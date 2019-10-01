package com.github.tusharepro.core.bean;

import com.github.tusharepro.core.http.BaseRequestParam;

/**
 * 沪深港通资金流向
 * https://tushare.pro/document/2?doc_id=47
 */
public interface MoneyflowHsgt extends BaseBean {

    String API_NAME = "moneyflow_hsgt";

    interface Fields {
        String trade_date = "trade_date";  // 交易日期
        String ggt_ss = "ggt_ss";  // 港股通（上海）
        String ggt_sz = "ggt_sz";  // 港股通（深圳）
        String hgt = "hgt";  // 沪股通（百万元）
        String sgt = "sgt";  // 深股通（百万元）
        String north_money = "north_money";  // 北向资金（百万元）
        String south_money = "south_money";  // 南向资金（百万元）
    }

    interface Params {

        trade_date trade_date = new trade_date();  // 交易日期 (二选一)
        class trade_date extends BaseRequestParam {
            {key = "trade_date";}
        }

        start_date start_date = new start_date();  // 开始日期 (二选一)
        class start_date extends BaseRequestParam {
            {key = "start_date";}
        }

        end_date end_date = new end_date();  // 结束日期
        class end_date extends BaseRequestParam {
            {key = "end_date";}
        }
    }

}