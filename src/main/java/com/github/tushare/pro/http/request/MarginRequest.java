package com.github.tushare.pro.http.request;

import com.github.tushare.pro.TusharePro;
import com.github.tushare.pro.common.KeyValue;
import com.github.tushare.pro.http.BaseRequestParam;
import com.github.tushare.pro.http.Request;

/**
 * 融资融券交易汇总
 */
public final class MarginRequest extends Request<MarginRequest> {

    public MarginRequest() {
        this(null);
    }

    public MarginRequest(TusharePro tusharePro) {
        super(tusharePro);
        setApi_name("margin");
    }

    public static class Fields {
        public static final String trade_date = "trade_date";  // 交易日期
        public static final String exchange_id = "exchange_id";  // 交易所代码（SSE上交所SZSE深交所）
        public static final String rzye = "rzye";  // 融资余额(元)
        public static final String rzmre = "rzmre";  // 融资买入额(元)
        public static final String rzche = "rzche";  // 融资偿还额(元)
        public static final String rqye = "rqye";  // 融券余额(元)
        public static final String rqmcl = "rqmcl";  // 融券卖出量(股,份,手)
        public static final String rzrqye = "rzrqye";  // 融资融券余额(元)
    }

    public static class Params {

        public static final trade_date trade_date = new trade_date();  // 交易日期
        public static class trade_date extends BaseRequestParam {
            {key = "trade_date";}
        }

        public static final exchange_id exchange_id = new exchange_id();  // 交易所代码
        public static class exchange_id extends BaseRequestParam {
            {key = "exchange_id";}
        }
    }

}