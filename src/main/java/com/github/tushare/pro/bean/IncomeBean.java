package com.github.tushare.pro.bean;

/**
 * 利润表
 */
public class IncomeBean {

    protected String tsCode;  // TS股票代码
    protected String annDate;  // 公告日期
    protected String fAnnDate;  // 实际公告日期，即发生过数据变更的最终日期
    protected String endDate;  // 报告期
    protected String reportType;  // 报告类型： 参考下表说明
    protected String compType;  // 公司类型：1一般工商业 2银行 3保险 4证券
    protected Double basicEps;  // 基本每股收益
    protected Double dilutedEps;  // 稀释每股收益
    protected Double totalRevenue;  // 营业总收入 (元，下同)
    protected Double revenue;  // 营业收入
    protected Double intIncome;  // 利息收入
    protected Double premEarned;  // 已赚保费
    protected Double commIncome;  // 手续费及佣金收入
    protected Double nCommisIncome;  // 手续费及佣金净收入
    protected Double nOthIncome;  // 其他经营净收益
    protected Double nOthBIncome;  // 加:其他业务净收益
    protected Double premIncome;  // 保险业务收入
    protected Double outPrem;  // 减:分出保费
    protected Double unePremReser;  // 提取未到期责任准备金
    protected Double reinsIncome;  // 其中:分保费收入
    protected Double nSecTbIncome;  // 代理买卖证券业务净收入
    protected Double nSecUwIncome;  // 证券承销业务净收入
    protected Double nAssetMgIncome;  // 受托客户资产管理业务净收入
    protected Double othBIncome;  // 其他业务收入
    protected Double fvValueChgGain;  // 加:公允价值变动净收益
    protected Double investIncome;  // 加:投资净收益
    protected Double assInvestIncome;  // 其中:对联营企业和合营企业的投资收益
    protected Double forexGain;  // 加:汇兑净收益
    protected Double totalCogs;  // 营业总成本
    protected Double operCost;  // 减:营业成本
    protected Double intExp;  // 减:利息支出
    protected Double commExp;  // 减:手续费及佣金支出
    protected Double bizTaxSurchg;  // 减:营业税金及附加
    protected Double sellExp;  // 减:销售费用
    protected Double adminExp;  // 减:管理费用
    protected Double finExp;  // 减:财务费用
    protected Double assetsImpairLoss;  // 减:资产减值损失
    protected Double premRefund;  // 退保金
    protected Double compensPayout;  // 赔付总支出
    protected Double reserInsurLiab;  // 提取保险责任准备金
    protected Double divPayt;  // 保户红利支出
    protected Double reinsExp;  // 分保费用
    protected Double operExp;  // 营业支出
    protected Double compensPayoutRefu;  // 减:摊回赔付支出
    protected Double insurReserRefu;  // 减:摊回保险责任准备金
    protected Double reinsCostRefund;  // 减:摊回分保费用
    protected Double otherBusCost;  // 其他业务成本
    protected Double operateProfit;  // 营业利润
    protected Double nonOperIncome;  // 加:营业外收入
    protected Double nonOperExp;  // 减:营业外支出
    protected Double ncaDisploss;  // 其中:减:非流动资产处置净损失
    protected Double totalProfit;  // 利润总额
    protected Double incomeTax;  // 所得税费用
    protected Double nIncome;  // 净利润(含少数股东损益)
    protected Double nIncomeAttrP;  // 净利润(不含少数股东损益)
    protected Double minorityGain;  // 少数股东损益
    protected Double othComprIncome;  // 其他综合收益
    protected Double tComprIncome;  // 综合收益总额
    protected Double comprIncAttrP;  // 归属于母公司(或股东)的综合收益总额
    protected Double comprIncAttrMS;  // 归属于少数股东的综合收益总额
    protected Double ebit;  // 息税前利润
    protected Double ebitda;  // 息税折旧摊销前利润
    protected Double insuranceExp;  // 保险业务支出
    protected Double undistProfit;  // 年初未分配利润
    protected Double distableProfit;  // 可分配利润

    public String getTsCode() {
        return tsCode;
    }

    public IncomeBean setTsCode(String tsCode) {
        this.tsCode = tsCode;
        return this;
    }

    public String getAnnDate() {
        return annDate;
    }

    public IncomeBean setAnnDate(String annDate) {
        this.annDate = annDate;
        return this;
    }

    public String getFAnnDate() {
        return fAnnDate;
    }

    public IncomeBean setFAnnDate(String fAnnDate) {
        this.fAnnDate = fAnnDate;
        return this;
    }

    public String getEndDate() {
        return endDate;
    }

    public IncomeBean setEndDate(String endDate) {
        this.endDate = endDate;
        return this;
    }

    public String getReportType() {
        return reportType;
    }

    public IncomeBean setReportType(String reportType) {
        this.reportType = reportType;
        return this;
    }

    public String getCompType() {
        return compType;
    }

    public IncomeBean setCompType(String compType) {
        this.compType = compType;
        return this;
    }

    public Double getBasicEps() {
        return basicEps;
    }

    public IncomeBean setBasicEps(Double basicEps) {
        this.basicEps = basicEps;
        return this;
    }

    public Double getDilutedEps() {
        return dilutedEps;
    }

    public IncomeBean setDilutedEps(Double dilutedEps) {
        this.dilutedEps = dilutedEps;
        return this;
    }

    public Double getTotalRevenue() {
        return totalRevenue;
    }

    public IncomeBean setTotalRevenue(Double totalRevenue) {
        this.totalRevenue = totalRevenue;
        return this;
    }

    public Double getRevenue() {
        return revenue;
    }

    public IncomeBean setRevenue(Double revenue) {
        this.revenue = revenue;
        return this;
    }

    public Double getIntIncome() {
        return intIncome;
    }

    public IncomeBean setIntIncome(Double intIncome) {
        this.intIncome = intIncome;
        return this;
    }

    public Double getPremEarned() {
        return premEarned;
    }

    public IncomeBean setPremEarned(Double premEarned) {
        this.premEarned = premEarned;
        return this;
    }

    public Double getCommIncome() {
        return commIncome;
    }

    public IncomeBean setCommIncome(Double commIncome) {
        this.commIncome = commIncome;
        return this;
    }

    public Double getNCommisIncome() {
        return nCommisIncome;
    }

    public IncomeBean setNCommisIncome(Double nCommisIncome) {
        this.nCommisIncome = nCommisIncome;
        return this;
    }

    public Double getNOthIncome() {
        return nOthIncome;
    }

    public IncomeBean setNOthIncome(Double nOthIncome) {
        this.nOthIncome = nOthIncome;
        return this;
    }

    public Double getNOthBIncome() {
        return nOthBIncome;
    }

    public IncomeBean setNOthBIncome(Double nOthBIncome) {
        this.nOthBIncome = nOthBIncome;
        return this;
    }

    public Double getPremIncome() {
        return premIncome;
    }

    public IncomeBean setPremIncome(Double premIncome) {
        this.premIncome = premIncome;
        return this;
    }

    public Double getOutPrem() {
        return outPrem;
    }

    public IncomeBean setOutPrem(Double outPrem) {
        this.outPrem = outPrem;
        return this;
    }

    public Double getUnePremReser() {
        return unePremReser;
    }

    public IncomeBean setUnePremReser(Double unePremReser) {
        this.unePremReser = unePremReser;
        return this;
    }

    public Double getReinsIncome() {
        return reinsIncome;
    }

    public IncomeBean setReinsIncome(Double reinsIncome) {
        this.reinsIncome = reinsIncome;
        return this;
    }

    public Double getNSecTbIncome() {
        return nSecTbIncome;
    }

    public IncomeBean setNSecTbIncome(Double nSecTbIncome) {
        this.nSecTbIncome = nSecTbIncome;
        return this;
    }

    public Double getNSecUwIncome() {
        return nSecUwIncome;
    }

    public IncomeBean setNSecUwIncome(Double nSecUwIncome) {
        this.nSecUwIncome = nSecUwIncome;
        return this;
    }

    public Double getNAssetMgIncome() {
        return nAssetMgIncome;
    }

    public IncomeBean setNAssetMgIncome(Double nAssetMgIncome) {
        this.nAssetMgIncome = nAssetMgIncome;
        return this;
    }

    public Double getOthBIncome() {
        return othBIncome;
    }

    public IncomeBean setOthBIncome(Double othBIncome) {
        this.othBIncome = othBIncome;
        return this;
    }

    public Double getFvValueChgGain() {
        return fvValueChgGain;
    }

    public IncomeBean setFvValueChgGain(Double fvValueChgGain) {
        this.fvValueChgGain = fvValueChgGain;
        return this;
    }

    public Double getInvestIncome() {
        return investIncome;
    }

    public IncomeBean setInvestIncome(Double investIncome) {
        this.investIncome = investIncome;
        return this;
    }

    public Double getAssInvestIncome() {
        return assInvestIncome;
    }

    public IncomeBean setAssInvestIncome(Double assInvestIncome) {
        this.assInvestIncome = assInvestIncome;
        return this;
    }

    public Double getForexGain() {
        return forexGain;
    }

    public IncomeBean setForexGain(Double forexGain) {
        this.forexGain = forexGain;
        return this;
    }

    public Double getTotalCogs() {
        return totalCogs;
    }

    public IncomeBean setTotalCogs(Double totalCogs) {
        this.totalCogs = totalCogs;
        return this;
    }

    public Double getOperCost() {
        return operCost;
    }

    public IncomeBean setOperCost(Double operCost) {
        this.operCost = operCost;
        return this;
    }

    public Double getIntExp() {
        return intExp;
    }

    public IncomeBean setIntExp(Double intExp) {
        this.intExp = intExp;
        return this;
    }

    public Double getCommExp() {
        return commExp;
    }

    public IncomeBean setCommExp(Double commExp) {
        this.commExp = commExp;
        return this;
    }

    public Double getBizTaxSurchg() {
        return bizTaxSurchg;
    }

    public IncomeBean setBizTaxSurchg(Double bizTaxSurchg) {
        this.bizTaxSurchg = bizTaxSurchg;
        return this;
    }

    public Double getSellExp() {
        return sellExp;
    }

    public IncomeBean setSellExp(Double sellExp) {
        this.sellExp = sellExp;
        return this;
    }

    public Double getAdminExp() {
        return adminExp;
    }

    public IncomeBean setAdminExp(Double adminExp) {
        this.adminExp = adminExp;
        return this;
    }

    public Double getFinExp() {
        return finExp;
    }

    public IncomeBean setFinExp(Double finExp) {
        this.finExp = finExp;
        return this;
    }

    public Double getAssetsImpairLoss() {
        return assetsImpairLoss;
    }

    public IncomeBean setAssetsImpairLoss(Double assetsImpairLoss) {
        this.assetsImpairLoss = assetsImpairLoss;
        return this;
    }

    public Double getPremRefund() {
        return premRefund;
    }

    public IncomeBean setPremRefund(Double premRefund) {
        this.premRefund = premRefund;
        return this;
    }

    public Double getCompensPayout() {
        return compensPayout;
    }

    public IncomeBean setCompensPayout(Double compensPayout) {
        this.compensPayout = compensPayout;
        return this;
    }

    public Double getReserInsurLiab() {
        return reserInsurLiab;
    }

    public IncomeBean setReserInsurLiab(Double reserInsurLiab) {
        this.reserInsurLiab = reserInsurLiab;
        return this;
    }

    public Double getDivPayt() {
        return divPayt;
    }

    public IncomeBean setDivPayt(Double divPayt) {
        this.divPayt = divPayt;
        return this;
    }

    public Double getReinsExp() {
        return reinsExp;
    }

    public IncomeBean setReinsExp(Double reinsExp) {
        this.reinsExp = reinsExp;
        return this;
    }

    public Double getOperExp() {
        return operExp;
    }

    public IncomeBean setOperExp(Double operExp) {
        this.operExp = operExp;
        return this;
    }

    public Double getCompensPayoutRefu() {
        return compensPayoutRefu;
    }

    public IncomeBean setCompensPayoutRefu(Double compensPayoutRefu) {
        this.compensPayoutRefu = compensPayoutRefu;
        return this;
    }

    public Double getInsurReserRefu() {
        return insurReserRefu;
    }

    public IncomeBean setInsurReserRefu(Double insurReserRefu) {
        this.insurReserRefu = insurReserRefu;
        return this;
    }

    public Double getReinsCostRefund() {
        return reinsCostRefund;
    }

    public IncomeBean setReinsCostRefund(Double reinsCostRefund) {
        this.reinsCostRefund = reinsCostRefund;
        return this;
    }

    public Double getOtherBusCost() {
        return otherBusCost;
    }

    public IncomeBean setOtherBusCost(Double otherBusCost) {
        this.otherBusCost = otherBusCost;
        return this;
    }

    public Double getOperateProfit() {
        return operateProfit;
    }

    public IncomeBean setOperateProfit(Double operateProfit) {
        this.operateProfit = operateProfit;
        return this;
    }

    public Double getNonOperIncome() {
        return nonOperIncome;
    }

    public IncomeBean setNonOperIncome(Double nonOperIncome) {
        this.nonOperIncome = nonOperIncome;
        return this;
    }

    public Double getNonOperExp() {
        return nonOperExp;
    }

    public IncomeBean setNonOperExp(Double nonOperExp) {
        this.nonOperExp = nonOperExp;
        return this;
    }

    public Double getNcaDisploss() {
        return ncaDisploss;
    }

    public IncomeBean setNcaDisploss(Double ncaDisploss) {
        this.ncaDisploss = ncaDisploss;
        return this;
    }

    public Double getTotalProfit() {
        return totalProfit;
    }

    public IncomeBean setTotalProfit(Double totalProfit) {
        this.totalProfit = totalProfit;
        return this;
    }

    public Double getIncomeTax() {
        return incomeTax;
    }

    public IncomeBean setIncomeTax(Double incomeTax) {
        this.incomeTax = incomeTax;
        return this;
    }

    public Double getNIncome() {
        return nIncome;
    }

    public IncomeBean setNIncome(Double nIncome) {
        this.nIncome = nIncome;
        return this;
    }

    public Double getNIncomeAttrP() {
        return nIncomeAttrP;
    }

    public IncomeBean setNIncomeAttrP(Double nIncomeAttrP) {
        this.nIncomeAttrP = nIncomeAttrP;
        return this;
    }

    public Double getMinorityGain() {
        return minorityGain;
    }

    public IncomeBean setMinorityGain(Double minorityGain) {
        this.minorityGain = minorityGain;
        return this;
    }

    public Double getOthComprIncome() {
        return othComprIncome;
    }

    public IncomeBean setOthComprIncome(Double othComprIncome) {
        this.othComprIncome = othComprIncome;
        return this;
    }

    public Double getTComprIncome() {
        return tComprIncome;
    }

    public IncomeBean setTComprIncome(Double tComprIncome) {
        this.tComprIncome = tComprIncome;
        return this;
    }

    public Double getComprIncAttrP() {
        return comprIncAttrP;
    }

    public IncomeBean setComprIncAttrP(Double comprIncAttrP) {
        this.comprIncAttrP = comprIncAttrP;
        return this;
    }

    public Double getComprIncAttrMS() {
        return comprIncAttrMS;
    }

    public IncomeBean setComprIncAttrMS(Double comprIncAttrMS) {
        this.comprIncAttrMS = comprIncAttrMS;
        return this;
    }

    public Double getEbit() {
        return ebit;
    }

    public IncomeBean setEbit(Double ebit) {
        this.ebit = ebit;
        return this;
    }

    public Double getEbitda() {
        return ebitda;
    }

    public IncomeBean setEbitda(Double ebitda) {
        this.ebitda = ebitda;
        return this;
    }

    public Double getInsuranceExp() {
        return insuranceExp;
    }

    public IncomeBean setInsuranceExp(Double insuranceExp) {
        this.insuranceExp = insuranceExp;
        return this;
    }

    public Double getUndistProfit() {
        return undistProfit;
    }

    public IncomeBean setUndistProfit(Double undistProfit) {
        this.undistProfit = undistProfit;
        return this;
    }

    public Double getDistableProfit() {
        return distableProfit;
    }

    public IncomeBean setDistableProfit(Double distableProfit) {
        this.distableProfit = distableProfit;
        return this;
    }

    @Override
    public String toString() {
        return "IncomeBean{" +
               "tsCode=" + tsCode + ", " +
               "annDate=" + annDate + ", " +
               "fAnnDate=" + fAnnDate + ", " +
               "endDate=" + endDate + ", " +
               "reportType=" + reportType + ", " +
               "compType=" + compType + ", " +
               "basicEps=" + basicEps + ", " +
               "dilutedEps=" + dilutedEps + ", " +
               "totalRevenue=" + totalRevenue + ", " +
               "revenue=" + revenue + ", " +
               "intIncome=" + intIncome + ", " +
               "premEarned=" + premEarned + ", " +
               "commIncome=" + commIncome + ", " +
               "nCommisIncome=" + nCommisIncome + ", " +
               "nOthIncome=" + nOthIncome + ", " +
               "nOthBIncome=" + nOthBIncome + ", " +
               "premIncome=" + premIncome + ", " +
               "outPrem=" + outPrem + ", " +
               "unePremReser=" + unePremReser + ", " +
               "reinsIncome=" + reinsIncome + ", " +
               "nSecTbIncome=" + nSecTbIncome + ", " +
               "nSecUwIncome=" + nSecUwIncome + ", " +
               "nAssetMgIncome=" + nAssetMgIncome + ", " +
               "othBIncome=" + othBIncome + ", " +
               "fvValueChgGain=" + fvValueChgGain + ", " +
               "investIncome=" + investIncome + ", " +
               "assInvestIncome=" + assInvestIncome + ", " +
               "forexGain=" + forexGain + ", " +
               "totalCogs=" + totalCogs + ", " +
               "operCost=" + operCost + ", " +
               "intExp=" + intExp + ", " +
               "commExp=" + commExp + ", " +
               "bizTaxSurchg=" + bizTaxSurchg + ", " +
               "sellExp=" + sellExp + ", " +
               "adminExp=" + adminExp + ", " +
               "finExp=" + finExp + ", " +
               "assetsImpairLoss=" + assetsImpairLoss + ", " +
               "premRefund=" + premRefund + ", " +
               "compensPayout=" + compensPayout + ", " +
               "reserInsurLiab=" + reserInsurLiab + ", " +
               "divPayt=" + divPayt + ", " +
               "reinsExp=" + reinsExp + ", " +
               "operExp=" + operExp + ", " +
               "compensPayoutRefu=" + compensPayoutRefu + ", " +
               "insurReserRefu=" + insurReserRefu + ", " +
               "reinsCostRefund=" + reinsCostRefund + ", " +
               "otherBusCost=" + otherBusCost + ", " +
               "operateProfit=" + operateProfit + ", " +
               "nonOperIncome=" + nonOperIncome + ", " +
               "nonOperExp=" + nonOperExp + ", " +
               "ncaDisploss=" + ncaDisploss + ", " +
               "totalProfit=" + totalProfit + ", " +
               "incomeTax=" + incomeTax + ", " +
               "nIncome=" + nIncome + ", " +
               "nIncomeAttrP=" + nIncomeAttrP + ", " +
               "minorityGain=" + minorityGain + ", " +
               "othComprIncome=" + othComprIncome + ", " +
               "tComprIncome=" + tComprIncome + ", " +
               "comprIncAttrP=" + comprIncAttrP + ", " +
               "comprIncAttrMS=" + comprIncAttrMS + ", " +
               "ebit=" + ebit + ", " +
               "ebitda=" + ebitda + ", " +
               "insuranceExp=" + insuranceExp + ", " +
               "undistProfit=" + undistProfit + ", " +
               "distableProfit=" + distableProfit + 
               "}";
    }
}