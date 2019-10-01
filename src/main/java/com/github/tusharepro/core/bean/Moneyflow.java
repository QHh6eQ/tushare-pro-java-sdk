package com.github.tusharepro.core.bean;

import com.github.tusharepro.core.http.BaseRequestParam;

/**
 * 个股资金流向
 * https://tushare.pro/document/2?doc_id=170
 */
public interface Moneyflow extends BaseBean {

    String API_NAME = "moneyflow";

    interface Fields {
        String ts_code = "ts_code";  // TS代码
        String trade_date = "trade_date";  // 交易日期
        String buy_sm_vol = "buy_sm_vol";  // 小单买入量（手）
        String buy_sm_amount = "buy_sm_amount";  // 小单买入金额（万元）
        String sell_sm_vol = "sell_sm_vol";  // 小单卖出量（手）
        String sell_sm_amount = "sell_sm_amount";  // 小单卖出金额（万元）
        String buy_md_vol = "buy_md_vol";  // 中单买入量（手）
        String buy_md_amount = "buy_md_amount";  // 中单买入金额（万元）
        String sell_md_vol = "sell_md_vol";  // 中单卖出量（手）
        String sell_md_amount = "sell_md_amount";  // 中单卖出金额（万元）
        String buy_lg_vol = "buy_lg_vol";  // 大单买入量（手）
        String buy_lg_amount = "buy_lg_amount";  // 大单买入金额（万元）
        String sell_lg_vol = "sell_lg_vol";  // 大单卖出量（手）
        String sell_lg_amount = "sell_lg_amount";  // 大单卖出金额（万元）
        String buy_elg_vol = "buy_elg_vol";  // 特大单买入量（手）
        String buy_elg_amount = "buy_elg_amount";  // 特大单买入金额（万元）
        String sell_elg_vol = "sell_elg_vol";  // 特大单卖出量（手）
        String sell_elg_amount = "sell_elg_amount";  // 特大单卖出金额（万元）
        String net_mf_vol = "net_mf_vol";  // 净流入量（手）
        String net_mf_amount = "net_mf_amount";  // 净流入额（万元）
    }

    interface Params {

        ts_code ts_code = new ts_code();  // 股票代码 （股票和时间参数至少输入一个）
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
    }

}