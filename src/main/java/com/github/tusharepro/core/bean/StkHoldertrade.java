package com.github.tusharepro.core.bean;

import com.github.tusharepro.core.http.BaseRequestParam;

/**
 * 股东增减持
 */
public interface StkHoldertrade extends BaseBean {

    String API_NAME = "stk_holdertrade";

    class Fields {
        public static final String ts_code = "ts_code";  // TS代码
        public static final String ann_date = "ann_date";  // 公告日期
        public static final String holder_name = "holder_name";  // 股东名称
        public static final String holder_type = "holder_type";  // 股东类型G高管P个人C公司
        public static final String in_de = "in_de";  // 类型IN增持DE减持
        public static final String change_vol = "change_vol";  // 变动数量
        public static final String change_ratio = "change_ratio";  // 占流通比例（%）
        public static final String after_share = "after_share";  // 变动后持股
        public static final String after_ratio = "after_ratio";  // 变动后占流通比例（%）
        public static final String avg_price = "avg_price";  // 平均价格
        public static final String total_share = "total_share";  // 持股总数
        public static final String begin_date = "begin_date";  // 增减持开始日期
        public static final String close_date = "close_date";  // 增减持结束日期
    }

    class Params {

        public static final ts_code ts_code = new ts_code();  // TS股票代码
        public static class ts_code extends BaseRequestParam {
            {key = "ts_code";}
        }

        public static final ann_date ann_date = new ann_date();  // 公告日期
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

        public static final trade_type trade_type = new trade_type();  // 交易类型IN增持DE减持
        public static class trade_type extends BaseRequestParam {
            {key = "trade_type";}
        }

        public static final holder_type holder_type = new holder_type();  // 股东类型C公司P个人G高管
        public static class holder_type extends BaseRequestParam {
            {key = "holder_type";}
        }
    }

}