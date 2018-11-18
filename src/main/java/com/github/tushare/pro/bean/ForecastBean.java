package com.github.tushare.pro.bean;

/**
 * 业绩预告
 */
public class ForecastBean {

    protected String tsCode;  // TS股票代码
    protected String annDate;  // 公告日期
    protected String endDate;  // 报告期
    protected String type;  // 业绩预告类型(预增/预减/扭亏/首亏/续亏/续盈/略增/略减)
    protected Double pChangeMin;  // 预告净利润变动幅度下限（%）
    protected Double pChangeMax;  // 预告净利润变动幅度上限（%）
    protected Double netProfitMin;  // 预告净利润下限（万元）
    protected Double netProfitMax;  // 预告净利润上限（万元）
    protected Double lastParentNet;  // 上年同期归属母公司净利润
    protected String firstAnnDate;  // 首次公告日
    protected String summary;  // 业绩预告摘要
    protected String changeReason;  // 业绩变动原因

    public String getTsCode() {
        return tsCode;
    }

    public ForecastBean setTsCode(String tsCode) {
        this.tsCode = tsCode;
        return this;
    }

    public String getAnnDate() {
        return annDate;
    }

    public ForecastBean setAnnDate(String annDate) {
        this.annDate = annDate;
        return this;
    }

    public String getEndDate() {
        return endDate;
    }

    public ForecastBean setEndDate(String endDate) {
        this.endDate = endDate;
        return this;
    }

    public String getType() {
        return type;
    }

    public ForecastBean setType(String type) {
        this.type = type;
        return this;
    }

    public Double getPChangeMin() {
        return pChangeMin;
    }

    public ForecastBean setPChangeMin(Double pChangeMin) {
        this.pChangeMin = pChangeMin;
        return this;
    }

    public Double getPChangeMax() {
        return pChangeMax;
    }

    public ForecastBean setPChangeMax(Double pChangeMax) {
        this.pChangeMax = pChangeMax;
        return this;
    }

    public Double getNetProfitMin() {
        return netProfitMin;
    }

    public ForecastBean setNetProfitMin(Double netProfitMin) {
        this.netProfitMin = netProfitMin;
        return this;
    }

    public Double getNetProfitMax() {
        return netProfitMax;
    }

    public ForecastBean setNetProfitMax(Double netProfitMax) {
        this.netProfitMax = netProfitMax;
        return this;
    }

    public Double getLastParentNet() {
        return lastParentNet;
    }

    public ForecastBean setLastParentNet(Double lastParentNet) {
        this.lastParentNet = lastParentNet;
        return this;
    }

    public String getFirstAnnDate() {
        return firstAnnDate;
    }

    public ForecastBean setFirstAnnDate(String firstAnnDate) {
        this.firstAnnDate = firstAnnDate;
        return this;
    }

    public String getSummary() {
        return summary;
    }

    public ForecastBean setSummary(String summary) {
        this.summary = summary;
        return this;
    }

    public String getChangeReason() {
        return changeReason;
    }

    public ForecastBean setChangeReason(String changeReason) {
        this.changeReason = changeReason;
        return this;
    }

    @Override
    public String toString() {
        return "ForecastBean{" +
               "tsCode=" + tsCode + ", " +
               "annDate=" + annDate + ", " +
               "endDate=" + endDate + ", " +
               "type=" + type + ", " +
               "pChangeMin=" + pChangeMin + ", " +
               "pChangeMax=" + pChangeMax + ", " +
               "netProfitMin=" + netProfitMin + ", " +
               "netProfitMax=" + netProfitMax + ", " +
               "lastParentNet=" + lastParentNet + ", " +
               "firstAnnDate=" + firstAnnDate + ", " +
               "summary=" + summary + ", " +
               "changeReason=" + changeReason + 
               "}";
    }
}