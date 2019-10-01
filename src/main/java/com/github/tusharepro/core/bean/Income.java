package com.github.tusharepro.core.bean;

import com.github.tusharepro.core.http.BaseRequestParam;

/**
 * 利润表
 * https://tushare.pro/document/2?doc_id=33
 */
public interface Income extends BaseBean {

    String API_NAME = "income";

    interface Fields {
        String ts_code = "ts_code";  // TS代码
        String ann_date = "ann_date";  // 公告日期
        String f_ann_date = "f_ann_date";  // 实际公告日期
        String end_date = "end_date";  // 报告期
        String report_type = "report_type";  // 报告类型 1合并报表 2单季合并 3调整单季合并表 4调整合并报表 5调整前合并报表 6母公司报表 7母公司单季表 8 母公司调整单季表 9母公司调整表 10母公司调整前报表 11调整前合并报表 12母公司调整前报表
        String comp_type = "comp_type";  // 公司类型(1一般工商业2银行3保险4证券)
        String basic_eps = "basic_eps";  // 基本每股收益
        String diluted_eps = "diluted_eps";  // 稀释每股收益
        String total_revenue = "total_revenue";  // 营业总收入
        String revenue = "revenue";  // 营业收入
        String int_income = "int_income";  // 利息收入
        String prem_earned = "prem_earned";  // 已赚保费
        String comm_income = "comm_income";  // 手续费及佣金收入
        String n_commis_income = "n_commis_income";  // 手续费及佣金净收入
        String n_oth_income = "n_oth_income";  // 其他经营净收益
        String n_oth_b_income = "n_oth_b_income";  // 加:其他业务净收益
        String prem_income = "prem_income";  // 保险业务收入
        String out_prem = "out_prem";  // 减:分出保费
        String une_prem_reser = "une_prem_reser";  // 提取未到期责任准备金
        String reins_income = "reins_income";  // 其中:分保费收入
        String n_sec_tb_income = "n_sec_tb_income";  // 代理买卖证券业务净收入
        String n_sec_uw_income = "n_sec_uw_income";  // 证券承销业务净收入
        String n_asset_mg_income = "n_asset_mg_income";  // 受托客户资产管理业务净收入
        String oth_b_income = "oth_b_income";  // 其他业务收入
        String fv_value_chg_gain = "fv_value_chg_gain";  // 加:公允价值变动净收益
        String invest_income = "invest_income";  // 加:投资净收益
        String ass_invest_income = "ass_invest_income";  // 其中:对联营企业和合营企业的投资收益
        String forex_gain = "forex_gain";  // 加:汇兑净收益
        String total_cogs = "total_cogs";  // 营业总成本
        String oper_cost = "oper_cost";  // 减:营业成本
        String int_exp = "int_exp";  // 减:利息支出
        String comm_exp = "comm_exp";  // 减:手续费及佣金支出
        String biz_tax_surchg = "biz_tax_surchg";  // 减:营业税金及附加
        String sell_exp = "sell_exp";  // 减:销售费用
        String admin_exp = "admin_exp";  // 减:管理费用
        String fin_exp = "fin_exp";  // 减:财务费用
        String assets_impair_loss = "assets_impair_loss";  // 减:资产减值损失
        String prem_refund = "prem_refund";  // 退保金
        String compens_payout = "compens_payout";  // 赔付总支出
        String reser_insur_liab = "reser_insur_liab";  // 提取保险责任准备金
        String div_payt = "div_payt";  // 保户红利支出
        String reins_exp = "reins_exp";  // 分保费用
        String oper_exp = "oper_exp";  // 营业支出
        String compens_payout_refu = "compens_payout_refu";  // 减:摊回赔付支出
        String insur_reser_refu = "insur_reser_refu";  // 减:摊回保险责任准备金
        String reins_cost_refund = "reins_cost_refund";  // 减:摊回分保费用
        String other_bus_cost = "other_bus_cost";  // 其他业务成本
        String operate_profit = "operate_profit";  // 营业利润
        String non_oper_income = "non_oper_income";  // 加:营业外收入
        String non_oper_exp = "non_oper_exp";  // 减:营业外支出
        String nca_disploss = "nca_disploss";  // 其中:减:非流动资产处置净损失
        String total_profit = "total_profit";  // 利润总额
        String income_tax = "income_tax";  // 所得税费用
        String n_income = "n_income";  // 净利润(含少数股东损益)
        String n_income_attr_p = "n_income_attr_p";  // 净利润(不含少数股东损益)
        String minority_gain = "minority_gain";  // 少数股东损益
        String oth_compr_income = "oth_compr_income";  // 其他综合收益
        String t_compr_income = "t_compr_income";  // 综合收益总额
        String compr_inc_attr_p = "compr_inc_attr_p";  // 归属于母公司(或股东)的综合收益总额
        String compr_inc_attr_m_s = "compr_inc_attr_m_s";  // 归属于少数股东的综合收益总额
        String ebit = "ebit";  // 息税前利润
        String ebitda = "ebitda";  // 息税折旧摊销前利润
        String insurance_exp = "insurance_exp";  // 保险业务支出
        String undist_profit = "undist_profit";  // 年初未分配利润
        String distable_profit = "distable_profit";  // 可分配利润
        String update_flag = "update_flag";  // 更新标识，0未修改1更正过
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

        period period = new period();  // 报告期(每个季度最后一天的日期，比如20171231表示年报)
        class period extends BaseRequestParam {
            {key = "period";}
        }

        report_type report_type = new report_type();  // 报告类型：见下方详细说明
        class report_type extends BaseRequestParam {
            {key = "report_type";}
        }

        comp_type comp_type = new comp_type();  // 公司类型：1一般工商业 2银行 3保险 4证券
        class comp_type extends BaseRequestParam {
            {key = "comp_type";}
        }
    }

}