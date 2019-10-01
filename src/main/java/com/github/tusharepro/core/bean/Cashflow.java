package com.github.tusharepro.core.bean;

import com.github.tusharepro.core.http.BaseRequestParam;

/**
 * 现金流量表
 * https://tushare.pro/document/2?doc_id=44
 */
public interface Cashflow extends BaseBean {

    String API_NAME = "cashflow";

    interface Fields {
        String ts_code = "ts_code";  // TS股票代码
        String ann_date = "ann_date";  // 公告日期
        String f_ann_date = "f_ann_date";  // 实际公告日期
        String end_date = "end_date";  // 报告期
        String comp_type = "comp_type";  // 公司类型
        String report_type = "report_type";  // 报表类型
        String net_profit = "net_profit";  // 净利润
        String finan_exp = "finan_exp";  // 财务费用
        String c_fr_sale_sg = "c_fr_sale_sg";  // 销售商品、提供劳务收到的现金
        String recp_tax_rends = "recp_tax_rends";  // 收到的税费返还
        String n_depos_incr_fi = "n_depos_incr_fi";  // 客户存款和同业存放款项净增加额
        String n_incr_loans_cb = "n_incr_loans_cb";  // 向中央银行借款净增加额
        String n_inc_borr_oth_fi = "n_inc_borr_oth_fi";  // 向其他金融机构拆入资金净增加额
        String prem_fr_orig_contr = "prem_fr_orig_contr";  // 收到原保险合同保费取得的现金
        String n_incr_insured_dep = "n_incr_insured_dep";  // 保户储金净增加额
        String n_reinsur_prem = "n_reinsur_prem";  // 收到再保业务现金净额
        String n_incr_disp_tfa = "n_incr_disp_tfa";  // 处置交易性金融资产净增加额
        String ifc_cash_incr = "ifc_cash_incr";  // 收取利息和手续费净增加额
        String n_incr_disp_faas = "n_incr_disp_faas";  // 处置可供出售金融资产净增加额
        String n_incr_loans_oth_bank = "n_incr_loans_oth_bank";  // 拆入资金净增加额
        String n_cap_incr_repur = "n_cap_incr_repur";  // 回购业务资金净增加额
        String c_fr_oth_operate_a = "c_fr_oth_operate_a";  // 收到其他与经营活动有关的现金
        String c_inf_fr_operate_a = "c_inf_fr_operate_a";  // 经营活动现金流入小计
        String c_paid_goods_s = "c_paid_goods_s";  // 购买商品、接受劳务支付的现金
        String c_paid_to_for_empl = "c_paid_to_for_empl";  // 支付给职工以及为职工支付的现金
        String c_paid_for_taxes = "c_paid_for_taxes";  // 支付的各项税费
        String n_incr_clt_loan_adv = "n_incr_clt_loan_adv";  // 客户贷款及垫款净增加额
        String n_incr_dep_cbob = "n_incr_dep_cbob";  // 存放央行和同业款项净增加额
        String c_pay_claims_orig_inco = "c_pay_claims_orig_inco";  // 支付原保险合同赔付款项的现金
        String pay_handling_chrg = "pay_handling_chrg";  // 支付手续费的现金
        String pay_comm_insur_plcy = "pay_comm_insur_plcy";  // 支付保单红利的现金
        String oth_cash_pay_oper_act = "oth_cash_pay_oper_act";  // 支付其他与经营活动有关的现金
        String st_cash_out_act = "st_cash_out_act";  // 经营活动现金流出小计
        String n_cashflow_act = "n_cashflow_act";  // 经营活动产生的现金流量净额
        String oth_recp_ral_inv_act = "oth_recp_ral_inv_act";  // 收到其他与投资活动有关的现金
        String c_disp_withdrwl_invest = "c_disp_withdrwl_invest";  // 收回投资收到的现金
        String c_recp_return_invest = "c_recp_return_invest";  // 取得投资收益收到的现金
        String n_recp_disp_fiolta = "n_recp_disp_fiolta";  // 处置固定资产、无形资产和其他长期资产收回的现金净额
        String n_recp_disp_sobu = "n_recp_disp_sobu";  // 处置子公司及其他营业单位收到的现金净额
        String stot_inflows_inv_act = "stot_inflows_inv_act";  // 投资活动现金流入小计
        String c_pay_acq_const_fiolta = "c_pay_acq_const_fiolta";  // 购建固定资产、无形资产和其他长期资产支付的现金
        String c_paid_invest = "c_paid_invest";  // 投资支付的现金
        String n_disp_subs_oth_biz = "n_disp_subs_oth_biz";  // 取得子公司及其他营业单位支付的现金净额
        String oth_pay_ral_inv_act = "oth_pay_ral_inv_act";  // 支付其他与投资活动有关的现金
        String n_incr_pledge_loan = "n_incr_pledge_loan";  // 质押贷款净增加额
        String stot_out_inv_act = "stot_out_inv_act";  // 投资活动现金流出小计
        String n_cashflow_inv_act = "n_cashflow_inv_act";  // 投资活动产生的现金流量净额
        String c_recp_borrow = "c_recp_borrow";  // 取得借款收到的现金
        String proc_issue_bonds = "proc_issue_bonds";  // 发行债券收到的现金
        String oth_cash_recp_ral_fnc_act = "oth_cash_recp_ral_fnc_act";  // 收到其他与筹资活动有关的现金
        String stot_cash_in_fnc_act = "stot_cash_in_fnc_act";  // 筹资活动现金流入小计
        String free_cashflow = "free_cashflow";  // 企业自由现金流量
        String c_prepay_amt_borr = "c_prepay_amt_borr";  // 偿还债务支付的现金
        String c_pay_dist_dpcp_int_exp = "c_pay_dist_dpcp_int_exp";  // 分配股利、利润或偿付利息支付的现金
        String incl_dvd_profit_paid_sc_ms = "incl_dvd_profit_paid_sc_ms";  // 其中:子公司支付给少数股东的股利、利润
        String oth_cashpay_ral_fnc_act = "oth_cashpay_ral_fnc_act";  // 支付其他与筹资活动有关的现金
        String stot_cashout_fnc_act = "stot_cashout_fnc_act";  // 筹资活动现金流出小计
        String n_cash_flows_fnc_act = "n_cash_flows_fnc_act";  // 筹资活动产生的现金流量净额
        String eff_fx_flu_cash = "eff_fx_flu_cash";  // 汇率变动对现金的影响
        String n_incr_cash_cash_equ = "n_incr_cash_cash_equ";  // 现金及现金等价物净增加额
        String c_cash_equ_beg_period = "c_cash_equ_beg_period";  // 期初现金及现金等价物余额
        String c_cash_equ_end_period = "c_cash_equ_end_period";  // 期末现金及现金等价物余额
        String c_recp_cap_contrib = "c_recp_cap_contrib";  // 吸收投资收到的现金
        String incl_cash_rec_saims = "incl_cash_rec_saims";  // 其中:子公司吸收少数股东投资收到的现金
        String uncon_invest_loss = "uncon_invest_loss";  // 未确认投资损失
        String prov_depr_assets = "prov_depr_assets";  // 加:资产减值准备
        String depr_fa_coga_dpba = "depr_fa_coga_dpba";  // 固定资产折旧、油气资产折耗、生产性生物资产折旧
        String amort_intang_assets = "amort_intang_assets";  // 无形资产摊销
        String lt_amort_deferred_exp = "lt_amort_deferred_exp";  // 长期待摊费用摊销
        String decr_deferred_exp = "decr_deferred_exp";  // 待摊费用减少
        String incr_acc_exp = "incr_acc_exp";  // 预提费用增加
        String loss_disp_fiolta = "loss_disp_fiolta";  // 处置固定、无形资产和其他长期资产的损失
        String loss_scr_fa = "loss_scr_fa";  // 固定资产报废损失
        String loss_fv_chg = "loss_fv_chg";  // 公允价值变动损失
        String invest_loss = "invest_loss";  // 投资损失
        String decr_def_inc_tax_assets = "decr_def_inc_tax_assets";  // 递延所得税资产减少
        String incr_def_inc_tax_liab = "incr_def_inc_tax_liab";  // 递延所得税负债增加
        String decr_inventories = "decr_inventories";  // 存货的减少
        String decr_oper_payable = "decr_oper_payable";  // 经营性应收项目的减少
        String incr_oper_payable = "incr_oper_payable";  // 经营性应付项目的增加
        String others = "others";  // 其他
        String im_net_cashflow_oper_act = "im_net_cashflow_oper_act";  // 经营活动产生的现金流量净额(间接法)
        String conv_debt_into_cap = "conv_debt_into_cap";  // 债务转为资本
        String conv_copbonds_due_within_1y = "conv_copbonds_due_within_1y";  // 一年内到期的可转换公司债券
        String fa_fnc_leases = "fa_fnc_leases";  // 融资租入固定资产
        String end_bal_cash = "end_bal_cash";  // 现金的期末余额
        String beg_bal_cash = "beg_bal_cash";  // 减:现金的期初余额
        String end_bal_cash_equ = "end_bal_cash_equ";  // 加:现金等价物的期末余额
        String beg_bal_cash_equ = "beg_bal_cash_equ";  // 减:现金等价物的期初余额
        String im_n_incr_cash_equ = "im_n_incr_cash_equ";  // 现金及现金等价物净增加额(间接法)
        String update_flag = "update_flag";  // 更新标识
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