package com.github.tusharepro.core.bean;

import com.github.tusharepro.core.http.BaseRequestParam;

/**
 * 大盘指数每日指标
 * https://tushare.pro/document/2?doc_id=128
 */
public interface IndexDailybasic extends BaseBean {

    String API_NAME = "index_dailybasic";

    interface Fields {
        String ts_code = "ts_code";  // TS代码
        String trade_date = "trade_date";  // 交易日期
        String total_mv = "total_mv";  // 当日总市值（元）
        String float_mv = "float_mv";  // 当日流通市值（元）
        String total_share = "total_share";  // 当日总股本（股）
        String float_share = "float_share";  // 当日流通股本（股）
        String free_share = "free_share";  // 当日自由流通股本（股）
        String turnover_rate = "turnover_rate";  // 换手率
        String turnover_rate_f = "turnover_rate_f";  // 换手率(基于自由流通股本)
        String pe = "pe";  // 市盈率
        String pe_ttm = "pe_ttm";  // 市盈率TTM
        String pb = "pb";  // 市净率
    }

    interface Params {

        trade_date trade_date = new trade_date();  // 交易日期 （格式：YYYYMMDD，比如20181018，下同）
        class trade_date extends BaseRequestParam {
            {key = "trade_date";}
        }

        ts_code ts_code = new ts_code();  // TS代码
        class ts_code extends BaseRequestParam {
            {key = "ts_code";}
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