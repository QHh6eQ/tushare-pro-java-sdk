package com.github.tusharepro.core.bean;

import com.github.tusharepro.core.http.BaseRequestParam;

/**
 * 指数周线行情
 */
public interface IndexWeekly extends BaseBean {

    String API_NAME = "index_weekly";

    class Fields {
        public static final String ts_code = "ts_code";  // TS指数代码
        public static final String trade_date = "trade_date";  // 交易日
        public static final String close = "close";  // 收盘点位
        public static final String open = "open";  // 开盘点位
        public static final String high = "high";  // 最高点位
        public static final String low = "low";  // 最低点位
        public static final String pre_close = "pre_close";  // 昨日收盘点
        public static final String change = "change";  // 涨跌点位
        public static final String pct_chg = "pct_chg";  // 涨跌幅
        public static final String vol = "vol";  // 成交量
        public static final String amount = "amount";  // 成交额
    }

    class Params {

        public static final ts_code ts_code = new ts_code();  // TS代码
        public static class ts_code extends BaseRequestParam {
            {key = "ts_code";}
        }

        public static final trade_date trade_date = new trade_date();  // 交易日期
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