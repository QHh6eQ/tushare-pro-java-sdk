package com.github.tushare.pro.bean;

/**
 * 股票曾用名
 */
public class NamechangeBean {

    protected String tsCode;  // TS代码
    protected String name;  // 证券名称
    protected String startDate;  // 开始日期
    protected String endDate;  // 结束日期
    protected String annDate;  // 公告日期
    protected String changeReason;  // 变更原因

    public String getTsCode() {
        return tsCode;
    }

    public NamechangeBean setTsCode(String tsCode) {
        this.tsCode = tsCode;
        return this;
    }

    public String getName() {
        return name;
    }

    public NamechangeBean setName(String name) {
        this.name = name;
        return this;
    }

    public String getStartDate() {
        return startDate;
    }

    public NamechangeBean setStartDate(String startDate) {
        this.startDate = startDate;
        return this;
    }

    public String getEndDate() {
        return endDate;
    }

    public NamechangeBean setEndDate(String endDate) {
        this.endDate = endDate;
        return this;
    }

    public String getAnnDate() {
        return annDate;
    }

    public NamechangeBean setAnnDate(String annDate) {
        this.annDate = annDate;
        return this;
    }

    public String getChangeReason() {
        return changeReason;
    }

    public NamechangeBean setChangeReason(String changeReason) {
        this.changeReason = changeReason;
        return this;
    }

    @Override
    public String toString() {
        return "NamechangeBean{" +
               "tsCode=" + tsCode + ", " +
               "name=" + name + ", " +
               "startDate=" + startDate + ", " +
               "endDate=" + endDate + ", " +
               "annDate=" + annDate + ", " +
               "changeReason=" + changeReason + 
               "}";
    }
}