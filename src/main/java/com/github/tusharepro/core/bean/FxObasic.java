package com.github.tusharepro.core.bean;

import com.github.tusharepro.core.http.BaseRequestParam;

/**
 * 外汇基础信息(海外)
 * https://tushare.pro/document/2?doc_id=178
 */
public interface FxObasic extends BaseBean {

    String API_NAME = "fx_obasic";

    interface Fields {
        String ts_code = "ts_code";  // 外汇代码
        String name = "name";  // 名称
        String classify = "classify";  // 分类
        String exchange = "exchange";  // 交易商
        String min_unit = "min_unit";  // 最小交易单位
        String max_unit = "max_unit";  // 最大交易单位
        String pip = "pip";  // 最大交易单位
        String pip_cost = "pip_cost";  // 点值
        String traget_spread = "traget_spread";  // 目标差价
        String min_stop_distance = "min_stop_distance";  // 最小止损距离（点子）
        String trading_hours = "trading_hours";  // 交易时间
        String break_time = "break_time";  // 休市时间
    }

    interface Params {

        exchange exchange = new exchange();  // 交易商
        class exchange extends BaseRequestParam {
            {key = "exchange";}
        }

        classify classify = new classify();  // 分类
        class classify extends BaseRequestParam {
            {key = "classify";}
        }

        ts_code ts_code = new ts_code();  // TS代码
        class ts_code extends BaseRequestParam {
            {key = "ts_code";}
        }
    }

}