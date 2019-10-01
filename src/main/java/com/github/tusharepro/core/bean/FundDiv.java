package com.github.tusharepro.core.bean;

import com.github.tusharepro.core.http.BaseRequestParam;

/**
 * 公募基金分红
 * https://tushare.pro/document/2?doc_id=120
 */
public interface FundDiv extends BaseBean {

    String API_NAME = "fund_div";

    interface Fields {
        String ts_code = "ts_code";  // TS代码
        String ann_date = "ann_date";  // 公告日期
        String imp_anndate = "imp_anndate";  // 分红实施公告日
        String base_date = "base_date";  // 分配收益基准日
        String div_proc = "div_proc";  // 方案进度
        String record_date = "record_date";  // 权益登记日
        String ex_date = "ex_date";  // 除息日
        String pay_date = "pay_date";  // 派息日
        String earpay_date = "earpay_date";  // 收益支付日
        String net_ex_date = "net_ex_date";  // 净值除权日
        String div_cash = "div_cash";  // 每股派息(元)
        String base_unit = "base_unit";  // 基准基金份额(万份)
        String ear_distr = "ear_distr";  // 可分配收益(元)
        String ear_amount = "ear_amount";  // 收益分配金额(元)
        String account_date = "account_date";  // 红利再投资到账日
        String base_year = "base_year";  // 份额基准年度
    }

    interface Params {

        ann_date ann_date = new ann_date();  // 公告日（以下参数四选一）
        class ann_date extends BaseRequestParam {
            {key = "ann_date";}
        }

        ex_date ex_date = new ex_date();  // 除息日
        class ex_date extends BaseRequestParam {
            {key = "ex_date";}
        }

        pay_date pay_date = new pay_date();  // 派息日
        class pay_date extends BaseRequestParam {
            {key = "pay_date";}
        }

        ts_code ts_code = new ts_code();  // 基金代码
        class ts_code extends BaseRequestParam {
            {key = "ts_code";}
        }
    }

}