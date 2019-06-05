package com.github.tusharepro.core.http;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.github.tusharepro.core.TusharePro;
import com.github.tusharepro.core.bean.BaseBean;
import com.github.tusharepro.core.util.TypeUtil;
import com.github.tusharepro.core.util.Util;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.RequestBody;
import okhttp3.logging.HttpLoggingInterceptor;

import java.io.IOException;
import java.lang.reflect.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
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
            Future<okhttp3.Response> responseFuture = requestExecutor.submit(() -> {
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

    public static <T extends BaseBean> List<T> beanList(Request<T> request) throws IOException {
        final TusharePro tusharePro = request.tusharePro;
        final int maxRetries = tusharePro.maxRetries;
        final TimeUnit timeUnit = tusharePro.retrySleepTimeUnit;
        final long timeOut = tusharePro.retrySleepTimeOut;
        final Double integral = tusharePro.integral;

        Class beanClass;
        try {
            beanClass = TypeUtil.getActualTypeArgumentClass(request.getClass());
        }
        catch (ClassNotFoundException e) {
            throw new IOException();
        }

            for (int current = 0; current <= maxRetries; current++) {
                try {
                    return f(request, beanClass);
                }
                catch (Exception e) {
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

    private static <T extends BaseBean> List<T> f(Request<T> request, Class beanClass) throws IOException {
            return Optional.ofNullable(Client.post(request))
                    .map(stockBasicResponse -> {
                        List<String> fields = stockBasicResponse.getData().getFields().stream()
                                .map(Util::camelName)
                                .collect(Collectors.toList());
                        List<List<?>> items = stockBasicResponse.getData().getItems();

                        List<T> beanList = new ArrayList<>(items.size());

                        try {
                            for (int i = 0; i < items.size(); i++) {

                                T bean = (T) beanClass.getDeclaredConstructor().newInstance();

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

                                    // 对时间进行特殊处理
                                    Object value = item.get(j);
                                    switch (field.getType().getTypeName()) {
                                        case "java.time.LocalDate":
                                            value = value == null ? null : LocalDate.parse((String) value, DateTimeFormatter.BASIC_ISO_DATE);
                                            break;
                                    }

                                    field.set(bean, value);
                                }
                                beanList.add(bean);
                            }
                        } catch (InstantiationException | IllegalAccessException | NoSuchMethodException | InvocationTargetException e) {
                            throw new RuntimeException();
                        }

                        return beanList;
                    }).orElse(Collections.emptyList());
    }

}
