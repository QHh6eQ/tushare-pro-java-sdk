package com.github.tusharepro.core.bean;

import com.github.tusharepro.core.http.BaseRequestParam;

/**
 * 每日涨跌停统计
 * https://tushare.pro/document/2?doc_id=198
 */
public interface LimitList extends BaseBean {

    String API_NAME = "limit_list";

    interface Fields {
        String trade_date = "trade_date";  // 交易日期
        String ts_code = "ts_code";  // 股票代码
        String name = "name";  // 股票名称
        String close = "close";  // 收盘价
        String pct_chg = "pct_chg";  // 涨跌幅
        String amp = "amp";  // 振幅
        String fc_ratio = "fc_ratio";  // 封单金额/日成交金额
        String fl_ratio = "fl_ratio";  // 封单手数/流通股本
        String fd_amount = "fd_amount";  // 封单金额
        String first_time = "first_time";  // 首次涨停时间
        String last_time = "last_time";  // 最后封板时间
        String open_times = "open_times";  // 打开次数
        String strth = "strth";  // 涨跌停强度
        String limit = "limit";  // D跌停U涨停
    }

    interface Params {

        trade_date trade_date = new trade_date();  // 交易日期 YYYYMMDD格式，支持单个或多日期输入
        class trade_date extends BaseRequestParam {
            {key = "trade_date";}
        }

        ts_code ts_code = new ts_code();  // 股票代码 （支持单个或多个股票输入）
        class ts_code extends BaseRequestParam {
            {key = "ts_code";}
        }

        limit_type limit_type = new limit_type();  // 涨跌停类型：U涨停D跌停
        class limit_type extends BaseRequestParam {
            {key = "limit_type";}
        }

        start_date start_date = new start_date();  // 开始日期 YYYYMMDD格式
        class start_date extends BaseRequestParam {
            {key = "start_date";}
        }

        end_date end_date = new end_date();  // 结束日期 YYYYMMDD格式
        class end_date extends BaseRequestParam {
            {key = "end_date";}
        }
    }

}