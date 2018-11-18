package com.github.tushare.pro.bean;

/**
 * 前十大股东
 */
public class Top10HoldersBean {

    protected String tsCode;  // TS股票代码
    protected String annDate;  // 公告日期
    protected String endDate;  // 报告期
    protected String holderName;  // 股东名称
    protected Double holdAmount;  // 持有数量（股）
    protected Double holdRatio;  // 持有比例

    public String getTsCode() {
        return tsCode;
    }

    public Top10HoldersBean setTsCode(String tsCode) {
        this.tsCode = tsCode;
        return this;
    }

    public String getAnnDate() {
        return annDate;
    }

    public Top10HoldersBean setAnnDate(String annDate) {
        this.annDate = annDate;
        return this;
    }

    public String getEndDate() {
        return endDate;
    }

    public Top10HoldersBean setEndDate(String endDate) {
        this.endDate = endDate;
        return this;
    }

    public String getHolderName() {
        return holderName;
    }

    public Top10HoldersBean setHolderName(String holderName) {
        this.holderName = holderName;
        return this;
    }

    public Double getHoldAmount() {
        return holdAmount;
    }

    public Top10HoldersBean setHoldAmount(Double holdAmount) {
        this.holdAmount = holdAmount;
        return this;
    }

    public Double getHoldRatio() {
        return holdRatio;
    }

    public Top10HoldersBean setHoldRatio(Double holdRatio) {
        this.holdRatio = holdRatio;
        return this;
    }

    @Override
    public String toString() {
        return "Top10HoldersBean{" +
               "tsCode=" + tsCode + ", " +
               "annDate=" + annDate + ", " +
               "endDate=" + endDate + ", " +
               "holderName=" + holderName + ", " +
               "holdAmount=" + holdAmount + ", " +
               "holdRatio=" + holdRatio + 
               "}";
    }
}