package com.github.tusharepro.core.bean;

import com.github.tusharepro.core.http.BaseRequestParam;

/**
 * 月线行情
 */
public interface Monthly extends BaseBean {

    String API_NAME = "monthly";

    class Fields {
        public static final String ts_code = "ts_code";  // 股票代码
        public static final String trade_date = "trade_date";  // 交易日期
        public static final String close = "close";  // 月收盘价
        public static final String open = "open";  // 月开盘价
        public static final String high = "high";  // 月最高价
        public static final String low = "low";  // 月最低价
        public static final String pre_close = "pre_close";  // 上月收盘价
        public static final String change = "change";  // 月涨跌额
        public static final String pct_chg = "pct_chg";  // 月涨跌幅 （未复权，如果是复权请用 <a href="https://tushare.pro/document/2?doc_id=109">通用行情接口</a> ）
        public static final String vol = "vol";  // 月成交量
        public static final String amount = "amount";  // 月成交额
    }

    class Params {

        public static final ts_code ts_code = new ts_code();  // TS代码 （ts_code,trade_date两个参数任选一）
        public static class ts_code extends BaseRequestParam {
            {key = "ts_code";}
        }

        public static final trade_date trade_date = new trade_date();  // 交易日期 （每月最后一个交易日日期，YYYYMMDD格式）
        public static class trade_date extends BaseRequestParam {
            {key = "trade_date";}
        }

        public static final start_date start_date = new start_date();  // 开始日期
        public static class start_date extends BaseRequestParam {
            {key = "start_date";}
        }

        public static final end_date end_date = new end_date();  // 结束日期
        public static class end_date extends BaseRequestParam {
            {key = "end_date";}
        }
    }

}