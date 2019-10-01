package com.github.tusharepro.core.bean;

import com.github.tusharepro.core.http.BaseRequestParam;

/**
 * 申万行业分类
 * https://tushare.pro/document/2?doc_id=181
 */
public interface IndexClassify extends BaseBean {

    String API_NAME = "index_classify";

    interface Fields {
        String index_code = "index_code";  // 指数代码
        String industry_name = "industry_name";  // 行业名称
        String level = "level";  // 行业名称
        String industry_code = "industry_code";  // 行业代码
        String src = "src";  // 行业分类（SW申万）
    }

    interface Params {

        index_code index_code = new index_code();  // 指数代码
        class index_code extends BaseRequestParam {
            {key = "index_code";}
        }

        level level = new level();  // 行业分级（L1/L2/L3）
        class level extends BaseRequestParam {
            {key = "level";}
        }

        src src = new src();  // 指数来源（SW申万）
        class src extends BaseRequestParam {
            {key = "src";}
        }
    }

}