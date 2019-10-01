package com.github.tusharepro.core.bean;

import com.github.tusharepro.core.http.BaseRequestParam;

/**
 * 股票账户开户数据
 * https://tushare.pro/document/2?doc_id=164
 */
public interface StkAccount extends BaseBean {

    String API_NAME = "stk_account";

    interface Fields {
        String date = "date";  // 统计周期
        String weekly_new = "weekly_new";  // 本周新增（万）
        String total = "total";  // 期末总账户数（万）
        String weekly_hold = "weekly_hold";  // 本周持仓账户数（万）
        String weekly_trade = "weekly_trade";  // 本周参与交易账户数（万）
    }

    interface Params {

        date date = new date();  // 日期
        class date extends BaseRequestParam {
            {key = "date";}
        }

        start_date start_date = new start_date();  // 开始日期
        class start_date extends BaseRequestParam {
            {key = "start_date";}
        }

        end_date end_date = new end_date();  // 结束日期
        class end_date extends BaseRequestParam {
            {key = "end_date";}
        }
    }

}