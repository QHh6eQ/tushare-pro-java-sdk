package com.github.tushare.pro.http.request;

import com.github.tushare.pro.TusharePro;
import com.github.tushare.pro.common.KeyValue;
import com.github.tushare.pro.http.BaseRequestParam;
import com.github.tushare.pro.http.Request;

/**
 * 业绩快报
 */
public final class ExpressRequest extends Request<ExpressRequest> {

    public ExpressRequest() {
        this(null);
    }

    public ExpressRequest(TusharePro tusharePro) {
        super(tusharePro);
        setApi_name("express");
    }

    public static class Fields {
        public static final String ts_code = "ts_code";  // TS股票代码
        public static final String ann_date = "ann_date";  // 公告日期
        public static final String end_date = "end_date";  // 报告期
        public static final String revenue = "revenue";  // 营业收入(元)
        public static final String operate_profit = "operate_profit";  // 营业利润(元)
        public static final String total_profit = "total_profit";  // 利润总额(元)
        public static final String n_income = "n_income";  // 净利润(元)
        public static final String total_assets = "total_assets";  // 总资产(元)
        public static final String total_hldr_eqy_exc_min_int = "total_hldr_eqy_exc_min_int";  // 股东权益合计(不含少数股东权益)(元)
        public static final String diluted_eps = "diluted_eps";  // 每股收益(摊薄)(元)
        public static final String diluted_roe = "diluted_roe";  // 净资产收益率(摊薄)(%)
        public static final String yoy_net_profit = "yoy_net_profit";  // 去年同期修正后净利润
        public static final String bps = "bps";  // 每股净资产
        public static final String yoy_sales = "yoy_sales";  // 同比增长率:营业收入
        public static final String yoy_op = "yoy_op";  // 同比增长率:营业利润
        public static final String yoy_tp = "yoy_tp";  // 同比增长率:利润总额
        public static final String yoy_dedu_np = "yoy_dedu_np";  // 同比增长率:归属母公司股东的净利润
        public static final String yoy_eps = "yoy_eps";  // 同比增长率:基本每股收益
        public static final String yoy_roe = "yoy_roe";  // 同比增减:加权平均净资产收益率
        public static final String growth_assets = "growth_assets";  // 比年初增长率:总资产
        public static final String yoy_equity = "yoy_equity";  // 比年初增长率:归属母公司的股东权益
        public static final String growth_bps = "growth_bps";  // 比年初增长率:归属于母公司股东的每股净资产
        public static final String or_last_year = "or_last_year";  // 去年同期营业收入
        public static final String op_last_year = "op_last_year";  // 去年同期营业利润
        public static final String tp_last_year = "tp_last_year";  // 去年同期利润总额
        public static final String np_last_year = "np_last_year";  // 去年同期净利润
        public static final String eps_last_year = "eps_last_year";  // 去年同期每股收益
        public static final String open_net_assets = "open_net_assets";  // 期初净资产
        public static final String open_bps = "open_bps";  // 期初每股净资产
        public static final String perf_summary = "perf_summary";  // 业绩简要说明
        public static final String is_audit = "is_audit";  // 是否审计： 1是 0否
        public static final String remark = "remark";  // 备注
    }

    public static class Params {

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