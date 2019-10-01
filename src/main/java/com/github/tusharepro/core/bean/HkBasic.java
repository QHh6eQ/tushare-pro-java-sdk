package com.github.tusharepro.core.bean;

import com.github.tusharepro.core.http.BaseRequestParam;

/**
 * 港股列表
 * https://tushare.pro/document/2?doc_id=191
 */
public interface HkBasic extends BaseBean {

    String API_NAME = "hk_basic";

    interface Fields {
        String ts_code = "ts_code";  // 
        String name = "name";  // 股票简称
        String fullname = "fullname";  // 公司全称
        String enname = "enname";  // 英文名称
        String cn_spell = "cn_spell";  // 拼音
        String market = "market";  // 市场类别
        String list_status = "list_status";  // 上市状态
        String list_date = "list_date";  // 上市日期
        String delist_date = "delist_date";  // 退市日期
        String trade_unit = "trade_unit";  // 交易单位
        String isin = "isin";  // ISIN代码
        String curr_type = "curr_type";  // 货币代码
    }

    interface Params {

        ts_code ts_code = new ts_code();  // TS代码
        class ts_code extends BaseRequestParam {
            {key = "ts_code";}
        }

        list_status list_status = new list_status();  // 上市状态 L上市 D退市 P暂停上市 ，默认L
        class list_status extends BaseRequestParam {
            {key = "list_status";}
        }
    }

}