package com.github.tusharepro.core.bean;

import com.github.tusharepro.core.http.BaseRequestParam;

/**
 * 沪深港股通持股明细
 * https://tushare.pro/document/2?doc_id=188
 */
public interface HkHold extends BaseBean {

    String API_NAME = "hk_hold";

    interface Fields {
        String code = "code";  // 原始代码
        String trade_date = "trade_date";  // 交易日期
        String ts_code = "ts_code";  // TS代码
        String name = "name";  // 股票名称
        String vol = "vol";  // 持股数量(股)
        String ratio = "ratio";  // 持股占比（%）
        String exchange = "exchange";  // 类型：SH沪股通SZ深港通HK港股通
    }

    interface Params {

        code code = new code();  // 交易所代码
        class code extends BaseRequestParam {
            {key = "code";}
        }

        ts_code ts_code = new ts_code();  // TS股票代码
        class ts_code extends BaseRequestParam {
            {key = "ts_code";}
        }

        trade_date trade_date = new trade_date();  // 交易日期
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

        exchange exchange = new exchange();  // 类型：SH沪股通（北向）SZ深股通（北向）HK港股通（南向持股）
        class exchange extends BaseRequestParam {
            {key = "exchange";}
        }
    }

}