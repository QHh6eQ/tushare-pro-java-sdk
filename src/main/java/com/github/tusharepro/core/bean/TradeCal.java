package com.github.tusharepro.core.bean;

import com.github.tusharepro.core.http.BaseRequestParam;

/**
 * 交易日历
 * https://tushare.pro/document/2?doc_id=26
 */
public interface TradeCal extends BaseBean {

    String API_NAME = "trade_cal";

    interface Fields {
        String exchange = "exchange";  // 交易所 SSE上交所 SZSE深交所
        String cal_date = "cal_date";  // 日历日期
        String is_open = "is_open";  // 是否交易 0休市 1交易
        String pretrade_date = "pretrade_date";  // 上一个交易日
    }

    interface Params {

        exchange exchange = new exchange();  // 交易所 SSE上交所 SZSE深交所
        class exchange extends BaseRequestParam {
            {key = "exchange";}
        }

        start_date start_date = new start_date();  // 开始日期
        class start_date extends BaseRequestParam {
            {key = "start_date";}
        }

        end_date end_date = new end_date();  // 结束日期
        class end_date extends BaseRequestParam {
            {key = "end_date";}
        }

        is_open is_open = new is_open();  // 是否交易 0休市 1交易
        class is_open extends BaseRequestParam {
            {key = "is_open";}
        }
    }

}