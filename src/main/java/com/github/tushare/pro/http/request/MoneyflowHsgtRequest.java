package com.github.tushare.pro.http.request;

import com.github.tushare.pro.TusharePro;
import com.github.tushare.pro.common.KeyValue;
import com.github.tushare.pro.http.BaseRequestParam;
import com.github.tushare.pro.http.Request;

/**
 * 沪深港通资金流向
 */
public final class MoneyflowHsgtRequest extends Request<MoneyflowHsgtRequest> {

    public MoneyflowHsgtRequest() {
        this(null);
    }

    public MoneyflowHsgtRequest(TusharePro tusharePro) {
        super(tusharePro);
        setApi_name("moneyflow_hsgt");
    }

    public static class Fields {
        public static final String trade_date = "trade_date";  // 交易日期
        public static final String ggt_ss = "ggt_ss";  // 港股通（上海）
        public static final String ggt_sz = "ggt_sz";  // 港股通（深圳）
        public static final String hgt = "hgt";  // 沪股通（百万元）
        public static final String sgt = "sgt";  // 深股通（百万元）
        public static final String north_money = "north_money";  // 北向资金（百万元）
        public static final String south_money = "south_money";  // 南向资金（百万元）
    }

    public static class Params {

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