package com.github.tusharepro.core.bean;

import com.github.tusharepro.core.http.BaseRequestParam;

/**
 * 沪深港通资金流向
 */
public interface MoneyflowHsgt extends BaseBean {

    String API_NAME = "moneyflow_hsgt";

    class Fields {
        public static final String trade_date = "trade_date";  // 交易日期
        public static final String ggt_ss = "ggt_ss";  // 港股通（上海）
        public static final String ggt_sz = "ggt_sz";  // 港股通（深圳）
        public static final String hgt = "hgt";  // 沪股通（百万元）
        public static final String sgt = "sgt";  // 深股通（百万元）
        public static final String north_money = "north_money";  // 北向资金（百万元）
        public static final String south_money = "south_money";  // 南向资金（百万元）
    }

    class Params {

        public static final trade_date trade_date = new trade_date();  // 交易日期 (二选一)
        public static class trade_date extends BaseRequestParam {
            {key = "trade_date";}
        }

        public static final start_date start_date = new start_date();  // 开始日期 (二选一)
        public static class start_date extends BaseRequestParam {
            {key = "start_date";}
        }

        public static final end_date end_date = new end_date();  // 结束日期
        public static class end_date extends BaseRequestParam {
            {key = "end_date";}
        }
    }

}