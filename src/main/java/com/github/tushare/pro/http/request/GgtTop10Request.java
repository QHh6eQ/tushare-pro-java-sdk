package com.github.tushare.pro.http.request;

import com.github.tushare.pro.TusharePro;
import com.github.tushare.pro.common.KeyValue;
import com.github.tushare.pro.http.BaseRequestParam;
import com.github.tushare.pro.http.Request;

/**
 * 港股通十大成交股
 */
public final class GgtTop10Request extends Request<GgtTop10Request> {

    public GgtTop10Request() {
        this(null);
    }

    public GgtTop10Request(TusharePro tusharePro) {
        super(tusharePro);
        setApi_name("ggt_top10");
    }

    public static class Fields {
        public static final String trade_date = "trade_date";  // 交易日期
        public static final String ts_code = "ts_code";  // 股票代码
        public static final String name = "name";  // 股票名称
        public static final String close = "close";  // 收盘价
        public static final String p_change = "p_change";  // 涨跌幅
        public static final String rank = "rank";  // 资金排名
        public static final String market_type = "market_type";  // 市场类型 2：港股通（沪） 4：港股通（深）
        public static final String amount = "amount";  // 累计成交金额（元）
        public static final String net_amount = "net_amount";  // 净买入金额（元）
        public static final String sh_amount = "sh_amount";  // 沪市成交金额（元）
        public static final String sh_net_amount = "sh_net_amount";  // 沪市净买入金额（元）
        public static final String sh_buy = "sh_buy";  // 沪市买入金额（元）
        public static final String sh_sell = "sh_sell";  // 沪市卖出金额
        public static final String sz_amount = "sz_amount";  // 深市成交金额（元）
        public static final String sz_net_amount = "sz_net_amount";  // 深市净买入金额（元）
        public static final String sz_buy = "sz_buy";  // 深市买入金额（元）
        public static final String sz_sell = "sz_sell";  // 深市卖出金额（元）
    }

    public static class Params {

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

        public static final market_type market_type = new market_type();  // 市场类型 2：港股通（沪） 4：港股通（深）
        public static class market_type extends BaseRequestParam {
            {key = "market_type";}
        }
    }

}