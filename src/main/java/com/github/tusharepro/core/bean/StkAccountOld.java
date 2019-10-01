package com.github.tusharepro.core.bean;

import com.github.tusharepro.core.http.BaseRequestParam;

/**
 * 股票账户开户数据（旧）
 * https://tushare.pro/document/2?doc_id=165
 */
public interface StkAccountOld extends BaseBean {

    String API_NAME = "stk_account_old";

    interface Fields {
        String date = "date";  // 统计周期
        String new_sh = "new_sh";  // 本周新增（上海，户）
        String new_sz = "new_sz";  // 本周新增（深圳，户）
        String active_sh = "active_sh";  // 期末有效账户（上海，万户）
        String active_sz = "active_sz";  // 期末有效账户（深圳，万户）
        String total_sh = "total_sh";  // 期末账户数（上海，万户）
        String total_sz = "total_sz";  // 期末账户数（深圳，万户）
        String trade_sh = "trade_sh";  // 参与交易账户数（上海，万户）
        String trade_sz = "trade_sz";  // 参与交易账户数（深圳，万户）
    }

    interface Params {

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