package com.github.tusharepro.core.bean;

import com.github.tusharepro.core.http.BaseRequestParam;

/**
 * 股东人数
 * https://tushare.pro/document/2?doc_id=166
 */
public interface StkHoldernumber extends BaseBean {

    String API_NAME = "stk_holdernumber";

    interface Fields {
        String ts_code = "ts_code";  // TS股票代码
        String ann_date = "ann_date";  // 公告日期
        String end_date = "end_date";  // 截止日期
        String holder_num = "holder_num";  // 股东户数
    }

    interface Params {

        ts_code ts_code = new ts_code();  // TS股票代码
        class ts_code extends BaseRequestParam {
            {key = "ts_code";}
        }

        enddate enddate = new enddate();  // 截止日期
        class enddate extends BaseRequestParam {
            {key = "enddate";}
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