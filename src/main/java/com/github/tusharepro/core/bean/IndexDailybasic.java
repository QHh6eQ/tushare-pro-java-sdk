package com.github.tusharepro.core.bean;

import com.github.tusharepro.core.http.BaseRequestParam;

/**
 * 大盘指数每日指标
 */
public interface IndexDailybasic extends BaseBean {

    String API_NAME = "index_dailybasic";

    class Fields {
        public static final String ts_code = "ts_code";  // TS代码
        public static final String trade_date = "trade_date";  // 交易日期
        public static final String total_mv = "total_mv";  // 当日总市值（元）
        public static final String float_mv = "float_mv";  // 当日流通市值（元）
        public static final String total_share = "total_share";  // 当日总股本（股）
        public static final String float_share = "float_share";  // 当日流通股本（股）
        public static final String free_share = "free_share";  // 当日自由流通股本（股）
        public static final String turnover_rate = "turnover_rate";  // 换手率
        public static final String turnover_rate_f = "turnover_rate_f";  // 换手率(基于自由流通股本)
        public static final String pe = "pe";  // 市盈率
        public static final String pe_ttm = "pe_ttm";  // 市盈率TTM
        public static final String pb = "pb";  // 市净率
    }

    class Params {

        public static final trade_date trade_date = new trade_date();  // 交易日期 （格式：YYYYMMDD，比如20181018，下同）
        public static class trade_date extends BaseRequestParam {
            {key = "trade_date";}
        }

        public static final ts_code ts_code = new ts_code();  // TS代码
        public static class ts_code extends BaseRequestParam {
            {key = "ts_code";}
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