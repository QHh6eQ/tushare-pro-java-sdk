package com.github.tusharepro.core.bean;

import com.github.tusharepro.core.http.BaseRequestParam;

/**
 * 沪深股通十大成交股
 */
public interface HsgtTop10 extends BaseBean {

    String API_NAME = "hsgt_top10";

    class Fields {
        public static final String trade_date = "trade_date";  // 交易日期
        public static final String ts_code = "ts_code";  // 股票代码
        public static final String name = "name";  // 股票名称
        public static final String close = "close";  // 收盘价
        public static final String change = "change";  // 涨跌额
        public static final String rank = "rank";  // 资金排名
        public static final String market_type = "market_type";  // 市场类型（1：沪市 3：深市）
        public static final String amount = "amount";  // 成交金额（元）
        public static final String net_amount = "net_amount";  // 净成交金额（元）
        public static final String buy = "buy";  // 买入金额（元）
        public static final String sell = "sell";  // 卖出金额（元）
    }

    class Params {

        public static final ts_code ts_code = new ts_code();  // 股票代码（二选一）
        public static class ts_code extends BaseRequestParam {
            {key = "ts_code";}
        }

        public static final trade_date trade_date = new trade_date();  // 交易日期（二选一）
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

        public static final market_type market_type = new market_type();  // 市场类型（1：沪市 3：深市）
        public static class market_type extends BaseRequestParam {
            {key = "market_type";}
        }
    }

}