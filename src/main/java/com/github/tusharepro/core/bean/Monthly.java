package com.github.tusharepro.core.bean;

import com.github.tusharepro.core.http.BaseRequestParam;

/**
 * 月线行情
 * https://tushare.pro/document/2?doc_id=145
 */
public interface Monthly extends BaseBean {

    String API_NAME = "monthly";

    interface Fields {
        String ts_code = "ts_code";  // 股票代码
        String trade_date = "trade_date";  // 交易日期
        String close = "close";  // 月收盘价
        String open = "open";  // 月开盘价
        String high = "high";  // 月最高价
        String low = "low";  // 月最低价
        String pre_close = "pre_close";  // 上月收盘价
        String change = "change";  // 月涨跌额
        String pct_chg = "pct_chg";  // 月涨跌幅 （未复权，如果是复权请用 <a href="https://tushare.pro/document/2?doc_id=109">通用行情接口</a> ）
        String vol = "vol";  // 月成交量
        String amount = "amount";  // 月成交额
    }

    interface Params {

        ts_code ts_code = new ts_code();  // TS代码 （ts_code,trade_date两个参数任选一）
        class ts_code extends BaseRequestParam {
            {key = "ts_code";}
        }

        trade_date trade_date = new trade_date();  // 交易日期 （每月最后一个交易日日期，YYYYMMDD格式）
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