package com.github.tusharepro.core.bean;

import com.github.tusharepro.core.http.BaseRequestParam;

/**
 * IPO新股列表
 */
public interface NewShare extends BaseBean {

    String API_NAME = "new_share";

    class Fields {
        public static final String ts_code = "ts_code";  // TS股票代码
        public static final String sub_code = "sub_code";  // 申购代码
        public static final String name = "name";  // 名称
        public static final String ipo_date = "ipo_date";  // 上网发行日期
        public static final String issue_date = "issue_date";  // 上市日期
        public static final String amount = "amount";  // 发行总量（万股）
        public static final String market_amount = "market_amount";  // 上网发行总量（万股）
        public static final String price = "price";  // 发行价格
        public static final String pe = "pe";  // 市盈率
        public static final String limit_amount = "limit_amount";  // 个人申购上限（万股）
        public static final String funds = "funds";  // 募集资金（亿元）
        public static final String ballot = "ballot";  // 中签率
    }

    class Params {

        public static final start_date start_date = new start_date();  // 上网发行开始日期
        public static class start_date extends BaseRequestParam {
            {key = "start_date";}
        }

        public static final end_date end_date = new end_date();  // 上网发行结束日期
        public static class end_date extends BaseRequestParam {
            {key = "end_date";}
        }
    }

}