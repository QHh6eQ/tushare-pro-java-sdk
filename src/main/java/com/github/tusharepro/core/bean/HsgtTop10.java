package com.github.tusharepro.core.bean;

import com.github.tusharepro.core.http.BaseRequestParam;

/**
 * 沪深股通十大成交股
 * https://tushare.pro/document/2?doc_id=48
 */
public interface HsgtTop10 extends BaseBean {

    String API_NAME = "hsgt_top10";

    interface Fields {
        String trade_date = "trade_date";  // 交易日期
        String ts_code = "ts_code";  // 股票代码
        String name = "name";  // 股票名称
        String close = "close";  // 收盘价
        String change = "change";  // 涨跌额
        String rank = "rank";  // 资金排名
        String market_type = "market_type";  // 市场类型（1：沪市 3：深市）
        String amount = "amount";  // 成交金额（元）
        String net_amount = "net_amount";  // 净成交金额（元）
        String buy = "buy";  // 买入金额（元）
        String sell = "sell";  // 卖出金额（元）
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

        market_type market_type = new market_type();  // 市场类型（1：沪市 3：深市）
        class market_type extends BaseRequestParam {
            {key = "market_type";}
        }
    }

}