package com.github.tusharepro.core.bean;

import com.github.tusharepro.core.http.BaseRequestParam;

/**
 * 财报披露计划
 */
public interface DisclosureDate extends BaseBean {

    String API_NAME = "disclosure_date";

    class Fields {
        public static final String ts_code = "ts_code";  // TS代码
        public static final String ann_date = "ann_date";  // 最新披露公告日
        public static final String end_date = "end_date";  // 报告期
        public static final String pre_date = "pre_date";  // 预计披露日期
        public static final String actual_date = "actual_date";  // 实际披露日期
        public static final String modify_date = "modify_date";  // 披露日期修正记录
    }

    class Params {

        public static final ts_code ts_code = new ts_code();  // TS股票代码
        public static class ts_code extends BaseRequestParam {
            {key = "ts_code";}
        }

        public static final end_date end_date = new end_date();  // 财报周期（比如20181231表示2018年年报，20180630表示中报)
        public static class end_date extends BaseRequestParam {
            {key = "end_date";}
        }

        public static final pre_date pre_date = new pre_date();  // 计划披露日期
        public static class pre_date extends BaseRequestParam {
            {key = "pre_date";}
        }

        public static final actual_date actual_date = new actual_date();  // 实际披露日期
        public static class actual_date extends BaseRequestParam {
            {key = "actual_date";}
        }
    }

}