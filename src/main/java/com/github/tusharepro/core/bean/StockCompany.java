package com.github.tusharepro.core.bean;

import com.github.tusharepro.core.http.BaseRequestParam;

/**
 * 上市公司基本信息
 * https://tushare.pro/document/2?doc_id=112
 */
public interface StockCompany extends BaseBean {

    String API_NAME = "stock_company";

    interface Fields {
        String ts_code = "ts_code";  // 股票代码
        String exchange = "exchange";  // 交易所代码 ，SSE上交所 SZSE深交所
        String chairman = "chairman";  // 法人代表
        String manager = "manager";  // 总经理
        String secretary = "secretary";  // 董秘
        String reg_capital = "reg_capital";  // 注册资本
        String setup_date = "setup_date";  // 注册日期
        String province = "province";  // 所在省份
        String city = "city";  // 所在城市
        String introduction = "introduction";  // 公司介绍
        String website = "website";  // 公司主页
        String email = "email";  // 电子邮件
        String office = "office";  // 办公室
        String employees = "employees";  // 员工人数
        String main_business = "main_business";  // 主要业务及产品
        String business_scope = "business_scope";  // 经营范围
    }

    interface Params {

        exchange exchange = new exchange();  // 交易所代码 ，SSE上交所 SZSE深交所 ，默认SSE
        class exchange extends BaseRequestParam {
            {key = "exchange";}
        }
    }

}