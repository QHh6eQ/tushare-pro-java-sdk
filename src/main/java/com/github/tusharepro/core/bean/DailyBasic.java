package com.github.tusharepro.core.bean;

import com.github.tusharepro.core.http.BaseRequestParam;

/**
 * 每日指标
 * https://tushare.pro/document/2?doc_id=32
 */
public interface DailyBasic extends BaseBean {

    String API_NAME = "daily_basic";

    interface Fields {
        String ts_code = "ts_code";  // TS股票代码
        String trade_date = "trade_date";  // 交易日期
        String close = "close";  // 当日收盘价
        String turnover_rate = "turnover_rate";  // 换手率（%）
        String turnover_rate_f = "turnover_rate_f";  // 换手率（自由流通股）
        String volume_ratio = "volume_ratio";  // 量比
        String pe = "pe";  // 市盈率（总市值/净利润， 亏损的PE为空）
        String pe_ttm = "pe_ttm";  // 市盈率（TTM，亏损的PE为空）
        String pb = "pb";  // 市净率（总市值/净资产）
        String ps = "ps";  // 市销率
        String ps_ttm = "ps_ttm";  // 市销率（TTM）
        String dv_ratio = "dv_ratio";  // 股息率 （%）
        String dv_ttm = "dv_ttm";  // 股息率（TTM）（%）
        String total_share = "total_share";  // 总股本 （万股）
        String float_share = "float_share";  // 流通股本 （万股）
        String free_share = "free_share";  // 自由流通股本 （万）
        String total_mv = "total_mv";  // 总市值 （万元）
        String circ_mv = "circ_mv";  // 流通市值（万元）
    }

    interface Params {

        ts_code ts_code = new ts_code();  // 股票代码（二选一）
        class ts_code extends BaseRequestParam {
            {key = "ts_code";}
        }

        trade_date trade_date = new trade_date();  // 交易日期 （二选一）
        class trade_date extends BaseRequestParam {
            {key = "trade_date";}
        }

        start_date start_date = new start_date();  // 开始日期(YYYYMMDD)
        class start_date extends BaseRequestParam {
            {key = "start_date";}
        }

        end_date end_date = new end_date();  // 结束日期(YYYYMMDD)
        class end_date extends BaseRequestParam {
            {key = "end_date";}
        }
    }

}