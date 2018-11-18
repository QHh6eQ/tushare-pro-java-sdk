package com.github.tushare.pro.http;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.github.tushare.pro.common.KeyValue;
import com.github.tushare.pro.TusharePro;

import java.util.*;
import java.util.stream.Collectors;

public abstract class Request<T> {

    private String token;
    private String api_name;
    private String fields = "";
    private Map<String, Object> params = new HashMap<>();

    @JsonIgnore public final TusharePro tusharePro;

    protected Request(TusharePro tusharePro) {
        this.tusharePro = Optional.ofNullable(tusharePro).orElse(TusharePro.getGlobal());
        token = this.tusharePro.token;
    }

    public Request<T> allFields() {
        return fields(Arrays.stream(
                Arrays.stream(getClass().getClasses()).filter(x -> x.getName().contains("Fields")).findAny().orElse(Object.class)
                        .getFields()).map(x -> {
            try {
                return (String) x.get(null);
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
            return "";
        }).collect(Collectors.toList()));
    }

    public Request<T> defaultFields() {
        return fields("");
    }

    /**
     * 单个字段叠加
     */
    public Request<T> field(String field) {
        return fields(field);
    }

    /**
     * 多个字段叠加
     */
    public Request<T> fields(String fields) {
        if (fields == null) return this;
        this.fields += ("".equals(this.fields) ? "" : "," + fields);
        return this;
    }

    /**
     * 多个字段(列表)叠加
     */
    public Request<T> fields(List<String> fields) {
        this.fields += (("".equals(this.fields) ? "" : ",") + fields.stream().reduce((a, b) -> a += ("," + b)).orElse(""));
        return this;
    }

    public Request<T> param(String key, Object value) {
        getParams().put(key, value);
        return this;
    }

    public Request<T> param(KeyValue<String, ?> keyValue) {
        getParams().put(keyValue.key, keyValue.value);
        return this;
    }

    public String getToken() {
        return token;
    }

    protected Request setToken(String token) {
        this.token = token;
        return this;
    }

    public String getApi_name() {
        return api_name;
    }

    protected Request setApi_name(String api_name) {
        this.api_name = api_name;
        return this;
    }

    public String getFields() {
        return fields;
    }

    protected Request setFields(String fields) {
        this.fields = fields;
        return this;
    }

    public Map<String, Object> getParams() {
        return params;
    }

    protected Request setParams(Map<String, Object> params) {
        this.params = params;
        return this;
    }
}
