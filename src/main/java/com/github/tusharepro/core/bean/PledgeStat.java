package com.github.tusharepro.core.bean;

import com.github.tusharepro.core.http.BaseRequestParam;

/**
 * 股权质押统计数据
 */
public interface PledgeStat extends BaseBean {

    String API_NAME = "pledge_stat";

    class Fields {
        public static final String ts_code = "ts_code";  // TS代码
        public static final String end_date = "end_date";  // 截至日期
        public static final String pledge_count = "pledge_count";  // 质押次数
        public static final String unrest_pledge = "unrest_pledge";  // 无限售股质押数量（万）
        public static final String rest_pledge = "rest_pledge";  // 限售股份质押数量（万）
        public static final String total_share = "total_share";  // 总股本
        public static final String pledge_ratio = "pledge_ratio";  // 质押比例
    }

    class Params {

        public static final ts_code ts_code = new ts_code();  // 股票代码
        public static class ts_code extends BaseRequestParam {
            {key = "ts_code";}
        }
    }

}