package com.github.tusharepro.core.bean;

import com.github.tusharepro.core.http.BaseRequestParam;

/**
 * 期货主力与连续合约
 * https://tushare.pro/document/2?doc_id=189
 */
public interface FutMapping extends BaseBean {

    String API_NAME = "fut_mapping";

    interface Fields {
        String ts_code = "ts_code";  // 连续合约代码
        String trade_date = "trade_date";  // 起始日期
        String mapping_ts_code = "mapping_ts_code";  // 期货合约代码
    }

    interface Params {

        ts_code ts_code = new ts_code();  // 合约代码
        class ts_code extends BaseRequestParam {
            {key = "ts_code";}
        }

        trade_date trade_date = new trade_date();  // 交易日期
        class trade_date extends BaseRequestParam {
            {key = "trade_date";}
        }

        start_date start_date = new start_date();  // 开始日期
        class start_date extends BaseRequestParam {
            {key = "start_date";}
        }

        end_date end_date = new end_date();  // 结束日期
        class end_date extends BaseRequestParam {
            {key = "end_date";}
        }
    }

}