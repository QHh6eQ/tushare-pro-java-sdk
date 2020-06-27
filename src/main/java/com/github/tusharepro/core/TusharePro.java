package com.github.tusharepro.core;

import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.RequestBody;
import okhttp3.logging.HttpLoggingInterceptor;

import java.io.IOException;
import java.util.concurrent.*;
import java.util.function.Function;

public class TusharePro {

    private static TusharePro GLOBAL;

    static {
        // ...
//        Object o
    }

    public static class Builder {
        private static final String API_URL = "http://api.tushare.pro";
        private static final MediaType MEDIA_TYPE = MediaType.parse("application/json; charset=utf-8");
        private static final OkHttpClient DEFAULT_HTTP_CLIENT = new OkHttpClient.Builder()
                .addInterceptor(new HttpLoggingInterceptor().setLevel(HttpLoggingInterceptor.Level.BASIC))
                .connectTimeout(42, TimeUnit.SECONDS)
                .writeTimeout(42, TimeUnit.SECONDS)
                .readTimeout(42, TimeUnit.SECONDS)
                .build();

        private String token;
        private Double integral;  // 积分 暂时没有使用
        private int maxRetries = 0;  // 最大重试次数, 默认为0(不重试)
        private TimeUnit retrySleepTimeUnit = TimeUnit.MILLISECONDS;  // 重试休眠单位, 默认毫秒
        private long retrySleepTimeOut = 0;  // 重试休眠时间 默认0
        private ExecutorService requestExecutor = Executors.newCachedThreadPool();  // 请求线程池
        private Function<byte[], byte[]> httpFunction = requestBytes -> {  // requestBytes -> function -> responseBytes
            try {
                okhttp3.Request request = new okhttp3.Request.Builder()
                        .url(API_URL)
                        .post(RequestBody.create(MEDIA_TYPE, requestBytes))
                        .build();

                return DEFAULT_HTTP_CLIENT.newCall(request).execute().body().bytes();
            }
            catch (IOException e) {
                e.printStackTrace();
            }
            return null;
        };
//        private Map<String, Function> defaultMapperMap = new HashMap<>();

//        {
//            addDefaultMapper(
//                    (String value) -> LocalDate.parse(value, DateTimeFormatter.BASIC_ISO_DATE),
//                    Double::valueOf,
//                    Integer::valueOf
//            );
//            addDefaultMapper(
//                    (Integer value) -> value
//            );
//            addDefaultMapper(
//                    (Double value) -> value
//            );
//        }

        public Builder() {}

        public Builder copy() {
            return new Builder()
                    .setToken(token)
                    .setMaxRetries(maxRetries)
                    .setRetrySleepTimeUnit(retrySleepTimeUnit)
                    .setRetrySleepTimeOut(retrySleepTimeOut)
                    .setRequestExecutor(requestExecutor)
                    .setHttpFunction(httpFunction);
        }

        public TusharePro build() {
            return new TusharePro(token, integral, maxRetries, retrySleepTimeUnit, retrySleepTimeOut, requestExecutor, httpFunction);
        }

        public String getToken() {
            return token;
        }

        public Builder setToken(String token) {
            this.token = token;
            return this;
        }

        public Double getIntegral() {
            return integral;
        }

        public Builder setIntegral(Integer integral) {
            this.integral = integral == null ? null : integral.doubleValue();
            return this;
        }

        public Builder setIntegral(Double integral) {
            this.integral = integral;
            return this;
        }

        public int getMaxRetries() {
            return maxRetries;
        }

        public Builder setMaxRetries(int maxRetries) {
            this.maxRetries = maxRetries;
            return this;
        }

        public TimeUnit getRetrySleepTimeUnit() {
            return retrySleepTimeUnit;
        }

        public Builder setRetrySleepTimeUnit(TimeUnit retrySleepTimeUnit) {
            this.retrySleepTimeUnit = retrySleepTimeUnit;
            return this;
        }

        public long getRetrySleepTimeOut() {
            return retrySleepTimeOut;
        }

        public Builder setRetrySleepTimeOut(long retrySleepTimeOut) {
            this.retrySleepTimeOut = retrySleepTimeOut;
            return this;
        }

        public ExecutorService getRequestExecutor() {
            return requestExecutor;
        }

        public Builder setRequestExecutor(ExecutorService requestExecutor) {
            this.requestExecutor = requestExecutor;
            return this;
        }

        public Function<byte[], byte[]> getHttpFunction() {
            return httpFunction;
        }

        public Builder setHttpFunction(Function<byte[], byte[]> httpFunction) {
            this.httpFunction = httpFunction;
            return this;
        }

//        public Map<String, Function> getDefaultMapperMap() {
//            return new HashMap<>(defaultMapperMap);
//        }
//
//        @SafeVarargs
//        public final <T, R> Builder addDefaultMapper(Function<T, R>... functions) {
//            Arrays.stream(functions).forEach(function -> {});
//            Arrays.stream(functions).forEach(function -> defaultMapperMap.put(function.toString(), function));
//            return this;
//        }
    }

    public final String token;
    public final Double integral;
    public final int maxRetries;  // 最大重试次数, 默认为0(不重试)
    public final TimeUnit retrySleepTimeUnit;  // 重试休眠单位, 默认毫秒
    public final long retrySleepTimeOut;  // 重试休眠时间 默认0
    public final ExecutorService requestExecutor;  // 请求线程池
    public final Function<byte[], byte[]> httpFunction;  // requestBytes -> function -> responseBytes

    public TusharePro(
            String token, Double integral, int maxRetries, TimeUnit retrySleepTimeUnit, long retrySleepTimeOut, ExecutorService requestExecutor,
            Function<byte[], byte[]> httpFunction
    ) {
        this.token = token;
        this.integral = integral;
        this.maxRetries = maxRetries;
        this.retrySleepTimeUnit = retrySleepTimeUnit;
        this.retrySleepTimeOut = retrySleepTimeOut;
        this.requestExecutor = requestExecutor;
        this.httpFunction = httpFunction;
    }

    public static synchronized TusharePro getGlobal() {
        return GLOBAL;
    }

    public static synchronized void setGlobal(TusharePro global) {
        TusharePro.GLOBAL = global;
    }

}
