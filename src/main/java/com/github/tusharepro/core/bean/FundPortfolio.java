package com.github.tusharepro.core.bean;

import com.github.tusharepro.core.http.BaseRequestParam;

/**
 * 公募基金持仓数据
 * https://tushare.pro/document/2?doc_id=121
 */
public interface FundPortfolio extends BaseBean {

    String API_NAME = "fund_portfolio";

    interface Fields {
        String ts_code = "ts_code";  // TS基金代码
        String ann_date = "ann_date";  // 公告日期
        String end_date = "end_date";  // 截止日期
        String symbol = "symbol";  // 股票代码
        String mkv = "mkv";  // 持有股票市值(元)
        String amount = "amount";  // 持有股票数量（股）
        String stk_mkv_ratio = "stk_mkv_ratio";  // 占股票市值比
        String stk_float_ratio = "stk_float_ratio";  // 占流通股本比例
    }

    interface Params {

        ts_code ts_code = new ts_code();  // 基金代码
        class ts_code extends BaseRequestParam {
            {key = "ts_code";}
        }

        ann_date ann_date = new ann_date();  // 公告日期
        class ann_date extends BaseRequestParam {
            {key = "ann_date";}
        }

        start_date start_date = new start_date();  // 报告期开始日期
        class start_date extends BaseRequestParam {
            {key = "start_date";}
        }

        end_date end_date = new end_date();  // 报告期结束日期
        class end_date extends BaseRequestParam {
            {key = "end_date";}
        }
    }

}