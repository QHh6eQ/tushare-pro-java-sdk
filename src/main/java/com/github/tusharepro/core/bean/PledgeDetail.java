package com.github.tusharepro.core.bean;

import com.github.tusharepro.core.http.BaseRequestParam;

/**
 * 股权质押明细
 */
public interface PledgeDetail extends BaseBean {

    String API_NAME = "pledge_detail";

    class Fields {
        public static final String ts_code = "ts_code";  // TS股票代码
        public static final String ann_date = "ann_date";  // 公告日期
        public static final String holder_name = "holder_name";  // 股东名称
        public static final String pledge_amount = "pledge_amount";  // 质押数量
        public static final String start_date = "start_date";  // 质押开始日期
        public static final String end_date = "end_date";  // 质押结束日期
        public static final String is_release = "is_release";  // 是否已解押
        public static final String release_date = "release_date";  // 解押日期
        public static final String pledgor = "pledgor";  // 质押方
        public static final String holding_amount = "holding_amount";  // 持股总数
        public static final String pledged_amount = "pledged_amount";  // 质押总数
        public static final String p_total_ratio = "p_total_ratio";  // 本次质押占总股本比例
        public static final String h_total_ratio = "h_total_ratio";  // 持股总数占总股本比例
        public static final String is_buyback = "is_buyback";  // 是否回购
    }

    class Params {

        public static final ts_code ts_code = new ts_code();  // 股票代码
        public static class ts_code extends BaseRequestParam {
            {key = "ts_code";}
        }
    }

}