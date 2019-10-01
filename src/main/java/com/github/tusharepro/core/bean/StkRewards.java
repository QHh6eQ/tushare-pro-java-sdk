package com.github.tusharepro.core.bean;

import com.github.tusharepro.core.http.BaseRequestParam;

/**
 * 管理层薪酬和持股
 * https://tushare.pro/document/2?doc_id=194
 */
public interface StkRewards extends BaseBean {

    String API_NAME = "stk_rewards";

    interface Fields {
        String ts_code = "ts_code";  // TS股票代码
        String ann_date = "ann_date";  // 公告日期
        String end_date = "end_date";  // 截止日期
        String name = "name";  // 姓名
        String title = "title";  // 职务
        String reward = "reward";  // 报酬
        String hold_vol = "hold_vol";  // 持股数
    }

    interface Params {

        ts_code ts_code = new ts_code();  // TS股票代码，支持单个或多个代码输入
        class ts_code extends BaseRequestParam {
            {key = "ts_code";}
        }

        end_date end_date = new end_date();  // 报告期
        class end_date extends BaseRequestParam {
            {key = "end_date";}
        }
    }

}