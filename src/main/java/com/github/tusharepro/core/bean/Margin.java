package com.github.tusharepro.core.bean;

import com.github.tusharepro.core.http.BaseRequestParam;

/**
 * 融资融券交易汇总
 * https://tushare.pro/document/2?doc_id=58
 */
public interface Margin extends BaseBean {

    String API_NAME = "margin";

    interface Fields {
        String trade_date = "trade_date";  // 交易日期
        String exchange_id = "exchange_id";  // 交易所代码（SSE上交所SZSE深交所）
        String rzye = "rzye";  // 融资余额(元)
        String rzmre = "rzmre";  // 融资买入额(元)
        String rzche = "rzche";  // 融资偿还额(元)
        String rqye = "rqye";  // 融券余额(元)
        String rqmcl = "rqmcl";  // 融券卖出量(股,份,手)
        String rzrqye = "rzrqye";  // 融资融券余额(元)
        String rqyl = "rqyl";  // 融券余量(股,份,手)
    }

    interface Params {

        trade_date trade_date = new trade_date();  // 交易日期
        class trade_date extends BaseRequestParam {
            {key = "trade_date";}
        }

        exchange_id exchange_id = new exchange_id();  // 交易所代码
        class exchange_id extends BaseRequestParam {
            {key = "exchange_id";}
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