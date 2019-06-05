package com.github.tusharepro.core.bean;

import com.github.tusharepro.core.http.BaseRequestParam;

/**
 * 周线行情
 */
public interface Weekly extends BaseBean {

    String API_NAME = "weekly";

    class Fields {
        public static final String ts_code = "ts_code";  // 股票代码
        public static final String trade_date = "trade_date";  // 交易日期
        public static final String close = "close";  // 周收盘价
        public static final String open = "open";  // 周开盘价
        public static final String high = "high";  // 周最高价
        public static final String low = "low";  // 周最低价
        public static final String pre_close = "pre_close";  // 上一周收盘价
        public static final String change = "change";  // 周涨跌额
        public static final String pct_chg = "pct_chg";  // 周涨跌幅 （未复权，如果是复权请用 <a href="https://tushare.pro/document/2?doc_id=109">通用行情接口</a> ）
        public static final String vol = "vol";  // 周成交量
        public static final String amount = "amount";  // 周成交额
    }

    class Params {

        public static final ts_code ts_code = new ts_code();  // TS代码 （ts_code,trade_date两个参数任选一）
        public static class ts_code extends BaseRequestParam {
            {key = "ts_code";}
        }

        public static final trade_date trade_date = new trade_date();  // 交易日期 （每周五日期，YYYYMMDD格式）
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