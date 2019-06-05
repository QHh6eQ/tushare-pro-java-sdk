package com.github.tusharepro.core.bean;

import com.github.tusharepro.core.http.BaseRequestParam;

/**
 * 指数基本信息
 */
public interface IndexBasic extends BaseBean {

    String API_NAME = "index_basic";

    class Fields {
        public static final String ts_code = "ts_code";  // TS代码
        public static final String name = "name";  // 简称
        public static final String fullname = "fullname";  // 指数全称
        public static final String market = "market";  // 市场
        public static final String publisher = "publisher";  // 发布方
        public static final String index_type = "index_type";  // 指数风格
        public static final String category = "category";  // 指数类别
        public static final String base_date = "base_date";  // 基期
        public static final String base_point = "base_point";  // 基点
        public static final String list_date = "list_date";  // 发布日期
        public static final String weight_rule = "weight_rule";  // 加权方式
        public static final String desc = "desc";  // 描述
        public static final String exp_date = "exp_date";  // 终止日期
    }

    class Params {

        public static final market market = new market();  // 交易所或服务商
        public static class market extends BaseRequestParam {
            {key = "market";}
        }

        public static final publisher publisher = new publisher();  // 发布商
        public static class publisher extends BaseRequestParam {
            {key = "publisher";}
        }

        public static final category category = new category();  // 指数类别
        public static class category extends BaseRequestParam {
            {key = "category";}
        }
    }

}