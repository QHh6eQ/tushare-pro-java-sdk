package com.github.tusharepro.core.bean;

import com.github.tusharepro.core.http.BaseRequestParam;

/**
 * 每日停复牌信息
 * https://tushare.pro/document/2?doc_id=214
 */
public interface SuspendD extends BaseBean {

    String API_NAME = "suspend_d";

    interface Fields {
        String ts_code = "ts_code";  // TS代码
        String trade_date = "trade_date";  // 停复牌日期
        String suspend_timing = "suspend_timing";  // 日内停牌时间段
        String suspend_type = "suspend_type";  // 停复牌类型：S-停牌，R-复牌
    }

    interface Params {

        ts_code ts_code = new ts_code();  // 股票代码(可输入多值)
        class ts_code extends BaseRequestParam {
            {key = "ts_code";}
        }

        trade_date trade_date = new trade_date();  // 交易日日期
        class trade_date extends BaseRequestParam {
            {key = "trade_date";}
        }

        start_date start_date = new start_date();  // 停复牌查询开始日期
        class start_date extends BaseRequestParam {
            {key = "start_date";}
        }

        end_date end_date = new end_date();  // 停复牌查询结束日期
        class end_date extends BaseRequestParam {
            {key = "end_date";}
        }

        suspend_type suspend_type = new suspend_type();  // 停复牌类型：S-停牌,R-复牌
        class suspend_type extends BaseRequestParam {
            {key = "suspend_type";}
        }
    }

}