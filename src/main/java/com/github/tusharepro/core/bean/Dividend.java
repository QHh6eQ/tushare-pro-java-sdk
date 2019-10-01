package com.github.tusharepro.core.bean;

import com.github.tusharepro.core.http.BaseRequestParam;

/**
 * 分红送股
 * https://tushare.pro/document/2?doc_id=103
 */
public interface Dividend extends BaseBean {

    String API_NAME = "dividend";

    interface Fields {
        String ts_code = "ts_code";  // TS代码
        String end_date = "end_date";  // 分红年度
        String ann_date = "ann_date";  // 预案公告日
        String div_proc = "div_proc";  // 实施进度
        String stk_div = "stk_div";  // 每股送转
        String stk_bo_rate = "stk_bo_rate";  // 每股送股比例
        String stk_co_rate = "stk_co_rate";  // 每股转增比例
        String cash_div = "cash_div";  // 每股分红（税后）
        String cash_div_tax = "cash_div_tax";  // 每股分红（税前）
        String record_date = "record_date";  // 股权登记日
        String ex_date = "ex_date";  // 除权除息日
        String pay_date = "pay_date";  // 派息日
        String div_listdate = "div_listdate";  // 红股上市日
        String imp_ann_date = "imp_ann_date";  // 实施公告日
        String base_date = "base_date";  // 基准日
        String base_share = "base_share";  // 基准股本（万）
    }

    interface Params {

        ts_code ts_code = new ts_code();  // TS代码
        class ts_code extends BaseRequestParam {
            {key = "ts_code";}
        }

        ann_date ann_date = new ann_date();  // 公告日
        class ann_date extends BaseRequestParam {
            {key = "ann_date";}
        }

        record_date record_date = new record_date();  // 股权登记日期
        class record_date extends BaseRequestParam {
            {key = "record_date";}
        }

        ex_date ex_date = new ex_date();  // 除权除息日
        class ex_date extends BaseRequestParam {
            {key = "ex_date";}
        }

        imp_ann_date imp_ann_date = new imp_ann_date();  // 实施公告日
        class imp_ann_date extends BaseRequestParam {
            {key = "imp_ann_date";}
        }
    }

}