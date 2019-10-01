package com.github.tusharepro.core.http;

import lombok.Data;

import java.util.List;

@Data
public class Response {

    @lombok.Data
    public static class Data {

        private List<String> fields;
        private List<List<?>> items;
        private Boolean has_more;  // 分页

    }

    private String request_id;
    private Integer code;
    private String msg;
    private Data data;

}