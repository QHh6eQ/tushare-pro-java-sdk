package com.github.tusharepro.core.bean;

import com.github.tusharepro.core.http.BaseRequestParam;

/**
 * 基金复权因子
 * https://tushare.pro/document/2?doc_id=199
 */
public interface FundAdj extends BaseBean {

    String API_NAME = "fund_adj";

    interface Fields {
        String ts_code = "ts_code";  // ts基金代码
        String trade_date = "trade_date";  // 交易日期
        String adj_factor = "adj_factor";  // 复权因子
    }

    interface Params {

        ts_code ts_code = new ts_code();  // TS基金代码（支持多只基金输入）
        class ts_code extends BaseRequestParam {
            {key = "ts_code";}
        }

        trade_date trade_date = new trade_date();  // 交易日期（格式：yyyymmdd，下同）
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

        offset offset = new offset();  // 开始行数
        class offset extends BaseRequestParam {
            {key = "offset";}
        }

        limit limit = new limit();  // 最大行数
        class limit extends BaseRequestParam {
            {key = "limit";}
        }
    }

}