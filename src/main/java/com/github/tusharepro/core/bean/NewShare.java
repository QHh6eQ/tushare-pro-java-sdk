package com.github.tusharepro.core.bean;

import com.github.tusharepro.core.http.BaseRequestParam;

/**
 * IPO新股列表
 * https://tushare.pro/document/2?doc_id=123
 */
public interface NewShare extends BaseBean {

    String API_NAME = "new_share";

    interface Fields {
        String ts_code = "ts_code";  // TS股票代码
        String sub_code = "sub_code";  // 申购代码
        String name = "name";  // 名称
        String ipo_date = "ipo_date";  // 上网发行日期
        String issue_date = "issue_date";  // 上市日期
        String amount = "amount";  // 发行总量（万股）
        String market_amount = "market_amount";  // 上网发行总量（万股）
        String price = "price";  // 发行价格
        String pe = "pe";  // 市盈率
        String limit_amount = "limit_amount";  // 个人申购上限（万股）
        String funds = "funds";  // 募集资金（亿元）
        String ballot = "ballot";  // 中签率
    }

    interface Params {

        start_date start_date = new start_date();  // 上网发行开始日期
        class start_date extends BaseRequestParam {
            {key = "start_date";}
        }

        end_date end_date = new end_date();  // 上网发行结束日期
        class end_date extends BaseRequestParam {
            {key = "end_date";}
        }
    }

}