package com.github.tusharepro.core.bean;

import com.github.tusharepro.core.http.BaseRequestParam;

/**
 * 股票回购
 */
public interface Repurchase extends BaseBean {

    String API_NAME = "repurchase";

    class Fields {
        public static final String ts_code = "ts_code";  // TS代码
        public static final String ann_date = "ann_date";  // 公告日期
        public static final String end_date = "end_date";  // 截止日期
        public static final String proc = "proc";  // 进度
        public static final String exp_date = "exp_date";  // 过期日期
        public static final String vol = "vol";  // 回购数量
        public static final String amount = "amount";  // 回购金额
        public static final String high_limit = "high_limit";  // 回购最高价
        public static final String low_limit = "low_limit";  // 回购最低价
    }

    class Params {

        public static final ann_date ann_date = new ann_date();  // 公告日期（任意填参数，如果都不填，单次默认返回2000条）
        public static class ann_date extends BaseRequestParam {
            {key = "ann_date";}
        }

        public static final start_date start_date = new start_date();  // 公告开始日期
        public static class start_date extends BaseRequestParam {
            {key = "start_date";}
        }

        public static final end_date end_date = new end_date();  // 公告结束日期
        public static class end_date extends BaseRequestParam {
            {key = "end_date";}
        }
    }

}