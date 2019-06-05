package com.github.tusharepro.core.bean;

import com.github.tusharepro.core.http.BaseRequestParam;

/**
 * 概念股列表
 */
public interface ConceptDetail extends BaseBean {

    String API_NAME = "concept_detail";

    class Fields {
        public static final String id = "id";  // 概念代码
        public static final String concept_name = "concept_name";  // 概念名称
        public static final String ts_code = "ts_code";  // 股票代码
        public static final String name = "name";  // 股票名称
        public static final String in_date = "in_date";  // 纳入日期
        public static final String out_date = "out_date";  // 剔除日期
    }

    class Params {

        public static final id id = new id();  // 概念分类ID （id来自概念股分类接口）
        public static class id extends BaseRequestParam {
            {key = "id";}
        }

        public static final ts_code ts_code = new ts_code();  // 股票代码  （以上参数二选一）
        public static class ts_code extends BaseRequestParam {
            {key = "ts_code";}
        }
    }

}