package com.github.tusharepro.core.bean;

import com.github.tusharepro.core.http.BaseRequestParam;

/**
 * 期权合约信息
 * https://tushare.pro/document/2?doc_id=158
 */
public interface OptBasic extends BaseBean {

    String API_NAME = "opt_basic";

    interface Fields {
        String ts_code = "ts_code";  // TS代码
        String exchange = "exchange";  // 交易市场
        String name = "name";  // 合约名称
        String per_unit = "per_unit";  // 合约单位
        String opt_code = "opt_code";  // 标准合约代码
        String opt_type = "opt_type";  // 合约类型
        String call_put = "call_put";  // 期权类型
        String exercise_type = "exercise_type";  // 行权方式
        String exercise_price = "exercise_price";  // 行权价格
        String s_month = "s_month";  // 结算月
        String maturity_date = "maturity_date";  // 到期日
        String list_price = "list_price";  // 挂牌基准价
        String list_date = "list_date";  // 开始交易日期
        String delist_date = "delist_date";  // 最后交易日期
        String last_edate = "last_edate";  // 最后行权日期
        String last_ddate = "last_ddate";  // 最后交割日期
        String quote_unit = "quote_unit";  // 报价单位
        String min_price_chg = "min_price_chg";  // 最小价格波幅
    }

    interface Params {

        exchange exchange = new exchange();  // 交易所代码 （包括上交所SSE等<a href="https://tushare.pro/document/2?doc_id=157">交易所</a>）
        class exchange extends BaseRequestParam {
            {key = "exchange";}
        }

        call_put call_put = new call_put();  // 期权类型
        class call_put extends BaseRequestParam {
            {key = "call_put";}
        }
    }

}