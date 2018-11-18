package com.github.tushare.pro.http.request;

import com.github.tushare.pro.TusharePro;
import com.github.tushare.pro.common.KeyValue;
import com.github.tushare.pro.http.BaseRequestParam;
import com.github.tushare.pro.http.Request;

/**
 * 复权因子
 */
public final class AdjFactorRequest extends Request<AdjFactorRequest> {

    public AdjFactorRequest() {
        this(null);
    }

    public AdjFactorRequest(TusharePro tusharePro) {
        super(tusharePro);
        setApi_name("adj_factor");
    }

    public static class Fields {
        public static final String ts_code = "ts_code";  // 股票代码
        public static final String trade_date = "trade_date";  // 交易日期
        public static final String adj_factor = "adj_factor";  // 复权因子
        public static final String start_date = "start_date";  // 开始日期
        public static final String end_date = "end_date";  // 结束日期
    }

    public static class Params {

        public static final ts_code ts_code = new ts_code();  // 股票代码
        public static class ts_code extends BaseRequestParam {
            {key = "ts_code";}
        }

        public static final trade_date trade_date = new trade_date();  // 交易日期(YYYYMMDD，下同)
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