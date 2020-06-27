package com.github.tusharepro.core.bean;

import com.github.tusharepro.core.http.BaseRequestParam;

/**
 * 股权质押统计数据
 * https://tushare.pro/document/2?doc_id=110
 */
public interface PledgeStat extends BaseBean {

    String API_NAME = "pledge_stat";

    interface Fields {
        String ts_code = "ts_code";  // TS代码
        String end_date = "end_date";  // 截止日期
        String pledge_count = "pledge_count";  // 质押次数
        String unrest_pledge = "unrest_pledge";  // 无限售股质押数量（万）
        String rest_pledge = "rest_pledge";  // 限售股份质押数量（万）
        String total_share = "total_share";  // 总股本
        String pledge_ratio = "pledge_ratio";  // 质押比例
    }

    interface Params {

        ts_code ts_code = new ts_code();  // 股票代码
        class ts_code extends BaseRequestParam {
            {key = "ts_code";}
        }

        end_date end_date = new end_date();  // 截止日期
        class end_date extends BaseRequestParam {
            {key = "end_date";}
        }
    }

}