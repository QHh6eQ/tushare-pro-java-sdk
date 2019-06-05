package com.github.tusharepro.core.bean;

import com.github.tusharepro.core.http.BaseRequestParam;

/**
 * 龙虎榜每日明细
 */
public interface TopList extends BaseBean {

    String API_NAME = "top_list";

    class Fields {
        public static final String trade_date = "trade_date";  // 交易日期
        public static final String ts_code = "ts_code";  // TS代码
        public static final String name = "name";  // 名称
        public static final String close = "close";  // 收盘价
        public static final String pct_change = "pct_change";  // 涨跌幅
        public static final String turnover_rate = "turnover_rate";  // 换手率
        public static final String amount = "amount";  // 总成交额
        public static final String l_sell = "l_sell";  // 龙虎榜卖出额
        public static final String l_buy = "l_buy";  // 龙虎榜买入额
        public static final String l_amount = "l_amount";  // 龙虎榜成交额
        public static final String net_amount = "net_amount";  // 龙虎榜净买入额
        public static final String net_rate = "net_rate";  // 龙虎榜净买额占比
        public static final String amount_rate = "amount_rate";  // 龙虎榜成交额占比
        public static final String float_values = "float_values";  // 当日流通市值
        public static final String reason = "reason";  // 上榜理由
    }

    class Params {

        public static final trade_date trade_date = new trade_date();  // 交易日期
        public static class trade_date extends BaseRequestParam {
            {key = "trade_date";}
        }

        public static final ts_code ts_code = new ts_code();  // 股票代码
        public static class ts_code extends BaseRequestParam {
            {key = "ts_code";}
        }
    }

}