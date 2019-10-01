package com.github.tusharepro.core.bean;

import com.github.tusharepro.core.http.BaseRequestParam;

/**
 * 业绩预告
 * https://tushare.pro/document/2?doc_id=45
 */
public interface Forecast extends BaseBean {

    String API_NAME = "forecast";

    interface Fields {
        String ts_code = "ts_code";  // TS股票代码
        String ann_date = "ann_date";  // 公告日期
        String end_date = "end_date";  // 报告期
        String type = "type";  // 业绩预告类型(预增/预减/扭亏/首亏/续亏/续盈/略增/略减)
        String p_change_min = "p_change_min";  // 预告净利润变动幅度下限（%）
        String p_change_max = "p_change_max";  // 预告净利润变动幅度上限（%）
        String net_profit_min = "net_profit_min";  // 预告净利润下限（万元）
        String net_profit_max = "net_profit_max";  // 预告净利润上限（万元）
        String last_parent_net = "last_parent_net";  // 上年同期归属母公司净利润
        String first_ann_date = "first_ann_date";  // 首次公告日
        String summary = "summary";  // 业绩预告摘要
        String change_reason = "change_reason";  // 业绩变动原因
    }

    interface Params {

        ts_code ts_code = new ts_code();  // 股票代码(二选一)
        class ts_code extends BaseRequestParam {
            {key = "ts_code";}
        }

        ann_date ann_date = new ann_date();  // 公告日期 (二选一)
        class ann_date extends BaseRequestParam {
            {key = "ann_date";}
        }

        start_date start_date = new start_date();  // 公告开始日期
        class start_date extends BaseRequestParam {
            {key = "start_date";}
        }

        end_date end_date = new end_date();  // 公告结束日期
        class end_date extends BaseRequestParam {
            {key = "end_date";}
        }

        period period = new period();  // 报告期(每个季度最后一天的日期，比如20171231表示年报)
        class period extends BaseRequestParam {
            {key = "period";}
        }

        type type = new type();  // 预告类型(预增/预减/扭亏/首亏/续亏/续盈/略增/略减)
        class type extends BaseRequestParam {
            {key = "type";}
        }
    }

}