package com.github.tusharepro.core.bean;

import com.github.tusharepro.core.http.BaseRequestParam;

/**
 * 股票账户开户数据
 */
public interface StkAccount extends BaseBean {

    String API_NAME = "stk_account";

    class Fields {
        public static final String date = "date";  // 统计周期
        public static final String weekly_new = "weekly_new";  // 本周新增（万）
        public static final String total = "total";  // 期末总账户数（万）
        public static final String weekly_hold = "weekly_hold";  // 本周持仓账户数（万）
        public static final String weekly_trade = "weekly_trade";  // 本周参与交易账户数（万）
    }

    class Params {

        public static final date date = new date();  // 日期
        public static class date extends BaseRequestParam {
            {key = "date";}
        }

        public static final start_date start_date = new start_date();  // 开始日期
        public static class start_date extends BaseRequestParam {
            {key = "start_date";}
        }

        public static final end_date end_date = new end_date();  // 结束日期
        public static class end_date extends BaseRequestParam {
            {key = "end_date";}
        }
    }

}