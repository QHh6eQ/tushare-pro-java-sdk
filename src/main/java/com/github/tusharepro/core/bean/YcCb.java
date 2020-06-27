package com.github.tusharepro.core.bean;

import com.github.tusharepro.core.http.BaseRequestParam;

/**
 * 中债收益率曲线
 * https://tushare.pro/document/2?doc_id=201
 */
@Deprecated
public interface YcCb extends BaseBean {

    String API_NAME = "yc_cb";

    interface Fields {
        String trade_date = "trade_date";  // 交易日期
        String ts_code = "ts_code";  // 曲线编码
        String curve_name = "curve_name";  // 曲线名称
        String curve_type = "curve_type";  // 曲线类型：0-到期，1-即期
        String curve_term = "curve_term";  // 期限(年)
        String yield = "yield";  // 收益率(%)
    }

    interface Params {

        ts_code ts_code = new ts_code();  // 收益率曲线编码：1001.CB-国债收益率曲线
        class ts_code extends BaseRequestParam {
            {key = "ts_code";}
        }

        curve_type curve_type = new curve_type();  // 曲线类型：0-到期，1-即期
        class curve_type extends BaseRequestParam {
            {key = "curve_type";}
        }

        trade_date trade_date = new trade_date();  // 交易日期
        class trade_date extends BaseRequestParam {
            {key = "trade_date";}
        }

        start_date start_date = new start_date();  // 查询起始日期
        class start_date extends BaseRequestParam {
            {key = "start_date";}
        }

        end_date end_date = new end_date();  // 查询结束日期
        class end_date extends BaseRequestParam {
            {key = "end_date";}
        }
    }

}