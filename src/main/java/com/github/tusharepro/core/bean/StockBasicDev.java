package com.github.tusharepro.core.bean;

/**
 * 股票列表
 */
public interface StockBasicDev extends BaseBean {

    String API_NAME = "stock_basic";

    // API权限规则...
    class Permission {
        Double minimum = 120.;  // 最小门槛
        Double unlimited = 5000.;  // 无限制调用
        Integer perMinute = 200;  // 每分钟调用限制
    }

    // 定义字段类型 可能是字符串, 浮点数...
    class Fields {
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

//    // 定义字段类型 可能是字符串, 浮点数...
//    // 可能不需要这样
//    class Fields {
//        public static final Field ts_code = new Field("ts_code", "str");  // TS代码
//        public static final Field symbol = new Field("symbol", "str");  // 股票代码
//        public static final Field name = new Field("name", "str");  // 股票名称
//        public static final Field area = new Field("area", "str");  // 所在地域
//        public static final Field industry = new Field("industry", "str");  // 所属行业
//        public static final Field fullname = new Field("fullname", "str");  // 股票全称
//        public static final Field enname = new Field("enname", "str");  // 英文全称
//        public static final Field market = new Field("market", "str");  // 市场类型 （主板/中小板/创业板）
//        public static final Field exchange = new Field("exchange", "str");  // 交易所代码
//        public static final Field curr_type = new Field("curr_type", "str");  // 交易货币
//        public static final Field list_status = new Field("list_status", "str");  // 上市状态： L上市 D退市 P暂停上市
//        public static final Field list_date = new Field("list_date", "str");  // 上市日期
//        public static final Field delist_date = new Field("delist_date", "str");  // 退市日期
//        public static final Field is_hs = new Field("is_hs", "str");  // 是否沪深港通标的，N否 H沪股通 S深股通
//    }

    // 定义字段类型
    class Params {
        public static final String is_hs = "is_hs";  // 是否沪深港通标的，N否 H沪股通 S深股通
        public static final String list_status = "list_status";  // 上市状态： L上市 D退市 P暂停上市
        public static final String exchange = "exchange";  // 交易所 SSE上交所 SZSE深交所 HKEX港交所(未上线)
    }

}
