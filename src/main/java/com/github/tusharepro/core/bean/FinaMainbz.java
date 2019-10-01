package com.github.tusharepro.core.bean;

import com.github.tusharepro.core.http.BaseRequestParam;

/**
 * 主营业务构成
 * https://tushare.pro/document/2?doc_id=81
 */
public interface FinaMainbz extends BaseBean {

    String API_NAME = "fina_mainbz";

    interface Fields {
        String ts_code = "ts_code";  // TS代码
        String end_date = "end_date";  // 报告期
        String bz_item = "bz_item";  // 主营业务来源
        String bz_sales = "bz_sales";  // 主营业务收入(元)
        String bz_profit = "bz_profit";  // 主营业务利润(元)
        String bz_cost = "bz_cost";  // 主营业务成本(元)
        String curr_type = "curr_type";  // 货币代码
        String update_flag = "update_flag";  // 是否更新
    }

    interface Params {

        ts_code ts_code = new ts_code();  // 股票代码
        class ts_code extends BaseRequestParam {
            {key = "ts_code";}
        }

        period period = new period();  // 报告期(每个季度最后一天的日期,比如20171231表示年报)
        class period extends BaseRequestParam {
            {key = "period";}
        }

        type type = new type();  // 类型：P按产品 D按地区（请输入大写字母P或者D）
        class type extends BaseRequestParam {
            {key = "type";}
        }

        start_date start_date = new start_date();  // 报告期开始日期
        class start_date extends BaseRequestParam {
            {key = "start_date";}
        }

        end_date end_date = new end_date();  // 报告期结束日期
        class end_date extends BaseRequestParam {
            {key = "end_date";}
        }
    }

}