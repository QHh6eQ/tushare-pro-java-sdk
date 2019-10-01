package com.github.tusharepro.core.bean;

import com.github.tusharepro.core.http.BaseRequestParam;

/**
 * 申万行业成分构成
 * https://tushare.pro/document/2?doc_id=182
 */
public interface IndexMember extends BaseBean {

    String API_NAME = "index_member";

    interface Fields {
        String index_code = "index_code";  // 指数代码
        String index_name = "index_name";  // 指数名称
        String con_code = "con_code";  // 成分股票代码
        String con_name = "con_name";  // 成分股票名称
        String in_date = "in_date";  // 纳入日期
        String out_date = "out_date";  // 剔除日期
        String is_new = "is_new";  // 是否最新Y是N否
    }

    interface Params {

        index_code index_code = new index_code();  // 指数代码
        class index_code extends BaseRequestParam {
            {key = "index_code";}
        }

        ts_code ts_code = new ts_code();  // 股票代码
        class ts_code extends BaseRequestParam {
            {key = "ts_code";}
        }

        is_new is_new = new is_new();  // 是否最新（默认为“Y是”）
        class is_new extends BaseRequestParam {
            {key = "is_new";}
        }
    }

}