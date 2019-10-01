package com.github.tusharepro.core.bean;

import com.github.tusharepro.core.http.BaseRequestParam;

/**
 * 公募基金公司
 * https://tushare.pro/document/2?doc_id=118
 */
public interface FundCompany extends BaseBean {

    String API_NAME = "fund_company";

    interface Fields {
        String name = "name";  // 基金公司名称
        String shortname = "shortname";  // 简称
        String short_enname = "short_enname";  // 英文缩写
        String province = "province";  // 省份
        String city = "city";  // 城市
        String address = "address";  // 注册地址
        String phone = "phone";  // 电话
        String office = "office";  // 办公地址
        String website = "website";  // 公司网址
        String chairman = "chairman";  // 法人代表
        String manager = "manager";  // 总经理
        String reg_capital = "reg_capital";  // 注册资本
        String setup_date = "setup_date";  // 成立日期
        String end_date = "end_date";  // 公司终止日期
        String employees = "employees";  // 员工总数
        String main_business = "main_business";  // 主要产品及业务
        String org_code = "org_code";  // 组织机构代码
        String credit_code = "credit_code";  // 统一社会信用代码
    }

    interface Params {
    }

}