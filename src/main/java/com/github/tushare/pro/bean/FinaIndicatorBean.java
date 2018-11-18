package com.github.tushare.pro.bean;

/**
 * 财务指标数据
 */
public class FinaIndicatorBean {

    protected String tsCode;  // TS代码
    protected String annDate;  // 公告日期
    protected String endDate;  // 报告期
    protected Double eps;  // 基本每股收益
    protected Double dtEps;  // 稀释每股收益
    protected Double totalRevenuePs;  // 每股营业总收入
    protected Double revenuePs;  // 每股营业收入
    protected Double capitalResePs;  // 每股资本公积
    protected Double surplusResePs;  // 每股盈余公积
    protected Double undistProfitPs;  // 每股未分配利润
    protected Double extraItem;  // 非经常性损益
    protected Double profitDedt;  // 扣除非经常性损益后的净利润
    protected Double grossMargin;  // 毛利
    protected Double currentRatio;  // 流动比率
    protected Double quickRatio;  // 速动比率
    protected Double cashRatio;  // 保守速动比率
    protected Double invturnDays;  // 存货周转天数
    protected Double arturnDays;  // 应收账款周转天数
    protected Double invTurn;  // 存货周转率
    protected Double arTurn;  // 应收账款周转率
    protected Double caTurn;  // 流动资产周转率
    protected Double faTurn;  // 固定资产周转率
    protected Double assetsTurn;  // 总资产周转率
    protected Double opIncome;  // 经营活动净收益
    protected Double valuechangeIncome;  // 价值变动净收益
    protected Double interstIncome;  // 利息费用
    protected Double daa;  // 折旧与摊销
    protected Double ebit;  // 息税前利润
    protected Double ebitda;  // 息税折旧摊销前利润
    protected Double fcff;  // 企业自由现金流量
    protected Double fcfe;  // 股权自由现金流量
    protected Double currentExint;  // 无息流动负债
    protected Double noncurrentExint;  // 无息非流动负债
    protected Double interestdebt;  // 带息债务
    protected Double netdebt;  // 净债务
    protected Double tangibleAsset;  // 有形资产
    protected Double workingCapital;  // 营运资金
    protected Double networkingCapital;  // 营运流动资本
    protected Double investCapital;  // 全部投入资本
    protected Double retainedEarnings;  // 留存收益
    protected Double diluted2Eps;  // 期末摊薄每股收益
    protected Double bps;  // 每股净资产
    protected Double ocfps;  // 每股经营活动产生的现金流量净额
    protected Double retainedps;  // 每股留存收益
    protected Double cfps;  // 每股现金流量净额
    protected Double ebitPs;  // 每股息税前利润
    protected Double fcffPs;  // 每股企业自由现金流量
    protected Double fcfePs;  // 每股股东自由现金流量
    protected Double netprofitMargin;  // 销售净利率
    protected Double grossprofitMargin;  // 销售毛利率
    protected Double cogsOfSales;  // 销售成本率
    protected Double expenseOfSales;  // 销售期间费用率
    protected Double profitToGr;  // 净利润/营业总收入
    protected Double saleexpToGr;  // 销售费用/营业总收入
    protected Double adminexpOfGr;  // 管理费用/营业总收入
    protected Double finaexpOfGr;  // 财务费用/营业总收入
    protected Double impaiTtm;  // 资产减值损失/营业总收入
    protected Double gcOfGr;  // 营业总成本/营业总收入
    protected Double opOfGr;  // 营业利润/营业总收入
    protected Double ebitOfGr;  // 息税前利润/营业总收入
    protected Double roe;  // 净资产收益率
    protected Double roeWaa;  // 加权平均净资产收益率
    protected Double roeDt;  // 净资产收益率(扣除非经常损益)
    protected Double roa;  // 总资产报酬率
    protected Double npta;  // 总资产净利润
    protected Double roic;  // 投入资本回报率
    protected Double roeYearly;  // 年化净资产收益率
    protected Double roa2Yearly;  // 年化总资产报酬率
    protected Double roeAvg;  // 平均净资产收益率(增发条件)
    protected Double opincomeOfEbt;  // 经营活动净收益/利润总额
    protected Double investincomeOfEbt;  // 价值变动净收益/利润总额
    protected Double nOpProfitOfEbt;  // 营业外收支净额/利润总额
    protected Double taxToEbt;  // 所得税/利润总额
    protected Double dtprofitToProfit;  // 扣除非经常损益后的净利润/净利润
    protected Double salescashToOr;  // 销售商品提供劳务收到的现金/营业收入
    protected Double ocfToOr;  // 经营活动产生的现金流量净额/营业收入
    protected Double ocfToOpincome;  // 经营活动产生的现金流量净额/经营活动净收益
    protected Double capitalizedToDa;  // 资本支出/折旧和摊销
    protected Double debtToAssets;  // 资产负债率
    protected Double assetsToEqt;  // 权益乘数
    protected Double dpAssetsToEqt;  // 权益乘数(杜邦分析)
    protected Double caToAssets;  // 流动资产/总资产
    protected Double ncaToAssets;  // 非流动资产/总资产
    protected Double tbassetsToTotalassets;  // 有形资产/总资产
    protected Double intToTalcap;  // 带息债务/全部投入资本
    protected Double eqtToTalcapital;  // 归属于母公司的股东权益/全部投入资本
    protected Double currentdebtToDebt;  // 流动负债/负债合计
    protected Double longdebToDebt;  // 非流动负债/负债合计
    protected Double ocfToShortdebt;  // 经营活动产生的现金流量净额/流动负债
    protected Double debtToEqt;  // 产权比率
    protected Double eqtToDebt;  // 归属于母公司的股东权益/负债合计
    protected Double eqtToInterestdebt;  // 归属于母公司的股东权益/带息债务
    protected Double tangibleassetToDebt;  // 有形资产/负债合计
    protected Double tangassetToIntdebt;  // 有形资产/带息债务
    protected Double tangibleassetToNetdebt;  // 有形资产/净债务
    protected Double ocfToDebt;  // 经营活动产生的现金流量净额/负债合计
    protected Double ocfToInterestdebt;  // 经营活动产生的现金流量净额/带息债务
    protected Double ocfToNetdebt;  // 经营活动产生的现金流量净额/净债务
    protected Double ebitToInterest;  // 已获利息倍数(EBIT/利息费用)
    protected Double longdebtToWorkingcapital;  // 长期债务与营运资金比率
    protected Double ebitdaToDebt;  // 息税折旧摊销前利润/负债合计
    protected Double turnDays;  // 营业周期
    protected Double roaYearly;  // 年化总资产净利率
    protected Double roaDp;  // 总资产净利率(杜邦分析)
    protected Double fixedAssets;  // 固定资产合计
    protected Double profitPrefinExp;  // 扣除财务费用前营业利润
    protected Double nonOpProfit;  // 非营业利润
    protected Double opToEbt;  // 营业利润／利润总额
    protected Double nopToEbt;  // 非营业利润／利润总额
    protected Double ocfToProfit;  // 经营活动产生的现金流量净额／营业利润
    protected Double cashToLiqdebt;  // 货币资金／流动负债
    protected Double cashToLiqdebtWithinterest;  // 货币资金／带息流动负债
    protected Double opToLiqdebt;  // 营业利润／流动负债
    protected Double opToDebt;  // 营业利润／负债合计
    protected Double roicYearly;  // 年化投入资本回报率
    protected Double totalFaTrun;  // 固定资产合计周转率
    protected Double profitToOp;  // 利润总额／营业收入
    protected Double qOpincome;  // 经营活动单季度净收益
    protected Double qInvestincome;  // 价值变动单季度净收益
    protected Double qDtprofit;  // 扣除非经常损益后的单季度净利润
    protected Double qEps;  // 每股收益(单季度)
    protected Double qNetprofitMargin;  // 销售净利率(单季度)
    protected Double qGsprofitMargin;  // 销售毛利率(单季度)
    protected Double qExpToSales;  // 销售期间费用率(单季度)
    protected Double qProfitToGr;  // 净利润／营业总收入(单季度)
    protected Double qSaleexpToGr;  // 销售费用／营业总收入 (单季度)
    protected Double qAdminexpToGr;  // 管理费用／营业总收入 (单季度)
    protected Double qFinaexpToGr;  // 财务费用／营业总收入 (单季度)
    protected Double qImpairToGrTtm;  // 资产减值损失／营业总收入(单季度)
    protected Double qGcToGr;  // 营业总成本／营业总收入 (单季度)
    protected Double qOpToGr;  // 营业利润／营业总收入(单季度)
    protected Double qRoe;  // 净资产收益率(单季度)
    protected Double qDtRoe;  // 净资产单季度收益率(扣除非经常损益)
    protected Double qNpta;  // 总资产净利润(单季度)
    protected Double qOpincomeToEbt;  // 经营活动净收益／利润总额(单季度)
    protected Double qInvestincomeToEbt;  // 价值变动净收益／利润总额(单季度)
    protected Double qDtprofitToProfit;  // 扣除非经常损益后的净利润／净利润(单季度)
    protected Double qSalescashToOr;  // 销售商品提供劳务收到的现金／营业收入(单季度)
    protected Double qOcfToSales;  // 经营活动产生的现金流量净额／营业收入(单季度)
    protected Double qOcfToOr;  // 经营活动产生的现金流量净额／经营活动净收益(单季度)
    protected Double basicEpsYoy;  // 基本每股收益同比增长率(%)
    protected Double dtEpsYoy;  // 稀释每股收益同比增长率(%)
    protected Double cfpsYoy;  // 每股经营活动产生的现金流量净额同比增长率(%)
    protected Double opYoy;  // 营业利润同比增长率(%)
    protected Double ebtYoy;  // 利润总额同比增长率(%)
    protected Double netprofitYoy;  // 归属母公司股东的净利润同比增长率(%)
    protected Double dtNetprofitYoy;  // 归属母公司股东的净利润-扣除非经常损益同比增长率(%)
    protected Double ocfYoy;  // 经营活动产生的现金流量净额同比增长率(%)
    protected Double roeYoy;  // 净资产收益率(摊薄)同比增长率(%)
    protected Double bpsYoy;  // 每股净资产相对年初增长率(%)
    protected Double assetsYoy;  // 资产总计相对年初增长率(%)
    protected Double eqtYoy;  // 归属母公司的股东权益相对年初增长率(%)
    protected Double trYoy;  // 营业总收入同比增长率(%)
    protected Double orYoy;  // 营业收入同比增长率(%)
    protected Double qGrYoy;  // 营业总收入同比增长率(%)(单季度)
    protected Double qGrQoq;  // 营业总收入环比增长率(%)(单季度)
    protected Double qSalesYoy;  // 营业收入同比增长率(%)(单季度)
    protected Double qSalesQoq;  // 营业收入环比增长率(%)(单季度)
    protected Double qOpYoy;  // 营业利润同比增长率(%)(单季度)
    protected Double qOpQoq;  // 营业利润环比增长率(%)(单季度)
    protected Double qProfitYoy;  // 净利润同比增长率(%)(单季度)
    protected Double qProfitQoq;  // 净利润环比增长率(%)(单季度)
    protected Double qNetprofitYoy;  // 归属母公司股东的净利润同比增长率(%)(单季度)
    protected Double qNetprofitQoq;  // 归属母公司股东的净利润环比增长率(%)(单季度)
    protected Double equityYoy;  // 净资产同比增长率
    protected Double rdExp;  // 研发费用

    public String getTsCode() {
        return tsCode;
    }

    public FinaIndicatorBean setTsCode(String tsCode) {
        this.tsCode = tsCode;
        return this;
    }

    public String getAnnDate() {
        return annDate;
    }

    public FinaIndicatorBean setAnnDate(String annDate) {
        this.annDate = annDate;
        return this;
    }

    public String getEndDate() {
        return endDate;
    }

    public FinaIndicatorBean setEndDate(String endDate) {
        this.endDate = endDate;
        return this;
    }

    public Double getEps() {
        return eps;
    }

    public FinaIndicatorBean setEps(Double eps) {
        this.eps = eps;
        return this;
    }

    public Double getDtEps() {
        return dtEps;
    }

    public FinaIndicatorBean setDtEps(Double dtEps) {
        this.dtEps = dtEps;
        return this;
    }

    public Double getTotalRevenuePs() {
        return totalRevenuePs;
    }

    public FinaIndicatorBean setTotalRevenuePs(Double totalRevenuePs) {
        this.totalRevenuePs = totalRevenuePs;
        return this;
    }

    public Double getRevenuePs() {
        return revenuePs;
    }

    public FinaIndicatorBean setRevenuePs(Double revenuePs) {
        this.revenuePs = revenuePs;
        return this;
    }

    public Double getCapitalResePs() {
        return capitalResePs;
    }

    public FinaIndicatorBean setCapitalResePs(Double capitalResePs) {
        this.capitalResePs = capitalResePs;
        return this;
    }

    public Double getSurplusResePs() {
        return surplusResePs;
    }

    public FinaIndicatorBean setSurplusResePs(Double surplusResePs) {
        this.surplusResePs = surplusResePs;
        return this;
    }

    public Double getUndistProfitPs() {
        return undistProfitPs;
    }

    public FinaIndicatorBean setUndistProfitPs(Double undistProfitPs) {
        this.undistProfitPs = undistProfitPs;
        return this;
    }

    public Double getExtraItem() {
        return extraItem;
    }

    public FinaIndicatorBean setExtraItem(Double extraItem) {
        this.extraItem = extraItem;
        return this;
    }

    public Double getProfitDedt() {
        return profitDedt;
    }

    public FinaIndicatorBean setProfitDedt(Double profitDedt) {
        this.profitDedt = profitDedt;
        return this;
    }

    public Double getGrossMargin() {
        return grossMargin;
    }

    public FinaIndicatorBean setGrossMargin(Double grossMargin) {
        this.grossMargin = grossMargin;
        return this;
    }

    public Double getCurrentRatio() {
        return currentRatio;
    }

    public FinaIndicatorBean setCurrentRatio(Double currentRatio) {
        this.currentRatio = currentRatio;
        return this;
    }

    public Double getQuickRatio() {
        return quickRatio;
    }

    public FinaIndicatorBean setQuickRatio(Double quickRatio) {
        this.quickRatio = quickRatio;
        return this;
    }

    public Double getCashRatio() {
        return cashRatio;
    }

    public FinaIndicatorBean setCashRatio(Double cashRatio) {
        this.cashRatio = cashRatio;
        return this;
    }

    public Double getInvturnDays() {
        return invturnDays;
    }

    public FinaIndicatorBean setInvturnDays(Double invturnDays) {
        this.invturnDays = invturnDays;
        return this;
    }

    public Double getArturnDays() {
        return arturnDays;
    }

    public FinaIndicatorBean setArturnDays(Double arturnDays) {
        this.arturnDays = arturnDays;
        return this;
    }

    public Double getInvTurn() {
        return invTurn;
    }

    public FinaIndicatorBean setInvTurn(Double invTurn) {
        this.invTurn = invTurn;
        return this;
    }

    public Double getArTurn() {
        return arTurn;
    }

    public FinaIndicatorBean setArTurn(Double arTurn) {
        this.arTurn = arTurn;
        return this;
    }

    public Double getCaTurn() {
        return caTurn;
    }

    public FinaIndicatorBean setCaTurn(Double caTurn) {
        this.caTurn = caTurn;
        return this;
    }

    public Double getFaTurn() {
        return faTurn;
    }

    public FinaIndicatorBean setFaTurn(Double faTurn) {
        this.faTurn = faTurn;
        return this;
    }

    public Double getAssetsTurn() {
        return assetsTurn;
    }

    public FinaIndicatorBean setAssetsTurn(Double assetsTurn) {
        this.assetsTurn = assetsTurn;
        return this;
    }

    public Double getOpIncome() {
        return opIncome;
    }

    public FinaIndicatorBean setOpIncome(Double opIncome) {
        this.opIncome = opIncome;
        return this;
    }

    public Double getValuechangeIncome() {
        return valuechangeIncome;
    }

    public FinaIndicatorBean setValuechangeIncome(Double valuechangeIncome) {
        this.valuechangeIncome = valuechangeIncome;
        return this;
    }

    public Double getInterstIncome() {
        return interstIncome;
    }

    public FinaIndicatorBean setInterstIncome(Double interstIncome) {
        this.interstIncome = interstIncome;
        return this;
    }

    public Double getDaa() {
        return daa;
    }

    public FinaIndicatorBean setDaa(Double daa) {
        this.daa = daa;
        return this;
    }

    public Double getEbit() {
        return ebit;
    }

    public FinaIndicatorBean setEbit(Double ebit) {
        this.ebit = ebit;
        return this;
    }

    public Double getEbitda() {
        return ebitda;
    }

    public FinaIndicatorBean setEbitda(Double ebitda) {
        this.ebitda = ebitda;
        return this;
    }

    public Double getFcff() {
        return fcff;
    }

    public FinaIndicatorBean setFcff(Double fcff) {
        this.fcff = fcff;
        return this;
    }

    public Double getFcfe() {
        return fcfe;
    }

    public FinaIndicatorBean setFcfe(Double fcfe) {
        this.fcfe = fcfe;
        return this;
    }

    public Double getCurrentExint() {
        return currentExint;
    }

    public FinaIndicatorBean setCurrentExint(Double currentExint) {
        this.currentExint = currentExint;
        return this;
    }

    public Double getNoncurrentExint() {
        return noncurrentExint;
    }

    public FinaIndicatorBean setNoncurrentExint(Double noncurrentExint) {
        this.noncurrentExint = noncurrentExint;
        return this;
    }

    public Double getInterestdebt() {
        return interestdebt;
    }

    public FinaIndicatorBean setInterestdebt(Double interestdebt) {
        this.interestdebt = interestdebt;
        return this;
    }

    public Double getNetdebt() {
        return netdebt;
    }

    public FinaIndicatorBean setNetdebt(Double netdebt) {
        this.netdebt = netdebt;
        return this;
    }

    public Double getTangibleAsset() {
        return tangibleAsset;
    }

    public FinaIndicatorBean setTangibleAsset(Double tangibleAsset) {
        this.tangibleAsset = tangibleAsset;
        return this;
    }

    public Double getWorkingCapital() {
        return workingCapital;
    }

    public FinaIndicatorBean setWorkingCapital(Double workingCapital) {
        this.workingCapital = workingCapital;
        return this;
    }

    public Double getNetworkingCapital() {
        return networkingCapital;
    }

    public FinaIndicatorBean setNetworkingCapital(Double networkingCapital) {
        this.networkingCapital = networkingCapital;
        return this;
    }

    public Double getInvestCapital() {
        return investCapital;
    }

    public FinaIndicatorBean setInvestCapital(Double investCapital) {
        this.investCapital = investCapital;
        return this;
    }

    public Double getRetainedEarnings() {
        return retainedEarnings;
    }

    public FinaIndicatorBean setRetainedEarnings(Double retainedEarnings) {
        this.retainedEarnings = retainedEarnings;
        return this;
    }

    public Double getDiluted2Eps() {
        return diluted2Eps;
    }

    public FinaIndicatorBean setDiluted2Eps(Double diluted2Eps) {
        this.diluted2Eps = diluted2Eps;
        return this;
    }

    public Double getBps() {
        return bps;
    }

    public FinaIndicatorBean setBps(Double bps) {
        this.bps = bps;
        return this;
    }

    public Double getOcfps() {
        return ocfps;
    }

    public FinaIndicatorBean setOcfps(Double ocfps) {
        this.ocfps = ocfps;
        return this;
    }

    public Double getRetainedps() {
        return retainedps;
    }

    public FinaIndicatorBean setRetainedps(Double retainedps) {
        this.retainedps = retainedps;
        return this;
    }

    public Double getCfps() {
        return cfps;
    }

    public FinaIndicatorBean setCfps(Double cfps) {
        this.cfps = cfps;
        return this;
    }

    public Double getEbitPs() {
        return ebitPs;
    }

    public FinaIndicatorBean setEbitPs(Double ebitPs) {
        this.ebitPs = ebitPs;
        return this;
    }

    public Double getFcffPs() {
        return fcffPs;
    }

    public FinaIndicatorBean setFcffPs(Double fcffPs) {
        this.fcffPs = fcffPs;
        return this;
    }

    public Double getFcfePs() {
        return fcfePs;
    }

    public FinaIndicatorBean setFcfePs(Double fcfePs) {
        this.fcfePs = fcfePs;
        return this;
    }

    public Double getNetprofitMargin() {
        return netprofitMargin;
    }

    public FinaIndicatorBean setNetprofitMargin(Double netprofitMargin) {
        this.netprofitMargin = netprofitMargin;
        return this;
    }

    public Double getGrossprofitMargin() {
        return grossprofitMargin;
    }

    public FinaIndicatorBean setGrossprofitMargin(Double grossprofitMargin) {
        this.grossprofitMargin = grossprofitMargin;
        return this;
    }

    public Double getCogsOfSales() {
        return cogsOfSales;
    }

    public FinaIndicatorBean setCogsOfSales(Double cogsOfSales) {
        this.cogsOfSales = cogsOfSales;
        return this;
    }

    public Double getExpenseOfSales() {
        return expenseOfSales;
    }

    public FinaIndicatorBean setExpenseOfSales(Double expenseOfSales) {
        this.expenseOfSales = expenseOfSales;
        return this;
    }

    public Double getProfitToGr() {
        return profitToGr;
    }

    public FinaIndicatorBean setProfitToGr(Double profitToGr) {
        this.profitToGr = profitToGr;
        return this;
    }

    public Double getSaleexpToGr() {
        return saleexpToGr;
    }

    public FinaIndicatorBean setSaleexpToGr(Double saleexpToGr) {
        this.saleexpToGr = saleexpToGr;
        return this;
    }

    public Double getAdminexpOfGr() {
        return adminexpOfGr;
    }

    public FinaIndicatorBean setAdminexpOfGr(Double adminexpOfGr) {
        this.adminexpOfGr = adminexpOfGr;
        return this;
    }

    public Double getFinaexpOfGr() {
        return finaexpOfGr;
    }

    public FinaIndicatorBean setFinaexpOfGr(Double finaexpOfGr) {
        this.finaexpOfGr = finaexpOfGr;
        return this;
    }

    public Double getImpaiTtm() {
        return impaiTtm;
    }

    public FinaIndicatorBean setImpaiTtm(Double impaiTtm) {
        this.impaiTtm = impaiTtm;
        return this;
    }

    public Double getGcOfGr() {
        return gcOfGr;
    }

    public FinaIndicatorBean setGcOfGr(Double gcOfGr) {
        this.gcOfGr = gcOfGr;
        return this;
    }

    public Double getOpOfGr() {
        return opOfGr;
    }

    public FinaIndicatorBean setOpOfGr(Double opOfGr) {
        this.opOfGr = opOfGr;
        return this;
    }

    public Double getEbitOfGr() {
        return ebitOfGr;
    }

    public FinaIndicatorBean setEbitOfGr(Double ebitOfGr) {
        this.ebitOfGr = ebitOfGr;
        return this;
    }

    public Double getRoe() {
        return roe;
    }

    public FinaIndicatorBean setRoe(Double roe) {
        this.roe = roe;
        return this;
    }

    public Double getRoeWaa() {
        return roeWaa;
    }

    public FinaIndicatorBean setRoeWaa(Double roeWaa) {
        this.roeWaa = roeWaa;
        return this;
    }

    public Double getRoeDt() {
        return roeDt;
    }

    public FinaIndicatorBean setRoeDt(Double roeDt) {
        this.roeDt = roeDt;
        return this;
    }

    public Double getRoa() {
        return roa;
    }

    public FinaIndicatorBean setRoa(Double roa) {
        this.roa = roa;
        return this;
    }

    public Double getNpta() {
        return npta;
    }

    public FinaIndicatorBean setNpta(Double npta) {
        this.npta = npta;
        return this;
    }

    public Double getRoic() {
        return roic;
    }

    public FinaIndicatorBean setRoic(Double roic) {
        this.roic = roic;
        return this;
    }

    public Double getRoeYearly() {
        return roeYearly;
    }

    public FinaIndicatorBean setRoeYearly(Double roeYearly) {
        this.roeYearly = roeYearly;
        return this;
    }

    public Double getRoa2Yearly() {
        return roa2Yearly;
    }

    public FinaIndicatorBean setRoa2Yearly(Double roa2Yearly) {
        this.roa2Yearly = roa2Yearly;
        return this;
    }

    public Double getRoeAvg() {
        return roeAvg;
    }

    public FinaIndicatorBean setRoeAvg(Double roeAvg) {
        this.roeAvg = roeAvg;
        return this;
    }

    public Double getOpincomeOfEbt() {
        return opincomeOfEbt;
    }

    public FinaIndicatorBean setOpincomeOfEbt(Double opincomeOfEbt) {
        this.opincomeOfEbt = opincomeOfEbt;
        return this;
    }

    public Double getInvestincomeOfEbt() {
        return investincomeOfEbt;
    }

    public FinaIndicatorBean setInvestincomeOfEbt(Double investincomeOfEbt) {
        this.investincomeOfEbt = investincomeOfEbt;
        return this;
    }

    public Double getNOpProfitOfEbt() {
        return nOpProfitOfEbt;
    }

    public FinaIndicatorBean setNOpProfitOfEbt(Double nOpProfitOfEbt) {
        this.nOpProfitOfEbt = nOpProfitOfEbt;
        return this;
    }

    public Double getTaxToEbt() {
        return taxToEbt;
    }

    public FinaIndicatorBean setTaxToEbt(Double taxToEbt) {
        this.taxToEbt = taxToEbt;
        return this;
    }

    public Double getDtprofitToProfit() {
        return dtprofitToProfit;
    }

    public FinaIndicatorBean setDtprofitToProfit(Double dtprofitToProfit) {
        this.dtprofitToProfit = dtprofitToProfit;
        return this;
    }

    public Double getSalescashToOr() {
        return salescashToOr;
    }

    public FinaIndicatorBean setSalescashToOr(Double salescashToOr) {
        this.salescashToOr = salescashToOr;
        return this;
    }

    public Double getOcfToOr() {
        return ocfToOr;
    }

    public FinaIndicatorBean setOcfToOr(Double ocfToOr) {
        this.ocfToOr = ocfToOr;
        return this;
    }

    public Double getOcfToOpincome() {
        return ocfToOpincome;
    }

    public FinaIndicatorBean setOcfToOpincome(Double ocfToOpincome) {
        this.ocfToOpincome = ocfToOpincome;
        return this;
    }

    public Double getCapitalizedToDa() {
        return capitalizedToDa;
    }

    public FinaIndicatorBean setCapitalizedToDa(Double capitalizedToDa) {
        this.capitalizedToDa = capitalizedToDa;
        return this;
    }

    public Double getDebtToAssets() {
        return debtToAssets;
    }

    public FinaIndicatorBean setDebtToAssets(Double debtToAssets) {
        this.debtToAssets = debtToAssets;
        return this;
    }

    public Double getAssetsToEqt() {
        return assetsToEqt;
    }

    public FinaIndicatorBean setAssetsToEqt(Double assetsToEqt) {
        this.assetsToEqt = assetsToEqt;
        return this;
    }

    public Double getDpAssetsToEqt() {
        return dpAssetsToEqt;
    }

    public FinaIndicatorBean setDpAssetsToEqt(Double dpAssetsToEqt) {
        this.dpAssetsToEqt = dpAssetsToEqt;
        return this;
    }

    public Double getCaToAssets() {
        return caToAssets;
    }

    public FinaIndicatorBean setCaToAssets(Double caToAssets) {
        this.caToAssets = caToAssets;
        return this;
    }

    public Double getNcaToAssets() {
        return ncaToAssets;
    }

    public FinaIndicatorBean setNcaToAssets(Double ncaToAssets) {
        this.ncaToAssets = ncaToAssets;
        return this;
    }

    public Double getTbassetsToTotalassets() {
        return tbassetsToTotalassets;
    }

    public FinaIndicatorBean setTbassetsToTotalassets(Double tbassetsToTotalassets) {
        this.tbassetsToTotalassets = tbassetsToTotalassets;
        return this;
    }

    public Double getIntToTalcap() {
        return intToTalcap;
    }

    public FinaIndicatorBean setIntToTalcap(Double intToTalcap) {
        this.intToTalcap = intToTalcap;
        return this;
    }

    public Double getEqtToTalcapital() {
        return eqtToTalcapital;
    }

    public FinaIndicatorBean setEqtToTalcapital(Double eqtToTalcapital) {
        this.eqtToTalcapital = eqtToTalcapital;
        return this;
    }

    public Double getCurrentdebtToDebt() {
        return currentdebtToDebt;
    }

    public FinaIndicatorBean setCurrentdebtToDebt(Double currentdebtToDebt) {
        this.currentdebtToDebt = currentdebtToDebt;
        return this;
    }

    public Double getLongdebToDebt() {
        return longdebToDebt;
    }

    public FinaIndicatorBean setLongdebToDebt(Double longdebToDebt) {
        this.longdebToDebt = longdebToDebt;
        return this;
    }

    public Double getOcfToShortdebt() {
        return ocfToShortdebt;
    }

    public FinaIndicatorBean setOcfToShortdebt(Double ocfToShortdebt) {
        this.ocfToShortdebt = ocfToShortdebt;
        return this;
    }

    public Double getDebtToEqt() {
        return debtToEqt;
    }

    public FinaIndicatorBean setDebtToEqt(Double debtToEqt) {
        this.debtToEqt = debtToEqt;
        return this;
    }

    public Double getEqtToDebt() {
        return eqtToDebt;
    }

    public FinaIndicatorBean setEqtToDebt(Double eqtToDebt) {
        this.eqtToDebt = eqtToDebt;
        return this;
    }

    public Double getEqtToInterestdebt() {
        return eqtToInterestdebt;
    }

    public FinaIndicatorBean setEqtToInterestdebt(Double eqtToInterestdebt) {
        this.eqtToInterestdebt = eqtToInterestdebt;
        return this;
    }

    public Double getTangibleassetToDebt() {
        return tangibleassetToDebt;
    }

    public FinaIndicatorBean setTangibleassetToDebt(Double tangibleassetToDebt) {
        this.tangibleassetToDebt = tangibleassetToDebt;
        return this;
    }

    public Double getTangassetToIntdebt() {
        return tangassetToIntdebt;
    }

    public FinaIndicatorBean setTangassetToIntdebt(Double tangassetToIntdebt) {
        this.tangassetToIntdebt = tangassetToIntdebt;
        return this;
    }

    public Double getTangibleassetToNetdebt() {
        return tangibleassetToNetdebt;
    }

    public FinaIndicatorBean setTangibleassetToNetdebt(Double tangibleassetToNetdebt) {
        this.tangibleassetToNetdebt = tangibleassetToNetdebt;
        return this;
    }

    public Double getOcfToDebt() {
        return ocfToDebt;
    }

    public FinaIndicatorBean setOcfToDebt(Double ocfToDebt) {
        this.ocfToDebt = ocfToDebt;
        return this;
    }

    public Double getOcfToInterestdebt() {
        return ocfToInterestdebt;
    }

    public FinaIndicatorBean setOcfToInterestdebt(Double ocfToInterestdebt) {
        this.ocfToInterestdebt = ocfToInterestdebt;
        return this;
    }

    public Double getOcfToNetdebt() {
        return ocfToNetdebt;
    }

    public FinaIndicatorBean setOcfToNetdebt(Double ocfToNetdebt) {
        this.ocfToNetdebt = ocfToNetdebt;
        return this;
    }

    public Double getEbitToInterest() {
        return ebitToInterest;
    }

    public FinaIndicatorBean setEbitToInterest(Double ebitToInterest) {
        this.ebitToInterest = ebitToInterest;
        return this;
    }

    public Double getLongdebtToWorkingcapital() {
        return longdebtToWorkingcapital;
    }

    public FinaIndicatorBean setLongdebtToWorkingcapital(Double longdebtToWorkingcapital) {
        this.longdebtToWorkingcapital = longdebtToWorkingcapital;
        return this;
    }

    public Double getEbitdaToDebt() {
        return ebitdaToDebt;
    }

    public FinaIndicatorBean setEbitdaToDebt(Double ebitdaToDebt) {
        this.ebitdaToDebt = ebitdaToDebt;
        return this;
    }

    public Double getTurnDays() {
        return turnDays;
    }

    public FinaIndicatorBean setTurnDays(Double turnDays) {
        this.turnDays = turnDays;
        return this;
    }

    public Double getRoaYearly() {
        return roaYearly;
    }

    public FinaIndicatorBean setRoaYearly(Double roaYearly) {
        this.roaYearly = roaYearly;
        return this;
    }

    public Double getRoaDp() {
        return roaDp;
    }

    public FinaIndicatorBean setRoaDp(Double roaDp) {
        this.roaDp = roaDp;
        return this;
    }

    public Double getFixedAssets() {
        return fixedAssets;
    }

    public FinaIndicatorBean setFixedAssets(Double fixedAssets) {
        this.fixedAssets = fixedAssets;
        return this;
    }

    public Double getProfitPrefinExp() {
        return profitPrefinExp;
    }

    public FinaIndicatorBean setProfitPrefinExp(Double profitPrefinExp) {
        this.profitPrefinExp = profitPrefinExp;
        return this;
    }

    public Double getNonOpProfit() {
        return nonOpProfit;
    }

    public FinaIndicatorBean setNonOpProfit(Double nonOpProfit) {
        this.nonOpProfit = nonOpProfit;
        return this;
    }

    public Double getOpToEbt() {
        return opToEbt;
    }

    public FinaIndicatorBean setOpToEbt(Double opToEbt) {
        this.opToEbt = opToEbt;
        return this;
    }

    public Double getNopToEbt() {
        return nopToEbt;
    }

    public FinaIndicatorBean setNopToEbt(Double nopToEbt) {
        this.nopToEbt = nopToEbt;
        return this;
    }

    public Double getOcfToProfit() {
        return ocfToProfit;
    }

    public FinaIndicatorBean setOcfToProfit(Double ocfToProfit) {
        this.ocfToProfit = ocfToProfit;
        return this;
    }

    public Double getCashToLiqdebt() {
        return cashToLiqdebt;
    }

    public FinaIndicatorBean setCashToLiqdebt(Double cashToLiqdebt) {
        this.cashToLiqdebt = cashToLiqdebt;
        return this;
    }

    public Double getCashToLiqdebtWithinterest() {
        return cashToLiqdebtWithinterest;
    }

    public FinaIndicatorBean setCashToLiqdebtWithinterest(Double cashToLiqdebtWithinterest) {
        this.cashToLiqdebtWithinterest = cashToLiqdebtWithinterest;
        return this;
    }

    public Double getOpToLiqdebt() {
        return opToLiqdebt;
    }

    public FinaIndicatorBean setOpToLiqdebt(Double opToLiqdebt) {
        this.opToLiqdebt = opToLiqdebt;
        return this;
    }

    public Double getOpToDebt() {
        return opToDebt;
    }

    public FinaIndicatorBean setOpToDebt(Double opToDebt) {
        this.opToDebt = opToDebt;
        return this;
    }

    public Double getRoicYearly() {
        return roicYearly;
    }

    public FinaIndicatorBean setRoicYearly(Double roicYearly) {
        this.roicYearly = roicYearly;
        return this;
    }

    public Double getTotalFaTrun() {
        return totalFaTrun;
    }

    public FinaIndicatorBean setTotalFaTrun(Double totalFaTrun) {
        this.totalFaTrun = totalFaTrun;
        return this;
    }

    public Double getProfitToOp() {
        return profitToOp;
    }

    public FinaIndicatorBean setProfitToOp(Double profitToOp) {
        this.profitToOp = profitToOp;
        return this;
    }

    public Double getQOpincome() {
        return qOpincome;
    }

    public FinaIndicatorBean setQOpincome(Double qOpincome) {
        this.qOpincome = qOpincome;
        return this;
    }

    public Double getQInvestincome() {
        return qInvestincome;
    }

    public FinaIndicatorBean setQInvestincome(Double qInvestincome) {
        this.qInvestincome = qInvestincome;
        return this;
    }

    public Double getQDtprofit() {
        return qDtprofit;
    }

    public FinaIndicatorBean setQDtprofit(Double qDtprofit) {
        this.qDtprofit = qDtprofit;
        return this;
    }

    public Double getQEps() {
        return qEps;
    }

    public FinaIndicatorBean setQEps(Double qEps) {
        this.qEps = qEps;
        return this;
    }

    public Double getQNetprofitMargin() {
        return qNetprofitMargin;
    }

    public FinaIndicatorBean setQNetprofitMargin(Double qNetprofitMargin) {
        this.qNetprofitMargin = qNetprofitMargin;
        return this;
    }

    public Double getQGsprofitMargin() {
        return qGsprofitMargin;
    }

    public FinaIndicatorBean setQGsprofitMargin(Double qGsprofitMargin) {
        this.qGsprofitMargin = qGsprofitMargin;
        return this;
    }

    public Double getQExpToSales() {
        return qExpToSales;
    }

    public FinaIndicatorBean setQExpToSales(Double qExpToSales) {
        this.qExpToSales = qExpToSales;
        return this;
    }

    public Double getQProfitToGr() {
        return qProfitToGr;
    }

    public FinaIndicatorBean setQProfitToGr(Double qProfitToGr) {
        this.qProfitToGr = qProfitToGr;
        return this;
    }

    public Double getQSaleexpToGr() {
        return qSaleexpToGr;
    }

    public FinaIndicatorBean setQSaleexpToGr(Double qSaleexpToGr) {
        this.qSaleexpToGr = qSaleexpToGr;
        return this;
    }

    public Double getQAdminexpToGr() {
        return qAdminexpToGr;
    }

    public FinaIndicatorBean setQAdminexpToGr(Double qAdminexpToGr) {
        this.qAdminexpToGr = qAdminexpToGr;
        return this;
    }

    public Double getQFinaexpToGr() {
        return qFinaexpToGr;
    }

    public FinaIndicatorBean setQFinaexpToGr(Double qFinaexpToGr) {
        this.qFinaexpToGr = qFinaexpToGr;
        return this;
    }

    public Double getQImpairToGrTtm() {
        return qImpairToGrTtm;
    }

    public FinaIndicatorBean setQImpairToGrTtm(Double qImpairToGrTtm) {
        this.qImpairToGrTtm = qImpairToGrTtm;
        return this;
    }

    public Double getQGcToGr() {
        return qGcToGr;
    }

    public FinaIndicatorBean setQGcToGr(Double qGcToGr) {
        this.qGcToGr = qGcToGr;
        return this;
    }

    public Double getQOpToGr() {
        return qOpToGr;
    }

    public FinaIndicatorBean setQOpToGr(Double qOpToGr) {
        this.qOpToGr = qOpToGr;
        return this;
    }

    public Double getQRoe() {
        return qRoe;
    }

    public FinaIndicatorBean setQRoe(Double qRoe) {
        this.qRoe = qRoe;
        return this;
    }

    public Double getQDtRoe() {
        return qDtRoe;
    }

    public FinaIndicatorBean setQDtRoe(Double qDtRoe) {
        this.qDtRoe = qDtRoe;
        return this;
    }

    public Double getQNpta() {
        return qNpta;
    }

    public FinaIndicatorBean setQNpta(Double qNpta) {
        this.qNpta = qNpta;
        return this;
    }

    public Double getQOpincomeToEbt() {
        return qOpincomeToEbt;
    }

    public FinaIndicatorBean setQOpincomeToEbt(Double qOpincomeToEbt) {
        this.qOpincomeToEbt = qOpincomeToEbt;
        return this;
    }

    public Double getQInvestincomeToEbt() {
        return qInvestincomeToEbt;
    }

    public FinaIndicatorBean setQInvestincomeToEbt(Double qInvestincomeToEbt) {
        this.qInvestincomeToEbt = qInvestincomeToEbt;
        return this;
    }

    public Double getQDtprofitToProfit() {
        return qDtprofitToProfit;
    }

    public FinaIndicatorBean setQDtprofitToProfit(Double qDtprofitToProfit) {
        this.qDtprofitToProfit = qDtprofitToProfit;
        return this;
    }

    public Double getQSalescashToOr() {
        return qSalescashToOr;
    }

    public FinaIndicatorBean setQSalescashToOr(Double qSalescashToOr) {
        this.qSalescashToOr = qSalescashToOr;
        return this;
    }

    public Double getQOcfToSales() {
        return qOcfToSales;
    }

    public FinaIndicatorBean setQOcfToSales(Double qOcfToSales) {
        this.qOcfToSales = qOcfToSales;
        return this;
    }

    public Double getQOcfToOr() {
        return qOcfToOr;
    }

    public FinaIndicatorBean setQOcfToOr(Double qOcfToOr) {
        this.qOcfToOr = qOcfToOr;
        return this;
    }

    public Double getBasicEpsYoy() {
        return basicEpsYoy;
    }

    public FinaIndicatorBean setBasicEpsYoy(Double basicEpsYoy) {
        this.basicEpsYoy = basicEpsYoy;
        return this;
    }

    public Double getDtEpsYoy() {
        return dtEpsYoy;
    }

    public FinaIndicatorBean setDtEpsYoy(Double dtEpsYoy) {
        this.dtEpsYoy = dtEpsYoy;
        return this;
    }

    public Double getCfpsYoy() {
        return cfpsYoy;
    }

    public FinaIndicatorBean setCfpsYoy(Double cfpsYoy) {
        this.cfpsYoy = cfpsYoy;
        return this;
    }

    public Double getOpYoy() {
        return opYoy;
    }

    public FinaIndicatorBean setOpYoy(Double opYoy) {
        this.opYoy = opYoy;
        return this;
    }

    public Double getEbtYoy() {
        return ebtYoy;
    }

    public FinaIndicatorBean setEbtYoy(Double ebtYoy) {
        this.ebtYoy = ebtYoy;
        return this;
    }

    public Double getNetprofitYoy() {
        return netprofitYoy;
    }

    public FinaIndicatorBean setNetprofitYoy(Double netprofitYoy) {
        this.netprofitYoy = netprofitYoy;
        return this;
    }

    public Double getDtNetprofitYoy() {
        return dtNetprofitYoy;
    }

    public FinaIndicatorBean setDtNetprofitYoy(Double dtNetprofitYoy) {
        this.dtNetprofitYoy = dtNetprofitYoy;
        return this;
    }

    public Double getOcfYoy() {
        return ocfYoy;
    }

    public FinaIndicatorBean setOcfYoy(Double ocfYoy) {
        this.ocfYoy = ocfYoy;
        return this;
    }

    public Double getRoeYoy() {
        return roeYoy;
    }

    public FinaIndicatorBean setRoeYoy(Double roeYoy) {
        this.roeYoy = roeYoy;
        return this;
    }

    public Double getBpsYoy() {
        return bpsYoy;
    }

    public FinaIndicatorBean setBpsYoy(Double bpsYoy) {
        this.bpsYoy = bpsYoy;
        return this;
    }

    public Double getAssetsYoy() {
        return assetsYoy;
    }

    public FinaIndicatorBean setAssetsYoy(Double assetsYoy) {
        this.assetsYoy = assetsYoy;
        return this;
    }

    public Double getEqtYoy() {
        return eqtYoy;
    }

    public FinaIndicatorBean setEqtYoy(Double eqtYoy) {
        this.eqtYoy = eqtYoy;
        return this;
    }

    public Double getTrYoy() {
        return trYoy;
    }

    public FinaIndicatorBean setTrYoy(Double trYoy) {
        this.trYoy = trYoy;
        return this;
    }

    public Double getOrYoy() {
        return orYoy;
    }

    public FinaIndicatorBean setOrYoy(Double orYoy) {
        this.orYoy = orYoy;
        return this;
    }

    public Double getQGrYoy() {
        return qGrYoy;
    }

    public FinaIndicatorBean setQGrYoy(Double qGrYoy) {
        this.qGrYoy = qGrYoy;
        return this;
    }

    public Double getQGrQoq() {
        return qGrQoq;
    }

    public FinaIndicatorBean setQGrQoq(Double qGrQoq) {
        this.qGrQoq = qGrQoq;
        return this;
    }

    public Double getQSalesYoy() {
        return qSalesYoy;
    }

    public FinaIndicatorBean setQSalesYoy(Double qSalesYoy) {
        this.qSalesYoy = qSalesYoy;
        return this;
    }

    public Double getQSalesQoq() {
        return qSalesQoq;
    }

    public FinaIndicatorBean setQSalesQoq(Double qSalesQoq) {
        this.qSalesQoq = qSalesQoq;
        return this;
    }

    public Double getQOpYoy() {
        return qOpYoy;
    }

    public FinaIndicatorBean setQOpYoy(Double qOpYoy) {
        this.qOpYoy = qOpYoy;
        return this;
    }

    public Double getQOpQoq() {
        return qOpQoq;
    }

    public FinaIndicatorBean setQOpQoq(Double qOpQoq) {
        this.qOpQoq = qOpQoq;
        return this;
    }

    public Double getQProfitYoy() {
        return qProfitYoy;
    }

    public FinaIndicatorBean setQProfitYoy(Double qProfitYoy) {
        this.qProfitYoy = qProfitYoy;
        return this;
    }

    public Double getQProfitQoq() {
        return qProfitQoq;
    }

    public FinaIndicatorBean setQProfitQoq(Double qProfitQoq) {
        this.qProfitQoq = qProfitQoq;
        return this;
    }

    public Double getQNetprofitYoy() {
        return qNetprofitYoy;
    }

    public FinaIndicatorBean setQNetprofitYoy(Double qNetprofitYoy) {
        this.qNetprofitYoy = qNetprofitYoy;
        return this;
    }

    public Double getQNetprofitQoq() {
        return qNetprofitQoq;
    }

    public FinaIndicatorBean setQNetprofitQoq(Double qNetprofitQoq) {
        this.qNetprofitQoq = qNetprofitQoq;
        return this;
    }

    public Double getEquityYoy() {
        return equityYoy;
    }

    public FinaIndicatorBean setEquityYoy(Double equityYoy) {
        this.equityYoy = equityYoy;
        return this;
    }

    public Double getRdExp() {
        return rdExp;
    }

    public FinaIndicatorBean setRdExp(Double rdExp) {
        this.rdExp = rdExp;
        return this;
    }

    @Override
    public String toString() {
        return "FinaIndicatorBean{" +
               "tsCode=" + tsCode + ", " +
               "annDate=" + annDate + ", " +
               "endDate=" + endDate + ", " +
               "eps=" + eps + ", " +
               "dtEps=" + dtEps + ", " +
               "totalRevenuePs=" + totalRevenuePs + ", " +
               "revenuePs=" + revenuePs + ", " +
               "capitalResePs=" + capitalResePs + ", " +
               "surplusResePs=" + surplusResePs + ", " +
               "undistProfitPs=" + undistProfitPs + ", " +
               "extraItem=" + extraItem + ", " +
               "profitDedt=" + profitDedt + ", " +
               "grossMargin=" + grossMargin + ", " +
               "currentRatio=" + currentRatio + ", " +
               "quickRatio=" + quickRatio + ", " +
               "cashRatio=" + cashRatio + ", " +
               "invturnDays=" + invturnDays + ", " +
               "arturnDays=" + arturnDays + ", " +
               "invTurn=" + invTurn + ", " +
               "arTurn=" + arTurn + ", " +
               "caTurn=" + caTurn + ", " +
               "faTurn=" + faTurn + ", " +
               "assetsTurn=" + assetsTurn + ", " +
               "opIncome=" + opIncome + ", " +
               "valuechangeIncome=" + valuechangeIncome + ", " +
               "interstIncome=" + interstIncome + ", " +
               "daa=" + daa + ", " +
               "ebit=" + ebit + ", " +
               "ebitda=" + ebitda + ", " +
               "fcff=" + fcff + ", " +
               "fcfe=" + fcfe + ", " +
               "currentExint=" + currentExint + ", " +
               "noncurrentExint=" + noncurrentExint + ", " +
               "interestdebt=" + interestdebt + ", " +
               "netdebt=" + netdebt + ", " +
               "tangibleAsset=" + tangibleAsset + ", " +
               "workingCapital=" + workingCapital + ", " +
               "networkingCapital=" + networkingCapital + ", " +
               "investCapital=" + investCapital + ", " +
               "retainedEarnings=" + retainedEarnings + ", " +
               "diluted2Eps=" + diluted2Eps + ", " +
               "bps=" + bps + ", " +
               "ocfps=" + ocfps + ", " +
               "retainedps=" + retainedps + ", " +
               "cfps=" + cfps + ", " +
               "ebitPs=" + ebitPs + ", " +
               "fcffPs=" + fcffPs + ", " +
               "fcfePs=" + fcfePs + ", " +
               "netprofitMargin=" + netprofitMargin + ", " +
               "grossprofitMargin=" + grossprofitMargin + ", " +
               "cogsOfSales=" + cogsOfSales + ", " +
               "expenseOfSales=" + expenseOfSales + ", " +
               "profitToGr=" + profitToGr + ", " +
               "saleexpToGr=" + saleexpToGr + ", " +
               "adminexpOfGr=" + adminexpOfGr + ", " +
               "finaexpOfGr=" + finaexpOfGr + ", " +
               "impaiTtm=" + impaiTtm + ", " +
               "gcOfGr=" + gcOfGr + ", " +
               "opOfGr=" + opOfGr + ", " +
               "ebitOfGr=" + ebitOfGr + ", " +
               "roe=" + roe + ", " +
               "roeWaa=" + roeWaa + ", " +
               "roeDt=" + roeDt + ", " +
               "roa=" + roa + ", " +
               "npta=" + npta + ", " +
               "roic=" + roic + ", " +
               "roeYearly=" + roeYearly + ", " +
               "roa2Yearly=" + roa2Yearly + ", " +
               "roeAvg=" + roeAvg + ", " +
               "opincomeOfEbt=" + opincomeOfEbt + ", " +
               "investincomeOfEbt=" + investincomeOfEbt + ", " +
               "nOpProfitOfEbt=" + nOpProfitOfEbt + ", " +
               "taxToEbt=" + taxToEbt + ", " +
               "dtprofitToProfit=" + dtprofitToProfit + ", " +
               "salescashToOr=" + salescashToOr + ", " +
               "ocfToOr=" + ocfToOr + ", " +
               "ocfToOpincome=" + ocfToOpincome + ", " +
               "capitalizedToDa=" + capitalizedToDa + ", " +
               "debtToAssets=" + debtToAssets + ", " +
               "assetsToEqt=" + assetsToEqt + ", " +
               "dpAssetsToEqt=" + dpAssetsToEqt + ", " +
               "caToAssets=" + caToAssets + ", " +
               "ncaToAssets=" + ncaToAssets + ", " +
               "tbassetsToTotalassets=" + tbassetsToTotalassets + ", " +
               "intToTalcap=" + intToTalcap + ", " +
               "eqtToTalcapital=" + eqtToTalcapital + ", " +
               "currentdebtToDebt=" + currentdebtToDebt + ", " +
               "longdebToDebt=" + longdebToDebt + ", " +
               "ocfToShortdebt=" + ocfToShortdebt + ", " +
               "debtToEqt=" + debtToEqt + ", " +
               "eqtToDebt=" + eqtToDebt + ", " +
               "eqtToInterestdebt=" + eqtToInterestdebt + ", " +
               "tangibleassetToDebt=" + tangibleassetToDebt + ", " +
               "tangassetToIntdebt=" + tangassetToIntdebt + ", " +
               "tangibleassetToNetdebt=" + tangibleassetToNetdebt + ", " +
               "ocfToDebt=" + ocfToDebt + ", " +
               "ocfToInterestdebt=" + ocfToInterestdebt + ", " +
               "ocfToNetdebt=" + ocfToNetdebt + ", " +
               "ebitToInterest=" + ebitToInterest + ", " +
               "longdebtToWorkingcapital=" + longdebtToWorkingcapital + ", " +
               "ebitdaToDebt=" + ebitdaToDebt + ", " +
               "turnDays=" + turnDays + ", " +
               "roaYearly=" + roaYearly + ", " +
               "roaDp=" + roaDp + ", " +
               "fixedAssets=" + fixedAssets + ", " +
               "profitPrefinExp=" + profitPrefinExp + ", " +
               "nonOpProfit=" + nonOpProfit + ", " +
               "opToEbt=" + opToEbt + ", " +
               "nopToEbt=" + nopToEbt + ", " +
               "ocfToProfit=" + ocfToProfit + ", " +
               "cashToLiqdebt=" + cashToLiqdebt + ", " +
               "cashToLiqdebtWithinterest=" + cashToLiqdebtWithinterest + ", " +
               "opToLiqdebt=" + opToLiqdebt + ", " +
               "opToDebt=" + opToDebt + ", " +
               "roicYearly=" + roicYearly + ", " +
               "totalFaTrun=" + totalFaTrun + ", " +
               "profitToOp=" + profitToOp + ", " +
               "qOpincome=" + qOpincome + ", " +
               "qInvestincome=" + qInvestincome + ", " +
               "qDtprofit=" + qDtprofit + ", " +
               "qEps=" + qEps + ", " +
               "qNetprofitMargin=" + qNetprofitMargin + ", " +
               "qGsprofitMargin=" + qGsprofitMargin + ", " +
               "qExpToSales=" + qExpToSales + ", " +
               "qProfitToGr=" + qProfitToGr + ", " +
               "qSaleexpToGr=" + qSaleexpToGr + ", " +
               "qAdminexpToGr=" + qAdminexpToGr + ", " +
               "qFinaexpToGr=" + qFinaexpToGr + ", " +
               "qImpairToGrTtm=" + qImpairToGrTtm + ", " +
               "qGcToGr=" + qGcToGr + ", " +
               "qOpToGr=" + qOpToGr + ", " +
               "qRoe=" + qRoe + ", " +
               "qDtRoe=" + qDtRoe + ", " +
               "qNpta=" + qNpta + ", " +
               "qOpincomeToEbt=" + qOpincomeToEbt + ", " +
               "qInvestincomeToEbt=" + qInvestincomeToEbt + ", " +
               "qDtprofitToProfit=" + qDtprofitToProfit + ", " +
               "qSalescashToOr=" + qSalescashToOr + ", " +
               "qOcfToSales=" + qOcfToSales + ", " +
               "qOcfToOr=" + qOcfToOr + ", " +
               "basicEpsYoy=" + basicEpsYoy + ", " +
               "dtEpsYoy=" + dtEpsYoy + ", " +
               "cfpsYoy=" + cfpsYoy + ", " +
               "opYoy=" + opYoy + ", " +
               "ebtYoy=" + ebtYoy + ", " +
               "netprofitYoy=" + netprofitYoy + ", " +
               "dtNetprofitYoy=" + dtNetprofitYoy + ", " +
               "ocfYoy=" + ocfYoy + ", " +
               "roeYoy=" + roeYoy + ", " +
               "bpsYoy=" + bpsYoy + ", " +
               "assetsYoy=" + assetsYoy + ", " +
               "eqtYoy=" + eqtYoy + ", " +
               "trYoy=" + trYoy + ", " +
               "orYoy=" + orYoy + ", " +
               "qGrYoy=" + qGrYoy + ", " +
               "qGrQoq=" + qGrQoq + ", " +
               "qSalesYoy=" + qSalesYoy + ", " +
               "qSalesQoq=" + qSalesQoq + ", " +
               "qOpYoy=" + qOpYoy + ", " +
               "qOpQoq=" + qOpQoq + ", " +
               "qProfitYoy=" + qProfitYoy + ", " +
               "qProfitQoq=" + qProfitQoq + ", " +
               "qNetprofitYoy=" + qNetprofitYoy + ", " +
               "qNetprofitQoq=" + qNetprofitQoq + ", " +
               "equityYoy=" + equityYoy + ", " +
               "rdExp=" + rdExp + 
               "}";
    }
}