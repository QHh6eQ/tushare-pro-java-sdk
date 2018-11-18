package com.github.tushare.pro.http.request;

import com.github.tushare.pro.TusharePro;
import com.github.tushare.pro.common.KeyValue;
import com.github.tushare.pro.http.BaseRequestParam;
import com.github.tushare.pro.http.Request;

/**
 * 指数日线行情
 */
public final class IndexDailyRequest extends Request<IndexDailyRequest> {

    public IndexDailyRequest() {
        this(null);
    }

    public IndexDailyRequest(TusharePro tusharePro) {
        super(tusharePro);
        setApi_name("index_daily");
    }

    public static class Fields {
        public static final String ts_code = "ts_code";  // TS指数代码
        public static final String trade_date = "trade_date";  // 交易日
        public static final String close = "close";  // 收盘点位
        public static final String open = "open";  // 开盘点位
        public static final String high = "high";  // 最高点位
        public static final String low = "low";  // 最低点位
        public static final String pre_close = "pre_close";  // 昨日收盘点
        public static final String change = "change";  // 涨跌点
        public static final String pct_change = "pct_change";  // 涨跌幅
        public static final String vol = "vol";  // 成交量（手）
        public static final String amount = "amount";  // 成交额（千元）
    }

    public static class Params {

        public static final ts_code ts_code = new ts_code();  // 指数代码
        public static class ts_code extends BaseRequestParam {
            {key = "ts_code";}
        }

        public static final trade_date trade_date = new trade_date();  // 交易日期 （日期格式：YYYYMMDD，下同）
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