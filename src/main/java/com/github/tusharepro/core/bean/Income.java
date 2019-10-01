package com.github.tusharepro.core.bean;

import com.github.tusharepro.core.http.BaseRequestParam;

/**
 * 利润表
 */
public interface Income extends BaseBean {

    String API_NAME = "income";

    class Fields {
        public static final String ts_code = "ts_code";  // TS股票代码
        public static final String ann_date = "ann_date";  // 公告日期
        public static final String f_ann_date = "f_ann_date";  // 实际公告日期，即发生过数据变更的最终日期
        public static final String end_date = "end_date";  // 报告期
        public static final String report_type = "report_type";  // 报告类型： 参考下表说明
        public static final String comp_type = "comp_type";  // 公司类型：1一般工商业 2银行 3保险 4证券
        public static final String basic_eps = "basic_eps";  // 基本每股收益
        public static final String diluted_eps = "diluted_eps";  // 稀释每股收益
        public static final String total_revenue = "total_revenue";  // 营业总收入 (元，下同)
        public static final String revenue = "revenue";  // 营业收入
        public static final String int_income = "int_income";  // 利息收入
        public static final String prem_earned = "prem_earned";  // 已赚保费
        public static final String comm_income = "comm_income";  // 手续费及佣金收入
        public static final String n_commis_income = "n_commis_income";  // 手续费及佣金净收入
        public static final String n_oth_income = "n_oth_income";  // 其他经营净收益
        public static final String n_oth_b_income = "n_oth_b_income";  // 加:其他业务净收益
        public static final String prem_income = "prem_income";  // 保险业务收入
        public static final String out_prem = "out_prem";  // 减:分出保费
        public static final String une_prem_reser = "une_prem_reser";  // 提取未到期责任准备金
        public static final String reins_income = "reins_income";  // 其中:分保费收入
        public static final String n_sec_tb_income = "n_sec_tb_income";  // 代理买卖证券业务净收入
        public static final String n_sec_uw_income = "n_sec_uw_income";  // 证券承销业务净收入
        public static final String n_asset_mg_income = "n_asset_mg_income";  // 受托客户资产管理业务净收入
        public static final String oth_b_income = "oth_b_income";  // 其他业务收入
        public static final String fv_value_chg_gain = "fv_value_chg_gain";  // 加:公允价值变动净收益
        public static final String invest_income = "invest_income";  // 加:投资净收益
        public static final String ass_invest_income = "ass_invest_income";  // 其中:对联营企业和合营企业的投资收益
        public static final String forex_gain = "forex_gain";  // 加:汇兑净收益
        public static final String total_cogs = "total_cogs";  // 营业总成本
        public static final String oper_cost = "oper_cost";  // 减:营业成本
        public static final String int_exp = "int_exp";  // 减:利息支出
        public static final String comm_exp = "comm_exp";  // 减:手续费及佣金支出
        public static final String biz_tax_surchg = "biz_tax_surchg";  // 减:营业税金及附加
        public static final String sell_exp = "sell_exp";  // 减:销售费用
        public static final String admin_exp = "admin_exp";  // 减:管理费用
        public static final String fin_exp = "fin_exp";  // 减:财务费用
        public static final String assets_impair_loss = "assets_impair_loss";  // 减:资产减值损失
        public static final String prem_refund = "prem_refund";  // 退保金
        public static final String compens_payout = "compens_payout";  // 赔付总支出
        public static final String reser_insur_liab = "reser_insur_liab";  // 提取保险责任准备金
        public static final String div_payt = "div_payt";  // 保户红利支出
        public static final String reins_exp = "reins_exp";  // 分保费用
        public static final String oper_exp = "oper_exp";  // 营业支出
        public static final String compens_payout_refu = "compens_payout_refu";  // 减:摊回赔付支出
        public static final String insur_reser_refu = "insur_reser_refu";  // 减:摊回保险责任准备金
        public static final String reins_cost_refund = "reins_cost_refund";  // 减:摊回分保费用
        public static final String other_bus_cost = "other_bus_cost";  // 其他业务成本
        public static final String operate_profit = "operate_profit";  // 营业利润
        public static final String non_oper_income = "non_oper_income";  // 加:营业外收入
        public static final String non_oper_exp = "non_oper_exp";  // 减:营业外支出
        public static final String nca_disploss = "nca_disploss";  // 其中:减:非流动资产处置净损失
        public static final String total_profit = "total_profit";  // 利润总额
        public static final String income_tax = "income_tax";  // 所得税费用
        public static final String n_income = "n_income";  // 净利润(含少数股东损益)
        public static final String n_income_attr_p = "n_income_attr_p";  // 净利润(不含少数股东损益)
        public static final String minority_gain = "minority_gain";  // 少数股东损益
        public static final String oth_compr_income = "oth_compr_income";  // 其他综合收益
        public static final String t_compr_income = "t_compr_income";  // 综合收益总额
        public static final String compr_inc_attr_p = "compr_inc_attr_p";  // 归属于母公司(或股东)的综合收益总额
        public static final String compr_inc_attr_m_s = "compr_inc_attr_m_s";  // 归属于少数股东的综合收益总额
        public static final String ebit = "ebit";  // 息税前利润
        public static final String ebitda = "ebitda";  // 息税折旧摊销前利润
        public static final String insurance_exp = "insurance_exp";  // 保险业务支出
        public static final String undist_profit = "undist_profit";  // 年初未分配利润
        public static final String distable_profit = "distable_profit";  // 可分配利润
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

        public static final period period = new period();  // 报告期(每个季度最后一天的日期，比如20171231表示年报)
        public static class period extends BaseRequestParam {
            {key = "period";}
        }

        public static final report_type report_type = new report_type();  // 报告类型：见下方详细说明
        public static class report_type extends BaseRequestParam {
            {key = "report_type";}
        }

        public static final comp_type comp_type = new comp_type();  // 公司类型：1一般工商业 2银行 3保险 4证券
        public static class comp_type extends BaseRequestParam {
            {key = "comp_type";}
        }
    }

}