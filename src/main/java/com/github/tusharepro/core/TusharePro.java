package com.github.tusharepro.core;

import java.util.concurrent.*;

public class TusharePro {


    private static ExecutorService defaultRequestExecutor = Executors.newCachedThreadPool();

    private static TusharePro GLOBAL;

    static {
        // ...
    }

    public static class Builder {
        private String token;
        private Double integral;  // 积分 暂时没有使用
        private int maxRetries = 0;  // 最大重试次数, 默认为0(不重试)
        private TimeUnit retrySleepTimeUnit = TimeUnit.MILLISECONDS;  // 重试休眠单位, 默认毫秒
        private long retrySleepTimeOut = 0;  // 重试休眠时间 默认0
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
            return new TusharePro(token, integral, maxRetries, retrySleepTimeUnit, retrySleepTimeOut, requestExecutor);
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
    }

    public final String token;
    public final Double integral;
    public final int maxRetries;  // 最大重试次数, 默认为0(不重试)
    public final TimeUnit retrySleepTimeUnit;  // 重试休眠单位, 默认毫秒
    public final long retrySleepTimeOut;  // 重试休眠时间 默认0
    public final ExecutorService requestExecutor;

    public TusharePro(String token, Double integral, int maxRetries, TimeUnit retrySleepTimeUnit, long retrySleepTimeOut, ExecutorService requestExecutor) {
        this.token = token;
        this.integral = integral;
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
