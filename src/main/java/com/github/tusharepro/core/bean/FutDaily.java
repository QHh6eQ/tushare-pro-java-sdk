package com.github.tusharepro.core.bean;

import com.github.tusharepro.core.http.BaseRequestParam;

/**
 * 期货日线行情
 * https://tushare.pro/document/2?doc_id=138
 */
public interface FutDaily extends BaseBean {

    String API_NAME = "fut_daily";

    interface Fields {
        String ts_code = "ts_code";  // TS合约代码
        String trade_date = "trade_date";  // 交易日期
        String pre_close = "pre_close";  // 昨收盘价
        String pre_settle = "pre_settle";  // 昨结算价
        String open = "open";  // 开盘价
        String high = "high";  // 最高价
        String low = "low";  // 最低价
        String close = "close";  // 收盘价
        String settle = "settle";  // 结算价
        String change1 = "change1";  // 涨跌1 收盘价-昨结算价
        String change2 = "change2";  // 涨跌2 结算价-昨结算价
        String vol = "vol";  // 成交量(手)
        String amount = "amount";  // 成交金额(万元)
        String oi = "oi";  // 持仓量(手)
        String oi_chg = "oi_chg";  // 持仓量变化
        String delv_settle = "delv_settle";  // 交割结算价
    }

    interface Params {

        trade_date trade_date = new trade_date();  // 交易日期
        class trade_date extends BaseRequestParam {
            {key = "trade_date";}
        }

        ts_code ts_code = new ts_code();  // 合约代码
        class ts_code extends BaseRequestParam {
            {key = "ts_code";}
        }

        exchange exchange = new exchange();  // 交易所代码
        class exchange extends BaseRequestParam {
            {key = "exchange";}
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