package com.github.tushare.pro.http.request;

import com.github.tushare.pro.TusharePro;
import com.github.tushare.pro.common.KeyValue;
import com.github.tushare.pro.http.BaseRequestParam;
import com.github.tushare.pro.http.Request;

/**
 * 股票列表
 */
public final class StockBasicRequest extends Request<StockBasicRequest> {

    public StockBasicRequest() {
        this(null);
    }

    public StockBasicRequest(TusharePro tusharePro) {
        super(tusharePro);
        setApi_name("stock_basic");
    }

    public static class Fields {
        public static final String ts_code = "ts_code";  // TS代码
        public static final String symbol = "symbol";  // 股票代码
        public static final String name = "name";  // 股票名称
        public static final String area = "area";  // 所在地域
        public static final String industry = "industry";  // 所属行业
        public static final String fullname = "fullname";  // 股票全称
        public static final String enname = "enname";  // 英文全称
        public static final String market = "market";  // 市场类型 （主板/中小板/创业板）
        public static final String exchange = "exchange";  // 交易所代码
        public static final String curr_type = "curr_type";  // 交易货币
        public static final String list_status = "list_status";  // 上市状态： L上市 D退市 P暂停上市
        public static final String list_date = "list_date";  // 上市日期
        public static final String delist_date = "delist_date";  // 退市日期
        public static final String is_hs = "is_hs";  // 是否沪深港通标的，N否 H沪股通 S深股通
    }

    public static class Params {

        public static final is_hs is_hs = new is_hs();  // 是否沪深港通标的，N否 H沪股通 S深股通
        public static class is_hs extends BaseRequestParam {
            {key = "is_hs";}
        }

        public static final list_status list_status = new list_status();  // 上市状态： L上市 D退市 P暂停上市
        public static class list_status extends BaseRequestParam {
            {key = "list_status";}
        }

        public static final exchange exchange = new exchange();  // 交易所 SSE上交所 SZSE深交所 HKEX港交所
        public static class exchange extends BaseRequestParam {
            {key = "exchange";}
        }
    }

}