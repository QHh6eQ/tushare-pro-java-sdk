package com.github.tushare.pro.bean;

/**
 * 财务审计意见
 */
public class FinaAuditBean {

    protected String tsCode;  // TS股票代码
    protected String annDate;  // 公告日期
    protected String endDate;  // 报告期
    protected String auditResult;  // 审计结果
    protected Double auditFees;  // 审计总费用（元）
    protected String auditAgency;  // 会计事务所
    protected String auditSign;  // 签字会计师

    public String getTsCode() {
        return tsCode;
    }

    public FinaAuditBean setTsCode(String tsCode) {
        this.tsCode = tsCode;
        return this;
    }

    public String getAnnDate() {
        return annDate;
    }

    public FinaAuditBean setAnnDate(String annDate) {
        this.annDate = annDate;
        return this;
    }

    public String getEndDate() {
        return endDate;
    }

    public FinaAuditBean setEndDate(String endDate) {
        this.endDate = endDate;
        return this;
    }

    public String getAuditResult() {
        return auditResult;
    }

    public FinaAuditBean setAuditResult(String auditResult) {
        this.auditResult = auditResult;
        return this;
    }

    public Double getAuditFees() {
        return auditFees;
    }

    public FinaAuditBean setAuditFees(Double auditFees) {
        this.auditFees = auditFees;
        return this;
    }

    public String getAuditAgency() {
        return auditAgency;
    }

    public FinaAuditBean setAuditAgency(String auditAgency) {
        this.auditAgency = auditAgency;
        return this;
    }

    public String getAuditSign() {
        return auditSign;
    }

    public FinaAuditBean setAuditSign(String auditSign) {
        this.auditSign = auditSign;
        return this;
    }

    @Override
    public String toString() {
        return "FinaAuditBean{" +
               "tsCode=" + tsCode + ", " +
               "annDate=" + annDate + ", " +
               "endDate=" + endDate + ", " +
               "auditResult=" + auditResult + ", " +
               "auditFees=" + auditFees + ", " +
               "auditAgency=" + auditAgency + ", " +
               "auditSign=" + auditSign + 
               "}";
    }
}