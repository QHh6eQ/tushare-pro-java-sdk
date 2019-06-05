package com.github.tusharepro.core.bean;

import com.github.tusharepro.core.http.BaseRequestParam;

/**
 * 龙虎榜机构明细
 */
public interface TopInst extends BaseBean {

    String API_NAME = "top_inst";

    class Fields {
        public static final String trade_date = "trade_date";  // 交易日期
        public static final String ts_code = "ts_code";  // TS代码
        public static final String exalter = "exalter";  // 营业部名称
        public static final String buy = "buy";  // 买入额（万）
        public static final String buy_rate = "buy_rate";  // 买入占总成交比例
        public static final String sell = "sell";  // 卖出额（万）
        public static final String sell_rate = "sell_rate";  // 卖出占总成交比例
        public static final String net_buy = "net_buy";  // 净成交额（万）
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