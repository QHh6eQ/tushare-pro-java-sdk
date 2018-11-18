package com.github.tushare.pro.http.request;

import com.github.tushare.pro.TusharePro;
import com.github.tushare.pro.common.KeyValue;
import com.github.tushare.pro.http.BaseRequestParam;
import com.github.tushare.pro.http.Request;

/**
 * 交易日历
 */
public final class TradeCalRequest extends Request<TradeCalRequest> {

    public TradeCalRequest() {
        this(null);
    }

    public TradeCalRequest(TusharePro tusharePro) {
        super(tusharePro);
        setApi_name("trade_cal");
    }

    public static class Fields {
        public static final String exchange = "exchange";  // 交易所 SSE上交所 SZSE深交所
        public static final String cal_date = "cal_date";  // 日历日期
        public static final String is_open = "is_open";  // 是否交易 0休市 1交易
        public static final String pretrade_date = "pretrade_date";  // 上一个交易日
    }

    public static class Params {

        public static final exchange exchange = new exchange();  // 交易所 SSE上交所 SZSE深交所
        public static class exchange extends BaseRequestParam {
            {key = "exchange";}
        }

        public static final start_date start_date = new start_date();  // 开始日期
        public static class start_date extends BaseRequestParam {
            {key = "start_date";}
        }

        public static final end_date end_date = new end_date();  // 结束日期
        public static class end_date extends BaseRequestParam {
            {key = "end_date";}
        }

        public static final is_open is_open = new is_open();  // 是否交易 0休市 1交易
        public static class is_open extends BaseRequestParam {
            {key = "is_open";}
        }
    }

}