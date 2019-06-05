package com.github.tusharepro.core.bean;

import com.github.tusharepro.core.http.BaseRequestParam;

/**
 * 指数成分和权重
 */
public interface IndexWeigth extends BaseBean {

    String API_NAME = "index_weigth";

    class Fields {
        public static final String index_code = "index_code";  // 指数代码
        public static final String con_code = "con_code";  // 成分代码
        public static final String trade_date = "trade_date";  // 交易日期
        public static final String weight = "weight";  // 权重
    }

    class Params {

        public static final index_code index_code = new index_code();  // 指数代码 (二选一)
        public static class index_code extends BaseRequestParam {
            {key = "index_code";}
        }

        public static final trade_date trade_date = new trade_date();  // 交易日期 （二选一）
        public static class trade_date extends BaseRequestParam {
            {key = "trade_date";}
        }

        public static final start_date start_date = new start_date();  // 开始日期
        public static class start_date extends BaseRequestParam {
            {key = "start_date";}
        }

        public static final end_date end_date = new end_date();  // 结束日期
        public static class end_date extends BaseRequestParam {
            {key = "end_date";}
        }
    }

}