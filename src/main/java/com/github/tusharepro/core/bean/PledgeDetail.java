package com.github.tusharepro.core.bean;

import com.github.tusharepro.core.http.BaseRequestParam;

/**
 * 股权质押明细
 * https://tushare.pro/document/2?doc_id=111
 */
public interface PledgeDetail extends BaseBean {

    String API_NAME = "pledge_detail";

    interface Fields {
        String ts_code = "ts_code";  // TS股票代码
        String ann_date = "ann_date";  // 公告日期
        String holder_name = "holder_name";  // 股东名称
        String pledge_amount = "pledge_amount";  // 质押数量（万股）
        String start_date = "start_date";  // 质押开始日期
        String end_date = "end_date";  // 质押结束日期
        String is_release = "is_release";  // 是否已解押
        String release_date = "release_date";  // 解押日期
        String pledgor = "pledgor";  // 质押方
        String holding_amount = "holding_amount";  // 持股总数（万股）
        String pledged_amount = "pledged_amount";  // 质押总数（万股）
        String p_total_ratio = "p_total_ratio";  // 本次质押占总股本比例
        String h_total_ratio = "h_total_ratio";  // 持股总数占总股本比例
        String is_buyback = "is_buyback";  // 是否回购
    }

    interface Params {

        ts_code ts_code = new ts_code();  // 股票代码
        class ts_code extends BaseRequestParam {
            {key = "ts_code";}
        }
    }

}