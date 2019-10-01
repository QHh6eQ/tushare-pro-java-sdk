package com.github.tusharepro.core.entity;
import lombok.Data;

import com.github.tusharepro.core.bean.FinaIndicator;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;

/**
 * 财务指标数据
 * https://tushare.pro/document/2?doc_id=79
 */
@Data
@Entity
@Table(name = "fina_indicator")
@IdClass(FinaIndicatorEntity.PrimaryKey.class)
public class FinaIndicatorEntity implements FinaIndicator {

    @Data public static class PrimaryKey implements Serializable {
        private String tsCode;
        private LocalDate endDate;
    }

    @Id
    @Column(name = "ts_code") protected String tsCode;  // TS代码
    @Column(name = "ann_date") protected LocalDate annDate;  // 公告日期
    @Id
    @Column(name = "end_date") protected LocalDate endDate;  // 报告期
    @Column(name = "eps") protected Double eps;  // 基本每股收益
    @Column(name = "dt_eps") protected Double dtEps;  // 稀释每股收益
    @Column(name = "total_revenue_ps") protected Double totalRevenuePs;  // 每股营业总收入
    @Column(name = "revenue_ps") protected Double revenuePs;  // 每股营业收入
    @Column(name = "capital_rese_ps") protected Double capitalResePs;  // 每股资本公积
    @Column(name = "surplus_rese_ps") protected Double surplusResePs;  // 每股盈余公积
    @Column(name = "undist_profit_ps") protected Double undistProfitPs;  // 每股未分配利润
    @Column(name = "extra_item") protected Double extraItem;  // 非经常性损益
    @Column(name = "profit_dedt") protected Double profitDedt;  // 扣除非经常性损益后的净利润
    @Column(name = "gross_margin") protected Double grossMargin;  // 毛利
    @Column(name = "current_ratio") protected Double currentRatio;  // 流动比率
    @Column(name = "quick_ratio") protected Double quickRatio;  // 速动比率
    @Column(name = "cash_ratio") protected Double cashRatio;  // 保守速动比率
    @Column(name = "invturn_days") protected Double invturnDays;  // 存货周转天数
    @Column(name = "arturn_days") protected Double arturnDays;  // 应收账款周转天数
    @Column(name = "inv_turn") protected Double invTurn;  // 存货周转率
    @Column(name = "ar_turn") protected Double arTurn;  // 应收账款周转率
    @Column(name = "ca_turn") protected Double caTurn;  // 流动资产周转率
    @Column(name = "fa_turn") protected Double faTurn;  // 固定资产周转率
    @Column(name = "assets_turn") protected Double assetsTurn;  // 总资产周转率
    @Column(name = "op_income") protected Double opIncome;  // 经营活动净收益
    @Column(name = "valuechange_income") protected Double valuechangeIncome;  // 价值变动净收益
    @Column(name = "interst_income") protected Double interstIncome;  // 利息费用
    @Column(name = "daa") protected Double daa;  // 折旧与摊销
    @Column(name = "ebit") protected Double ebit;  // 息税前利润
    @Column(name = "ebitda") protected Double ebitda;  // 息税折旧摊销前利润
    @Column(name = "fcff") protected Double fcff;  // 企业自由现金流量
    @Column(name = "fcfe") protected Double fcfe;  // 股权自由现金流量
    @Column(name = "current_exint") protected Double currentExint;  // 无息流动负债
    @Column(name = "noncurrent_exint") protected Double noncurrentExint;  // 无息非流动负债
    @Column(name = "interestdebt") protected Double interestdebt;  // 带息债务
    @Column(name = "netdebt") protected Double netdebt;  // 净债务
    @Column(name = "tangible_asset") protected Double tangibleAsset;  // 有形资产
    @Column(name = "working_capital") protected Double workingCapital;  // 营运资金
    @Column(name = "networking_capital") protected Double networkingCapital;  // 营运流动资本
    @Column(name = "invest_capital") protected Double investCapital;  // 全部投入资本
    @Column(name = "retained_earnings") protected Double retainedEarnings;  // 留存收益
    @Column(name = "diluted2_eps") protected Double diluted2Eps;  // 期末摊薄每股收益
    @Column(name = "bps") protected Double bps;  // 每股净资产
    @Column(name = "ocfps") protected Double ocfps;  // 每股经营活动产生的现金流量净额
    @Column(name = "retainedps") protected Double retainedps;  // 每股留存收益
    @Column(name = "cfps") protected Double cfps;  // 每股现金流量净额
    @Column(name = "ebit_ps") protected Double ebitPs;  // 每股息税前利润
    @Column(name = "fcff_ps") protected Double fcffPs;  // 每股企业自由现金流量
    @Column(name = "fcfe_ps") protected Double fcfePs;  // 每股股东自由现金流量
    @Column(name = "netprofit_margin") protected Double netprofitMargin;  // 销售净利率
    @Column(name = "grossprofit_margin") protected Double grossprofitMargin;  // 销售毛利率
    @Column(name = "cogs_of_sales") protected Double cogsOfSales;  // 销售成本率
    @Column(name = "expense_of_sales") protected Double expenseOfSales;  // 销售期间费用率
    @Column(name = "profit_to_gr") protected Double profitToGr;  // 净利润/营业总收入
    @Column(name = "saleexp_to_gr") protected Double saleexpToGr;  // 销售费用/营业总收入
    @Column(name = "adminexp_of_gr") protected Double adminexpOfGr;  // 管理费用/营业总收入
    @Column(name = "finaexp_of_gr") protected Double finaexpOfGr;  // 财务费用/营业总收入
    @Column(name = "impai_ttm") protected Double impaiTtm;  // 资产减值损失/营业总收入
    @Column(name = "gc_of_gr") protected Double gcOfGr;  // 营业总成本/营业总收入
    @Column(name = "op_of_gr") protected Double opOfGr;  // 营业利润/营业总收入
    @Column(name = "ebit_of_gr") protected Double ebitOfGr;  // 息税前利润/营业总收入
    @Column(name = "roe") protected Double roe;  // 净资产收益率
    @Column(name = "roe_waa") protected Double roeWaa;  // 加权平均净资产收益率
    @Column(name = "roe_dt") protected Double roeDt;  // 净资产收益率(扣除非经常损益)
    @Column(name = "roa") protected Double roa;  // 总资产报酬率
    @Column(name = "npta") protected Double npta;  // 总资产净利润
    @Column(name = "roic") protected Double roic;  // 投入资本回报率
    @Column(name = "roe_yearly") protected Double roeYearly;  // 年化净资产收益率
    @Column(name = "roa2_yearly") protected Double roa2Yearly;  // 年化总资产报酬率
    @Column(name = "roe_avg") protected Double roeAvg;  // 平均净资产收益率(增发条件)
    @Column(name = "opincome_of_ebt") protected Double opincomeOfEbt;  // 经营活动净收益/利润总额
    @Column(name = "investincome_of_ebt") protected Double investincomeOfEbt;  // 价值变动净收益/利润总额
    @Column(name = "n_op_profit_of_ebt") protected Double nOpProfitOfEbt;  // 营业外收支净额/利润总额
    @Column(name = "tax_to_ebt") protected Double taxToEbt;  // 所得税/利润总额
    @Column(name = "dtprofit_to_profit") protected Double dtprofitToProfit;  // 扣除非经常损益后的净利润/净利润
    @Column(name = "salescash_to_or") protected Double salescashToOr;  // 销售商品提供劳务收到的现金/营业收入
    @Column(name = "ocf_to_or") protected Double ocfToOr;  // 经营活动产生的现金流量净额/营业收入
    @Column(name = "ocf_to_opincome") protected Double ocfToOpincome;  // 经营活动产生的现金流量净额/经营活动净收益
    @Column(name = "capitalized_to_da") protected Double capitalizedToDa;  // 资本支出/折旧和摊销
    @Column(name = "debt_to_assets") protected Double debtToAssets;  // 资产负债率
    @Column(name = "assets_to_eqt") protected Double assetsToEqt;  // 权益乘数
    @Column(name = "dp_assets_to_eqt") protected Double dpAssetsToEqt;  // 权益乘数(杜邦分析)
    @Column(name = "ca_to_assets") protected Double caToAssets;  // 流动资产/总资产
    @Column(name = "nca_to_assets") protected Double ncaToAssets;  // 非流动资产/总资产
    @Column(name = "tbassets_to_totalassets") protected Double tbassetsToTotalassets;  // 有形资产/总资产
    @Column(name = "int_to_talcap") protected Double intToTalcap;  // 带息债务/全部投入资本
    @Column(name = "eqt_to_talcapital") protected Double eqtToTalcapital;  // 归属于母公司的股东权益/全部投入资本
    @Column(name = "currentdebt_to_debt") protected Double currentdebtToDebt;  // 流动负债/负债合计
    @Column(name = "longdeb_to_debt") protected Double longdebToDebt;  // 非流动负债/负债合计
    @Column(name = "ocf_to_shortdebt") protected Double ocfToShortdebt;  // 经营活动产生的现金流量净额/流动负债
    @Column(name = "debt_to_eqt") protected Double debtToEqt;  // 产权比率
    @Column(name = "eqt_to_debt") protected Double eqtToDebt;  // 归属于母公司的股东权益/负债合计
    @Column(name = "eqt_to_interestdebt") protected Double eqtToInterestdebt;  // 归属于母公司的股东权益/带息债务
    @Column(name = "tangibleasset_to_debt") protected Double tangibleassetToDebt;  // 有形资产/负债合计
    @Column(name = "tangasset_to_intdebt") protected Double tangassetToIntdebt;  // 有形资产/带息债务
    @Column(name = "tangibleasset_to_netdebt") protected Double tangibleassetToNetdebt;  // 有形资产/净债务
    @Column(name = "ocf_to_debt") protected Double ocfToDebt;  // 经营活动产生的现金流量净额/负债合计
    @Column(name = "ocf_to_interestdebt") protected Double ocfToInterestdebt;  // 经营活动产生的现金流量净额/带息债务
    @Column(name = "ocf_to_netdebt") protected Double ocfToNetdebt;  // 经营活动产生的现金流量净额/净债务
    @Column(name = "ebit_to_interest") protected Double ebitToInterest;  // 已获利息倍数(EBIT/利息费用)
    @Column(name = "longdebt_to_workingcapital") protected Double longdebtToWorkingcapital;  // 长期债务与营运资金比率
    @Column(name = "ebitda_to_debt") protected Double ebitdaToDebt;  // 息税折旧摊销前利润/负债合计
    @Column(name = "turn_days") protected Double turnDays;  // 营业周期
    @Column(name = "roa_yearly") protected Double roaYearly;  // 年化总资产净利率
    @Column(name = "roa_dp") protected Double roaDp;  // 总资产净利率(杜邦分析)
    @Column(name = "fixed_assets") protected Double fixedAssets;  // 固定资产合计
    @Column(name = "profit_prefin_exp") protected Double profitPrefinExp;  // 扣除财务费用前营业利润
    @Column(name = "non_op_profit") protected Double nonOpProfit;  // 非营业利润
    @Column(name = "op_to_ebt") protected Double opToEbt;  // 营业利润／利润总额
    @Column(name = "nop_to_ebt") protected Double nopToEbt;  // 非营业利润／利润总额
    @Column(name = "ocf_to_profit") protected Double ocfToProfit;  // 经营活动产生的现金流量净额／营业利润
    @Column(name = "cash_to_liqdebt") protected Double cashToLiqdebt;  // 货币资金／流动负债
    @Column(name = "cash_to_liqdebt_withinterest") protected Double cashToLiqdebtWithinterest;  // 货币资金／带息流动负债
    @Column(name = "op_to_liqdebt") protected Double opToLiqdebt;  // 营业利润／流动负债
    @Column(name = "op_to_debt") protected Double opToDebt;  // 营业利润／负债合计
    @Column(name = "roic_yearly") protected Double roicYearly;  // 年化投入资本回报率
    @Column(name = "total_fa_trun") protected Double totalFaTrun;  // 固定资产合计周转率
    @Column(name = "profit_to_op") protected Double profitToOp;  // 利润总额／营业收入
    @Column(name = "q_opincome") protected Double qOpincome;  // 经营活动单季度净收益
    @Column(name = "q_investincome") protected Double qInvestincome;  // 价值变动单季度净收益
    @Column(name = "q_dtprofit") protected Double qDtprofit;  // 扣除非经常损益后的单季度净利润
    @Column(name = "q_eps") protected Double qEps;  // 每股收益(单季度)
    @Column(name = "q_netprofit_margin") protected Double qNetprofitMargin;  // 销售净利率(单季度)
    @Column(name = "q_gsprofit_margin") protected Double qGsprofitMargin;  // 销售毛利率(单季度)
    @Column(name = "q_exp_to_sales") protected Double qExpToSales;  // 销售期间费用率(单季度)
    @Column(name = "q_profit_to_gr") protected Double qProfitToGr;  // 净利润／营业总收入(单季度)
    @Column(name = "q_saleexp_to_gr") protected Double qSaleexpToGr;  // 销售费用／营业总收入 (单季度)
    @Column(name = "q_adminexp_to_gr") protected Double qAdminexpToGr;  // 管理费用／营业总收入 (单季度)
    @Column(name = "q_finaexp_to_gr") protected Double qFinaexpToGr;  // 财务费用／营业总收入 (单季度)
    @Column(name = "q_impair_to_gr_ttm") protected Double qImpairToGrTtm;  // 资产减值损失／营业总收入(单季度)
    @Column(name = "q_gc_to_gr") protected Double qGcToGr;  // 营业总成本／营业总收入 (单季度)
    @Column(name = "q_op_to_gr") protected Double qOpToGr;  // 营业利润／营业总收入(单季度)
    @Column(name = "q_roe") protected Double qRoe;  // 净资产收益率(单季度)
    @Column(name = "q_dt_roe") protected Double qDtRoe;  // 净资产单季度收益率(扣除非经常损益)
    @Column(name = "q_npta") protected Double qNpta;  // 总资产净利润(单季度)
    @Column(name = "q_opincome_to_ebt") protected Double qOpincomeToEbt;  // 经营活动净收益／利润总额(单季度)
    @Column(name = "q_investincome_to_ebt") protected Double qInvestincomeToEbt;  // 价值变动净收益／利润总额(单季度)
    @Column(name = "q_dtprofit_to_profit") protected Double qDtprofitToProfit;  // 扣除非经常损益后的净利润／净利润(单季度)
    @Column(name = "q_salescash_to_or") protected Double qSalescashToOr;  // 销售商品提供劳务收到的现金／营业收入(单季度)
    @Column(name = "q_ocf_to_sales") protected Double qOcfToSales;  // 经营活动产生的现金流量净额／营业收入(单季度)
    @Column(name = "q_ocf_to_or") protected Double qOcfToOr;  // 经营活动产生的现金流量净额／经营活动净收益(单季度)
    @Column(name = "basic_eps_yoy") protected Double basicEpsYoy;  // 基本每股收益同比增长率(%)
    @Column(name = "dt_eps_yoy") protected Double dtEpsYoy;  // 稀释每股收益同比增长率(%)
    @Column(name = "cfps_yoy") protected Double cfpsYoy;  // 每股经营活动产生的现金流量净额同比增长率(%)
    @Column(name = "op_yoy") protected Double opYoy;  // 营业利润同比增长率(%)
    @Column(name = "ebt_yoy") protected Double ebtYoy;  // 利润总额同比增长率(%)
    @Column(name = "netprofit_yoy") protected Double netprofitYoy;  // 归属母公司股东的净利润同比增长率(%)
    @Column(name = "dt_netprofit_yoy") protected Double dtNetprofitYoy;  // 归属母公司股东的净利润-扣除非经常损益同比增长率(%)
    @Column(name = "ocf_yoy") protected Double ocfYoy;  // 经营活动产生的现金流量净额同比增长率(%)
    @Column(name = "roe_yoy") protected Double roeYoy;  // 净资产收益率(摊薄)同比增长率(%)
    @Column(name = "bps_yoy") protected Double bpsYoy;  // 每股净资产相对年初增长率(%)
    @Column(name = "assets_yoy") protected Double assetsYoy;  // 资产总计相对年初增长率(%)
    @Column(name = "eqt_yoy") protected Double eqtYoy;  // 归属母公司的股东权益相对年初增长率(%)
    @Column(name = "tr_yoy") protected Double trYoy;  // 营业总收入同比增长率(%)
    @Column(name = "or_yoy") protected Double orYoy;  // 营业收入同比增长率(%)
    @Column(name = "q_gr_yoy") protected Double qGrYoy;  // 营业总收入同比增长率(%)(单季度)
    @Column(name = "q_gr_qoq") protected Double qGrQoq;  // 营业总收入环比增长率(%)(单季度)
    @Column(name = "q_sales_yoy") protected Double qSalesYoy;  // 营业收入同比增长率(%)(单季度)
    @Column(name = "q_sales_qoq") protected Double qSalesQoq;  // 营业收入环比增长率(%)(单季度)
    @Column(name = "q_op_yoy") protected Double qOpYoy;  // 营业利润同比增长率(%)(单季度)
    @Column(name = "q_op_qoq") protected Double qOpQoq;  // 营业利润环比增长率(%)(单季度)
    @Column(name = "q_profit_yoy") protected Double qProfitYoy;  // 净利润同比增长率(%)(单季度)
    @Column(name = "q_profit_qoq") protected Double qProfitQoq;  // 净利润环比增长率(%)(单季度)
    @Column(name = "q_netprofit_yoy") protected Double qNetprofitYoy;  // 归属母公司股东的净利润同比增长率(%)(单季度)
    @Column(name = "q_netprofit_qoq") protected Double qNetprofitQoq;  // 归属母公司股东的净利润环比增长率(%)(单季度)
    @Column(name = "equity_yoy") protected Double equityYoy;  // 净资产同比增长率
    @Column(name = "rd_exp") protected Double rdExp;  // 研发费用
    @Column(name = "update_flag") protected String updateFlag;  // 更新标识

}