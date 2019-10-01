package com.github.tusharepro.core.bean;

import com.github.tusharepro.core.http.BaseRequestParam;

/**
 * 期货合约信息表
 * https://tushare.pro/document/2?doc_id=135
 */
public interface FutBasic extends BaseBean {

    String API_NAME = "fut_basic";

    interface Fields {
        String ts_code = "ts_code";  // 合约代码
        String symbol = "symbol";  // 交易标识
        String exchange = "exchange";  // 交易市场
        String name = "name";  // 中文简称
        String fut_code = "fut_code";  // 合约产品代码
        String multiplier = "multiplier";  // 合约乘数
        String trade_unit = "trade_unit";  // 交易计量单位
        String per_unit = "per_unit";  // 交易单位(每手)
        String quote_unit = "quote_unit";  // 报价单位
        String quote_unit_desc = "quote_unit_desc";  // 最小报价单位说明
        String d_mode_desc = "d_mode_desc";  // 交割方式说明
        String list_date = "list_date";  // 上市日期
        String delist_date = "delist_date";  // 最后交易日期
        String d_month = "d_month";  // 交割月份
        String last_ddate = "last_ddate";  // 最后交割日
        String trade_time_desc = "trade_time_desc";  // 交易时间说明
    }

    interface Params {

        exchange exchange = new exchange();  // 交易所代码 CFFEX-中金所 DCE-大商所 CZCE-郑商所 SHFE-上期所 INE-上海国际能源交易中心
        class exchange extends BaseRequestParam {
            {key = "exchange";}
        }

        fut_type fut_type = new fut_type();  // 合约类型 (1 普通合约 2主力与连续合约 默认取全部)
        class fut_type extends BaseRequestParam {
            {key = "fut_type";}
        }
    }

}