package com.github.tusharepro.core.bean;

import com.github.tusharepro.core.http.BaseRequestParam;

/**
 * 指数基本信息
 * https://tushare.pro/document/2?doc_id=94
 */
public interface IndexBasic extends BaseBean {

    String API_NAME = "index_basic";

    interface Fields {
        String ts_code = "ts_code";  // TS代码
        String name = "name";  // 简称
        String fullname = "fullname";  // 指数全称
        String market = "market";  // 市场
        String publisher = "publisher";  // 发布方
        String index_type = "index_type";  // 指数风格
        String category = "category";  // 指数类别
        String base_date = "base_date";  // 基期
        String base_point = "base_point";  // 基点
        String list_date = "list_date";  // 发布日期
        String weight_rule = "weight_rule";  // 加权方式
        String desc = "desc";  // 描述
        String exp_date = "exp_date";  // 终止日期
    }

    interface Params {

        ts_code ts_code = new ts_code();  // 指数代码
        class ts_code extends BaseRequestParam {
            {key = "ts_code";}
        }

        market market = new market();  // 交易所或服务商
        class market extends BaseRequestParam {
            {key = "market";}
        }

        publisher publisher = new publisher();  // 发布商
        class publisher extends BaseRequestParam {
            {key = "publisher";}
        }

        category category = new category();  // 指数类别
        class category extends BaseRequestParam {
            {key = "category";}
        }
    }

}