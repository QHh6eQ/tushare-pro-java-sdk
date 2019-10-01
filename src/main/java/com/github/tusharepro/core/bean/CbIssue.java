package com.github.tusharepro.core.bean;

import com.github.tusharepro.core.http.BaseRequestParam;

/**
 * 可转债发行
 * https://tushare.pro/document/2?doc_id=186
 */
public interface CbIssue extends BaseBean {

    String API_NAME = "cb_issue";

    interface Fields {
        String ts_code = "ts_code";  // 转债代码
        String ann_date = "ann_date";  // 发行公告日
        String res_ann_date = "res_ann_date";  // 发行结果公告日
        String plan_issue_size = "plan_issue_size";  // 计划发行总额（元）
        String issue_size = "issue_size";  // 发行总额（元）
        String issue_price = "issue_price";  // 发行价格
        String issue_type = "issue_type";  // 发行方式
        String issue_cost = "issue_cost";  // 发行费用（元）
        String onl_code = "onl_code";  // 网上申购代码
        String onl_name = "onl_name";  // 网上申购简称
        String onl_date = "onl_date";  // 网上发行日期
        String onl_size = "onl_size";  // 网上发行总额（元）
        String onl_pch_vol = "onl_pch_vol";  // 网上发行有效申购数量（张）
        String onl_pch_num = "onl_pch_num";  // 网上发行有效申购户数
        String onl_pch_excess = "onl_pch_excess";  // 网上发行超额认购倍数
        String onl_winning_rate = "onl_winning_rate";  // 网上发行中签率（%）
        String shd_ration_code = "shd_ration_code";  // 老股东配售代码
        String shd_ration_name = "shd_ration_name";  // 老股东配售简称
        String shd_ration_date = "shd_ration_date";  // 老股东配售日
        String shd_ration_record_date = "shd_ration_record_date";  // 老股东配售股权登记日
        String shd_ration_pay_date = "shd_ration_pay_date";  // 老股东配售缴款日
        String shd_ration_price = "shd_ration_price";  // 老股东配售价格
        String shd_ration_ratio = "shd_ration_ratio";  // 老股东配售比例
        String shd_ration_size = "shd_ration_size";  // 老股东配售数量（张）
        String shd_ration_vol = "shd_ration_vol";  // 老股东配售有效申购数量（张）
        String shd_ration_num = "shd_ration_num";  // 老股东配售有效申购户数
        String shd_ration_excess = "shd_ration_excess";  // 老股东配售超额认购倍数
        String offl_size = "offl_size";  // 网下发行总额（元）
        String offl_deposit = "offl_deposit";  // 网下发行定金比例（%）
        String offl_pch_vol = "offl_pch_vol";  // 网下发行有效申购数量（张）
        String offl_pch_num = "offl_pch_num";  // 网下发行有效申购户数
        String offl_pch_excess = "offl_pch_excess";  // 网下发行超额认购倍数
        String offl_winning_rate = "offl_winning_rate";  // 网下发行中签率
        String lead_underwriter = "lead_underwriter";  // 主承销商
        String lead_underwriter_vol = "lead_underwriter_vol";  // 主承销商包销数量（张）
    }

    interface Params {

        ts_code ts_code = new ts_code();  // TS代码
        class ts_code extends BaseRequestParam {
            {key = "ts_code";}
        }

        ann_date ann_date = new ann_date();  // 发行公告日
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
    }

}