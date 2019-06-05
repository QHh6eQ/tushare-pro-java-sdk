package com.github.tusharepro.core.http;

import com.github.tusharepro.core.common.KeyValue;

public class BaseRequestParam {
    protected String key = null;
    public <V> KeyValue<String, V> value(V value) {
        return new KeyValue<>(key, value);
    }
}
