package com.github.tusharepro.core.bean;

import com.github.tusharepro.core.http.BaseRequestParam;

/**
 * 财务审计意见
 * https://tushare.pro/document/2?doc_id=80
 */
public interface FinaAudit extends BaseBean {

    String API_NAME = "fina_audit";

    interface Fields {
        String ts_code = "ts_code";  // TS股票代码
        String ann_date = "ann_date";  // 公告日期
        String end_date = "end_date";  // 报告期
        String audit_result = "audit_result";  // 审计结果
        String audit_fees = "audit_fees";  // 审计总费用（元）
        String audit_agency = "audit_agency";  // 会计事务所
        String audit_sign = "audit_sign";  // 签字会计师
    }

    interface Params {

        ts_code ts_code = new ts_code();  // 股票代码
        class ts_code extends BaseRequestParam {
            {key = "ts_code";}
        }

        ann_date ann_date = new ann_date();  // 公告日期
        class ann_date extends BaseRequestParam {
            {key = "ann_date";}
        }

        start_date start_date = new start_date();  // 公告开始日期
        class start_date extends BaseRequestParam {
            {key = "start_date";}
        }

        end_date end_date = new end_date();  // 公告结束日期
        class end_date extends BaseRequestParam {
            {key = "end_date";}
        }

        period period = new period();  // 报告期(每个季度最后一天的日期,比如20171231表示年报)
        class period extends BaseRequestParam {
            {key = "period";}
        }
    }

}