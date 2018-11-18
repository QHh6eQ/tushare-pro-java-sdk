package com.github.tushare.pro.bean;

/**
 * 停复牌信息
 */
public class SuspendBean {

    protected String tsCode;  // 股票代码
    protected String suspendDate;  // 停牌日期
    protected String resumeDate;  // 复牌日期
    protected String annDate;  // 公告日期
    protected String suspendReason;  // 停牌原因
    protected String reasonType;  // 停牌原因类别

    public String getTsCode() {
        return tsCode;
    }

    public SuspendBean setTsCode(String tsCode) {
        this.tsCode = tsCode;
        return this;
    }

    public String getSuspendDate() {
        return suspendDate;
    }

    public SuspendBean setSuspendDate(String suspendDate) {
        this.suspendDate = suspendDate;
        return this;
    }

    public String getResumeDate() {
        return resumeDate;
    }

    public SuspendBean setResumeDate(String resumeDate) {
        this.resumeDate = resumeDate;
        return this;
    }

    public String getAnnDate() {
        return annDate;
    }

    public SuspendBean setAnnDate(String annDate) {
        this.annDate = annDate;
        return this;
    }

    public String getSuspendReason() {
        return suspendReason;
    }

    public SuspendBean setSuspendReason(String suspendReason) {
        this.suspendReason = suspendReason;
        return this;
    }

    public String getReasonType() {
        return reasonType;
    }

    public SuspendBean setReasonType(String reasonType) {
        this.reasonType = reasonType;
        return this;
    }

    @Override
    public String toString() {
        return "SuspendBean{" +
               "tsCode=" + tsCode + ", " +
               "suspendDate=" + suspendDate + ", " +
               "resumeDate=" + resumeDate + ", " +
               "annDate=" + annDate + ", " +
               "suspendReason=" + suspendReason + ", " +
               "reasonType=" + reasonType + 
               "}";
    }
}