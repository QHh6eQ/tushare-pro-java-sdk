package com.github.tusharepro.core.bean;

import com.github.tusharepro.core.http.BaseRequestParam;

/**
 * 财务审计意见
 */
public interface FinaAudit extends BaseBean {

    String API_NAME = "fina_audit";

    class Fields {
        public static final String ts_code = "ts_code";  // TS股票代码
        public static final String ann_date = "ann_date";  // 公告日期
        public static final String end_date = "end_date";  // 报告期
        public static final String audit_result = "audit_result";  // 审计结果
        public static final String audit_fees = "audit_fees";  // 审计总费用（元）
        public static final String audit_agency = "audit_agency";  // 会计事务所
        public static final String audit_sign = "audit_sign";  // 签字会计师
    }

    class Params {

        public static final ts_code ts_code = new ts_code();  // 股票代码
        public static class ts_code extends BaseRequestParam {
            {key = "ts_code";}
        }

        public static final ann_date ann_date = new ann_date();  // 公告日期
        public static class ann_date extends BaseRequestParam {
            {key = "ann_date";}
        }

        public static final start_date start_date = new start_date();  // 公告开始日期
        public static class start_date extends BaseRequestParam {
            {key = "start_date";}
        }

        public static final end_date end_date = new end_date();  // 公告结束日期
        public static class end_date extends BaseRequestParam {
            {key = "end_date";}
        }

        public static final period period = new period();  // 报告期(每个季度最后一天的日期,比如20171231表示年报)
        public static class period extends BaseRequestParam {
            {key = "period";}
        }
    }

}