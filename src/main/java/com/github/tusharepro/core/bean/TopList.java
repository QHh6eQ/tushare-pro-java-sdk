package com.github.tusharepro.core.bean;

import com.github.tusharepro.core.http.BaseRequestParam;

/**
 * 龙虎榜每日明细
 * https://tushare.pro/document/2?doc_id=106
 */
public interface TopList extends BaseBean {

    String API_NAME = "top_list";

    interface Fields {
        String trade_date = "trade_date";  // 交易日期
        String ts_code = "ts_code";  // TS代码
        String name = "name";  // 名称
        String close = "close";  // 收盘价
        String pct_change = "pct_change";  // 涨跌幅
        String turnover_rate = "turnover_rate";  // 换手率
        String amount = "amount";  // 总成交额
        String l_sell = "l_sell";  // 龙虎榜卖出额
        String l_buy = "l_buy";  // 龙虎榜买入额
        String l_amount = "l_amount";  // 龙虎榜成交额
        String net_amount = "net_amount";  // 龙虎榜净买入额
        String net_rate = "net_rate";  // 龙虎榜净买额占比
        String amount_rate = "amount_rate";  // 龙虎榜成交额占比
        String float_values = "float_values";  // 当日流通市值
        String reason = "reason";  // 上榜理由
    }

    interface Params {

        trade_date trade_date = new trade_date();  // 交易日期
        class trade_date extends BaseRequestParam {
            {key = "trade_date";}
        }

        ts_code ts_code = new ts_code();  // 股票代码
        class ts_code extends BaseRequestParam {
            {key = "ts_code";}
        }
    }

}