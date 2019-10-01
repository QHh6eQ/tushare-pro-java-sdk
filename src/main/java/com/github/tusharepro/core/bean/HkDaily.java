package com.github.tusharepro.core.bean;

import com.github.tusharepro.core.http.BaseRequestParam;

/**
 * 港股行情
 * https://tushare.pro/document/2?doc_id=192
 */
public interface HkDaily extends BaseBean {

    String API_NAME = "hk_daily";

    interface Fields {
        String ts_code = "ts_code";  // 股票代码
        String trade_date = "trade_date";  // 交易日期
        String open = "open";  // 开盘价
        String high = "high";  // 最高价
        String low = "low";  // 最低价
        String close = "close";  // 收盘价
        String pre_close = "pre_close";  // 昨收价
        String change = "change";  // 涨跌额
        String pct_chg = "pct_chg";  // 涨跌幅(%)
        String vol = "vol";  // 成交量(股)
        String amount = "amount";  // 成交额(元)
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