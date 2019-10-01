package com.github.tusharepro.core.bean;

import com.github.tusharepro.core.http.BaseRequestParam;

/**
 * 场内基金日线行情
 * https://tushare.pro/document/2?doc_id=127
 */
public interface FundDaily extends BaseBean {

    String API_NAME = "fund_daily";

    interface Fields {
        String ts_code = "ts_code";  // TS代码
        String trade_date = "trade_date";  // 交易日期
        String open = "open";  // 开盘价(元)
        String high = "high";  // 最高价(元)
        String low = "low";  // 最低价(元)
        String close = "close";  // 收盘价(元)
        String pre_close = "pre_close";  // 昨收盘价(元)
        String change = "change";  // 涨跌额(元)
        String pct_chg = "pct_chg";  // 涨跌幅(%)
        String vol = "vol";  // 成交量(手)
        String amount = "amount";  // 成交额(千元)
    }

    interface Params {

        ts_code ts_code = new ts_code();  // 基金代码（二选一）
        class ts_code extends BaseRequestParam {
            {key = "ts_code";}
        }

        trade_date trade_date = new trade_date();  // 交易日期（二选一）
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