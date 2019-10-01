package com.github.tusharepro.core.bean;

import com.github.tusharepro.core.http.BaseRequestParam;

/**
 * 港股通十大成交股
 * https://tushare.pro/document/2?doc_id=49
 */
public interface GgtTop10 extends BaseBean {

    String API_NAME = "ggt_top10";

    interface Fields {
        String trade_date = "trade_date";  // 交易日期
        String ts_code = "ts_code";  // 股票代码
        String name = "name";  // 股票名称
        String close = "close";  // 收盘价
        String p_change = "p_change";  // 涨跌幅
        String rank = "rank";  // 资金排名
        String market_type = "market_type";  // 市场类型 2：港股通（沪） 4：港股通（深）
        String amount = "amount";  // 累计成交金额（元）
        String net_amount = "net_amount";  // 净买入金额（元）
        String sh_amount = "sh_amount";  // 沪市成交金额（元）
        String sh_net_amount = "sh_net_amount";  // 沪市净买入金额（元）
        String sh_buy = "sh_buy";  // 沪市买入金额（元）
        String sh_sell = "sh_sell";  // 沪市卖出金额
        String sz_amount = "sz_amount";  // 深市成交金额（元）
        String sz_net_amount = "sz_net_amount";  // 深市净买入金额（元）
        String sz_buy = "sz_buy";  // 深市买入金额（元）
        String sz_sell = "sz_sell";  // 深市卖出金额（元）
    }

    interface Params {

        ts_code ts_code = new ts_code();  // 股票代码（二选一）
        class ts_code extends BaseRequestParam {
            {key = "ts_code";}
        }

        trade_date trade_date = new trade_date();  // 交易日期（二选一）
        class trade_date extends BaseRequestParam {
            {key = "trade_date";}
        }

        start_date start_date = new start_date();  // 开始日期
        class start_date extends BaseRequestParam {
            {key = "start_date";}
        }

        end_date end_date = new end_date();  // 结束日期
        class end_date extends BaseRequestParam {
            {key = "end_date";}
        }

        market_type market_type = new market_type();  // 市场类型 2：港股通（沪） 4：港股通（深）
        class market_type extends BaseRequestParam {
            {key = "market_type";}
        }
    }

}