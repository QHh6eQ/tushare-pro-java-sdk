package com.github.tushare.pro.http.request;

import com.github.tushare.pro.TusharePro;
import com.github.tushare.pro.common.KeyValue;
import com.github.tushare.pro.http.BaseRequestParam;
import com.github.tushare.pro.http.Request;

/**
 * 主营业务构成
 */
public final class FinaMainbzRequest extends Request<FinaMainbzRequest> {

    public FinaMainbzRequest() {
        this(null);
    }

    public FinaMainbzRequest(TusharePro tusharePro) {
        super(tusharePro);
        setApi_name("fina_mainbz");
    }

    public static class Fields {
        public static final String ts_code = "ts_code";  // TS代码
        public static final String end_date = "end_date";  // 报告期
        public static final String bz_item = "bz_item";  // 主营业务来源
        public static final String bz_sales = "bz_sales";  // 主营业务收入(元)
        public static final String bz_profit = "bz_profit";  // 主营业务利润(元)
        public static final String bz_cost = "bz_cost";  // 主营业务成本(元)
        public static final String curr_type = "curr_type";  // 货币代码
        public static final String update_flag = "update_flag";  // 是否更新
    }

    public static class Params {

        public static final ts_code ts_code = new ts_code();  // 股票代码
        public static class ts_code extends BaseRequestParam {
            {key = "ts_code";}
        }

        public static final period period = new period();  // 报告期(每个季度最后一天的日期,比如20171231表示年报)
        public static class period extends BaseRequestParam {
            {key = "period";}
        }

        public static final type type = new type();  // 类型：P按产品 D按地区（请输入大写字母P或者D）
        public static class type extends BaseRequestParam {
            {key = "type";}
        }

        public static final start_date start_date = new start_date();  // 报告期开始日期
        public static class start_date extends BaseRequestParam {
            {key = "start_date";}
        }

        public static final end_date end_date = new end_date();  // 报告期结束日期
        public static class end_date extends BaseRequestParam {
            {key = "end_date";}
        }
    }

}