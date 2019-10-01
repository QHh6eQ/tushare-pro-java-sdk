package com.github.tusharepro.core.entity;
import lombok.Data;

import com.github.tusharepro.core.bean.Income;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;

/**
 * 利润表
 * https://tushare.pro/document/2?doc_id=33
 */
@Data
@Entity
@Table(name = "income")
@IdClass(IncomeEntity.PrimaryKey.class)
public class IncomeEntity implements Income {

    @Data public static class PrimaryKey implements Serializable {
        private String tsCode;
        private LocalDate endDate;
        private String reportType;
    }

    @Id
    @Column(name = "ts_code") protected String tsCode;  // TS股票代码
    @Column(name = "ann_date") protected LocalDate annDate;  // 公告日期
    @Column(name = "f_ann_date") protected LocalDate fAnnDate;  // 实际公告日期，即发生过数据变更的最终日期
    @Id
    @Column(name = "end_date") protected LocalDate endDate;  // 报告期
    @Id
    @Column(name = "report_type") protected String reportType;  // 报告类型： 参考下表说明
    @Column(name = "comp_type") protected String compType;  // 公司类型：1一般工商业 2银行 3保险 4证券
    @Column(name = "basic_eps") protected Double basicEps;  // 基本每股收益
    @Column(name = "diluted_eps") protected Double dilutedEps;  // 稀释每股收益
    @Column(name = "total_revenue") protected Double totalRevenue;  // 营业总收入
    @Column(name = "revenue") protected Double revenue;  // 营业收入
    @Column(name = "int_income") protected Double intIncome;  // 利息收入
    @Column(name = "prem_earned") protected Double premEarned;  // 已赚保费
    @Column(name = "comm_income") protected Double commIncome;  // 手续费及佣金收入
    @Column(name = "n_commis_income") protected Double nCommisIncome;  // 手续费及佣金净收入
    @Column(name = "n_oth_income") protected Double nOthIncome;  // 其他经营净收益
    @Column(name = "n_oth_b_income") protected Double nOthBIncome;  // 加:其他业务净收益
    @Column(name = "prem_income") protected Double premIncome;  // 保险业务收入
    @Column(name = "out_prem") protected Double outPrem;  // 减:分出保费
    @Column(name = "une_prem_reser") protected Double unePremReser;  // 提取未到期责任准备金
    @Column(name = "reins_income") protected Double reinsIncome;  // 其中:分保费收入
    @Column(name = "n_sec_tb_income") protected Double nSecTbIncome;  // 代理买卖证券业务净收入
    @Column(name = "n_sec_uw_income") protected Double nSecUwIncome;  // 证券承销业务净收入
    @Column(name = "n_asset_mg_income") protected Double nAssetMgIncome;  // 受托客户资产管理业务净收入
    @Column(name = "oth_b_income") protected Double othBIncome;  // 其他业务收入
    @Column(name = "fv_value_chg_gain") protected Double fvValueChgGain;  // 加:公允价值变动净收益
    @Column(name = "invest_income") protected Double investIncome;  // 加:投资净收益
    @Column(name = "ass_invest_income") protected Double assInvestIncome;  // 其中:对联营企业和合营企业的投资收益
    @Column(name = "forex_gain") protected Double forexGain;  // 加:汇兑净收益
    @Column(name = "total_cogs") protected Double totalCogs;  // 营业总成本
    @Column(name = "oper_cost") protected Double operCost;  // 减:营业成本
    @Column(name = "int_exp") protected Double intExp;  // 减:利息支出
    @Column(name = "comm_exp") protected Double commExp;  // 减:手续费及佣金支出
    @Column(name = "biz_tax_surchg") protected Double bizTaxSurchg;  // 减:营业税金及附加
    @Column(name = "sell_exp") protected Double sellExp;  // 减:销售费用
    @Column(name = "admin_exp") protected Double adminExp;  // 减:管理费用
    @Column(name = "fin_exp") protected Double finExp;  // 减:财务费用
    @Column(name = "assets_impair_loss") protected Double assetsImpairLoss;  // 减:资产减值损失
    @Column(name = "prem_refund") protected Double premRefund;  // 退保金
    @Column(name = "compens_payout") protected Double compensPayout;  // 赔付总支出
    @Column(name = "reser_insur_liab") protected Double reserInsurLiab;  // 提取保险责任准备金
    @Column(name = "div_payt") protected Double divPayt;  // 保户红利支出
    @Column(name = "reins_exp") protected Double reinsExp;  // 分保费用
    @Column(name = "oper_exp") protected Double operExp;  // 营业支出
    @Column(name = "compens_payout_refu") protected Double compensPayoutRefu;  // 减:摊回赔付支出
    @Column(name = "insur_reser_refu") protected Double insurReserRefu;  // 减:摊回保险责任准备金
    @Column(name = "reins_cost_refund") protected Double reinsCostRefund;  // 减:摊回分保费用
    @Column(name = "other_bus_cost") protected Double otherBusCost;  // 其他业务成本
    @Column(name = "operate_profit") protected Double operateProfit;  // 营业利润
    @Column(name = "non_oper_income") protected Double nonOperIncome;  // 加:营业外收入
    @Column(name = "non_oper_exp") protected Double nonOperExp;  // 减:营业外支出
    @Column(name = "nca_disploss") protected Double ncaDisploss;  // 其中:减:非流动资产处置净损失
    @Column(name = "total_profit") protected Double totalProfit;  // 利润总额
    @Column(name = "income_tax") protected Double incomeTax;  // 所得税费用
    @Column(name = "n_income") protected Double nIncome;  // 净利润(含少数股东损益)
    @Column(name = "n_income_attr_p") protected Double nIncomeAttrP;  // 净利润(不含少数股东损益)
    @Column(name = "minority_gain") protected Double minorityGain;  // 少数股东损益
    @Column(name = "oth_compr_income") protected Double othComprIncome;  // 其他综合收益
    @Column(name = "t_compr_income") protected Double tComprIncome;  // 综合收益总额
    @Column(name = "compr_inc_attr_p") protected Double comprIncAttrP;  // 归属于母公司(或股东)的综合收益总额
    @Column(name = "compr_inc_attr_m_s") protected Double comprIncAttrMS;  // 归属于少数股东的综合收益总额
    @Column(name = "ebit") protected Double ebit;  // 息税前利润
    @Column(name = "ebitda") protected Double ebitda;  // 息税折旧摊销前利润
    @Column(name = "insurance_exp") protected Double insuranceExp;  // 保险业务支出
    @Column(name = "undist_profit") protected Double undistProfit;  // 年初未分配利润
    @Column(name = "distable_profit") protected Double distableProfit;  // 可分配利润
    @Column(name = "update_flag") protected String updateFlag;  // 更新标识，0未修改1更正过

}