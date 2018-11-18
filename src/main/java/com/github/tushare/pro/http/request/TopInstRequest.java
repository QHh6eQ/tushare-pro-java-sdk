package com.github.tushare.pro.http.request;

import com.github.tushare.pro.TusharePro;
import com.github.tushare.pro.common.KeyValue;
import com.github.tushare.pro.http.BaseRequestParam;
import com.github.tushare.pro.http.Request;

/**
 * 龙虎榜机构明细
 */
public final class TopInstRequest extends Request<TopInstRequest> {

    public TopInstRequest() {
        this(null);
    }

    public TopInstRequest(TusharePro tusharePro) {
        super(tusharePro);
        setApi_name("top_inst");
    }

    public static class Fields {
        public static final String trade_date = "trade_date";  // 交易日期
        public static final String ts_code = "ts_code";  // TS代码
        public static final String exalter = "exalter";  // 营业部名称
        public static final String buy = "buy";  // 买入额（万）
        public static final String buy_rate = "buy_rate";  // 买入占总成交比例
        public static final String sell = "sell";  // 卖出额（万）
        public static final String sell_rate = "sell_rate";  // 卖出占总成交比例
        public static final String net_buy = "net_buy";  // 净成交额（万）
    }

    public static class Params {

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