package com.github.tusharepro.core.bean;

import com.github.tusharepro.core.http.BaseRequestParam;

/**
 * 概念股分类
 * https://tushare.pro/document/2?doc_id=125
 */
public interface Concept extends BaseBean {

    String API_NAME = "concept";

    interface Fields {
        String code = "code";  // 概念分类ID
        String name = "name";  // 概念分类名称
        String src = "src";  // 来源
    }

    interface Params {

        src src = new src();  // 来源，默认为ts
        class src extends BaseRequestParam {
            {key = "src";}
        }
    }

}