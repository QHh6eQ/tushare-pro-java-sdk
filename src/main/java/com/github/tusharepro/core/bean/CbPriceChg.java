package com.github.tusharepro.core.bean;

import com.github.tusharepro.core.http.BaseRequestParam;

/**
 * 可转债转股价变动
 * https://tushare.pro/document/2?doc_id=246
 */
public interface CbPriceChg extends BaseBean {

    String API_NAME = "cb_price_chg";

    interface Fields {
        String ts_code = "ts_code";  // 转债代码
        String bond_short_name = "bond_short_name";  // 转债简称
        String publish_date = "publish_date";  // 公告日期
        String change_date = "change_date";  // 变动日期
        String convert_price_initial = "convert_price_initial";  // 初始转股价格
        String convertprice_bef = "convertprice_bef";  // 修正前转股价格
        String convertprice_aft = "convertprice_aft";  // 修正后转股价格
    }

    interface Params {

        ts_code ts_code = new ts_code();  // 转债代码，支持多值输入
        class ts_code extends BaseRequestParam {
            {key = "ts_code";}
        }
    }

}