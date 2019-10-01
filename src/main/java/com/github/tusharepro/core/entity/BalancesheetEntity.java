package com.github.tusharepro.core.entity;
import lombok.Data;

import com.github.tusharepro.core.bean.Balancesheet;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;

/**
 * 资产负债表
 * https://tushare.pro/document/2?doc_id=36
 */
@Data
@Entity
@Table(name = "balancesheet")
@IdClass(BalancesheetEntity.PrimaryKey.class)
public class BalancesheetEntity implements Balancesheet {

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
    @Id
    @Column(name = "report_type") protected String reportType;  // 报表类型：见下方详细说明
    @Column(name = "comp_type") protected String compType;  // 公司类型：1一般工商业 2银行 3保险 4证券
    @Column(name = "total_share") protected Double totalShare;  // 期末总股本
    @Column(name = "cap_rese") protected Double capRese;  // 资本公积金
    @Column(name = "undistr_porfit") protected Double undistrPorfit;  // 未分配利润
    @Column(name = "surplus_rese") protected Double surplusRese;  // 盈余公积金
    @Column(name = "special_rese") protected Double specialRese;  // 专项储备
    @Column(name = "money_cap") protected Double moneyCap;  // 货币资金
    @Column(name = "trad_asset") protected Double tradAsset;  // 交易性金融资产
    @Column(name = "notes_receiv") protected Double notesReceiv;  // 应收票据
    @Column(name = "accounts_receiv") protected Double accountsReceiv;  // 应收账款
    @Column(name = "oth_receiv") protected Double othReceiv;  // 其他应收款
    @Column(name = "prepayment") protected Double prepayment;  // 预付款项
    @Column(name = "div_receiv") protected Double divReceiv;  // 应收股利
    @Column(name = "int_receiv") protected Double intReceiv;  // 应收利息
    @Column(name = "inventories") protected Double inventories;  // 存货
    @Column(name = "amor_exp") protected Double amorExp;  // 长期待摊费用
    @Column(name = "nca_within_1y") protected Double ncaWithin1y;  // 一年内到期的非流动资产
    @Column(name = "sett_rsrv") protected Double settRsrv;  // 结算备付金
    @Column(name = "loanto_oth_bank_fi") protected Double loantoOthBankFi;  // 拆出资金
    @Column(name = "premium_receiv") protected Double premiumReceiv;  // 应收保费
    @Column(name = "reinsur_receiv") protected Double reinsurReceiv;  // 应收分保账款
    @Column(name = "reinsur_res_receiv") protected Double reinsurResReceiv;  // 应收分保合同准备金
    @Column(name = "pur_resale_fa") protected Double purResaleFa;  // 买入返售金融资产
    @Column(name = "oth_cur_assets") protected Double othCurAssets;  // 其他流动资产
    @Column(name = "total_cur_assets") protected Double totalCurAssets;  // 流动资产合计
    @Column(name = "fa_avail_for_sale") protected Double faAvailForSale;  // 可供出售金融资产
    @Column(name = "htm_invest") protected Double htmInvest;  // 持有至到期投资
    @Column(name = "lt_eqt_invest") protected Double ltEqtInvest;  // 长期股权投资
    @Column(name = "invest_real_estate") protected Double investRealEstate;  // 投资性房地产
    @Column(name = "time_deposits") protected Double timeDeposits;  // 定期存款
    @Column(name = "oth_assets") protected Double othAssets;  // 其他资产
    @Column(name = "lt_rec") protected Double ltRec;  // 长期应收款
    @Column(name = "fix_assets") protected Double fixAssets;  // 固定资产
    @Column(name = "cip") protected Double cip;  // 在建工程
    @Column(name = "const_materials") protected Double constMaterials;  // 工程物资
    @Column(name = "fixed_assets_disp") protected Double fixedAssetsDisp;  // 固定资产清理
    @Column(name = "produc_bio_assets") protected Double producBioAssets;  // 生产性生物资产
    @Column(name = "oil_and_gas_assets") protected Double oilAndGasAssets;  // 油气资产
    @Column(name = "intan_assets") protected Double intanAssets;  // 无形资产
    @Column(name = "r_and_d") protected Double rAndD;  // 研发支出
    @Column(name = "goodwill") protected Double goodwill;  // 商誉
    @Column(name = "lt_amor_exp") protected Double ltAmorExp;  // 长期待摊费用
    @Column(name = "defer_tax_assets") protected Double deferTaxAssets;  // 递延所得税资产
    @Column(name = "decr_in_disbur") protected Double decrInDisbur;  // 发放贷款及垫款
    @Column(name = "oth_nca") protected Double othNca;  // 其他非流动资产
    @Column(name = "total_nca") protected Double totalNca;  // 非流动资产合计
    @Column(name = "cash_reser_cb") protected Double cashReserCb;  // 现金及存放中央银行款项
    @Column(name = "depos_in_oth_bfi") protected Double deposInOthBfi;  // 存放同业和其它金融机构款项
    @Column(name = "prec_metals") protected Double precMetals;  // 贵金属
    @Column(name = "deriv_assets") protected Double derivAssets;  // 衍生金融资产
    @Column(name = "rr_reins_une_prem") protected Double rrReinsUnePrem;  // 应收分保未到期责任准备金
    @Column(name = "rr_reins_outstd_cla") protected Double rrReinsOutstdCla;  // 应收分保未决赔款准备金
    @Column(name = "rr_reins_lins_liab") protected Double rrReinsLinsLiab;  // 应收分保寿险责任准备金
    @Column(name = "rr_reins_lthins_liab") protected Double rrReinsLthinsLiab;  // 应收分保长期健康险责任准备金
    @Column(name = "refund_depos") protected Double refundDepos;  // 存出保证金
    @Column(name = "ph_pledge_loans") protected Double phPledgeLoans;  // 保户质押贷款
    @Column(name = "refund_cap_depos") protected Double refundCapDepos;  // 存出资本保证金
    @Column(name = "indep_acct_assets") protected Double indepAcctAssets;  // 独立账户资产
    @Column(name = "client_depos") protected Double clientDepos;  // 其中：客户资金存款
    @Column(name = "client_prov") protected Double clientProv;  // 其中：客户备付金
    @Column(name = "transac_seat_fee") protected Double transacSeatFee;  // 其中:交易席位费
    @Column(name = "invest_as_receiv") protected Double investAsReceiv;  // 应收款项类投资
    @Column(name = "total_assets") protected Double totalAssets;  // 资产总计
    @Column(name = "lt_borr") protected Double ltBorr;  // 长期借款
    @Column(name = "st_borr") protected Double stBorr;  // 短期借款
    @Column(name = "cb_borr") protected Double cbBorr;  // 向中央银行借款
    @Column(name = "depos_ib_deposits") protected Double deposIbDeposits;  // 吸收存款及同业存放
    @Column(name = "loan_oth_bank") protected Double loanOthBank;  // 拆入资金
    @Column(name = "trading_fl") protected Double tradingFl;  // 交易性金融负债
    @Column(name = "notes_payable") protected Double notesPayable;  // 应付票据
    @Column(name = "acct_payable") protected Double acctPayable;  // 应付账款
    @Column(name = "adv_receipts") protected Double advReceipts;  // 预收款项
    @Column(name = "sold_for_repur_fa") protected Double soldForRepurFa;  // 卖出回购金融资产款
    @Column(name = "comm_payable") protected Double commPayable;  // 应付手续费及佣金
    @Column(name = "payroll_payable") protected Double payrollPayable;  // 应付职工薪酬
    @Column(name = "taxes_payable") protected Double taxesPayable;  // 应交税费
    @Column(name = "int_payable") protected Double intPayable;  // 应付利息
    @Column(name = "div_payable") protected Double divPayable;  // 应付股利
    @Column(name = "oth_payable") protected Double othPayable;  // 其他应付款
    @Column(name = "acc_exp") protected Double accExp;  // 预提费用
    @Column(name = "deferred_inc") protected Double deferredInc;  // 递延收益
    @Column(name = "st_bonds_payable") protected Double stBondsPayable;  // 应付短期债券
    @Column(name = "payable_to_reinsurer") protected Double payableToReinsurer;  // 应付分保账款
    @Column(name = "rsrv_insur_cont") protected Double rsrvInsurCont;  // 保险合同准备金
    @Column(name = "acting_trading_sec") protected Double actingTradingSec;  // 代理买卖证券款
    @Column(name = "acting_uw_sec") protected Double actingUwSec;  // 代理承销证券款
    @Column(name = "non_cur_liab_due_1y") protected Double nonCurLiabDue1y;  // 一年内到期的非流动负债
    @Column(name = "oth_cur_liab") protected Double othCurLiab;  // 其他流动负债
    @Column(name = "total_cur_liab") protected Double totalCurLiab;  // 流动负债合计
    @Column(name = "bond_payable") protected Double bondPayable;  // 应付债券
    @Column(name = "lt_payable") protected Double ltPayable;  // 长期应付款
    @Column(name = "specific_payables") protected Double specificPayables;  // 专项应付款
    @Column(name = "estimated_liab") protected Double estimatedLiab;  // 预计负债
    @Column(name = "defer_tax_liab") protected Double deferTaxLiab;  // 递延所得税负债
    @Column(name = "defer_inc_non_cur_liab") protected Double deferIncNonCurLiab;  // 递延收益-非流动负债
    @Column(name = "oth_ncl") protected Double othNcl;  // 其他非流动负债
    @Column(name = "total_ncl") protected Double totalNcl;  // 非流动负债合计
    @Column(name = "depos_oth_bfi") protected Double deposOthBfi;  // 同业和其它金融机构存放款项
    @Column(name = "deriv_liab") protected Double derivLiab;  // 衍生金融负债
    @Column(name = "depos") protected Double depos;  // 吸收存款
    @Column(name = "agency_bus_liab") protected Double agencyBusLiab;  // 代理业务负债
    @Column(name = "oth_liab") protected Double othLiab;  // 其他负债
    @Column(name = "prem_receiv_adva") protected Double premReceivAdva;  // 预收保费
    @Column(name = "depos_received") protected Double deposReceived;  // 存入保证金
    @Column(name = "ph_invest") protected Double phInvest;  // 保户储金及投资款
    @Column(name = "reser_une_prem") protected Double reserUnePrem;  // 未到期责任准备金
    @Column(name = "reser_outstd_claims") protected Double reserOutstdClaims;  // 未决赔款准备金
    @Column(name = "reser_lins_liab") protected Double reserLinsLiab;  // 寿险责任准备金
    @Column(name = "reser_lthins_liab") protected Double reserLthinsLiab;  // 长期健康险责任准备金
    @Column(name = "indept_acc_liab") protected Double indeptAccLiab;  // 独立账户负债
    @Column(name = "pledge_borr") protected Double pledgeBorr;  // 其中:质押借款
    @Column(name = "indem_payable") protected Double indemPayable;  // 应付赔付款
    @Column(name = "policy_div_payable") protected Double policyDivPayable;  // 应付保单红利
    @Column(name = "total_liab") protected Double totalLiab;  // 负债合计
    @Column(name = "treasury_share") protected Double treasuryShare;  // 减:库存股
    @Column(name = "ordin_risk_reser") protected Double ordinRiskReser;  // 一般风险准备
    @Column(name = "forex_differ") protected Double forexDiffer;  // 外币报表折算差额
    @Column(name = "invest_loss_unconf") protected Double investLossUnconf;  // 未确认的投资损失
    @Column(name = "minority_int") protected Double minorityInt;  // 少数股东权益
    @Column(name = "total_hldr_eqy_exc_min_int") protected Double totalHldrEqyExcMinInt;  // 股东权益合计(不含少数股东权益)
    @Column(name = "total_hldr_eqy_inc_min_int") protected Double totalHldrEqyIncMinInt;  // 股东权益合计(含少数股东权益)
    @Column(name = "total_liab_hldr_eqy") protected Double totalLiabHldrEqy;  // 负债及股东权益总计
    @Column(name = "lt_payroll_payable") protected Double ltPayrollPayable;  // 长期应付职工薪酬
    @Column(name = "oth_comp_income") protected Double othCompIncome;  // 其他综合收益
    @Column(name = "oth_eqt_tools") protected Double othEqtTools;  // 其他权益工具
    @Column(name = "oth_eqt_tools_p_shr") protected Double othEqtToolsPShr;  // 其他权益工具(优先股)
    @Column(name = "lending_funds") protected Double lendingFunds;  // 融出资金
    @Column(name = "acc_receivable") protected Double accReceivable;  // 应收款项
    @Column(name = "st_fin_payable") protected Double stFinPayable;  // 应付短期融资款
    @Column(name = "payables") protected Double payables;  // 应付款项
    @Column(name = "hfs_assets") protected Double hfsAssets;  // 持有待售的资产
    @Column(name = "hfs_sales") protected Double hfsSales;  // 持有待售的负债
    @Column(name = "update_flag") protected String updateFlag;  // 更新标识

}