package com.github.tusharepro.core.bean;

import com.github.tusharepro.core.http.BaseRequestParam;

/**
 * 基金规模数据
 * https://tushare.pro/document/2?doc_id=207
 */
public interface FundShare extends BaseBean {

    String API_NAME = "fund_share";

    interface Fields {
        String ts_code = "ts_code";  // 基金代码，支持多只基金同时提取，用逗号分隔
        String trade_date = "trade_date";  // 交易（变动）日期，格式YYYYMMDD
        String fd_share = "fd_share";  // 基金份额（万）
    }

    interface Params {

        ts_code ts_code = new ts_code();  // TS基金代码
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

        fund_type fund_type = new fund_type();  // 基金类型，见下表
        class fund_type extends BaseRequestParam {
            {key = "fund_type";}
        }

        market market = new market();  // 市场：SH/SZ
        class market extends BaseRequestParam {
            {key = "market";}
        }
    }

}