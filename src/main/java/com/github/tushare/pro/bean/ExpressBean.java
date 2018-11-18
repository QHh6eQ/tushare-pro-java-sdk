package com.github.tushare.pro.bean;

/**
 * 业绩快报
 */
public class ExpressBean {

    protected String tsCode;  // TS股票代码
    protected String annDate;  // 公告日期
    protected String endDate;  // 报告期
    protected Double revenue;  // 营业收入(元)
    protected Double operateProfit;  // 营业利润(元)
    protected Double totalProfit;  // 利润总额(元)
    protected Double nIncome;  // 净利润(元)
    protected Double totalAssets;  // 总资产(元)
    protected Double totalHldrEqyExcMinInt;  // 股东权益合计(不含少数股东权益)(元)
    protected Double dilutedEps;  // 每股收益(摊薄)(元)
    protected Double dilutedRoe;  // 净资产收益率(摊薄)(%)
    protected Double yoyNetProfit;  // 去年同期修正后净利润
    protected Double bps;  // 每股净资产
    protected Double yoySales;  // 同比增长率:营业收入
    protected Double yoyOp;  // 同比增长率:营业利润
    protected Double yoyTp;  // 同比增长率:利润总额
    protected Double yoyDeduNp;  // 同比增长率:归属母公司股东的净利润
    protected Double yoyEps;  // 同比增长率:基本每股收益
    protected Double yoyRoe;  // 同比增减:加权平均净资产收益率
    protected Double growthAssets;  // 比年初增长率:总资产
    protected Double yoyEquity;  // 比年初增长率:归属母公司的股东权益
    protected Double growthBps;  // 比年初增长率:归属于母公司股东的每股净资产
    protected Double orLastYear;  // 去年同期营业收入
    protected Double opLastYear;  // 去年同期营业利润
    protected Double tpLastYear;  // 去年同期利润总额
    protected Double npLastYear;  // 去年同期净利润
    protected Double epsLastYear;  // 去年同期每股收益
    protected Double openNetAssets;  // 期初净资产
    protected Double openBps;  // 期初每股净资产
    protected String perfSummary;  // 业绩简要说明
    protected Integer isAudit;  // 是否审计： 1是 0否
    protected String remark;  // 备注

    public String getTsCode() {
        return tsCode;
    }

    public ExpressBean setTsCode(String tsCode) {
        this.tsCode = tsCode;
        return this;
    }

    public String getAnnDate() {
        return annDate;
    }

    public ExpressBean setAnnDate(String annDate) {
        this.annDate = annDate;
        return this;
    }

    public String getEndDate() {
        return endDate;
    }

    public ExpressBean setEndDate(String endDate) {
        this.endDate = endDate;
        return this;
    }

    public Double getRevenue() {
        return revenue;
    }

    public ExpressBean setRevenue(Double revenue) {
        this.revenue = revenue;
        return this;
    }

    public Double getOperateProfit() {
        return operateProfit;
    }

    public ExpressBean setOperateProfit(Double operateProfit) {
        this.operateProfit = operateProfit;
        return this;
    }

    public Double getTotalProfit() {
        return totalProfit;
    }

    public ExpressBean setTotalProfit(Double totalProfit) {
        this.totalProfit = totalProfit;
        return this;
    }

    public Double getNIncome() {
        return nIncome;
    }

    public ExpressBean setNIncome(Double nIncome) {
        this.nIncome = nIncome;
        return this;
    }

    public Double getTotalAssets() {
        return totalAssets;
    }

    public ExpressBean setTotalAssets(Double totalAssets) {
        this.totalAssets = totalAssets;
        return this;
    }

    public Double getTotalHldrEqyExcMinInt() {
        return totalHldrEqyExcMinInt;
    }

    public ExpressBean setTotalHldrEqyExcMinInt(Double totalHldrEqyExcMinInt) {
        this.totalHldrEqyExcMinInt = totalHldrEqyExcMinInt;
        return this;
    }

    public Double getDilutedEps() {
        return dilutedEps;
    }

    public ExpressBean setDilutedEps(Double dilutedEps) {
        this.dilutedEps = dilutedEps;
        return this;
    }

    public Double getDilutedRoe() {
        return dilutedRoe;
    }

    public ExpressBean setDilutedRoe(Double dilutedRoe) {
        this.dilutedRoe = dilutedRoe;
        return this;
    }

    public Double getYoyNetProfit() {
        return yoyNetProfit;
    }

    public ExpressBean setYoyNetProfit(Double yoyNetProfit) {
        this.yoyNetProfit = yoyNetProfit;
        return this;
    }

    public Double getBps() {
        return bps;
    }

    public ExpressBean setBps(Double bps) {
        this.bps = bps;
        return this;
    }

    public Double getYoySales() {
        return yoySales;
    }

    public ExpressBean setYoySales(Double yoySales) {
        this.yoySales = yoySales;
        return this;
    }

    public Double getYoyOp() {
        return yoyOp;
    }

    public ExpressBean setYoyOp(Double yoyOp) {
        this.yoyOp = yoyOp;
        return this;
    }

    public Double getYoyTp() {
        return yoyTp;
    }

    public ExpressBean setYoyTp(Double yoyTp) {
        this.yoyTp = yoyTp;
        return this;
    }

    public Double getYoyDeduNp() {
        return yoyDeduNp;
    }

    public ExpressBean setYoyDeduNp(Double yoyDeduNp) {
        this.yoyDeduNp = yoyDeduNp;
        return this;
    }

    public Double getYoyEps() {
        return yoyEps;
    }

    public ExpressBean setYoyEps(Double yoyEps) {
        this.yoyEps = yoyEps;
        return this;
    }

    public Double getYoyRoe() {
        return yoyRoe;
    }

    public ExpressBean setYoyRoe(Double yoyRoe) {
        this.yoyRoe = yoyRoe;
        return this;
    }

    public Double getGrowthAssets() {
        return growthAssets;
    }

    public ExpressBean setGrowthAssets(Double growthAssets) {
        this.growthAssets = growthAssets;
        return this;
    }

    public Double getYoyEquity() {
        return yoyEquity;
    }

    public ExpressBean setYoyEquity(Double yoyEquity) {
        this.yoyEquity = yoyEquity;
        return this;
    }

    public Double getGrowthBps() {
        return growthBps;
    }

    public ExpressBean setGrowthBps(Double growthBps) {
        this.growthBps = growthBps;
        return this;
    }

    public Double getOrLastYear() {
        return orLastYear;
    }

    public ExpressBean setOrLastYear(Double orLastYear) {
        this.orLastYear = orLastYear;
        return this;
    }

    public Double getOpLastYear() {
        return opLastYear;
    }

    public ExpressBean setOpLastYear(Double opLastYear) {
        this.opLastYear = opLastYear;
        return this;
    }

    public Double getTpLastYear() {
        return tpLastYear;
    }

    public ExpressBean setTpLastYear(Double tpLastYear) {
        this.tpLastYear = tpLastYear;
        return this;
    }

    public Double getNpLastYear() {
        return npLastYear;
    }

    public ExpressBean setNpLastYear(Double npLastYear) {
        this.npLastYear = npLastYear;
        return this;
    }

    public Double getEpsLastYear() {
        return epsLastYear;
    }

    public ExpressBean setEpsLastYear(Double epsLastYear) {
        this.epsLastYear = epsLastYear;
        return this;
    }

    public Double getOpenNetAssets() {
        return openNetAssets;
    }

    public ExpressBean setOpenNetAssets(Double openNetAssets) {
        this.openNetAssets = openNetAssets;
        return this;
    }

    public Double getOpenBps() {
        return openBps;
    }

    public ExpressBean setOpenBps(Double openBps) {
        this.openBps = openBps;
        return this;
    }

    public String getPerfSummary() {
        return perfSummary;
    }

    public ExpressBean setPerfSummary(String perfSummary) {
        this.perfSummary = perfSummary;
        return this;
    }

    public Integer getIsAudit() {
        return isAudit;
    }

    public ExpressBean setIsAudit(Integer isAudit) {
        this.isAudit = isAudit;
        return this;
    }

    public String getRemark() {
        return remark;
    }

    public ExpressBean setRemark(String remark) {
        this.remark = remark;
        return this;
    }

    @Override
    public String toString() {
        return "ExpressBean{" +
               "tsCode=" + tsCode + ", " +
               "annDate=" + annDate + ", " +
               "endDate=" + endDate + ", " +
               "revenue=" + revenue + ", " +
               "operateProfit=" + operateProfit + ", " +
               "totalProfit=" + totalProfit + ", " +
               "nIncome=" + nIncome + ", " +
               "totalAssets=" + totalAssets + ", " +
               "totalHldrEqyExcMinInt=" + totalHldrEqyExcMinInt + ", " +
               "dilutedEps=" + dilutedEps + ", " +
               "dilutedRoe=" + dilutedRoe + ", " +
               "yoyNetProfit=" + yoyNetProfit + ", " +
               "bps=" + bps + ", " +
               "yoySales=" + yoySales + ", " +
               "yoyOp=" + yoyOp + ", " +
               "yoyTp=" + yoyTp + ", " +
               "yoyDeduNp=" + yoyDeduNp + ", " +
               "yoyEps=" + yoyEps + ", " +
               "yoyRoe=" + yoyRoe + ", " +
               "growthAssets=" + growthAssets + ", " +
               "yoyEquity=" + yoyEquity + ", " +
               "growthBps=" + growthBps + ", " +
               "orLastYear=" + orLastYear + ", " +
               "opLastYear=" + opLastYear + ", " +
               "tpLastYear=" + tpLastYear + ", " +
               "npLastYear=" + npLastYear + ", " +
               "epsLastYear=" + epsLastYear + ", " +
               "openNetAssets=" + openNetAssets + ", " +
               "openBps=" + openBps + ", " +
               "perfSummary=" + perfSummary + ", " +
               "isAudit=" + isAudit + ", " +
               "remark=" + remark + 
               "}";
    }
}