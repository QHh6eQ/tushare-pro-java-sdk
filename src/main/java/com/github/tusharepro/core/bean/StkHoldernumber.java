package com.github.tusharepro.core.bean;

import com.github.tusharepro.core.http.BaseRequestParam;

/**
 * 股东人数
 */
public interface StkHoldernumber extends BaseBean {

    String API_NAME = "stk_holdernumber";

    class Fields {
        public static final String ts_code = "ts_code";  // TS股票代码
        public static final String ann_date = "ann_date";  // 公告日期
        public static final String end_date = "end_date";  // 截止日期
        public static final String holder_num = "holder_num";  // 股东户数
    }

    class Params {

        public static final ts_code ts_code = new ts_code();  // TS股票代码
        public static class ts_code extends BaseRequestParam {
            {key = "ts_code";}
        }

        public static final enddate enddate = new enddate();  // 截止日期
        public static class enddate extends BaseRequestParam {
            {key = "enddate";}
        }

        public static final start_date start_date = new start_date();  // 公告开始日期
        public static class start_date extends BaseRequestParam {
            {key = "start_date";}
        }

        public static final end_date end_date = new end_date();  // 公告结束日期
        public static class end_date extends BaseRequestParam {
            {key = "end_date";}
        }
    }

}