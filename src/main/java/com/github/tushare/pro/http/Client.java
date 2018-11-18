package com.github.tushare.pro.http;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.github.tushare.pro.TusharePro;
import com.github.tushare.pro.common.Util;
import okhttp3.*;
import okhttp3.logging.HttpLoggingInterceptor;

import java.io.IOException;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.util.*;
import java.util.concurrent.*;
import java.util.stream.Collectors;

public class Client {

    private static final OkHttpClient client = new OkHttpClient.Builder()
            .addInterceptor(new HttpLoggingInterceptor().setLevel(HttpLoggingInterceptor.Level.BODY))
            .connectTimeout(42, TimeUnit.SECONDS)
            .writeTimeout(42, TimeUnit.SECONDS)
            .readTimeout(42, TimeUnit.SECONDS)
            .build();

    private static final MediaType JSON = MediaType.parse("application/json; charset=utf-8");

    private static Response post(Request requestJson) throws IOException {
        final TusharePro tusharePro = requestJson.tusharePro;
        final ExecutorService requestExecutor = tusharePro.requestExecutor;

        try {
            final Future<okhttp3.Response> responseFuture = requestExecutor.submit(() -> {
                okhttp3.Request request = new okhttp3.Request.Builder()
                        .url("http://api.tushare.pro")
                        .post(RequestBody.create(JSON, new ObjectMapper().writeValueAsBytes(requestJson)))
                        .build();
                return client.newCall(request).execute();
            });

            return new ObjectMapper().readValue(responseFuture.get().body().string(), new TypeReference<Response>() {});
        }
        catch (IOException | InterruptedException | ExecutionException e) {
            e.printStackTrace();
        }
        throw new IOException();
    }

    public static <T> List<T> beanList(Class<T> beanClass, Request request) throws IOException {
        final TusharePro tusharePro = request.tusharePro;
        final int maxRetries = tusharePro.maxRetries;
        final TimeUnit timeUnit = tusharePro.retrySleepTimeUnit;
        final long timeOut = tusharePro.retrySleepTimeOut;

        for (int current = 0; current < maxRetries; current++) {
            try {
                return Optional.ofNullable(Client.post(request))
                        .map(response -> {
                            List<String> fields = response.getData().getFields().stream()
                                    .map(Util::camelName)
                                    .collect(Collectors.toList());
                            List<List<?>> items = response.getData().getItems();

                            List<T> beanList = new ArrayList<>(items.size());

                            try {
                                for (int i = 0; i < items.size(); i++) {
                                    T bean = beanClass.getDeclaredConstructor().newInstance();
                                    List<?> item = items.get(i);
                                    Class c = bean.getClass();
                                    Map<String, Field> fieldMap = new HashMap<>();
                                    while (c != null) {
                                        fieldMap.putAll(Arrays.stream(c.getDeclaredFields())
                                                .collect(Collectors.toMap(Field::getName, x -> x)));
                                        c = c.getSuperclass();
                                    }

                                    for (int j = 0; j < fields.size(); j++) {
                                        Field field = fieldMap.get(fields.get(j));
                                        field.setAccessible(true);
                                        field.set(bean, item.get(j));
                                    }
                                    beanList.add(bean);
                                }
                            } catch (InstantiationException | IllegalAccessException | NoSuchMethodException | InvocationTargetException e) {
                                e.printStackTrace();
                                throw new RuntimeException();
                            }

                            return beanList;
                        })
                        .orElse(Collections.emptyList());
            } catch (Exception e) {
                e.printStackTrace();
                if (timeUnit != null && timeOut != 0) {
                    try {
                        timeUnit.sleep(timeOut);
                    } catch (InterruptedException e1) {
                        e1.printStackTrace();
                    }
                }
            }
        }
        throw new IOException();
    }

    public static String getApiDoc(String url) throws IOException {
        okhttp3.Request request = new okhttp3.Request.Builder()
                .url(url)
                .build();
        return client.newCall(request).execute().body().string();
    }

}
