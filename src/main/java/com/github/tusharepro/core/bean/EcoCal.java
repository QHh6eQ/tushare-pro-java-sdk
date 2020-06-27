package com.github.tusharepro.core.bean;

import com.github.tusharepro.core.http.BaseRequestParam;

/**
 * 财经日历
 * https://tushare.pro/document/2?doc_id=233
 */
public interface EcoCal extends BaseBean {

    String API_NAME = "eco_cal";

    interface Fields {
        String date = "date";  // 日期
        String time = "time";  // 时间
        String currency = "currency";  // 货币代码
        String country = "country";  // 国家
        String event = "event";  // 经济事件
        String value = "value";  // 今值
        String pre_value = "pre_value";  // 前值
        String fore_value = "fore_value";  // 预测值
    }

    interface Params {

        date date = new date();  // 日期（YYYYMMDD格式）
        class date extends BaseRequestParam {
            {key = "date";}
        }

        start_date start_date = new start_date();  // 开始日期
        class start_date extends BaseRequestParam {
            {key = "start_date";}
        }

        end_date end_date = new end_date();  // 结束日期
        class end_date extends BaseRequestParam {
            {key = "end_date";}
        }

        currency currency = new currency();  // 货币代码
        class currency extends BaseRequestParam {
            {key = "currency";}
        }

        country country = new country();  // 国家（比如：中国、美国）
        class country extends BaseRequestParam {
            {key = "country";}
        }

        event event = new event();  // 事件 （支持模糊匹配： *非农*）
        class event extends BaseRequestParam {
            {key = "event";}
        }
    }

}