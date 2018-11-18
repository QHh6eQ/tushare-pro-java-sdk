package com.github.tushare.pro.bean;

/**
 * 资产负债表
 */
public class BalancesheetBean {

    protected String tsCode;  // TS股票代码
    protected String annDate;  // 公告日期
    protected String fAnnDate;  // 实际公告日期
    protected String endDate;  // 报告期
    protected String reportType;  // 报表类型：见下方详细说明
    protected String compType;  // 公司类型：1一般工商业 2银行 3保险 4证券
    protected Double totalShare;  // 期末总股本
    protected Double capRese;  // 资本公积金 (元，下同)
    protected Double undistrPorfit;  // 未分配利润
    protected Double surplusRese;  // 盈余公积金
    protected Double specialRese;  // 专项储备
    protected Double moneyCap;  // 货币资金
    protected Double tradAsset;  // 交易性金融资产
    protected Double notesReceiv;  // 应收票据
    protected Double accountsReceiv;  // 应收账款
    protected Double othReceiv;  // 其他应收款
    protected Double prepayment;  // 预付款项
    protected Double divReceiv;  // 应收股利
    protected Double intReceiv;  // 应收利息
    protected Double inventories;  // 存货
    protected Double amorExp;  // 长期待摊费用
    protected Double ncaWithin1y;  // 一年内到期的非流动资产
    protected Double settRsrv;  // 结算备付金
    protected Double loantoOthBankFi;  // 拆出资金
    protected Double premiumReceiv;  // 应收保费
    protected Double reinsurReceiv;  // 应收分保账款
    protected Double reinsurResReceiv;  // 应收分保合同准备金
    protected Double purResaleFa;  // 买入返售金融资产
    protected Double othCurAssets;  // 其他流动资产
    protected Double totalCurAssets;  // 流动资产合计
    protected Double faAvailForSale;  // 可供出售金融资产
    protected Double htmInvest;  // 持有至到期投资
    protected Double ltEqtInvest;  // 长期股权投资
    protected Double investRealEstate;  // 投资性房地产
    protected Double timeDeposits;  // 定期存款
    protected Double othAssets;  // 其他资产
    protected Double ltRec;  // 长期应收款
    protected Double fixAssets;  // 固定资产
    protected Double cip;  // 在建工程
    protected Double constMaterials;  // 工程物资
    protected Double fixedAssetsDisp;  // 固定资产清理
    protected Double producBioAssets;  // 生产性生物资产
    protected Double oilAndGasAssets;  // 油气资产
    protected Double intanAssets;  // 无形资产
    protected Double rAndD;  // 研发支出
    protected Double goodwill;  // 商誉
    protected Double ltAmorExp;  // 长期待摊费用
    protected Double deferTaxAssets;  // 递延所得税资产
    protected Double decrInDisbur;  // 发放贷款及垫款
    protected Double othNca;  // 其他非流动资产
    protected Double totalNca;  // 非流动资产合计
    protected Double cashReserCb;  // 现金及存放中央银行款项
    protected Double deposInOthBfi;  // 存放同业和其它金融机构款项
    protected Double precMetals;  // 贵金属
    protected Double derivAssets;  // 衍生金融资产
    protected Double rrReinsUnePrem;  // 应收分保未到期责任准备金
    protected Double rrReinsOutstdCla;  // 应收分保未决赔款准备金
    protected Double rrReinsLinsLiab;  // 应收分保寿险责任准备金
    protected Double rrReinsLthinsLiab;  // 应收分保长期健康险责任准备金
    protected Double refundDepos;  // 存出保证金
    protected Double phPledgeLoans;  // 保户质押贷款
    protected Double refundCapDepos;  // 存出资本保证金
    protected Double indepAcctAssets;  // 独立账户资产
    protected Double clientDepos;  // 其中：客户资金存款
    protected Double clientProv;  // 其中：客户备付金
    protected Double transacSeatFee;  // 其中:交易席位费
    protected Double investAsReceiv;  // 应收款项类投资
    protected Double totalAssets;  // 资产总计
    protected Double ltBorr;  // 长期借款
    protected Double stBorr;  // 短期借款
    protected Double cbBorr;  // 向中央银行借款
    protected Double deposIbDeposits;  // 吸收存款及同业存放
    protected Double loanOthBank;  // 拆入资金
    protected Double tradingFl;  // 交易性金融负债
    protected Double notesPayable;  // 应付票据
    protected Double acctPayable;  // 应付账款
    protected Double advReceipts;  // 预收款项
    protected Double soldForRepurFa;  // 卖出回购金融资产款
    protected Double commPayable;  // 应付手续费及佣金
    protected Double payrollPayable;  // 应付职工薪酬
    protected Double taxesPayable;  // 应交税费
    protected Double intPayable;  // 应付利息
    protected Double divPayable;  // 应付股利
    protected Double othPayable;  // 其他应付款
    protected Double accExp;  // 预提费用
    protected Double deferredInc;  // 递延收益
    protected Double stBondsPayable;  // 应付短期债券
    protected Double payableToReinsurer;  // 应付分保账款
    protected Double rsrvInsurCont;  // 保险合同准备金
    protected Double actingTradingSec;  // 代理买卖证券款
    protected Double actingUwSec;  // 代理承销证券款
    protected Double nonCurLiabDue1y;  // 一年内到期的非流动负债
    protected Double othCurLiab;  // 其他流动负债
    protected Double totalCurLiab;  // 流动负债合计
    protected Double bondPayable;  // 应付债券
    protected Double ltPayable;  // 长期应付款
    protected Double specificPayables;  // 专项应付款
    protected Double estimatedLiab;  // 预计负债
    protected Double deferTaxLiab;  // 递延所得税负债
    protected Double deferIncNonCurLiab;  // 递延收益-非流动负债
    protected Double othNcl;  // 其他非流动负债
    protected Double totalNcl;  // 非流动负债合计
    protected Double deposOthBfi;  // 同业和其它金融机构存放款项
    protected Double derivLiab;  // 衍生金融负债
    protected Double depos;  // 吸收存款
    protected Double agencyBusLiab;  // 代理业务负债
    protected Double othLiab;  // 其他负债
    protected Double premReceivAdva;  // 预收保费
    protected Double deposReceived;  // 存入保证金
    protected Double phInvest;  // 保户储金及投资款
    protected Double reserUnePrem;  // 未到期责任准备金
    protected Double reserOutstdClaims;  // 未决赔款准备金
    protected Double reserLinsLiab;  // 寿险责任准备金
    protected Double reserLthinsLiab;  // 长期健康险责任准备金
    protected Double indeptAccLiab;  // 独立账户负债
    protected Double pledgeBorr;  // 其中:质押借款
    protected Double indemPayable;  // 应付赔付款
    protected Double policyDivPayable;  // 应付保单红利
    protected Double totalLiab;  // 负债合计
    protected Double treasuryShare;  // 减:库存股
    protected Double ordinRiskReser;  // 一般风险准备
    protected Double forexDiffer;  // 外币报表折算差额
    protected Double investLossUnconf;  // 未确认的投资损失
    protected Double minorityInt;  // 少数股东权益
    protected Double totalHldrEqyExcMinInt;  // 股东权益合计(不含少数股东权益)
    protected Double totalHldrEqyIncMinInt;  // 股东权益合计(含少数股东权益)
    protected Double totalLiabHldrEqy;  // 负债及股东权益总计
    protected Double ltPayrollPayable;  // 长期应付职工薪酬
    protected Double othCompIncome;  // 其他综合收益
    protected Double othEqtTools;  // 其他权益工具
    protected Double othEqtToolsPShr;  // 其他权益工具(优先股)
    protected Double lendingFunds;  // 融出资金
    protected Double accReceivable;  // 应收款项
    protected Double stFinPayable;  // 应付短期融资款
    protected Double payables;  // 应付款项
    protected Double hfsAssets;  // 持有待售的资产
    protected Double hfsSales;  // 持有待售的负债

    public String getTsCode() {
        return tsCode;
    }

    public BalancesheetBean setTsCode(String tsCode) {
        this.tsCode = tsCode;
        return this;
    }

    public String getAnnDate() {
        return annDate;
    }

    public BalancesheetBean setAnnDate(String annDate) {
        this.annDate = annDate;
        return this;
    }

    public String getFAnnDate() {
        return fAnnDate;
    }

    public BalancesheetBean setFAnnDate(String fAnnDate) {
        this.fAnnDate = fAnnDate;
        return this;
    }

    public String getEndDate() {
        return endDate;
    }

    public BalancesheetBean setEndDate(String endDate) {
        this.endDate = endDate;
        return this;
    }

    public String getReportType() {
        return reportType;
    }

    public BalancesheetBean setReportType(String reportType) {
        this.reportType = reportType;
        return this;
    }

    public String getCompType() {
        return compType;
    }

    public BalancesheetBean setCompType(String compType) {
        this.compType = compType;
        return this;
    }

    public Double getTotalShare() {
        return totalShare;
    }

    public BalancesheetBean setTotalShare(Double totalShare) {
        this.totalShare = totalShare;
        return this;
    }

    public Double getCapRese() {
        return capRese;
    }

    public BalancesheetBean setCapRese(Double capRese) {
        this.capRese = capRese;
        return this;
    }

    public Double getUndistrPorfit() {
        return undistrPorfit;
    }

    public BalancesheetBean setUndistrPorfit(Double undistrPorfit) {
        this.undistrPorfit = undistrPorfit;
        return this;
    }

    public Double getSurplusRese() {
        return surplusRese;
    }

    public BalancesheetBean setSurplusRese(Double surplusRese) {
        this.surplusRese = surplusRese;
        return this;
    }

    public Double getSpecialRese() {
        return specialRese;
    }

    public BalancesheetBean setSpecialRese(Double specialRese) {
        this.specialRese = specialRese;
        return this;
    }

    public Double getMoneyCap() {
        return moneyCap;
    }

    public BalancesheetBean setMoneyCap(Double moneyCap) {
        this.moneyCap = moneyCap;
        return this;
    }

    public Double getTradAsset() {
        return tradAsset;
    }

    public BalancesheetBean setTradAsset(Double tradAsset) {
        this.tradAsset = tradAsset;
        return this;
    }

    public Double getNotesReceiv() {
        return notesReceiv;
    }

    public BalancesheetBean setNotesReceiv(Double notesReceiv) {
        this.notesReceiv = notesReceiv;
        return this;
    }

    public Double getAccountsReceiv() {
        return accountsReceiv;
    }

    public BalancesheetBean setAccountsReceiv(Double accountsReceiv) {
        this.accountsReceiv = accountsReceiv;
        return this;
    }

    public Double getOthReceiv() {
        return othReceiv;
    }

    public BalancesheetBean setOthReceiv(Double othReceiv) {
        this.othReceiv = othReceiv;
        return this;
    }

    public Double getPrepayment() {
        return prepayment;
    }

    public BalancesheetBean setPrepayment(Double prepayment) {
        this.prepayment = prepayment;
        return this;
    }

    public Double getDivReceiv() {
        return divReceiv;
    }

    public BalancesheetBean setDivReceiv(Double divReceiv) {
        this.divReceiv = divReceiv;
        return this;
    }

    public Double getIntReceiv() {
        return intReceiv;
    }

    public BalancesheetBean setIntReceiv(Double intReceiv) {
        this.intReceiv = intReceiv;
        return this;
    }

    public Double getInventories() {
        return inventories;
    }

    public BalancesheetBean setInventories(Double inventories) {
        this.inventories = inventories;
        return this;
    }

    public Double getAmorExp() {
        return amorExp;
    }

    public BalancesheetBean setAmorExp(Double amorExp) {
        this.amorExp = amorExp;
        return this;
    }

    public Double getNcaWithin1y() {
        return ncaWithin1y;
    }

    public BalancesheetBean setNcaWithin1y(Double ncaWithin1y) {
        this.ncaWithin1y = ncaWithin1y;
        return this;
    }

    public Double getSettRsrv() {
        return settRsrv;
    }

    public BalancesheetBean setSettRsrv(Double settRsrv) {
        this.settRsrv = settRsrv;
        return this;
    }

    public Double getLoantoOthBankFi() {
        return loantoOthBankFi;
    }

    public BalancesheetBean setLoantoOthBankFi(Double loantoOthBankFi) {
        this.loantoOthBankFi = loantoOthBankFi;
        return this;
    }

    public Double getPremiumReceiv() {
        return premiumReceiv;
    }

    public BalancesheetBean setPremiumReceiv(Double premiumReceiv) {
        this.premiumReceiv = premiumReceiv;
        return this;
    }

    public Double getReinsurReceiv() {
        return reinsurReceiv;
    }

    public BalancesheetBean setReinsurReceiv(Double reinsurReceiv) {
        this.reinsurReceiv = reinsurReceiv;
        return this;
    }

    public Double getReinsurResReceiv() {
        return reinsurResReceiv;
    }

    public BalancesheetBean setReinsurResReceiv(Double reinsurResReceiv) {
        this.reinsurResReceiv = reinsurResReceiv;
        return this;
    }

    public Double getPurResaleFa() {
        return purResaleFa;
    }

    public BalancesheetBean setPurResaleFa(Double purResaleFa) {
        this.purResaleFa = purResaleFa;
        return this;
    }

    public Double getOthCurAssets() {
        return othCurAssets;
    }

    public BalancesheetBean setOthCurAssets(Double othCurAssets) {
        this.othCurAssets = othCurAssets;
        return this;
    }

    public Double getTotalCurAssets() {
        return totalCurAssets;
    }

    public BalancesheetBean setTotalCurAssets(Double totalCurAssets) {
        this.totalCurAssets = totalCurAssets;
        return this;
    }

    public Double getFaAvailForSale() {
        return faAvailForSale;
    }

    public BalancesheetBean setFaAvailForSale(Double faAvailForSale) {
        this.faAvailForSale = faAvailForSale;
        return this;
    }

    public Double getHtmInvest() {
        return htmInvest;
    }

    public BalancesheetBean setHtmInvest(Double htmInvest) {
        this.htmInvest = htmInvest;
        return this;
    }

    public Double getLtEqtInvest() {
        return ltEqtInvest;
    }

    public BalancesheetBean setLtEqtInvest(Double ltEqtInvest) {
        this.ltEqtInvest = ltEqtInvest;
        return this;
    }

    public Double getInvestRealEstate() {
        return investRealEstate;
    }

    public BalancesheetBean setInvestRealEstate(Double investRealEstate) {
        this.investRealEstate = investRealEstate;
        return this;
    }

    public Double getTimeDeposits() {
        return timeDeposits;
    }

    public BalancesheetBean setTimeDeposits(Double timeDeposits) {
        this.timeDeposits = timeDeposits;
        return this;
    }

    public Double getOthAssets() {
        return othAssets;
    }

    public BalancesheetBean setOthAssets(Double othAssets) {
        this.othAssets = othAssets;
        return this;
    }

    public Double getLtRec() {
        return ltRec;
    }

    public BalancesheetBean setLtRec(Double ltRec) {
        this.ltRec = ltRec;
        return this;
    }

    public Double getFixAssets() {
        return fixAssets;
    }

    public BalancesheetBean setFixAssets(Double fixAssets) {
        this.fixAssets = fixAssets;
        return this;
    }

    public Double getCip() {
        return cip;
    }

    public BalancesheetBean setCip(Double cip) {
        this.cip = cip;
        return this;
    }

    public Double getConstMaterials() {
        return constMaterials;
    }

    public BalancesheetBean setConstMaterials(Double constMaterials) {
        this.constMaterials = constMaterials;
        return this;
    }

    public Double getFixedAssetsDisp() {
        return fixedAssetsDisp;
    }

    public BalancesheetBean setFixedAssetsDisp(Double fixedAssetsDisp) {
        this.fixedAssetsDisp = fixedAssetsDisp;
        return this;
    }

    public Double getProducBioAssets() {
        return producBioAssets;
    }

    public BalancesheetBean setProducBioAssets(Double producBioAssets) {
        this.producBioAssets = producBioAssets;
        return this;
    }

    public Double getOilAndGasAssets() {
        return oilAndGasAssets;
    }

    public BalancesheetBean setOilAndGasAssets(Double oilAndGasAssets) {
        this.oilAndGasAssets = oilAndGasAssets;
        return this;
    }

    public Double getIntanAssets() {
        return intanAssets;
    }

    public BalancesheetBean setIntanAssets(Double intanAssets) {
        this.intanAssets = intanAssets;
        return this;
    }

    public Double getRAndD() {
        return rAndD;
    }

    public BalancesheetBean setRAndD(Double rAndD) {
        this.rAndD = rAndD;
        return this;
    }

    public Double getGoodwill() {
        return goodwill;
    }

    public BalancesheetBean setGoodwill(Double goodwill) {
        this.goodwill = goodwill;
        return this;
    }

    public Double getLtAmorExp() {
        return ltAmorExp;
    }

    public BalancesheetBean setLtAmorExp(Double ltAmorExp) {
        this.ltAmorExp = ltAmorExp;
        return this;
    }

    public Double getDeferTaxAssets() {
        return deferTaxAssets;
    }

    public BalancesheetBean setDeferTaxAssets(Double deferTaxAssets) {
        this.deferTaxAssets = deferTaxAssets;
        return this;
    }

    public Double getDecrInDisbur() {
        return decrInDisbur;
    }

    public BalancesheetBean setDecrInDisbur(Double decrInDisbur) {
        this.decrInDisbur = decrInDisbur;
        return this;
    }

    public Double getOthNca() {
        return othNca;
    }

    public BalancesheetBean setOthNca(Double othNca) {
        this.othNca = othNca;
        return this;
    }

    public Double getTotalNca() {
        return totalNca;
    }

    public BalancesheetBean setTotalNca(Double totalNca) {
        this.totalNca = totalNca;
        return this;
    }

    public Double getCashReserCb() {
        return cashReserCb;
    }

    public BalancesheetBean setCashReserCb(Double cashReserCb) {
        this.cashReserCb = cashReserCb;
        return this;
    }

    public Double getDeposInOthBfi() {
        return deposInOthBfi;
    }

    public BalancesheetBean setDeposInOthBfi(Double deposInOthBfi) {
        this.deposInOthBfi = deposInOthBfi;
        return this;
    }

    public Double getPrecMetals() {
        return precMetals;
    }

    public BalancesheetBean setPrecMetals(Double precMetals) {
        this.precMetals = precMetals;
        return this;
    }

    public Double getDerivAssets() {
        return derivAssets;
    }

    public BalancesheetBean setDerivAssets(Double derivAssets) {
        this.derivAssets = derivAssets;
        return this;
    }

    public Double getRrReinsUnePrem() {
        return rrReinsUnePrem;
    }

    public BalancesheetBean setRrReinsUnePrem(Double rrReinsUnePrem) {
        this.rrReinsUnePrem = rrReinsUnePrem;
        return this;
    }

    public Double getRrReinsOutstdCla() {
        return rrReinsOutstdCla;
    }

    public BalancesheetBean setRrReinsOutstdCla(Double rrReinsOutstdCla) {
        this.rrReinsOutstdCla = rrReinsOutstdCla;
        return this;
    }

    public Double getRrReinsLinsLiab() {
        return rrReinsLinsLiab;
    }

    public BalancesheetBean setRrReinsLinsLiab(Double rrReinsLinsLiab) {
        this.rrReinsLinsLiab = rrReinsLinsLiab;
        return this;
    }

    public Double getRrReinsLthinsLiab() {
        return rrReinsLthinsLiab;
    }

    public BalancesheetBean setRrReinsLthinsLiab(Double rrReinsLthinsLiab) {
        this.rrReinsLthinsLiab = rrReinsLthinsLiab;
        return this;
    }

    public Double getRefundDepos() {
        return refundDepos;
    }

    public BalancesheetBean setRefundDepos(Double refundDepos) {
        this.refundDepos = refundDepos;
        return this;
    }

    public Double getPhPledgeLoans() {
        return phPledgeLoans;
    }

    public BalancesheetBean setPhPledgeLoans(Double phPledgeLoans) {
        this.phPledgeLoans = phPledgeLoans;
        return this;
    }

    public Double getRefundCapDepos() {
        return refundCapDepos;
    }

    public BalancesheetBean setRefundCapDepos(Double refundCapDepos) {
        this.refundCapDepos = refundCapDepos;
        return this;
    }

    public Double getIndepAcctAssets() {
        return indepAcctAssets;
    }

    public BalancesheetBean setIndepAcctAssets(Double indepAcctAssets) {
        this.indepAcctAssets = indepAcctAssets;
        return this;
    }

    public Double getClientDepos() {
        return clientDepos;
    }

    public BalancesheetBean setClientDepos(Double clientDepos) {
        this.clientDepos = clientDepos;
        return this;
    }

    public Double getClientProv() {
        return clientProv;
    }

    public BalancesheetBean setClientProv(Double clientProv) {
        this.clientProv = clientProv;
        return this;
    }

    public Double getTransacSeatFee() {
        return transacSeatFee;
    }

    public BalancesheetBean setTransacSeatFee(Double transacSeatFee) {
        this.transacSeatFee = transacSeatFee;
        return this;
    }

    public Double getInvestAsReceiv() {
        return investAsReceiv;
    }

    public BalancesheetBean setInvestAsReceiv(Double investAsReceiv) {
        this.investAsReceiv = investAsReceiv;
        return this;
    }

    public Double getTotalAssets() {
        return totalAssets;
    }

    public BalancesheetBean setTotalAssets(Double totalAssets) {
        this.totalAssets = totalAssets;
        return this;
    }

    public Double getLtBorr() {
        return ltBorr;
    }

    public BalancesheetBean setLtBorr(Double ltBorr) {
        this.ltBorr = ltBorr;
        return this;
    }

    public Double getStBorr() {
        return stBorr;
    }

    public BalancesheetBean setStBorr(Double stBorr) {
        this.stBorr = stBorr;
        return this;
    }

    public Double getCbBorr() {
        return cbBorr;
    }

    public BalancesheetBean setCbBorr(Double cbBorr) {
        this.cbBorr = cbBorr;
        return this;
    }

    public Double getDeposIbDeposits() {
        return deposIbDeposits;
    }

    public BalancesheetBean setDeposIbDeposits(Double deposIbDeposits) {
        this.deposIbDeposits = deposIbDeposits;
        return this;
    }

    public Double getLoanOthBank() {
        return loanOthBank;
    }

    public BalancesheetBean setLoanOthBank(Double loanOthBank) {
        this.loanOthBank = loanOthBank;
        return this;
    }

    public Double getTradingFl() {
        return tradingFl;
    }

    public BalancesheetBean setTradingFl(Double tradingFl) {
        this.tradingFl = tradingFl;
        return this;
    }

    public Double getNotesPayable() {
        return notesPayable;
    }

    public BalancesheetBean setNotesPayable(Double notesPayable) {
        this.notesPayable = notesPayable;
        return this;
    }

    public Double getAcctPayable() {
        return acctPayable;
    }

    public BalancesheetBean setAcctPayable(Double acctPayable) {
        this.acctPayable = acctPayable;
        return this;
    }

    public Double getAdvReceipts() {
        return advReceipts;
    }

    public BalancesheetBean setAdvReceipts(Double advReceipts) {
        this.advReceipts = advReceipts;
        return this;
    }

    public Double getSoldForRepurFa() {
        return soldForRepurFa;
    }

    public BalancesheetBean setSoldForRepurFa(Double soldForRepurFa) {
        this.soldForRepurFa = soldForRepurFa;
        return this;
    }

    public Double getCommPayable() {
        return commPayable;
    }

    public BalancesheetBean setCommPayable(Double commPayable) {
        this.commPayable = commPayable;
        return this;
    }

    public Double getPayrollPayable() {
        return payrollPayable;
    }

    public BalancesheetBean setPayrollPayable(Double payrollPayable) {
        this.payrollPayable = payrollPayable;
        return this;
    }

    public Double getTaxesPayable() {
        return taxesPayable;
    }

    public BalancesheetBean setTaxesPayable(Double taxesPayable) {
        this.taxesPayable = taxesPayable;
        return this;
    }

    public Double getIntPayable() {
        return intPayable;
    }

    public BalancesheetBean setIntPayable(Double intPayable) {
        this.intPayable = intPayable;
        return this;
    }

    public Double getDivPayable() {
        return divPayable;
    }

    public BalancesheetBean setDivPayable(Double divPayable) {
        this.divPayable = divPayable;
        return this;
    }

    public Double getOthPayable() {
        return othPayable;
    }

    public BalancesheetBean setOthPayable(Double othPayable) {
        this.othPayable = othPayable;
        return this;
    }

    public Double getAccExp() {
        return accExp;
    }

    public BalancesheetBean setAccExp(Double accExp) {
        this.accExp = accExp;
        return this;
    }

    public Double getDeferredInc() {
        return deferredInc;
    }

    public BalancesheetBean setDeferredInc(Double deferredInc) {
        this.deferredInc = deferredInc;
        return this;
    }

    public Double getStBondsPayable() {
        return stBondsPayable;
    }

    public BalancesheetBean setStBondsPayable(Double stBondsPayable) {
        this.stBondsPayable = stBondsPayable;
        return this;
    }

    public Double getPayableToReinsurer() {
        return payableToReinsurer;
    }

    public BalancesheetBean setPayableToReinsurer(Double payableToReinsurer) {
        this.payableToReinsurer = payableToReinsurer;
        return this;
    }

    public Double getRsrvInsurCont() {
        return rsrvInsurCont;
    }

    public BalancesheetBean setRsrvInsurCont(Double rsrvInsurCont) {
        this.rsrvInsurCont = rsrvInsurCont;
        return this;
    }

    public Double getActingTradingSec() {
        return actingTradingSec;
    }

    public BalancesheetBean setActingTradingSec(Double actingTradingSec) {
        this.actingTradingSec = actingTradingSec;
        return this;
    }

    public Double getActingUwSec() {
        return actingUwSec;
    }

    public BalancesheetBean setActingUwSec(Double actingUwSec) {
        this.actingUwSec = actingUwSec;
        return this;
    }

    public Double getNonCurLiabDue1y() {
        return nonCurLiabDue1y;
    }

    public BalancesheetBean setNonCurLiabDue1y(Double nonCurLiabDue1y) {
        this.nonCurLiabDue1y = nonCurLiabDue1y;
        return this;
    }

    public Double getOthCurLiab() {
        return othCurLiab;
    }

    public BalancesheetBean setOthCurLiab(Double othCurLiab) {
        this.othCurLiab = othCurLiab;
        return this;
    }

    public Double getTotalCurLiab() {
        return totalCurLiab;
    }

    public BalancesheetBean setTotalCurLiab(Double totalCurLiab) {
        this.totalCurLiab = totalCurLiab;
        return this;
    }

    public Double getBondPayable() {
        return bondPayable;
    }

    public BalancesheetBean setBondPayable(Double bondPayable) {
        this.bondPayable = bondPayable;
        return this;
    }

    public Double getLtPayable() {
        return ltPayable;
    }

    public BalancesheetBean setLtPayable(Double ltPayable) {
        this.ltPayable = ltPayable;
        return this;
    }

    public Double getSpecificPayables() {
        return specificPayables;
    }

    public BalancesheetBean setSpecificPayables(Double specificPayables) {
        this.specificPayables = specificPayables;
        return this;
    }

    public Double getEstimatedLiab() {
        return estimatedLiab;
    }

    public BalancesheetBean setEstimatedLiab(Double estimatedLiab) {
        this.estimatedLiab = estimatedLiab;
        return this;
    }

    public Double getDeferTaxLiab() {
        return deferTaxLiab;
    }

    public BalancesheetBean setDeferTaxLiab(Double deferTaxLiab) {
        this.deferTaxLiab = deferTaxLiab;
        return this;
    }

    public Double getDeferIncNonCurLiab() {
        return deferIncNonCurLiab;
    }

    public BalancesheetBean setDeferIncNonCurLiab(Double deferIncNonCurLiab) {
        this.deferIncNonCurLiab = deferIncNonCurLiab;
        return this;
    }

    public Double getOthNcl() {
        return othNcl;
    }

    public BalancesheetBean setOthNcl(Double othNcl) {
        this.othNcl = othNcl;
        return this;
    }

    public Double getTotalNcl() {
        return totalNcl;
    }

    public BalancesheetBean setTotalNcl(Double totalNcl) {
        this.totalNcl = totalNcl;
        return this;
    }

    public Double getDeposOthBfi() {
        return deposOthBfi;
    }

    public BalancesheetBean setDeposOthBfi(Double deposOthBfi) {
        this.deposOthBfi = deposOthBfi;
        return this;
    }

    public Double getDerivLiab() {
        return derivLiab;
    }

    public BalancesheetBean setDerivLiab(Double derivLiab) {
        this.derivLiab = derivLiab;
        return this;
    }

    public Double getDepos() {
        return depos;
    }

    public BalancesheetBean setDepos(Double depos) {
        this.depos = depos;
        return this;
    }

    public Double getAgencyBusLiab() {
        return agencyBusLiab;
    }

    public BalancesheetBean setAgencyBusLiab(Double agencyBusLiab) {
        this.agencyBusLiab = agencyBusLiab;
        return this;
    }

    public Double getOthLiab() {
        return othLiab;
    }

    public BalancesheetBean setOthLiab(Double othLiab) {
        this.othLiab = othLiab;
        return this;
    }

    public Double getPremReceivAdva() {
        return premReceivAdva;
    }

    public BalancesheetBean setPremReceivAdva(Double premReceivAdva) {
        this.premReceivAdva = premReceivAdva;
        return this;
    }

    public Double getDeposReceived() {
        return deposReceived;
    }

    public BalancesheetBean setDeposReceived(Double deposReceived) {
        this.deposReceived = deposReceived;
        return this;
    }

    public Double getPhInvest() {
        return phInvest;
    }

    public BalancesheetBean setPhInvest(Double phInvest) {
        this.phInvest = phInvest;
        return this;
    }

    public Double getReserUnePrem() {
        return reserUnePrem;
    }

    public BalancesheetBean setReserUnePrem(Double reserUnePrem) {
        this.reserUnePrem = reserUnePrem;
        return this;
    }

    public Double getReserOutstdClaims() {
        return reserOutstdClaims;
    }

    public BalancesheetBean setReserOutstdClaims(Double reserOutstdClaims) {
        this.reserOutstdClaims = reserOutstdClaims;
        return this;
    }

    public Double getReserLinsLiab() {
        return reserLinsLiab;
    }

    public BalancesheetBean setReserLinsLiab(Double reserLinsLiab) {
        this.reserLinsLiab = reserLinsLiab;
        return this;
    }

    public Double getReserLthinsLiab() {
        return reserLthinsLiab;
    }

    public BalancesheetBean setReserLthinsLiab(Double reserLthinsLiab) {
        this.reserLthinsLiab = reserLthinsLiab;
        return this;
    }

    public Double getIndeptAccLiab() {
        return indeptAccLiab;
    }

    public BalancesheetBean setIndeptAccLiab(Double indeptAccLiab) {
        this.indeptAccLiab = indeptAccLiab;
        return this;
    }

    public Double getPledgeBorr() {
        return pledgeBorr;
    }

    public BalancesheetBean setPledgeBorr(Double pledgeBorr) {
        this.pledgeBorr = pledgeBorr;
        return this;
    }

    public Double getIndemPayable() {
        return indemPayable;
    }

    public BalancesheetBean setIndemPayable(Double indemPayable) {
        this.indemPayable = indemPayable;
        return this;
    }

    public Double getPolicyDivPayable() {
        return policyDivPayable;
    }

    public BalancesheetBean setPolicyDivPayable(Double policyDivPayable) {
        this.policyDivPayable = policyDivPayable;
        return this;
    }

    public Double getTotalLiab() {
        return totalLiab;
    }

    public BalancesheetBean setTotalLiab(Double totalLiab) {
        this.totalLiab = totalLiab;
        return this;
    }

    public Double getTreasuryShare() {
        return treasuryShare;
    }

    public BalancesheetBean setTreasuryShare(Double treasuryShare) {
        this.treasuryShare = treasuryShare;
        return this;
    }

    public Double getOrdinRiskReser() {
        return ordinRiskReser;
    }

    public BalancesheetBean setOrdinRiskReser(Double ordinRiskReser) {
        this.ordinRiskReser = ordinRiskReser;
        return this;
    }

    public Double getForexDiffer() {
        return forexDiffer;
    }

    public BalancesheetBean setForexDiffer(Double forexDiffer) {
        this.forexDiffer = forexDiffer;
        return this;
    }

    public Double getInvestLossUnconf() {
        return investLossUnconf;
    }

    public BalancesheetBean setInvestLossUnconf(Double investLossUnconf) {
        this.investLossUnconf = investLossUnconf;
        return this;
    }

    public Double getMinorityInt() {
        return minorityInt;
    }

    public BalancesheetBean setMinorityInt(Double minorityInt) {
        this.minorityInt = minorityInt;
        return this;
    }

    public Double getTotalHldrEqyExcMinInt() {
        return totalHldrEqyExcMinInt;
    }

    public BalancesheetBean setTotalHldrEqyExcMinInt(Double totalHldrEqyExcMinInt) {
        this.totalHldrEqyExcMinInt = totalHldrEqyExcMinInt;
        return this;
    }

    public Double getTotalHldrEqyIncMinInt() {
        return totalHldrEqyIncMinInt;
    }

    public BalancesheetBean setTotalHldrEqyIncMinInt(Double totalHldrEqyIncMinInt) {
        this.totalHldrEqyIncMinInt = totalHldrEqyIncMinInt;
        return this;
    }

    public Double getTotalLiabHldrEqy() {
        return totalLiabHldrEqy;
    }

    public BalancesheetBean setTotalLiabHldrEqy(Double totalLiabHldrEqy) {
        this.totalLiabHldrEqy = totalLiabHldrEqy;
        return this;
    }

    public Double getLtPayrollPayable() {
        return ltPayrollPayable;
    }

    public BalancesheetBean setLtPayrollPayable(Double ltPayrollPayable) {
        this.ltPayrollPayable = ltPayrollPayable;
        return this;
    }

    public Double getOthCompIncome() {
        return othCompIncome;
    }

    public BalancesheetBean setOthCompIncome(Double othCompIncome) {
        this.othCompIncome = othCompIncome;
        return this;
    }

    public Double getOthEqtTools() {
        return othEqtTools;
    }

    public BalancesheetBean setOthEqtTools(Double othEqtTools) {
        this.othEqtTools = othEqtTools;
        return this;
    }

    public Double getOthEqtToolsPShr() {
        return othEqtToolsPShr;
    }

    public BalancesheetBean setOthEqtToolsPShr(Double othEqtToolsPShr) {
        this.othEqtToolsPShr = othEqtToolsPShr;
        return this;
    }

    public Double getLendingFunds() {
        return lendingFunds;
    }

    public BalancesheetBean setLendingFunds(Double lendingFunds) {
        this.lendingFunds = lendingFunds;
        return this;
    }

    public Double getAccReceivable() {
        return accReceivable;
    }

    public BalancesheetBean setAccReceivable(Double accReceivable) {
        this.accReceivable = accReceivable;
        return this;
    }

    public Double getStFinPayable() {
        return stFinPayable;
    }

    public BalancesheetBean setStFinPayable(Double stFinPayable) {
        this.stFinPayable = stFinPayable;
        return this;
    }

    public Double getPayables() {
        return payables;
    }

    public BalancesheetBean setPayables(Double payables) {
        this.payables = payables;
        return this;
    }

    public Double getHfsAssets() {
        return hfsAssets;
    }

    public BalancesheetBean setHfsAssets(Double hfsAssets) {
        this.hfsAssets = hfsAssets;
        return this;
    }

    public Double getHfsSales() {
        return hfsSales;
    }

    public BalancesheetBean setHfsSales(Double hfsSales) {
        this.hfsSales = hfsSales;
        return this;
    }

    @Override
    public String toString() {
        return "BalancesheetBean{" +
               "tsCode=" + tsCode + ", " +
               "annDate=" + annDate + ", " +
               "fAnnDate=" + fAnnDate + ", " +
               "endDate=" + endDate + ", " +
               "reportType=" + reportType + ", " +
               "compType=" + compType + ", " +
               "totalShare=" + totalShare + ", " +
               "capRese=" + capRese + ", " +
               "undistrPorfit=" + undistrPorfit + ", " +
               "surplusRese=" + surplusRese + ", " +
               "specialRese=" + specialRese + ", " +
               "moneyCap=" + moneyCap + ", " +
               "tradAsset=" + tradAsset + ", " +
               "notesReceiv=" + notesReceiv + ", " +
               "accountsReceiv=" + accountsReceiv + ", " +
               "othReceiv=" + othReceiv + ", " +
               "prepayment=" + prepayment + ", " +
               "divReceiv=" + divReceiv + ", " +
               "intReceiv=" + intReceiv + ", " +
               "inventories=" + inventories + ", " +
               "amorExp=" + amorExp + ", " +
               "ncaWithin1y=" + ncaWithin1y + ", " +
               "settRsrv=" + settRsrv + ", " +
               "loantoOthBankFi=" + loantoOthBankFi + ", " +
               "premiumReceiv=" + premiumReceiv + ", " +
               "reinsurReceiv=" + reinsurReceiv + ", " +
               "reinsurResReceiv=" + reinsurResReceiv + ", " +
               "purResaleFa=" + purResaleFa + ", " +
               "othCurAssets=" + othCurAssets + ", " +
               "totalCurAssets=" + totalCurAssets + ", " +
               "faAvailForSale=" + faAvailForSale + ", " +
               "htmInvest=" + htmInvest + ", " +
               "ltEqtInvest=" + ltEqtInvest + ", " +
               "investRealEstate=" + investRealEstate + ", " +
               "timeDeposits=" + timeDeposits + ", " +
               "othAssets=" + othAssets + ", " +
               "ltRec=" + ltRec + ", " +
               "fixAssets=" + fixAssets + ", " +
               "cip=" + cip + ", " +
               "constMaterials=" + constMaterials + ", " +
               "fixedAssetsDisp=" + fixedAssetsDisp + ", " +
               "producBioAssets=" + producBioAssets + ", " +
               "oilAndGasAssets=" + oilAndGasAssets + ", " +
               "intanAssets=" + intanAssets + ", " +
               "rAndD=" + rAndD + ", " +
               "goodwill=" + goodwill + ", " +
               "ltAmorExp=" + ltAmorExp + ", " +
               "deferTaxAssets=" + deferTaxAssets + ", " +
               "decrInDisbur=" + decrInDisbur + ", " +
               "othNca=" + othNca + ", " +
               "totalNca=" + totalNca + ", " +
               "cashReserCb=" + cashReserCb + ", " +
               "deposInOthBfi=" + deposInOthBfi + ", " +
               "precMetals=" + precMetals + ", " +
               "derivAssets=" + derivAssets + ", " +
               "rrReinsUnePrem=" + rrReinsUnePrem + ", " +
               "rrReinsOutstdCla=" + rrReinsOutstdCla + ", " +
               "rrReinsLinsLiab=" + rrReinsLinsLiab + ", " +
               "rrReinsLthinsLiab=" + rrReinsLthinsLiab + ", " +
               "refundDepos=" + refundDepos + ", " +
               "phPledgeLoans=" + phPledgeLoans + ", " +
               "refundCapDepos=" + refundCapDepos + ", " +
               "indepAcctAssets=" + indepAcctAssets + ", " +
               "clientDepos=" + clientDepos + ", " +
               "clientProv=" + clientProv + ", " +
               "transacSeatFee=" + transacSeatFee + ", " +
               "investAsReceiv=" + investAsReceiv + ", " +
               "totalAssets=" + totalAssets + ", " +
               "ltBorr=" + ltBorr + ", " +
               "stBorr=" + stBorr + ", " +
               "cbBorr=" + cbBorr + ", " +
               "deposIbDeposits=" + deposIbDeposits + ", " +
               "loanOthBank=" + loanOthBank + ", " +
               "tradingFl=" + tradingFl + ", " +
               "notesPayable=" + notesPayable + ", " +
               "acctPayable=" + acctPayable + ", " +
               "advReceipts=" + advReceipts + ", " +
               "soldForRepurFa=" + soldForRepurFa + ", " +
               "commPayable=" + commPayable + ", " +
               "payrollPayable=" + payrollPayable + ", " +
               "taxesPayable=" + taxesPayable + ", " +
               "intPayable=" + intPayable + ", " +
               "divPayable=" + divPayable + ", " +
               "othPayable=" + othPayable + ", " +
               "accExp=" + accExp + ", " +
               "deferredInc=" + deferredInc + ", " +
               "stBondsPayable=" + stBondsPayable + ", " +
               "payableToReinsurer=" + payableToReinsurer + ", " +
               "rsrvInsurCont=" + rsrvInsurCont + ", " +
               "actingTradingSec=" + actingTradingSec + ", " +
               "actingUwSec=" + actingUwSec + ", " +
               "nonCurLiabDue1y=" + nonCurLiabDue1y + ", " +
               "othCurLiab=" + othCurLiab + ", " +
               "totalCurLiab=" + totalCurLiab + ", " +
               "bondPayable=" + bondPayable + ", " +
               "ltPayable=" + ltPayable + ", " +
               "specificPayables=" + specificPayables + ", " +
               "estimatedLiab=" + estimatedLiab + ", " +
               "deferTaxLiab=" + deferTaxLiab + ", " +
               "deferIncNonCurLiab=" + deferIncNonCurLiab + ", " +
               "othNcl=" + othNcl + ", " +
               "totalNcl=" + totalNcl + ", " +
               "deposOthBfi=" + deposOthBfi + ", " +
               "derivLiab=" + derivLiab + ", " +
               "depos=" + depos + ", " +
               "agencyBusLiab=" + agencyBusLiab + ", " +
               "othLiab=" + othLiab + ", " +
               "premReceivAdva=" + premReceivAdva + ", " +
               "deposReceived=" + deposReceived + ", " +
               "phInvest=" + phInvest + ", " +
               "reserUnePrem=" + reserUnePrem + ", " +
               "reserOutstdClaims=" + reserOutstdClaims + ", " +
               "reserLinsLiab=" + reserLinsLiab + ", " +
               "reserLthinsLiab=" + reserLthinsLiab + ", " +
               "indeptAccLiab=" + indeptAccLiab + ", " +
               "pledgeBorr=" + pledgeBorr + ", " +
               "indemPayable=" + indemPayable + ", " +
               "policyDivPayable=" + policyDivPayable + ", " +
               "totalLiab=" + totalLiab + ", " +
               "treasuryShare=" + treasuryShare + ", " +
               "ordinRiskReser=" + ordinRiskReser + ", " +
               "forexDiffer=" + forexDiffer + ", " +
               "investLossUnconf=" + investLossUnconf + ", " +
               "minorityInt=" + minorityInt + ", " +
               "totalHldrEqyExcMinInt=" + totalHldrEqyExcMinInt + ", " +
               "totalHldrEqyIncMinInt=" + totalHldrEqyIncMinInt + ", " +
               "totalLiabHldrEqy=" + totalLiabHldrEqy + ", " +
               "ltPayrollPayable=" + ltPayrollPayable + ", " +
               "othCompIncome=" + othCompIncome + ", " +
               "othEqtTools=" + othEqtTools + ", " +
               "othEqtToolsPShr=" + othEqtToolsPShr + ", " +
               "lendingFunds=" + lendingFunds + ", " +
               "accReceivable=" + accReceivable + ", " +
               "stFinPayable=" + stFinPayable + ", " +
               "payables=" + payables + ", " +
               "hfsAssets=" + hfsAssets + ", " +
               "hfsSales=" + hfsSales + 
               "}";
    }
}