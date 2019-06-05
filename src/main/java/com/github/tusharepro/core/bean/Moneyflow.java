package com.github.tusharepro.core.bean;

import com.github.tusharepro.core.http.BaseRequestParam;

/**
 * 个股资金流向
 */
public interface Moneyflow extends BaseBean {

    String API_NAME = "moneyflow";

    class Fields {
        public static final String ts_code = "ts_code";  // TS代码
        public static final String trade_date = "trade_date";  // 交易日期
        public static final String buy_sm_vol = "buy_sm_vol";  // 小单买入量（手）
        public static final String buy_sm_amount = "buy_sm_amount";  // 小单买入金额（万元）
        public static final String sell_sm_vol = "sell_sm_vol";  // 小单卖出量（手）
        public static final String sell_sm_amount = "sell_sm_amount";  // 小单卖出金额（万元）
        public static final String buy_md_vol = "buy_md_vol";  // 中单买入量（手）
        public static final String buy_md_amount = "buy_md_amount";  // 中单买入金额（万元）
        public static final String sell_md_vol = "sell_md_vol";  // 中单卖出量（手）
        public static final String sell_md_amount = "sell_md_amount";  // 中单卖出金额（万元）
        public static final String buy_lg_vol = "buy_lg_vol";  // 大单买入量（手）
        public static final String buy_lg_amount = "buy_lg_amount";  // 大单买入金额（万元）
        public static final String sell_lg_vol = "sell_lg_vol";  // 大单卖出量（手）
        public static final String sell_lg_amount = "sell_lg_amount";  // 大单卖出金额（万元）
        public static final String buy_elg_vol = "buy_elg_vol";  // 特大单买入量（手）
        public static final String buy_elg_amount = "buy_elg_amount";  // 特大单买入金额（万元）
        public static final String sell_elg_vol = "sell_elg_vol";  // 特大单卖出量（手）
        public static final String sell_elg_amount = "sell_elg_amount";  // 特大单卖出金额（万元）
        public static final String net_mf_vol = "net_mf_vol";  // 净流入量（手）
        public static final String net_mf_amount = "net_mf_amount";  // 净流入额（万元）
    }

    class Params {

        public static final ts_code ts_code = new ts_code();  // 股票代码 （股票和时间参数至少输入一个）
        public static class ts_code extends BaseRequestParam {
            {key = "ts_code";}
        }

        public static final trade_date trade_date = new trade_date();  // 交易日期
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