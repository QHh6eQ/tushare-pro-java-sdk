package com.github.tushare.pro;

import java.util.concurrent.*;

public class TusharePro {

    private static ExecutorService defaultRequestExecutor = Executors.newCachedThreadPool(r -> {
        Thread thread = new Thread(r);
        thread.setDaemon(true);
        return thread;
    });  // 默认线程池

    private static TusharePro GLOBAL;  // 默认全局配置

    static { }

    public static class Builder {

        private String token;
        private int maxRetries = 3;  // 最大重试次数, 默认为3
        private TimeUnit retrySleepTimeUnit = TimeUnit.MILLISECONDS;  // 重试休眠单位, 默认毫秒
        private long retrySleepTimeOut = 0;  // 重试休眠时间
        private ExecutorService requestExecutor = defaultRequestExecutor;  // 请求线程池

        public Builder() {}

        public Builder copy() {
            return new Builder()
                    .setToken(token)
                    .setMaxRetries(maxRetries)
                    .setRetrySleepTimeUnit(retrySleepTimeUnit)
                    .setRetrySleepTimeOut(retrySleepTimeOut)
                    .setRequestExecutor(requestExecutor);
        }

        public TusharePro build() {
            return new TusharePro(token, maxRetries, retrySleepTimeUnit, retrySleepTimeOut, requestExecutor);
        }

        public String getToken() {
            return token;
        }

        public Builder setToken(String token) {
            this.token = token;
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
    }

    public final String token;  // tushare pro token
    public final int maxRetries;  // 最大重试次数, 默认为0(不重试)
    public final TimeUnit retrySleepTimeUnit;  // 重试休眠单位, 默认毫秒
    public final long retrySleepTimeOut;  // 重试休眠时间 默认0
    public final ExecutorService requestExecutor;  // 请求线程池

    public TusharePro(String token, int maxRetries, TimeUnit retrySleepTimeUnit, long retrySleepTimeOut, ExecutorService requestExecutor) {
        this.token = token;
        this.maxRetries = maxRetries;
        this.retrySleepTimeUnit = retrySleepTimeUnit;
        this.retrySleepTimeOut = retrySleepTimeOut;
        this.requestExecutor = requestExecutor;
    }

    public static synchronized TusharePro getGlobal() {
        return GLOBAL;
    }

    public static synchronized void setGlobal(TusharePro global) {
        TusharePro.GLOBAL = global;
    }

}
