package com.github.tusharepro.core.bean;

import com.github.tusharepro.core.http.BaseRequestParam;

/**
 * 日线行情
 */
public interface Daily extends BaseBean {

    String API_NAME = "daily";

    class Fields {
        public static final String ts_code = "ts_code";  // 股票代码
        public static final String trade_date = "trade_date";  // 交易日期
        public static final String open = "open";  // 开盘价
        public static final String high = "high";  // 最高价
        public static final String low = "low";  // 最低价
        public static final String close = "close";  // 收盘价
        public static final String pre_close = "pre_close";  // 昨收价
        public static final String change = "change";  // 涨跌额
        public static final String pct_chg = "pct_chg";  // 涨跌幅 （未复权，如果是复权请用 <a href="https://tushare.pro/document/2?doc_id=109">通用行情接口</a> ）
        public static final String vol = "vol";  // 成交量 （手）
        public static final String amount = "amount";  // 成交额 （千元）
    }

    class Params {

        public static final ts_code ts_code = new ts_code();  // 股票代码（二选一）
        public static class ts_code extends BaseRequestParam {
            {key = "ts_code";}
        }

        public static final trade_date trade_date = new trade_date();  // 交易日期（二选一）
        public static class trade_date extends BaseRequestParam {
            {key = "trade_date";}
        }

        public static final start_date start_date = new start_date();  // 开始日期(YYYYMMDD)
        public static class start_date extends BaseRequestParam {
            {key = "start_date";}
        }

        public static final end_date end_date = new end_date();  // 结束日期(YYYYMMDD)
        public static class end_date extends BaseRequestParam {
            {key = "end_date";}
        }
    }

}