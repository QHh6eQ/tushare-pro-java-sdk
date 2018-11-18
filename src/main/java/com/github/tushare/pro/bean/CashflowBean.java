package com.github.tushare.pro.bean;

/**
 * 现金流量表
 */
public class CashflowBean {

    protected String tsCode;  // TS股票代码
    protected String annDate;  // 公告日期
    protected String fAnnDate;  // 实际公告日期
    protected String endDate;  // 报告期
    protected String compType;  // 公司类型：1一般工商业 2银行 3保险 4证券
    protected String reportType;  // 报表类型：见下方详细说明
    protected Double netProfit;  // 净利润 (元，下同)
    protected Double finanExp;  // 财务费用
    protected Double cFrSaleSg;  // 销售商品、提供劳务收到的现金
    protected Double recpTaxRends;  // 收到的税费返还
    protected Double nDeposIncrFi;  // 客户存款和同业存放款项净增加额
    protected Double nIncrLoansCb;  // 向中央银行借款净增加额
    protected Double nIncBorrOthFi;  // 向其他金融机构拆入资金净增加额
    protected Double premFrOrigContr;  // 收到原保险合同保费取得的现金
    protected Double nIncrInsuredDep;  // 保户储金净增加额
    protected Double nReinsurPrem;  // 收到再保业务现金净额
    protected Double nIncrDispTfa;  // 处置交易性金融资产净增加额
    protected Double ifcCashIncr;  // 收取利息和手续费净增加额
    protected Double nIncrDispFaas;  // 处置可供出售金融资产净增加额
    protected Double nIncrLoansOthBank;  // 拆入资金净增加额
    protected Double nCapIncrRepur;  // 回购业务资金净增加额
    protected Double cFrOthOperateA;  // 收到其他与经营活动有关的现金
    protected Double cInfFrOperateA;  // 经营活动现金流入小计
    protected Double cPaidGoodsS;  // 购买商品、接受劳务支付的现金
    protected Double cPaidToForEmpl;  // 支付给职工以及为职工支付的现金
    protected Double cPaidForTaxes;  // 支付的各项税费
    protected Double nIncrCltLoanAdv;  // 客户贷款及垫款净增加额
    protected Double nIncrDepCbob;  // 存放央行和同业款项净增加额
    protected Double cPayClaimsOrigInco;  // 支付原保险合同赔付款项的现金
    protected Double payHandlingChrg;  // 支付手续费的现金
    protected Double payCommInsurPlcy;  // 支付保单红利的现金
    protected Double othCashPayOperAct;  // 支付其他与经营活动有关的现金
    protected Double stCashOutAct;  // 经营活动现金流出小计
    protected Double nCashflowAct;  // 经营活动产生的现金流量净额
    protected Double othRecpRalInvAct;  // 收到其他与投资活动有关的现金
    protected Double cDispWithdrwlInvest;  // 收回投资收到的现金
    protected Double cRecpReturnInvest;  // 取得投资收益收到的现金
    protected Double nRecpDispFiolta;  // 处置固定资产、无形资产和其他长期资产收回的现金净额
    protected Double nRecpDispSobu;  // 处置子公司及其他营业单位收到的现金净额
    protected Double stotInflowsInvAct;  // 投资活动现金流入小计
    protected Double cPayAcqConstFiolta;  // 购建固定资产、无形资产和其他长期资产支付的现金
    protected Double cPaidInvest;  // 投资支付的现金
    protected Double nDispSubsOthBiz;  // 取得子公司及其他营业单位支付的现金净额
    protected Double othPayRalInvAct;  // 支付其他与投资活动有关的现金
    protected Double nIncrPledgeLoan;  // 质押贷款净增加额
    protected Double stotOutInvAct;  // 投资活动现金流出小计
    protected Double nCashflowInvAct;  // 投资活动产生的现金流量净额
    protected Double cRecpBorrow;  // 取得借款收到的现金
    protected Double procIssueBonds;  // 发行债券收到的现金
    protected Double othCashRecpRalFncAct;  // 收到其他与筹资活动有关的现金
    protected Double stotCashInFncAct;  // 筹资活动现金流入小计
    protected Double freeCashflow;  // 企业自由现金流量
    protected Double cPrepayAmtBorr;  // 偿还债务支付的现金
    protected Double cPayDistDpcpIntExp;  // 分配股利、利润或偿付利息支付的现金
    protected Double inclDvdProfitPaidScMs;  // 其中:子公司支付给少数股东的股利、利润
    protected Double othCashpayRalFncAct;  // 支付其他与筹资活动有关的现金
    protected Double stotCashoutFncAct;  // 筹资活动现金流出小计
    protected Double nCashFlowsFncAct;  // 筹资活动产生的现金流量净额
    protected Double effFxFluCash;  // 汇率变动对现金的影响
    protected Double nIncrCashCashEqu;  // 现金及现金等价物净增加额
    protected Double cCashEquBegPeriod;  // 期初现金及现金等价物余额
    protected Double cCashEquEndPeriod;  // 期末现金及现金等价物余额
    protected Double cRecpCapContrib;  // 吸收投资收到的现金
    protected Double inclCashRecSaims;  // 其中:子公司吸收少数股东投资收到的现金
    protected Double unconInvestLoss;  // 未确认投资损失
    protected Double provDeprAssets;  // 加:资产减值准备
    protected Double deprFaCogaDpba;  // 固定资产折旧、油气资产折耗、生产性生物资产折旧
    protected Double amortIntangAssets;  // 无形资产摊销
    protected Double ltAmortDeferredExp;  // 长期待摊费用摊销
    protected Double decrDeferredExp;  // 待摊费用减少
    protected Double incrAccExp;  // 预提费用增加
    protected Double lossDispFiolta;  // 处置固定、无形资产和其他长期资产的损失
    protected Double lossScrFa;  // 固定资产报废损失
    protected Double lossFvChg;  // 公允价值变动损失
    protected Double investLoss;  // 投资损失
    protected Double decrDefIncTaxAssets;  // 递延所得税资产减少
    protected Double incrDefIncTaxLiab;  // 递延所得税负债增加
    protected Double decrInventories;  // 存货的减少
    protected Double decrOperPayable;  // 经营性应收项目的减少
    protected Double incrOperPayable;  // 经营性应付项目的增加
    protected Double others;  // 其他
    protected Double imNetCashflowOperAct;  // 经营活动产生的现金流量净额(间接法)
    protected Double convDebtIntoCap;  // 债务转为资本
    protected Double convCopbondsDueWithin1y;  // 一年内到期的可转换公司债券
    protected Double faFncLeases;  // 融资租入固定资产
    protected Double endBalCash;  // 现金的期末余额
    protected Double begBalCash;  // 减:现金的期初余额
    protected Double endBalCashEqu;  // 加:现金等价物的期末余额
    protected Double begBalCashEqu;  // 减:现金等价物的期初余额
    protected Double imNIncrCashEqu;  // 现金及现金等价物净增加额(间接法)

    public String getTsCode() {
        return tsCode;
    }

    public CashflowBean setTsCode(String tsCode) {
        this.tsCode = tsCode;
        return this;
    }

    public String getAnnDate() {
        return annDate;
    }

    public CashflowBean setAnnDate(String annDate) {
        this.annDate = annDate;
        return this;
    }

    public String getFAnnDate() {
        return fAnnDate;
    }

    public CashflowBean setFAnnDate(String fAnnDate) {
        this.fAnnDate = fAnnDate;
        return this;
    }

    public String getEndDate() {
        return endDate;
    }

    public CashflowBean setEndDate(String endDate) {
        this.endDate = endDate;
        return this;
    }

    public String getCompType() {
        return compType;
    }

    public CashflowBean setCompType(String compType) {
        this.compType = compType;
        return this;
    }

    public String getReportType() {
        return reportType;
    }

    public CashflowBean setReportType(String reportType) {
        this.reportType = reportType;
        return this;
    }

    public Double getNetProfit() {
        return netProfit;
    }

    public CashflowBean setNetProfit(Double netProfit) {
        this.netProfit = netProfit;
        return this;
    }

    public Double getFinanExp() {
        return finanExp;
    }

    public CashflowBean setFinanExp(Double finanExp) {
        this.finanExp = finanExp;
        return this;
    }

    public Double getCFrSaleSg() {
        return cFrSaleSg;
    }

    public CashflowBean setCFrSaleSg(Double cFrSaleSg) {
        this.cFrSaleSg = cFrSaleSg;
        return this;
    }

    public Double getRecpTaxRends() {
        return recpTaxRends;
    }

    public CashflowBean setRecpTaxRends(Double recpTaxRends) {
        this.recpTaxRends = recpTaxRends;
        return this;
    }

    public Double getNDeposIncrFi() {
        return nDeposIncrFi;
    }

    public CashflowBean setNDeposIncrFi(Double nDeposIncrFi) {
        this.nDeposIncrFi = nDeposIncrFi;
        return this;
    }

    public Double getNIncrLoansCb() {
        return nIncrLoansCb;
    }

    public CashflowBean setNIncrLoansCb(Double nIncrLoansCb) {
        this.nIncrLoansCb = nIncrLoansCb;
        return this;
    }

    public Double getNIncBorrOthFi() {
        return nIncBorrOthFi;
    }

    public CashflowBean setNIncBorrOthFi(Double nIncBorrOthFi) {
        this.nIncBorrOthFi = nIncBorrOthFi;
        return this;
    }

    public Double getPremFrOrigContr() {
        return premFrOrigContr;
    }

    public CashflowBean setPremFrOrigContr(Double premFrOrigContr) {
        this.premFrOrigContr = premFrOrigContr;
        return this;
    }

    public Double getNIncrInsuredDep() {
        return nIncrInsuredDep;
    }

    public CashflowBean setNIncrInsuredDep(Double nIncrInsuredDep) {
        this.nIncrInsuredDep = nIncrInsuredDep;
        return this;
    }

    public Double getNReinsurPrem() {
        return nReinsurPrem;
    }

    public CashflowBean setNReinsurPrem(Double nReinsurPrem) {
        this.nReinsurPrem = nReinsurPrem;
        return this;
    }

    public Double getNIncrDispTfa() {
        return nIncrDispTfa;
    }

    public CashflowBean setNIncrDispTfa(Double nIncrDispTfa) {
        this.nIncrDispTfa = nIncrDispTfa;
        return this;
    }

    public Double getIfcCashIncr() {
        return ifcCashIncr;
    }

    public CashflowBean setIfcCashIncr(Double ifcCashIncr) {
        this.ifcCashIncr = ifcCashIncr;
        return this;
    }

    public Double getNIncrDispFaas() {
        return nIncrDispFaas;
    }

    public CashflowBean setNIncrDispFaas(Double nIncrDispFaas) {
        this.nIncrDispFaas = nIncrDispFaas;
        return this;
    }

    public Double getNIncrLoansOthBank() {
        return nIncrLoansOthBank;
    }

    public CashflowBean setNIncrLoansOthBank(Double nIncrLoansOthBank) {
        this.nIncrLoansOthBank = nIncrLoansOthBank;
        return this;
    }

    public Double getNCapIncrRepur() {
        return nCapIncrRepur;
    }

    public CashflowBean setNCapIncrRepur(Double nCapIncrRepur) {
        this.nCapIncrRepur = nCapIncrRepur;
        return this;
    }

    public Double getCFrOthOperateA() {
        return cFrOthOperateA;
    }

    public CashflowBean setCFrOthOperateA(Double cFrOthOperateA) {
        this.cFrOthOperateA = cFrOthOperateA;
        return this;
    }

    public Double getCInfFrOperateA() {
        return cInfFrOperateA;
    }

    public CashflowBean setCInfFrOperateA(Double cInfFrOperateA) {
        this.cInfFrOperateA = cInfFrOperateA;
        return this;
    }

    public Double getCPaidGoodsS() {
        return cPaidGoodsS;
    }

    public CashflowBean setCPaidGoodsS(Double cPaidGoodsS) {
        this.cPaidGoodsS = cPaidGoodsS;
        return this;
    }

    public Double getCPaidToForEmpl() {
        return cPaidToForEmpl;
    }

    public CashflowBean setCPaidToForEmpl(Double cPaidToForEmpl) {
        this.cPaidToForEmpl = cPaidToForEmpl;
        return this;
    }

    public Double getCPaidForTaxes() {
        return cPaidForTaxes;
    }

    public CashflowBean setCPaidForTaxes(Double cPaidForTaxes) {
        this.cPaidForTaxes = cPaidForTaxes;
        return this;
    }

    public Double getNIncrCltLoanAdv() {
        return nIncrCltLoanAdv;
    }

    public CashflowBean setNIncrCltLoanAdv(Double nIncrCltLoanAdv) {
        this.nIncrCltLoanAdv = nIncrCltLoanAdv;
        return this;
    }

    public Double getNIncrDepCbob() {
        return nIncrDepCbob;
    }

    public CashflowBean setNIncrDepCbob(Double nIncrDepCbob) {
        this.nIncrDepCbob = nIncrDepCbob;
        return this;
    }

    public Double getCPayClaimsOrigInco() {
        return cPayClaimsOrigInco;
    }

    public CashflowBean setCPayClaimsOrigInco(Double cPayClaimsOrigInco) {
        this.cPayClaimsOrigInco = cPayClaimsOrigInco;
        return this;
    }

    public Double getPayHandlingChrg() {
        return payHandlingChrg;
    }

    public CashflowBean setPayHandlingChrg(Double payHandlingChrg) {
        this.payHandlingChrg = payHandlingChrg;
        return this;
    }

    public Double getPayCommInsurPlcy() {
        return payCommInsurPlcy;
    }

    public CashflowBean setPayCommInsurPlcy(Double payCommInsurPlcy) {
        this.payCommInsurPlcy = payCommInsurPlcy;
        return this;
    }

    public Double getOthCashPayOperAct() {
        return othCashPayOperAct;
    }

    public CashflowBean setOthCashPayOperAct(Double othCashPayOperAct) {
        this.othCashPayOperAct = othCashPayOperAct;
        return this;
    }

    public Double getStCashOutAct() {
        return stCashOutAct;
    }

    public CashflowBean setStCashOutAct(Double stCashOutAct) {
        this.stCashOutAct = stCashOutAct;
        return this;
    }

    public Double getNCashflowAct() {
        return nCashflowAct;
    }

    public CashflowBean setNCashflowAct(Double nCashflowAct) {
        this.nCashflowAct = nCashflowAct;
        return this;
    }

    public Double getOthRecpRalInvAct() {
        return othRecpRalInvAct;
    }

    public CashflowBean setOthRecpRalInvAct(Double othRecpRalInvAct) {
        this.othRecpRalInvAct = othRecpRalInvAct;
        return this;
    }

    public Double getCDispWithdrwlInvest() {
        return cDispWithdrwlInvest;
    }

    public CashflowBean setCDispWithdrwlInvest(Double cDispWithdrwlInvest) {
        this.cDispWithdrwlInvest = cDispWithdrwlInvest;
        return this;
    }

    public Double getCRecpReturnInvest() {
        return cRecpReturnInvest;
    }

    public CashflowBean setCRecpReturnInvest(Double cRecpReturnInvest) {
        this.cRecpReturnInvest = cRecpReturnInvest;
        return this;
    }

    public Double getNRecpDispFiolta() {
        return nRecpDispFiolta;
    }

    public CashflowBean setNRecpDispFiolta(Double nRecpDispFiolta) {
        this.nRecpDispFiolta = nRecpDispFiolta;
        return this;
    }

    public Double getNRecpDispSobu() {
        return nRecpDispSobu;
    }

    public CashflowBean setNRecpDispSobu(Double nRecpDispSobu) {
        this.nRecpDispSobu = nRecpDispSobu;
        return this;
    }

    public Double getStotInflowsInvAct() {
        return stotInflowsInvAct;
    }

    public CashflowBean setStotInflowsInvAct(Double stotInflowsInvAct) {
        this.stotInflowsInvAct = stotInflowsInvAct;
        return this;
    }

    public Double getCPayAcqConstFiolta() {
        return cPayAcqConstFiolta;
    }

    public CashflowBean setCPayAcqConstFiolta(Double cPayAcqConstFiolta) {
        this.cPayAcqConstFiolta = cPayAcqConstFiolta;
        return this;
    }

    public Double getCPaidInvest() {
        return cPaidInvest;
    }

    public CashflowBean setCPaidInvest(Double cPaidInvest) {
        this.cPaidInvest = cPaidInvest;
        return this;
    }

    public Double getNDispSubsOthBiz() {
        return nDispSubsOthBiz;
    }

    public CashflowBean setNDispSubsOthBiz(Double nDispSubsOthBiz) {
        this.nDispSubsOthBiz = nDispSubsOthBiz;
        return this;
    }

    public Double getOthPayRalInvAct() {
        return othPayRalInvAct;
    }

    public CashflowBean setOthPayRalInvAct(Double othPayRalInvAct) {
        this.othPayRalInvAct = othPayRalInvAct;
        return this;
    }

    public Double getNIncrPledgeLoan() {
        return nIncrPledgeLoan;
    }

    public CashflowBean setNIncrPledgeLoan(Double nIncrPledgeLoan) {
        this.nIncrPledgeLoan = nIncrPledgeLoan;
        return this;
    }

    public Double getStotOutInvAct() {
        return stotOutInvAct;
    }

    public CashflowBean setStotOutInvAct(Double stotOutInvAct) {
        this.stotOutInvAct = stotOutInvAct;
        return this;
    }

    public Double getNCashflowInvAct() {
        return nCashflowInvAct;
    }

    public CashflowBean setNCashflowInvAct(Double nCashflowInvAct) {
        this.nCashflowInvAct = nCashflowInvAct;
        return this;
    }

    public Double getCRecpBorrow() {
        return cRecpBorrow;
    }

    public CashflowBean setCRecpBorrow(Double cRecpBorrow) {
        this.cRecpBorrow = cRecpBorrow;
        return this;
    }

    public Double getProcIssueBonds() {
        return procIssueBonds;
    }

    public CashflowBean setProcIssueBonds(Double procIssueBonds) {
        this.procIssueBonds = procIssueBonds;
        return this;
    }

    public Double getOthCashRecpRalFncAct() {
        return othCashRecpRalFncAct;
    }

    public CashflowBean setOthCashRecpRalFncAct(Double othCashRecpRalFncAct) {
        this.othCashRecpRalFncAct = othCashRecpRalFncAct;
        return this;
    }

    public Double getStotCashInFncAct() {
        return stotCashInFncAct;
    }

    public CashflowBean setStotCashInFncAct(Double stotCashInFncAct) {
        this.stotCashInFncAct = stotCashInFncAct;
        return this;
    }

    public Double getFreeCashflow() {
        return freeCashflow;
    }

    public CashflowBean setFreeCashflow(Double freeCashflow) {
        this.freeCashflow = freeCashflow;
        return this;
    }

    public Double getCPrepayAmtBorr() {
        return cPrepayAmtBorr;
    }

    public CashflowBean setCPrepayAmtBorr(Double cPrepayAmtBorr) {
        this.cPrepayAmtBorr = cPrepayAmtBorr;
        return this;
    }

    public Double getCPayDistDpcpIntExp() {
        return cPayDistDpcpIntExp;
    }

    public CashflowBean setCPayDistDpcpIntExp(Double cPayDistDpcpIntExp) {
        this.cPayDistDpcpIntExp = cPayDistDpcpIntExp;
        return this;
    }

    public Double getInclDvdProfitPaidScMs() {
        return inclDvdProfitPaidScMs;
    }

    public CashflowBean setInclDvdProfitPaidScMs(Double inclDvdProfitPaidScMs) {
        this.inclDvdProfitPaidScMs = inclDvdProfitPaidScMs;
        return this;
    }

    public Double getOthCashpayRalFncAct() {
        return othCashpayRalFncAct;
    }

    public CashflowBean setOthCashpayRalFncAct(Double othCashpayRalFncAct) {
        this.othCashpayRalFncAct = othCashpayRalFncAct;
        return this;
    }

    public Double getStotCashoutFncAct() {
        return stotCashoutFncAct;
    }

    public CashflowBean setStotCashoutFncAct(Double stotCashoutFncAct) {
        this.stotCashoutFncAct = stotCashoutFncAct;
        return this;
    }

    public Double getNCashFlowsFncAct() {
        return nCashFlowsFncAct;
    }

    public CashflowBean setNCashFlowsFncAct(Double nCashFlowsFncAct) {
        this.nCashFlowsFncAct = nCashFlowsFncAct;
        return this;
    }

    public Double getEffFxFluCash() {
        return effFxFluCash;
    }

    public CashflowBean setEffFxFluCash(Double effFxFluCash) {
        this.effFxFluCash = effFxFluCash;
        return this;
    }

    public Double getNIncrCashCashEqu() {
        return nIncrCashCashEqu;
    }

    public CashflowBean setNIncrCashCashEqu(Double nIncrCashCashEqu) {
        this.nIncrCashCashEqu = nIncrCashCashEqu;
        return this;
    }

    public Double getCCashEquBegPeriod() {
        return cCashEquBegPeriod;
    }

    public CashflowBean setCCashEquBegPeriod(Double cCashEquBegPeriod) {
        this.cCashEquBegPeriod = cCashEquBegPeriod;
        return this;
    }

    public Double getCCashEquEndPeriod() {
        return cCashEquEndPeriod;
    }

    public CashflowBean setCCashEquEndPeriod(Double cCashEquEndPeriod) {
        this.cCashEquEndPeriod = cCashEquEndPeriod;
        return this;
    }

    public Double getCRecpCapContrib() {
        return cRecpCapContrib;
    }

    public CashflowBean setCRecpCapContrib(Double cRecpCapContrib) {
        this.cRecpCapContrib = cRecpCapContrib;
        return this;
    }

    public Double getInclCashRecSaims() {
        return inclCashRecSaims;
    }

    public CashflowBean setInclCashRecSaims(Double inclCashRecSaims) {
        this.inclCashRecSaims = inclCashRecSaims;
        return this;
    }

    public Double getUnconInvestLoss() {
        return unconInvestLoss;
    }

    public CashflowBean setUnconInvestLoss(Double unconInvestLoss) {
        this.unconInvestLoss = unconInvestLoss;
        return this;
    }

    public Double getProvDeprAssets() {
        return provDeprAssets;
    }

    public CashflowBean setProvDeprAssets(Double provDeprAssets) {
        this.provDeprAssets = provDeprAssets;
        return this;
    }

    public Double getDeprFaCogaDpba() {
        return deprFaCogaDpba;
    }

    public CashflowBean setDeprFaCogaDpba(Double deprFaCogaDpba) {
        this.deprFaCogaDpba = deprFaCogaDpba;
        return this;
    }

    public Double getAmortIntangAssets() {
        return amortIntangAssets;
    }

    public CashflowBean setAmortIntangAssets(Double amortIntangAssets) {
        this.amortIntangAssets = amortIntangAssets;
        return this;
    }

    public Double getLtAmortDeferredExp() {
        return ltAmortDeferredExp;
    }

    public CashflowBean setLtAmortDeferredExp(Double ltAmortDeferredExp) {
        this.ltAmortDeferredExp = ltAmortDeferredExp;
        return this;
    }

    public Double getDecrDeferredExp() {
        return decrDeferredExp;
    }

    public CashflowBean setDecrDeferredExp(Double decrDeferredExp) {
        this.decrDeferredExp = decrDeferredExp;
        return this;
    }

    public Double getIncrAccExp() {
        return incrAccExp;
    }

    public CashflowBean setIncrAccExp(Double incrAccExp) {
        this.incrAccExp = incrAccExp;
        return this;
    }

    public Double getLossDispFiolta() {
        return lossDispFiolta;
    }

    public CashflowBean setLossDispFiolta(Double lossDispFiolta) {
        this.lossDispFiolta = lossDispFiolta;
        return this;
    }

    public Double getLossScrFa() {
        return lossScrFa;
    }

    public CashflowBean setLossScrFa(Double lossScrFa) {
        this.lossScrFa = lossScrFa;
        return this;
    }

    public Double getLossFvChg() {
        return lossFvChg;
    }

    public CashflowBean setLossFvChg(Double lossFvChg) {
        this.lossFvChg = lossFvChg;
        return this;
    }

    public Double getInvestLoss() {
        return investLoss;
    }

    public CashflowBean setInvestLoss(Double investLoss) {
        this.investLoss = investLoss;
        return this;
    }

    public Double getDecrDefIncTaxAssets() {
        return decrDefIncTaxAssets;
    }

    public CashflowBean setDecrDefIncTaxAssets(Double decrDefIncTaxAssets) {
        this.decrDefIncTaxAssets = decrDefIncTaxAssets;
        return this;
    }

    public Double getIncrDefIncTaxLiab() {
        return incrDefIncTaxLiab;
    }

    public CashflowBean setIncrDefIncTaxLiab(Double incrDefIncTaxLiab) {
        this.incrDefIncTaxLiab = incrDefIncTaxLiab;
        return this;
    }

    public Double getDecrInventories() {
        return decrInventories;
    }

    public CashflowBean setDecrInventories(Double decrInventories) {
        this.decrInventories = decrInventories;
        return this;
    }

    public Double getDecrOperPayable() {
        return decrOperPayable;
    }

    public CashflowBean setDecrOperPayable(Double decrOperPayable) {
        this.decrOperPayable = decrOperPayable;
        return this;
    }

    public Double getIncrOperPayable() {
        return incrOperPayable;
    }

    public CashflowBean setIncrOperPayable(Double incrOperPayable) {
        this.incrOperPayable = incrOperPayable;
        return this;
    }

    public Double getOthers() {
        return others;
    }

    public CashflowBean setOthers(Double others) {
        this.others = others;
        return this;
    }

    public Double getImNetCashflowOperAct() {
        return imNetCashflowOperAct;
    }

    public CashflowBean setImNetCashflowOperAct(Double imNetCashflowOperAct) {
        this.imNetCashflowOperAct = imNetCashflowOperAct;
        return this;
    }

    public Double getConvDebtIntoCap() {
        return convDebtIntoCap;
    }

    public CashflowBean setConvDebtIntoCap(Double convDebtIntoCap) {
        this.convDebtIntoCap = convDebtIntoCap;
        return this;
    }

    public Double getConvCopbondsDueWithin1y() {
        return convCopbondsDueWithin1y;
    }

    public CashflowBean setConvCopbondsDueWithin1y(Double convCopbondsDueWithin1y) {
        this.convCopbondsDueWithin1y = convCopbondsDueWithin1y;
        return this;
    }

    public Double getFaFncLeases() {
        return faFncLeases;
    }

    public CashflowBean setFaFncLeases(Double faFncLeases) {
        this.faFncLeases = faFncLeases;
        return this;
    }

    public Double getEndBalCash() {
        return endBalCash;
    }

    public CashflowBean setEndBalCash(Double endBalCash) {
        this.endBalCash = endBalCash;
        return this;
    }

    public Double getBegBalCash() {
        return begBalCash;
    }

    public CashflowBean setBegBalCash(Double begBalCash) {
        this.begBalCash = begBalCash;
        return this;
    }

    public Double getEndBalCashEqu() {
        return endBalCashEqu;
    }

    public CashflowBean setEndBalCashEqu(Double endBalCashEqu) {
        this.endBalCashEqu = endBalCashEqu;
        return this;
    }

    public Double getBegBalCashEqu() {
        return begBalCashEqu;
    }

    public CashflowBean setBegBalCashEqu(Double begBalCashEqu) {
        this.begBalCashEqu = begBalCashEqu;
        return this;
    }

    public Double getImNIncrCashEqu() {
        return imNIncrCashEqu;
    }

    public CashflowBean setImNIncrCashEqu(Double imNIncrCashEqu) {
        this.imNIncrCashEqu = imNIncrCashEqu;
        return this;
    }

    @Override
    public String toString() {
        return "CashflowBean{" +
               "tsCode=" + tsCode + ", " +
               "annDate=" + annDate + ", " +
               "fAnnDate=" + fAnnDate + ", " +
               "endDate=" + endDate + ", " +
               "compType=" + compType + ", " +
               "reportType=" + reportType + ", " +
               "netProfit=" + netProfit + ", " +
               "finanExp=" + finanExp + ", " +
               "cFrSaleSg=" + cFrSaleSg + ", " +
               "recpTaxRends=" + recpTaxRends + ", " +
               "nDeposIncrFi=" + nDeposIncrFi + ", " +
               "nIncrLoansCb=" + nIncrLoansCb + ", " +
               "nIncBorrOthFi=" + nIncBorrOthFi + ", " +
               "premFrOrigContr=" + premFrOrigContr + ", " +
               "nIncrInsuredDep=" + nIncrInsuredDep + ", " +
               "nReinsurPrem=" + nReinsurPrem + ", " +
               "nIncrDispTfa=" + nIncrDispTfa + ", " +
               "ifcCashIncr=" + ifcCashIncr + ", " +
               "nIncrDispFaas=" + nIncrDispFaas + ", " +
               "nIncrLoansOthBank=" + nIncrLoansOthBank + ", " +
               "nCapIncrRepur=" + nCapIncrRepur + ", " +
               "cFrOthOperateA=" + cFrOthOperateA + ", " +
               "cInfFrOperateA=" + cInfFrOperateA + ", " +
               "cPaidGoodsS=" + cPaidGoodsS + ", " +
               "cPaidToForEmpl=" + cPaidToForEmpl + ", " +
               "cPaidForTaxes=" + cPaidForTaxes + ", " +
               "nIncrCltLoanAdv=" + nIncrCltLoanAdv + ", " +
               "nIncrDepCbob=" + nIncrDepCbob + ", " +
               "cPayClaimsOrigInco=" + cPayClaimsOrigInco + ", " +
               "payHandlingChrg=" + payHandlingChrg + ", " +
               "payCommInsurPlcy=" + payCommInsurPlcy + ", " +
               "othCashPayOperAct=" + othCashPayOperAct + ", " +
               "stCashOutAct=" + stCashOutAct + ", " +
               "nCashflowAct=" + nCashflowAct + ", " +
               "othRecpRalInvAct=" + othRecpRalInvAct + ", " +
               "cDispWithdrwlInvest=" + cDispWithdrwlInvest + ", " +
               "cRecpReturnInvest=" + cRecpReturnInvest + ", " +
               "nRecpDispFiolta=" + nRecpDispFiolta + ", " +
               "nRecpDispSobu=" + nRecpDispSobu + ", " +
               "stotInflowsInvAct=" + stotInflowsInvAct + ", " +
               "cPayAcqConstFiolta=" + cPayAcqConstFiolta + ", " +
               "cPaidInvest=" + cPaidInvest + ", " +
               "nDispSubsOthBiz=" + nDispSubsOthBiz + ", " +
               "othPayRalInvAct=" + othPayRalInvAct + ", " +
               "nIncrPledgeLoan=" + nIncrPledgeLoan + ", " +
               "stotOutInvAct=" + stotOutInvAct + ", " +
               "nCashflowInvAct=" + nCashflowInvAct + ", " +
               "cRecpBorrow=" + cRecpBorrow + ", " +
               "procIssueBonds=" + procIssueBonds + ", " +
               "othCashRecpRalFncAct=" + othCashRecpRalFncAct + ", " +
               "stotCashInFncAct=" + stotCashInFncAct + ", " +
               "freeCashflow=" + freeCashflow + ", " +
               "cPrepayAmtBorr=" + cPrepayAmtBorr + ", " +
               "cPayDistDpcpIntExp=" + cPayDistDpcpIntExp + ", " +
               "inclDvdProfitPaidScMs=" + inclDvdProfitPaidScMs + ", " +
               "othCashpayRalFncAct=" + othCashpayRalFncAct + ", " +
               "stotCashoutFncAct=" + stotCashoutFncAct + ", " +
               "nCashFlowsFncAct=" + nCashFlowsFncAct + ", " +
               "effFxFluCash=" + effFxFluCash + ", " +
               "nIncrCashCashEqu=" + nIncrCashCashEqu + ", " +
               "cCashEquBegPeriod=" + cCashEquBegPeriod + ", " +
               "cCashEquEndPeriod=" + cCashEquEndPeriod + ", " +
               "cRecpCapContrib=" + cRecpCapContrib + ", " +
               "inclCashRecSaims=" + inclCashRecSaims + ", " +
               "unconInvestLoss=" + unconInvestLoss + ", " +
               "provDeprAssets=" + provDeprAssets + ", " +
               "deprFaCogaDpba=" + deprFaCogaDpba + ", " +
               "amortIntangAssets=" + amortIntangAssets + ", " +
               "ltAmortDeferredExp=" + ltAmortDeferredExp + ", " +
               "decrDeferredExp=" + decrDeferredExp + ", " +
               "incrAccExp=" + incrAccExp + ", " +
               "lossDispFiolta=" + lossDispFiolta + ", " +
               "lossScrFa=" + lossScrFa + ", " +
               "lossFvChg=" + lossFvChg + ", " +
               "investLoss=" + investLoss + ", " +
               "decrDefIncTaxAssets=" + decrDefIncTaxAssets + ", " +
               "incrDefIncTaxLiab=" + incrDefIncTaxLiab + ", " +
               "decrInventories=" + decrInventories + ", " +
               "decrOperPayable=" + decrOperPayable + ", " +
               "incrOperPayable=" + incrOperPayable + ", " +
               "others=" + others + ", " +
               "imNetCashflowOperAct=" + imNetCashflowOperAct + ", " +
               "convDebtIntoCap=" + convDebtIntoCap + ", " +
               "convCopbondsDueWithin1y=" + convCopbondsDueWithin1y + ", " +
               "faFncLeases=" + faFncLeases + ", " +
               "endBalCash=" + endBalCash + ", " +
               "begBalCash=" + begBalCash + ", " +
               "endBalCashEqu=" + endBalCashEqu + ", " +
               "begBalCashEqu=" + begBalCashEqu + ", " +
               "imNIncrCashEqu=" + imNIncrCashEqu + 
               "}";
    }
}