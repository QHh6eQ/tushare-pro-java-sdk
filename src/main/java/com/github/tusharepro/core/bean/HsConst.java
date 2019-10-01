package com.github.tusharepro.core.bean;

import com.github.tusharepro.core.http.BaseRequestParam;

/**
 * 沪深股通成份股
 * https://tushare.pro/document/2?doc_id=104
 */
public interface HsConst extends BaseBean {

    String API_NAME = "hs_const";

    interface Fields {
        String ts_code = "ts_code";  // TS代码
        String hs_type = "hs_type";  // 沪深港通类型SH沪SZ深
        String in_date = "in_date";  // 纳入日期
        String out_date = "out_date";  // 剔除日期
        String is_new = "is_new";  // 是否最新 1是 0否
    }

    interface Params {

        hs_type hs_type = new hs_type();  // 类型SH沪股通SZ深股通
        class hs_type extends BaseRequestParam {
            {key = "hs_type";}
        }

        is_new is_new = new is_new();  // 是否最新 1 是 0 否 (默认1)
        class is_new extends BaseRequestParam {
            {key = "is_new";}
        }
    }

}