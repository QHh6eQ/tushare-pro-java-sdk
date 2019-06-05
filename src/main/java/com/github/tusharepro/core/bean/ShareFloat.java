package com.github.tusharepro.core.bean;

import com.github.tusharepro.core.http.BaseRequestParam;

/**
 * 限售股解禁
 */
public interface ShareFloat extends BaseBean {

    String API_NAME = "share_float";

    class Fields {
        public static final String ts_code = "ts_code";  // TS代码
        public static final String ann_date = "ann_date";  // 公告日期
        public static final String float_date = "float_date";  // 解禁日期
        public static final String float_share = "float_share";  // 流通股份
        public static final String float_ratio = "float_ratio";  // 流通股份占总股本比率
        public static final String holder_name = "holder_name";  // 股东名称
        public static final String share_type = "share_type";  // 股份类型
    }

    class Params {

        public static final ts_code ts_code = new ts_code();  // TS股票代码（至少输入一个参数）
        public static class ts_code extends BaseRequestParam {
            {key = "ts_code";}
        }

        public static final ann_date ann_date = new ann_date();  // 公告日期（日期格式：YYYYMMDD，下同）
        public static class ann_date extends BaseRequestParam {
            {key = "ann_date";}
        }

        public static final float_date float_date = new float_date();  // 解禁日期
        public static class float_date extends BaseRequestParam {
            {key = "float_date";}
        }

        public static final start_date start_date = new start_date();  // 解禁开始日期
        public static class start_date extends BaseRequestParam {
            {key = "start_date";}
        }

        public static final end_date end_date = new end_date();  // 解禁结束日期
        public static class end_date extends BaseRequestParam {
            {key = "end_date";}
        }
    }

}