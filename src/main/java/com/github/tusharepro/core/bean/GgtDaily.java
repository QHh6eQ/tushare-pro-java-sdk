package com.github.tusharepro.core.bean;

import com.github.tusharepro.core.http.BaseRequestParam;

/**
 * 港股通每日成交统计
 * https://tushare.pro/document/2?doc_id=196
 */
public interface GgtDaily extends BaseBean {

    String API_NAME = "ggt_daily";

    interface Fields {
        String trade_date = "trade_date";  // 交易日期
        String buy_amount = "buy_amount";  // 买入成交金额（亿元）
        String buy_volume = "buy_volume";  // 买入成交笔数（万笔）
        String sell_amount = "sell_amount";  // 卖出成交金额（亿元）
        String sell_volume = "sell_volume";  // 卖出成交笔数（万笔）
    }

    interface Params {

        trade_date trade_date = new trade_date();  // 交易日期 （格式YYYYMMDD，下同。支持单日和多日输入）
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