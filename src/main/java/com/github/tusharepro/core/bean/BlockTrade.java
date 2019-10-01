package com.github.tusharepro.core.bean;

import com.github.tusharepro.core.http.BaseRequestParam;

/**
 * 大宗交易
 * https://tushare.pro/document/2?doc_id=161
 */
public interface BlockTrade extends BaseBean {

    String API_NAME = "block_trade";

    interface Fields {
        String ts_code = "ts_code";  // TS代码
        String trade_date = "trade_date";  // 交易日历
        String price = "price";  // 成交价
        String vol = "vol";  // 成交量（万股）
        String amount = "amount";  // 成交金额
        String buyer = "buyer";  // 买方营业部
        String seller = "seller";  // 卖方营业部
    }

    interface Params {

        ts_code ts_code = new ts_code();  // TS代码（股票代码和日期至少输入一个参数）
        class ts_code extends BaseRequestParam {
            {key = "ts_code";}
        }

        trade_date trade_date = new trade_date();  // 交易日期（格式：YYYYMMDD，下同）
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