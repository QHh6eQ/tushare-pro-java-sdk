package com.github.tusharepro.core.bean;

import com.github.tusharepro.core.http.BaseRequestParam;

/**
 * 大宗交易
 */
public interface BlockTrade extends BaseBean {

    String API_NAME = "block_trade";

    class Fields {
        public static final String ts_code = "ts_code";  // TS代码
        public static final String trade_date = "trade_date";  // 交易日历
        public static final String price = "price";  // 成交价
        public static final String vol = "vol";  // 成交量（万股）
        public static final String amount = "amount";  // 成交金额
        public static final String buyer = "buyer";  // 买方营业部
        public static final String seller = "seller";  // 卖方营业部
    }

    class Params {

        public static final ts_code ts_code = new ts_code();  // TS代码（股票代码和日期至少输入一个参数）
        public static class ts_code extends BaseRequestParam {
            {key = "ts_code";}
        }

        public static final trade_date trade_date = new trade_date();  // 交易日期（格式：YYYYMMDD，下同）
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