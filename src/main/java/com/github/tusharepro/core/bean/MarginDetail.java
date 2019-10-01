package com.github.tusharepro.core.bean;

import com.github.tusharepro.core.http.BaseRequestParam;

/**
 * 融资融券交易明细
 * https://tushare.pro/document/2?doc_id=59
 */
public interface MarginDetail extends BaseBean {

    String API_NAME = "margin_detail";

    interface Fields {
        String trade_date = "trade_date";  // 交易日期
        String ts_code = "ts_code";  // TS股票代码
        String name = "name";  // 股票名称 （20190910后有数据）
        String rzye = "rzye";  // 融资余额(元)
        String rqye = "rqye";  // 融券余额(元)
        String rzmre = "rzmre";  // 融资买入额(元)
        String rqyl = "rqyl";  // 融券余量（手）
        String rzche = "rzche";  // 融资偿还额(元)
        String rqchl = "rqchl";  // 融券偿还量(手)
        String rqmcl = "rqmcl";  // 融券卖出量(股,份,手)
        String rzrqye = "rzrqye";  // 融资融券余额(元)
    }

    interface Params {

        trade_date trade_date = new trade_date();  // 交易日期
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