package com.github.tusharepro.core.bean;

import com.github.tusharepro.core.http.BaseRequestParam;

/**
 * 股票列表
 * https://tushare.pro/document/2?doc_id=25
 */
public interface StockBasic extends BaseBean {

    String API_NAME = "stock_basic";

    interface Fields {
        String ts_code = "ts_code";  // TS代码
        String symbol = "symbol";  // 股票代码
        String name = "name";  // 股票名称
        String area = "area";  // 所在地域
        String industry = "industry";  // 所属行业
        String fullname = "fullname";  // 股票全称
        String enname = "enname";  // 英文全称
        String market = "market";  // 市场类型 （主板/中小板/创业板/科创板）
        String exchange = "exchange";  // 交易所代码
        String curr_type = "curr_type";  // 交易货币
        String list_status = "list_status";  // 上市状态： L上市 D退市 P暂停上市
        String list_date = "list_date";  // 上市日期
        String delist_date = "delist_date";  // 退市日期
        String is_hs = "is_hs";  // 是否沪深港通标的，N否 H沪股通 S深股通
    }

    interface Params {

        is_hs is_hs = new is_hs();  // 是否沪深港通标的，N否 H沪股通 S深股通
        class is_hs extends BaseRequestParam {
            {key = "is_hs";}
        }

        list_status list_status = new list_status();  // 上市状态： L上市 D退市 P暂停上市
        class list_status extends BaseRequestParam {
            {key = "list_status";}
        }

        exchange exchange = new exchange();  // 交易所 SSE上交所 SZSE深交所 HKEX港交所(未上线)
        class exchange extends BaseRequestParam {
            {key = "exchange";}
        }
    }

}