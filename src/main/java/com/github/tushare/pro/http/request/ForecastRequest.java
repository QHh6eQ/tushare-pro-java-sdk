package com.github.tushare.pro.http.request;

import com.github.tushare.pro.TusharePro;
import com.github.tushare.pro.common.KeyValue;
import com.github.tushare.pro.http.BaseRequestParam;
import com.github.tushare.pro.http.Request;

/**
 * 业绩预告
 */
public final class ForecastRequest extends Request<ForecastRequest> {

    public ForecastRequest() {
        this(null);
    }

    public ForecastRequest(TusharePro tusharePro) {
        super(tusharePro);
        setApi_name("forecast");
    }

    public static class Fields {
        public static final String ts_code = "ts_code";  // TS股票代码
        public static final String ann_date = "ann_date";  // 公告日期
        public static final String end_date = "end_date";  // 报告期
        public static final String type = "type";  // 业绩预告类型(预增/预减/扭亏/首亏/续亏/续盈/略增/略减)
        public static final String p_change_min = "p_change_min";  // 预告净利润变动幅度下限（%）
        public static final String p_change_max = "p_change_max";  // 预告净利润变动幅度上限（%）
        public static final String net_profit_min = "net_profit_min";  // 预告净利润下限（万元）
        public static final String net_profit_max = "net_profit_max";  // 预告净利润上限（万元）
        public static final String last_parent_net = "last_parent_net";  // 上年同期归属母公司净利润
        public static final String first_ann_date = "first_ann_date";  // 首次公告日
        public static final String summary = "summary";  // 业绩预告摘要
        public static final String change_reason = "change_reason";  // 业绩变动原因
    }

    public static class Params {

        public static final ts_code ts_code = new ts_code();  // 股票代码(二选一)
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

        public static final period period = new period();  // 报告期  (二选一) (每个季度最后一天的日期，比如20171231表示年报)
        public static class period extends BaseRequestParam {
            {key = "period";}
        }

        public static final type type = new type();  // 预告类型(预增/预减/扭亏/首亏/续亏/续盈/略增/略减)
        public static class type extends BaseRequestParam {
            {key = "type";}
        }
    }

}