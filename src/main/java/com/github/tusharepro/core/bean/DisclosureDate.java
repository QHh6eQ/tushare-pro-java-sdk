package com.github.tusharepro.core.bean;

import com.github.tusharepro.core.http.BaseRequestParam;

/**
 * 财报披露计划
 * https://tushare.pro/document/2?doc_id=162
 */
public interface DisclosureDate extends BaseBean {

    String API_NAME = "disclosure_date";

    interface Fields {
        String ts_code = "ts_code";  // TS代码
        String ann_date = "ann_date";  // 最新披露公告日
        String end_date = "end_date";  // 报告期
        String pre_date = "pre_date";  // 预计披露日期
        String actual_date = "actual_date";  // 实际披露日期
        String modify_date = "modify_date";  // 披露日期修正记录
    }

    interface Params {

        ts_code ts_code = new ts_code();  // TS股票代码
        class ts_code extends BaseRequestParam {
            {key = "ts_code";}
        }

        end_date end_date = new end_date();  // 财报周期（比如20181231表示2018年年报，20180630表示中报)
        class end_date extends BaseRequestParam {
            {key = "end_date";}
        }

        pre_date pre_date = new pre_date();  // 计划披露日期
        class pre_date extends BaseRequestParam {
            {key = "pre_date";}
        }

        actual_date actual_date = new actual_date();  // 实际披露日期
        class actual_date extends BaseRequestParam {
            {key = "actual_date";}
        }
    }

}