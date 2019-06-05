package com.github.tusharepro.core.bean;

import com.github.tusharepro.core.http.BaseRequestParam;

/**
 * 分红送股
 */
public interface Dividend extends BaseBean {

    String API_NAME = "dividend";

    class Fields {
        public static final String ts_code = "ts_code";  // TS代码
        public static final String end_date = "end_date";  // 分红年度
        public static final String ann_date = "ann_date";  // 预案公告日
        public static final String div_proc = "div_proc";  // 实施进度
        public static final String stk_div = "stk_div";  // 每股送转
        public static final String stk_bo_rate = "stk_bo_rate";  // 每股送股比例
        public static final String stk_co_rate = "stk_co_rate";  // 每股转增比例
        public static final String cash_div = "cash_div";  // 每股分红（税后）
        public static final String cash_div_tax = "cash_div_tax";  // 每股分红（税前）
        public static final String record_date = "record_date";  // 股权登记日
        public static final String ex_date = "ex_date";  // 除权除息日
        public static final String pay_date = "pay_date";  // 派息日
        public static final String div_listdate = "div_listdate";  // 红股上市日
        public static final String imp_ann_date = "imp_ann_date";  // 实施公告日
        public static final String base_date = "base_date";  // 基准日
        public static final String base_share = "base_share";  // 基准股本（万）
    }

    class Params {

        public static final ts_code ts_code = new ts_code();  // TS代码
        public static class ts_code extends BaseRequestParam {
            {key = "ts_code";}
        }

        public static final ann_date ann_date = new ann_date();  // 公告日
        public static class ann_date extends BaseRequestParam {
            {key = "ann_date";}
        }

        public static final record_date record_date = new record_date();  // 股权登记日期
        public static class record_date extends BaseRequestParam {
            {key = "record_date";}
        }

        public static final ex_date ex_date = new ex_date();  // 除权除息日
        public static class ex_date extends BaseRequestParam {
            {key = "ex_date";}
        }

        public static final imp_ann_date imp_ann_date = new imp_ann_date();  // 实施公告日
        public static class imp_ann_date extends BaseRequestParam {
            {key = "imp_ann_date";}
        }
    }

}