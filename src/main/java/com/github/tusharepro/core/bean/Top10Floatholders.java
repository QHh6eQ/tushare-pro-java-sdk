package com.github.tusharepro.core.bean;

import com.github.tusharepro.core.http.BaseRequestParam;

/**
 * 前十大流通股东
 * https://tushare.pro/document/2?doc_id=62
 */
public interface Top10Floatholders extends BaseBean {

    String API_NAME = "top10_floatholders";

    interface Fields {
        String ts_code = "ts_code";  // TS股票代码
        String ann_date = "ann_date";  // 公告日期
        String end_date = "end_date";  // 报告期
        String holder_name = "holder_name";  // 股东名称
        String hold_amount = "hold_amount";  // 持有数量（股）
    }

    interface Params {

        ts_code ts_code = new ts_code();  // TS代码
        class ts_code extends BaseRequestParam {
            {key = "ts_code";}
        }

        period period = new period();  // 报告期
        class period extends BaseRequestParam {
            {key = "period";}
        }

        ann_date ann_date = new ann_date();  // 公告日期
        class ann_date extends BaseRequestParam {
            {key = "ann_date";}
        }

        start_date start_date = new start_date();  // 报告期开始日期
        class start_date extends BaseRequestParam {
            {key = "start_date";}
        }

        end_date end_date = new end_date();  // 报告期结束日期
        class end_date extends BaseRequestParam {
            {key = "end_date";}
        }
    }

}