package com.github.tusharepro.core.bean;

import com.github.tusharepro.core.http.BaseRequestParam;

/**
 * 每日成交持仓排名
 * https://tushare.pro/document/2?doc_id=139
 */
public interface FutHolding extends BaseBean {

    String API_NAME = "fut_holding";

    interface Fields {
        String trade_date = "trade_date";  // 交易日期
        String symbol = "symbol";  // 合约代码或类型
        String broker = "broker";  // 期货公司会员简称
        String vol = "vol";  // 成交量
        String vol_chg = "vol_chg";  // 成交量变化
        String long_hld = "long_hld";  // 持买仓量
        String long_chg = "long_chg";  // 持买仓量变化
        String short_hld = "short_hld";  // 持卖仓量
        String short_chg = "short_chg";  // 持卖仓量变化
        String exchange = "exchange";  // 交易所
    }

    interface Params {

        trade_date trade_date = new trade_date();  // 交易日期 （trade_date/symbol至少输入一个参数）
        class trade_date extends BaseRequestParam {
            {key = "trade_date";}
        }

        symbol symbol = new symbol();  // 合约或产品代码
        class symbol extends BaseRequestParam {
            {key = "symbol";}
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