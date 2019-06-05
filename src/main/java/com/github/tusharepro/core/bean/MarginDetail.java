package com.github.tusharepro.core.bean;

import com.github.tusharepro.core.http.BaseRequestParam;

/**
 * 融资融券交易明细
 */
public interface MarginDetail extends BaseBean {

    String API_NAME = "margin_detail";

    class Fields {
        public static final String trade_date = "trade_date";  // 交易日期
        public static final String ts_code = "ts_code";  // TS股票代码
        public static final String rzye = "rzye";  // 融资余额(元)
        public static final String rqye = "rqye";  // 融券余额(元)
        public static final String rzmre = "rzmre";  // 融资买入额(元)
        public static final String rqyl = "rqyl";  // 融券余量（手）
        public static final String rzche = "rzche";  // 融资偿还额(元)
        public static final String rqchl = "rqchl";  // 融券偿还量(手)
        public static final String rqmcl = "rqmcl";  // 融券卖出量(股,份,手)
        public static final String rzrqye = "rzrqye";  // 融资融券余额(元)
    }

    class Params {

        public static final trade_date trade_date = new trade_date();  // 交易日期
        public static class trade_date extends BaseRequestParam {
            {key = "trade_date";}
        }

        public static final ts_code ts_code = new ts_code();  // TS代码
        public static class ts_code extends BaseRequestParam {
            {key = "ts_code";}
        }
    }

}