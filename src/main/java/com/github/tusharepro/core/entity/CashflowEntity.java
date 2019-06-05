package com.github.tusharepro.core.entity;

import com.github.tusharepro.core.bean.Cashflow;
import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;

/**
 * 现金流量表
 */
@Data
@Entity
@Table(name = "cashflow")
@IdClass(CashflowEntity.PrimaryKey.class)
public class CashflowEntity implements Cashflow {

    @Data public static class PrimaryKey implements Serializable {
        private String tsCode;
        private LocalDate endDate;
        private String reportType;
    }

    @Id
    @Column(name = "ts_code") protected String tsCode;  // TS股票代码
    @Column(name = "ann_date") protected LocalDate annDate;  // 公告日期
    @Column(name = "f_ann_date") protected LocalDate fAnnDate;  // 实际公告日期
    @Id
    @Column(name = "end_date") protected LocalDate endDate;  // 报告期
    @Column(name = "comp_type") protected String compType;  // 公司类型：1一般工商业 2银行 3保险 4证券
    @Id
    @Column(name = "report_type") protected String reportType;  // 报表类型：见下方详细说明
    @Column(name = "net_profit") protected Double netProfit;  // 净利润 (元，下同)
    @Column(name = "finan_exp") protected Double finanExp;  // 财务费用
    @Column(name = "c_fr_sale_sg") protected Double cFrSaleSg;  // 销售商品、提供劳务收到的现金
    @Column(name = "recp_tax_rends") protected Double recpTaxRends;  // 收到的税费返还
    @Column(name = "n_depos_incr_fi") protected Double nDeposIncrFi;  // 客户存款和同业存放款项净增加额
    @Column(name = "n_incr_loans_cb") protected Double nIncrLoansCb;  // 向中央银行借款净增加额
    @Column(name = "n_inc_borr_oth_fi") protected Double nIncBorrOthFi;  // 向其他金融机构拆入资金净增加额
    @Column(name = "prem_fr_orig_contr") protected Double premFrOrigContr;  // 收到原保险合同保费取得的现金
    @Column(name = "n_incr_insured_dep") protected Double nIncrInsuredDep;  // 保户储金净增加额
    @Column(name = "n_reinsur_prem") protected Double nReinsurPrem;  // 收到再保业务现金净额
    @Column(name = "n_incr_disp_tfa") protected Double nIncrDispTfa;  // 处置交易性金融资产净增加额
    @Column(name = "ifc_cash_incr") protected Double ifcCashIncr;  // 收取利息和手续费净增加额
    @Column(name = "n_incr_disp_faas") protected Double nIncrDispFaas;  // 处置可供出售金融资产净增加额
    @Column(name = "n_incr_loans_oth_bank") protected Double nIncrLoansOthBank;  // 拆入资金净增加额
    @Column(name = "n_cap_incr_repur") protected Double nCapIncrRepur;  // 回购业务资金净增加额
    @Column(name = "c_fr_oth_operate_a") protected Double cFrOthOperateA;  // 收到其他与经营活动有关的现金
    @Column(name = "c_inf_fr_operate_a") protected Double cInfFrOperateA;  // 经营活动现金流入小计
    @Column(name = "c_paid_goods_s") protected Double cPaidGoodsS;  // 购买商品、接受劳务支付的现金
    @Column(name = "c_paid_to_for_empl") protected Double cPaidToForEmpl;  // 支付给职工以及为职工支付的现金
    @Column(name = "c_paid_for_taxes") protected Double cPaidForTaxes;  // 支付的各项税费
    @Column(name = "n_incr_clt_loan_adv") protected Double nIncrCltLoanAdv;  // 客户贷款及垫款净增加额
    @Column(name = "n_incr_dep_cbob") protected Double nIncrDepCbob;  // 存放央行和同业款项净增加额
    @Column(name = "c_pay_claims_orig_inco") protected Double cPayClaimsOrigInco;  // 支付原保险合同赔付款项的现金
    @Column(name = "pay_handling_chrg") protected Double payHandlingChrg;  // 支付手续费的现金
    @Column(name = "pay_comm_insur_plcy") protected Double payCommInsurPlcy;  // 支付保单红利的现金
    @Column(name = "oth_cash_pay_oper_act") protected Double othCashPayOperAct;  // 支付其他与经营活动有关的现金
    @Column(name = "st_cash_out_act") protected Double stCashOutAct;  // 经营活动现金流出小计
    @Column(name = "n_cashflow_act") protected Double nCashflowAct;  // 经营活动产生的现金流量净额
    @Column(name = "oth_recp_ral_inv_act") protected Double othRecpRalInvAct;  // 收到其他与投资活动有关的现金
    @Column(name = "c_disp_withdrwl_invest") protected Double cDispWithdrwlInvest;  // 收回投资收到的现金
    @Column(name = "c_recp_return_invest") protected Double cRecpReturnInvest;  // 取得投资收益收到的现金
    @Column(name = "n_recp_disp_fiolta") protected Double nRecpDispFiolta;  // 处置固定资产、无形资产和其他长期资产收回的现金净额
    @Column(name = "n_recp_disp_sobu") protected Double nRecpDispSobu;  // 处置子公司及其他营业单位收到的现金净额
    @Column(name = "stot_inflows_inv_act") protected Double stotInflowsInvAct;  // 投资活动现金流入小计
    @Column(name = "c_pay_acq_const_fiolta") protected Double cPayAcqConstFiolta;  // 购建固定资产、无形资产和其他长期资产支付的现金
    @Column(name = "c_paid_invest") protected Double cPaidInvest;  // 投资支付的现金
    @Column(name = "n_disp_subs_oth_biz") protected Double nDispSubsOthBiz;  // 取得子公司及其他营业单位支付的现金净额
    @Column(name = "oth_pay_ral_inv_act") protected Double othPayRalInvAct;  // 支付其他与投资活动有关的现金
    @Column(name = "n_incr_pledge_loan") protected Double nIncrPledgeLoan;  // 质押贷款净增加额
    @Column(name = "stot_out_inv_act") protected Double stotOutInvAct;  // 投资活动现金流出小计
    @Column(name = "n_cashflow_inv_act") protected Double nCashflowInvAct;  // 投资活动产生的现金流量净额
    @Column(name = "c_recp_borrow") protected Double cRecpBorrow;  // 取得借款收到的现金
    @Column(name = "proc_issue_bonds") protected Double procIssueBonds;  // 发行债券收到的现金
    @Column(name = "oth_cash_recp_ral_fnc_act") protected Double othCashRecpRalFncAct;  // 收到其他与筹资活动有关的现金
    @Column(name = "stot_cash_in_fnc_act") protected Double stotCashInFncAct;  // 筹资活动现金流入小计
    @Column(name = "free_cashflow") protected Double freeCashflow;  // 企业自由现金流量
    @Column(name = "c_prepay_amt_borr") protected Double cPrepayAmtBorr;  // 偿还债务支付的现金
    @Column(name = "c_pay_dist_dpcp_int_exp") protected Double cPayDistDpcpIntExp;  // 分配股利、利润或偿付利息支付的现金
    @Column(name = "incl_dvd_profit_paid_sc_ms") protected Double inclDvdProfitPaidScMs;  // 其中:子公司支付给少数股东的股利、利润
    @Column(name = "oth_cashpay_ral_fnc_act") protected Double othCashpayRalFncAct;  // 支付其他与筹资活动有关的现金
    @Column(name = "stot_cashout_fnc_act") protected Double stotCashoutFncAct;  // 筹资活动现金流出小计
    @Column(name = "n_cash_flows_fnc_act") protected Double nCashFlowsFncAct;  // 筹资活动产生的现金流量净额
    @Column(name = "eff_fx_flu_cash") protected Double effFxFluCash;  // 汇率变动对现金的影响
    @Column(name = "n_incr_cash_cash_equ") protected Double nIncrCashCashEqu;  // 现金及现金等价物净增加额
    @Column(name = "c_cash_equ_beg_period") protected Double cCashEquBegPeriod;  // 期初现金及现金等价物余额
    @Column(name = "c_cash_equ_end_period") protected Double cCashEquEndPeriod;  // 期末现金及现金等价物余额
    @Column(name = "c_recp_cap_contrib") protected Double cRecpCapContrib;  // 吸收投资收到的现金
    @Column(name = "incl_cash_rec_saims") protected Double inclCashRecSaims;  // 其中:子公司吸收少数股东投资收到的现金
    @Column(name = "uncon_invest_loss") protected Double unconInvestLoss;  // 未确认投资损失
    @Column(name = "prov_depr_assets") protected Double provDeprAssets;  // 加:资产减值准备
    @Column(name = "depr_fa_coga_dpba") protected Double deprFaCogaDpba;  // 固定资产折旧、油气资产折耗、生产性生物资产折旧
    @Column(name = "amort_intang_assets") protected Double amortIntangAssets;  // 无形资产摊销
    @Column(name = "lt_amort_deferred_exp") protected Double ltAmortDeferredExp;  // 长期待摊费用摊销
    @Column(name = "decr_deferred_exp") protected Double decrDeferredExp;  // 待摊费用减少
    @Column(name = "incr_acc_exp") protected Double incrAccExp;  // 预提费用增加
    @Column(name = "loss_disp_fiolta") protected Double lossDispFiolta;  // 处置固定、无形资产和其他长期资产的损失
    @Column(name = "loss_scr_fa") protected Double lossScrFa;  // 固定资产报废损失
    @Column(name = "loss_fv_chg") protected Double lossFvChg;  // 公允价值变动损失
    @Column(name = "invest_loss") protected Double investLoss;  // 投资损失
    @Column(name = "decr_def_inc_tax_assets") protected Double decrDefIncTaxAssets;  // 递延所得税资产减少
    @Column(name = "incr_def_inc_tax_liab") protected Double incrDefIncTaxLiab;  // 递延所得税负债增加
    @Column(name = "decr_inventories") protected Double decrInventories;  // 存货的减少
    @Column(name = "decr_oper_payable") protected Double decrOperPayable;  // 经营性应收项目的减少
    @Column(name = "incr_oper_payable") protected Double incrOperPayable;  // 经营性应付项目的增加
    @Column(name = "others") protected Double others;  // 其他
    @Column(name = "im_net_cashflow_oper_act") protected Double imNetCashflowOperAct;  // 经营活动产生的现金流量净额(间接法)
    @Column(name = "conv_debt_into_cap") protected Double convDebtIntoCap;  // 债务转为资本
    @Column(name = "conv_copbonds_due_within_1y") protected Double convCopbondsDueWithin1y;  // 一年内到期的可转换公司债券
    @Column(name = "fa_fnc_leases") protected Double faFncLeases;  // 融资租入固定资产
    @Column(name = "end_bal_cash") protected Double endBalCash;  // 现金的期末余额
    @Column(name = "beg_bal_cash") protected Double begBalCash;  // 减:现金的期初余额
    @Column(name = "end_bal_cash_equ") protected Double endBalCashEqu;  // 加:现金等价物的期末余额
    @Column(name = "beg_bal_cash_equ") protected Double begBalCashEqu;  // 减:现金等价物的期初余额
    @Column(name = "im_n_incr_cash_equ") protected Double imNIncrCashEqu;  // 现金及现金等价物净增加额(间接法)

}