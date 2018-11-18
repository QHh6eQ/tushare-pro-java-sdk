package com.github.tushare.pro.http;

import java.util.List;

public class Response {

    public static class Data {

        private List<String> fields;
        private List<List<?>> items;

        public List<String> getFields() {
            return fields;
        }

        public Data setFields(List<String> fields) {
            this.fields = fields;
            return this;
        }

        public List<List<?>> getItems() {
            return items;
        }

        public Data setItems(List<List<?>> items) {
            this.items = items;
            return this;
        }
    }

    private String request_id;
    private Integer code;
    private String msg;
    private Data data;

    public String getRequest_id() {
        return request_id;
    }

    public Response setRequest_id(String request_id) {
        this.request_id = request_id;
        return this;
    }

    public Integer getCode() {
        return code;
    }

    public Response setCode(Integer code) {
        this.code = code;
        return this;
    }

    public String getMsg() {
        return msg;
    }

    public Response setMsg(String msg) {
        this.msg = msg;
        return this;
    }

    public Response.Data getData() {
        return data;
    }

    public Response setData(Response.Data data) {
        this.data = data;
        return this;
    }
}
