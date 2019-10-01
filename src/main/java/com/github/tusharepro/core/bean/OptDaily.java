package com.github.tusharepro.core.bean;

import com.github.tusharepro.core.http.BaseRequestParam;

/**
 * 期权日线行情
 * https://tushare.pro/document/2?doc_id=159
 */
public interface OptDaily extends BaseBean {

    String API_NAME = "opt_daily";

    interface Fields {
        String ts_code = "ts_code";  // TS代码
        String trade_date = "trade_date";  // 交易日期
        String exchange = "exchange";  // 交易市场
        String pre_settle = "pre_settle";  // 昨结算价
        String pre_close = "pre_close";  // 前收盘价
        String open = "open";  // 开盘价
        String high = "high";  // 最高价
        String low = "low";  // 最低价
        String close = "close";  // 收盘价
        String settle = "settle";  // 结算价
        String vol = "vol";  // 成交量(手)
        String amount = "amount";  // 成交金额(万元)
        String oi = "oi";  // 持仓量(手)
    }

    interface Params {

        ts_code ts_code = new ts_code();  // TS合约代码（输入代码或时间至少任意一个参数）
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

        exchange exchange = new exchange();  // 交易所
        class exchange extends BaseRequestParam {
            {key = "exchange";}
        }
    }

}