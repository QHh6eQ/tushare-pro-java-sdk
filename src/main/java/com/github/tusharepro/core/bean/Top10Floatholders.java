package com.github.tusharepro.core.bean;

import com.github.tusharepro.core.http.BaseRequestParam;

/**
 * 前十大流通股东
 */
public interface Top10Floatholders extends BaseBean {

    String API_NAME = "top10_floatholders";

    class Fields {
        public static final String ts_code = "ts_code";  // TS股票代码
        public static final String ann_date = "ann_date";  // 公告日期
        public static final String end_date = "end_date";  // 报告期
        public static final String holder_name = "holder_name";  // 股东名称
        public static final String hold_amount = "hold_amount";  // 持有数量（股）
    }

    class Params {

        public static final ts_code ts_code = new ts_code();  // TS代码
        public static class ts_code extends BaseRequestParam {
            {key = "ts_code";}
        }

        public static final period period = new period();  // 报告期
        public static class period extends BaseRequestParam {
            {key = "period";}
        }

        public static final ann_date ann_date = new ann_date();  // 公告日期
        public static class ann_date extends BaseRequestParam {
            {key = "ann_date";}
        }

        public static final start_date start_date = new start_date();  // 报告期开始日期
        public static class start_date extends BaseRequestParam {
            {key = "start_date";}
        }

        public static final end_date end_date = new end_date();  // 报告期结束日期
        public static class end_date extends BaseRequestParam {
            {key = "end_date";}
        }
    }

}