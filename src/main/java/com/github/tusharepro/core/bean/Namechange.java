package com.github.tusharepro.core.bean;

import com.github.tusharepro.core.http.BaseRequestParam;

/**
 * 股票曾用名
 * https://tushare.pro/document/2?doc_id=100
 */
public interface Namechange extends BaseBean {

    String API_NAME = "namechange";

    interface Fields {
        String ts_code = "ts_code";  // TS代码
        String name = "name";  // 证券名称
        String start_date = "start_date";  // 开始日期
        String end_date = "end_date";  // 结束日期
        String ann_date = "ann_date";  // 公告日期
        String change_reason = "change_reason";  // 变更原因
    }

    interface Params {

        ts_code ts_code = new ts_code();  // TS代码
        class ts_code extends BaseRequestParam {
            {key = "ts_code";}
        }

        start_date start_date = new start_date();  // 公告开始日期
        class start_date extends BaseRequestParam {
            {key = "start_date";}
        }

        end_date end_date = new end_date();  // 公告结束日期
        class end_date extends BaseRequestParam {
            {key = "end_date";}
        }
    }

}