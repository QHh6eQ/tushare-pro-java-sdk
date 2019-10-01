package com.github.tusharepro.core.bean;

import com.github.tusharepro.core.http.BaseRequestParam;

/**
 * 结算参数
 * https://tushare.pro/document/2?doc_id=141
 */
public interface FutSettle extends BaseBean {

    String API_NAME = "fut_settle";

    interface Fields {
        String ts_code = "ts_code";  // 合约代码
        String trade_date = "trade_date";  // 交易日期
        String settle = "settle";  // 结算价
        String trading_fee_rate = "trading_fee_rate";  // 交易手续费率
        String trading_fee = "trading_fee";  // 交易手续费
        String delivery_fee = "delivery_fee";  // 交割手续费
        String b_hedging_margin_rate = "b_hedging_margin_rate";  // 买套保交易保证金率
        String s_hedging_margin_rate = "s_hedging_margin_rate";  // 卖套保交易保证金率
        String long_margin_rate = "long_margin_rate";  // 买投机交易保证金率
        String short_margin_rate = "short_margin_rate";  // 卖投机交易保证金率
        String offset_today_fee = "offset_today_fee";  // 平今仓手续率
        String exchange = "exchange";  // 交易所
    }

    interface Params {

        trade_date trade_date = new trade_date();  // 交易日期 （trade_date/ts_code至少需要输入一个参数）
        class trade_date extends BaseRequestParam {
            {key = "trade_date";}
        }

        ts_code ts_code = new ts_code();  // 合约代码
        class ts_code extends BaseRequestParam {
            {key = "ts_code";}
        }

        start_date start_date = new start_date();  // 开始日期
        class start_date extends BaseRequestParam {
            {key = "start_date";}
        }

        end_date end_date = new end_date();  // 结束日期
        class end_date extends BaseRequestParam {
            {key = "end_date";}
        }

        exchange exchange = new exchange();  // 交易所代码
        class exchange extends BaseRequestParam {
            {key = "exchange";}
        }
    }

}