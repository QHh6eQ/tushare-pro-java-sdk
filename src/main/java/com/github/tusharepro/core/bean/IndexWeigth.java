package com.github.tusharepro.core.bean;

import com.github.tusharepro.core.http.BaseRequestParam;

/**
 * 指数成分和权重
 * https://tushare.pro/document/2?doc_id=96
 */
public interface IndexWeigth extends BaseBean {

    String API_NAME = "index_weigth";

    interface Fields {
        String index_code = "index_code";  // 指数代码
        String con_code = "con_code";  // 成分代码
        String trade_date = "trade_date";  // 交易日期
        String weight = "weight";  // 权重
    }

    interface Params {

        index_code index_code = new index_code();  // 指数代码 (二选一)
        class index_code extends BaseRequestParam {
            {key = "index_code";}
        }

        trade_date trade_date = new trade_date();  // 交易日期 （二选一）
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