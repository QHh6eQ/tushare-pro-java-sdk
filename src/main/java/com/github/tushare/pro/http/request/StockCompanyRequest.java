package com.github.tushare.pro.http.request;

import com.github.tushare.pro.TusharePro;
import com.github.tushare.pro.common.KeyValue;
import com.github.tushare.pro.http.BaseRequestParam;
import com.github.tushare.pro.http.Request;

/**
 * 上市公司基本信息
 */
public final class StockCompanyRequest extends Request<StockCompanyRequest> {

    public StockCompanyRequest() {
        this(null);
    }

    public StockCompanyRequest(TusharePro tusharePro) {
        super(tusharePro);
        setApi_name("stock_company");
    }

    public static class Fields {
        public static final String ts_code = "ts_code";  // 股票代码
        public static final String exchange = "exchange";  // 交易所代码 ，SSE上交所 SZSE深交所
        public static final String chairman = "chairman";  // 法人代表
        public static final String manager = "manager";  // 总经理
        public static final String secretary = "secretary";  // 董秘
        public static final String reg_capital = "reg_capital";  // 注册资本
        public static final String setup_date = "setup_date";  // 注册日期
        public static final String province = "province";  // 所在省份
        public static final String city = "city";  // 所在城市
        public static final String introduction = "introduction";  // 公司介绍
        public static final String website = "website";  // 公司主页
        public static final String email = "email";  // 电子邮件
        public static final String office = "office";  // 办公室
        public static final String employees = "employees";  // 员工人数
        public static final String main_business = "main_business";  // 主要业务及产品
        public static final String business_scope = "business_scope";  // 经营范围
    }

    public static class Params {
    }

}