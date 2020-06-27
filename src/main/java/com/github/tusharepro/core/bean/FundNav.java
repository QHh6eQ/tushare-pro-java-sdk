package com.github.tusharepro.core.bean;

import com.github.tusharepro.core.http.BaseRequestParam;

/**
 * 公募基金净值
 * https://tushare.pro/document/2?doc_id=119
 */
public interface FundNav extends BaseBean {

    String API_NAME = "fund_nav";

    interface Fields {
        String ts_code = "ts_code";  // TS代码
        String ann_date = "ann_date";  // 公告日期
        String end_date = "end_date";  // 截止日期
        String unit_nav = "unit_nav";  // 单位净值
        String accum_nav = "accum_nav";  // 累计净值
        String accum_div = "accum_div";  // 累计分红
        String net_asset = "net_asset";  // 资产净值
        String total_netasset = "total_netasset";  // 合计资产净值
        String adj_nav = "adj_nav";  // 复权单位净值
    }

    interface Params {

        ts_code ts_code = new ts_code();  // TS基金代码 （二选一）
        class ts_code extends BaseRequestParam {
            {key = "ts_code";}
        }

        end_date end_date = new end_date();  // 净值日期 （二选一）
        class end_date extends BaseRequestParam {
            {key = "end_date";}
        }

        market market = new market();  // E场内 O场外
        class market extends BaseRequestParam {
            {key = "market";}
        }
    }

}