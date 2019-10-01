package com.github.tusharepro.core.bean;

import com.github.tusharepro.core.http.BaseRequestParam;

/**
 * 外汇日线行情
 * https://tushare.pro/document/2?doc_id=179
 */
public interface FxDaily extends BaseBean {

    String API_NAME = "fx_daily";

    interface Fields {
        String ts_code = "ts_code";  // 外汇代码
        String trade_date = "trade_date";  // 交易日期
        String bid_open = "bid_open";  // 买入开盘价
        String bid_close = "bid_close";  // 买入收盘价
        String bid_high = "bid_high";  // 买入最高价
        String bid_low = "bid_low";  // 买入最低价
        String ask_open = "ask_open";  // 卖出开盘价
        String ask_close = "ask_close";  // 卖出收盘价
        String ask_high = "ask_high";  // 卖出最高价
        String ask_low = "ask_low";  // 卖出最低价
        String tick_qty = "tick_qty";  // 报价笔数
        String exchange = "exchange";  // 交易商
    }

    interface Params {

        ts_code ts_code = new ts_code();  // TS代码
        class ts_code extends BaseRequestParam {
            {key = "ts_code";}
        }

        trade_date trade_date = new trade_date();  // 交易日期（GMT，日期是格林尼治时间，比北京时间晚一天）
        class trade_date extends BaseRequestParam {
            {key = "trade_date";}
        }

        start_date start_date = new start_date();  // 开始日期（GMT）
        class start_date extends BaseRequestParam {
            {key = "start_date";}
        }

        end_date end_date = new end_date();  // 结束日期（GMT）
        class end_date extends BaseRequestParam {
            {key = "end_date";}
        }

        exchange exchange = new exchange();  // 交易商，目前只有FXCM
        class exchange extends BaseRequestParam {
            {key = "exchange";}
        }
    }

}