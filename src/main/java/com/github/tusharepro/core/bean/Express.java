package com.github.tusharepro.core.bean;

import com.github.tusharepro.core.http.BaseRequestParam;

/**
 * 业绩快报
 * https://tushare.pro/document/2?doc_id=46
 */
public interface Express extends BaseBean {

    String API_NAME = "express";

    interface Fields {
        String ts_code = "ts_code";  // TS股票代码
        String ann_date = "ann_date";  // 公告日期
        String end_date = "end_date";  // 报告期
        String revenue = "revenue";  // 营业收入(元)
        String operate_profit = "operate_profit";  // 营业利润(元)
        String total_profit = "total_profit";  // 利润总额(元)
        String n_income = "n_income";  // 净利润(元)
        String total_assets = "total_assets";  // 总资产(元)
        String total_hldr_eqy_exc_min_int = "total_hldr_eqy_exc_min_int";  // 股东权益合计(不含少数股东权益)(元)
        String diluted_eps = "diluted_eps";  // 每股收益(摊薄)(元)
        String diluted_roe = "diluted_roe";  // 净资产收益率(摊薄)(%)
        String yoy_net_profit = "yoy_net_profit";  // 去年同期修正后净利润
        String bps = "bps";  // 每股净资产
        String yoy_sales = "yoy_sales";  // 同比增长率:营业收入
        String yoy_op = "yoy_op";  // 同比增长率:营业利润
        String yoy_tp = "yoy_tp";  // 同比增长率:利润总额
        String yoy_dedu_np = "yoy_dedu_np";  // 同比增长率:归属母公司股东的净利润
        String yoy_eps = "yoy_eps";  // 同比增长率:基本每股收益
        String yoy_roe = "yoy_roe";  // 同比增减:加权平均净资产收益率
        String growth_assets = "growth_assets";  // 比年初增长率:总资产
        String yoy_equity = "yoy_equity";  // 比年初增长率:归属母公司的股东权益
        String growth_bps = "growth_bps";  // 比年初增长率:归属于母公司股东的每股净资产
        String or_last_year = "or_last_year";  // 去年同期营业收入
        String op_last_year = "op_last_year";  // 去年同期营业利润
        String tp_last_year = "tp_last_year";  // 去年同期利润总额
        String np_last_year = "np_last_year";  // 去年同期净利润
        String eps_last_year = "eps_last_year";  // 去年同期每股收益
        String open_net_assets = "open_net_assets";  // 期初净资产
        String open_bps = "open_bps";  // 期初每股净资产
        String perf_summary = "perf_summary";  // 业绩简要说明
        String is_audit = "is_audit";  // 是否审计： 1是 0否
        String remark = "remark";  // 备注
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