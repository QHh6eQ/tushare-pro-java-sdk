package com.github.tusharepro.core.bean;

import com.github.tusharepro.core.http.BaseRequestParam;

/**
 * 复权因子
 * https://tushare.pro/document/2?doc_id=28
 */
public interface AdjFactor extends BaseBean {

    String API_NAME = "adj_factor";

    interface Fields {
        String ts_code = "ts_code";  // 股票代码
        String trade_date = "trade_date";  // 交易日期
        String adj_factor = "adj_factor";  // 复权因子
    }

    interface Params {

        ts_code ts_code = new ts_code();  // 股票代码
        class ts_code extends BaseRequestParam {
            {key = "ts_code";}
        }

        trade_date trade_date = new trade_date();  // 交易日期(YYYYMMDD，下同)
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