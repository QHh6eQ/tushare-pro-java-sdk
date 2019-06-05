package com.github.tusharepro.core.bean;

import com.github.tusharepro.core.http.BaseRequestParam;

/**
 * 概念股分类
 */
public interface Concept extends BaseBean {

    String API_NAME = "concept";

    class Fields {
        public static final String code = "code";  // 概念分类ID
        public static final String name = "name";  // 概念分类名称
        public static final String src = "src";  // 来源
    }

    class Params {

        public static final src src = new src();  // 来源，默认为ts
        public static class src extends BaseRequestParam {
            {key = "src";}
        }
    }

}