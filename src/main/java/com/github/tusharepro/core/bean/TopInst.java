package com.github.tusharepro.core.bean;

import com.github.tusharepro.core.http.BaseRequestParam;

/**
 * 龙虎榜机构明细
 * https://tushare.pro/document/2?doc_id=107
 */
public interface TopInst extends BaseBean {

    String API_NAME = "top_inst";

    interface Fields {
        String trade_date = "trade_date";  // 交易日期
        String ts_code = "ts_code";  // TS代码
        String exalter = "exalter";  // 营业部名称
        String buy = "buy";  // 买入额（万）
        String buy_rate = "buy_rate";  // 买入占总成交比例
        String sell = "sell";  // 卖出额（万）
        String sell_rate = "sell_rate";  // 卖出占总成交比例
        String net_buy = "net_buy";  // 净成交额（万）
    }

    interface Params {

        trade_date trade_date = new trade_date();  // 交易日期
        class trade_date extends BaseRequestParam {
            {key = "trade_date";}
        }

        ts_code ts_code = new ts_code();  // TS代码
        class ts_code extends BaseRequestParam {
            {key = "ts_code";}
        }
    }

}