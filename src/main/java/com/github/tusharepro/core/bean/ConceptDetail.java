package com.github.tusharepro.core.bean;

import com.github.tusharepro.core.http.BaseRequestParam;

/**
 * 概念股列表
 * https://tushare.pro/document/2?doc_id=126
 */
public interface ConceptDetail extends BaseBean {

    String API_NAME = "concept_detail";

    interface Fields {
        String id = "id";  // 概念代码
        String concept_name = "concept_name";  // 概念名称
        String ts_code = "ts_code";  // 股票代码
        String name = "name";  // 股票名称
        String in_date = "in_date";  // 纳入日期
        String out_date = "out_date";  // 剔除日期
    }

    interface Params {

        id id = new id();  // 概念分类ID （id来自概念股分类接口）
        class id extends BaseRequestParam {
            {key = "id";}
        }

        ts_code ts_code = new ts_code();  // 股票代码  （以上参数二选一）
        class ts_code extends BaseRequestParam {
            {key = "ts_code";}
        }
    }

}