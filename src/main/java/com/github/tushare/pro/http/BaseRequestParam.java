package com.github.tushare.pro.http;

import com.github.tushare.pro.common.KeyValue;

public class BaseRequestParam {
    protected String key = null;
    public <V> KeyValue<String, V> value(V value) {
        return new KeyValue<>(key, value);
    }
}
