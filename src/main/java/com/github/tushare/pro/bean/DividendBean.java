package com.github.tushare.pro.bean;

/**
 * 分红送股
 */
public class DividendBean {

    protected String tsCode;  // TS代码
    protected String endDate;  // 分红年度
    protected String annDate;  // 预案公告日
    protected String divProc;  // 实施进度
    protected Double stkDiv;  // 每股送转
    protected Double stkBoRate;  // 每股送股比例
    protected Double stkCoRate;  // 每股转增比例
    protected Double cashDiv;  // 每股分红（税后）
    protected Double cashDivTax;  // 每股分红（税前）
    protected String recordDate;  // 股权登记日
    protected String exDate;  // 除权除息日
    protected String payDate;  // 派息日
    protected String divListdate;  // 红股上市日
    protected String impAnnDate;  // 实施公告日
    protected String baseDate;  // 基准日
    protected Double baseShare;  // 基准股本（万）

    public String getTsCode() {
        return tsCode;
    }

    public DividendBean setTsCode(String tsCode) {
        this.tsCode = tsCode;
        return this;
    }

    public String getEndDate() {
        return endDate;
    }

    public DividendBean setEndDate(String endDate) {
        this.endDate = endDate;
        return this;
    }

    public String getAnnDate() {
        return annDate;
    }

    public DividendBean setAnnDate(String annDate) {
        this.annDate = annDate;
        return this;
    }

    public String getDivProc() {
        return divProc;
    }

    public DividendBean setDivProc(String divProc) {
        this.divProc = divProc;
        return this;
    }

    public Double getStkDiv() {
        return stkDiv;
    }

    public DividendBean setStkDiv(Double stkDiv) {
        this.stkDiv = stkDiv;
        return this;
    }

    public Double getStkBoRate() {
        return stkBoRate;
    }

    public DividendBean setStkBoRate(Double stkBoRate) {
        this.stkBoRate = stkBoRate;
        return this;
    }

    public Double getStkCoRate() {
        return stkCoRate;
    }

    public DividendBean setStkCoRate(Double stkCoRate) {
        this.stkCoRate = stkCoRate;
        return this;
    }

    public Double getCashDiv() {
        return cashDiv;
    }

    public DividendBean setCashDiv(Double cashDiv) {
        this.cashDiv = cashDiv;
        return this;
    }

    public Double getCashDivTax() {
        return cashDivTax;
    }

    public DividendBean setCashDivTax(Double cashDivTax) {
        this.cashDivTax = cashDivTax;
        return this;
    }

    public String getRecordDate() {
        return recordDate;
    }

    public DividendBean setRecordDate(String recordDate) {
        this.recordDate = recordDate;
        return this;
    }

    public String getExDate() {
        return exDate;
    }

    public DividendBean setExDate(String exDate) {
        this.exDate = exDate;
        return this;
    }

    public String getPayDate() {
        return payDate;
    }

    public DividendBean setPayDate(String payDate) {
        this.payDate = payDate;
        return this;
    }

    public String getDivListdate() {
        return divListdate;
    }

    public DividendBean setDivListdate(String divListdate) {
        this.divListdate = divListdate;
        return this;
    }

    public String getImpAnnDate() {
        return impAnnDate;
    }

    public DividendBean setImpAnnDate(String impAnnDate) {
        this.impAnnDate = impAnnDate;
        return this;
    }

    public String getBaseDate() {
        return baseDate;
    }

    public DividendBean setBaseDate(String baseDate) {
        this.baseDate = baseDate;
        return this;
    }

    public Double getBaseShare() {
        return baseShare;
    }

    public DividendBean setBaseShare(Double baseShare) {
        this.baseShare = baseShare;
        return this;
    }

    @Override
    public String toString() {
        return "DividendBean{" +
               "tsCode=" + tsCode + ", " +
               "endDate=" + endDate + ", " +
               "annDate=" + annDate + ", " +
               "divProc=" + divProc + ", " +
               "stkDiv=" + stkDiv + ", " +
               "stkBoRate=" + stkBoRate + ", " +
               "stkCoRate=" + stkCoRate + ", " +
               "cashDiv=" + cashDiv + ", " +
               "cashDivTax=" + cashDivTax + ", " +
               "recordDate=" + recordDate + ", " +
               "exDate=" + exDate + ", " +
               "payDate=" + payDate + ", " +
               "divListdate=" + divListdate + ", " +
               "impAnnDate=" + impAnnDate + ", " +
               "baseDate=" + baseDate + ", " +
               "baseShare=" + baseShare + 
               "}";
    }
}