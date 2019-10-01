package com.github.tusharepro.core.bean;

import com.github.tusharepro.core.http.BaseRequestParam;

/**
 * 每日涨跌停价格
 * https://tushare.pro/document/2?doc_id=183
 */
public interface StkLimit extends BaseBean {

    String API_NAME = "stk_limit";

    interface Fields {
        String trade_date = "trade_date";  // 交易日期
        String ts_code = "ts_code";  // TS股票代码
        String pre_close = "pre_close";  // 昨日收盘价
        String up_limit = "up_limit";  // 涨停价
        String down_limit = "down_limit";  // 跌停价
    }

    interface Params {

        ts_code ts_code = new ts_code();  // 股票代码
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