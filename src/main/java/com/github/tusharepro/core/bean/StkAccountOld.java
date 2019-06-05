package com.github.tusharepro.core.bean;

import com.github.tusharepro.core.http.BaseRequestParam;

/**
 * 股票账户开户数据（旧）
 */
public interface StkAccountOld extends BaseBean {

    String API_NAME = "stk_account_old";

    class Fields {
        public static final String date = "date";  // 统计周期
        public static final String new_sh = "new_sh";  // 本周新增（上海，户）
        public static final String new_sz = "new_sz";  // 本周新增（深圳，户）
        public static final String active_sh = "active_sh";  // 期末有效账户（上海，万户）
        public static final String active_sz = "active_sz";  // 期末有效账户（深圳，万户）
        public static final String total_sh = "total_sh";  // 期末账户数（上海，万户）
        public static final String total_sz = "total_sz";  // 期末账户数（深圳，万户）
        public static final String trade_sh = "trade_sh";  // 参与交易账户数（上海，万户）
        public static final String trade_sz = "trade_sz";  // 参与交易账户数（深圳，万户）
    }

    class Params {

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