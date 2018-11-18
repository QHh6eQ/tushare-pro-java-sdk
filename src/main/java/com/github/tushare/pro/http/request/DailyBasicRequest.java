package com.github.tushare.pro.http.request;

import com.github.tushare.pro.TusharePro;
import com.github.tushare.pro.common.KeyValue;
import com.github.tushare.pro.http.BaseRequestParam;
import com.github.tushare.pro.http.Request;

/**
 * 每日指标
 */
public final class DailyBasicRequest extends Request<DailyBasicRequest> {

    public DailyBasicRequest() {
        this(null);
    }

    public DailyBasicRequest(TusharePro tusharePro) {
        super(tusharePro);
        setApi_name("daily_basic");
    }

    public static class Fields {
        public static final String ts_code = "ts_code";  // TS股票代码
        public static final String trade_date = "trade_date";  // 交易日期
        public static final String close = "close";  // 当日收盘价
        public static final String turnover_rate = "turnover_rate";  // 换手率
        public static final String turnover_rate_f = "turnover_rate_f";  // 换手率（自由流通股）
        public static final String volume_ratio = "volume_ratio";  // 量比
        public static final String pe = "pe";  // 市盈率（总市值/净利润）
        public static final String pe_ttm = "pe_ttm";  // 市盈率（TTM）
        public static final String pb = "pb";  // 市净率（总市值/净资产）
        public static final String ps = "ps";  // 市销率
        public static final String ps_ttm = "ps_ttm";  // 市销率（TTM）
        public static final String total_share = "total_share";  // 总股本 （万）
        public static final String float_share = "float_share";  // 流通股本 （万）
        public static final String free_share = "free_share";  // 自由流通股本 （万）
        public static final String total_mv = "total_mv";  // 总市值 （万元）
        public static final String circ_mv = "circ_mv";  // 流通市值（万元）
    }

    public static class Params {

        public static final ts_code ts_code = new ts_code();  // 股票代码（二选一）
        public static class ts_code extends BaseRequestParam {
            {key = "ts_code";}
        }

        public static final trade_date trade_date = new trade_date();  // 交易日期 （二选一）
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