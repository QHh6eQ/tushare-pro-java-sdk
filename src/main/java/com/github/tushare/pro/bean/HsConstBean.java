package com.github.tushare.pro.bean;

/**
 * 沪深股通成份股
 */
public class HsConstBean {

    protected String tsCode;  // TS代码
    protected String hsType;  // 沪深港通类型SH沪SZ深
    protected String inDate;  // 纳入日期
    protected String outDate;  // 剔除日期
    protected String isNew;  // 是否最新 1是0否

    public String getTsCode() {
        return tsCode;
    }

    public HsConstBean setTsCode(String tsCode) {
        this.tsCode = tsCode;
        return this;
    }

    public String getHsType() {
        return hsType;
    }

    public HsConstBean setHsType(String hsType) {
        this.hsType = hsType;
        return this;
    }

    public String getInDate() {
        return inDate;
    }

    public HsConstBean setInDate(String inDate) {
        this.inDate = inDate;
        return this;
    }

    public String getOutDate() {
        return outDate;
    }

    public HsConstBean setOutDate(String outDate) {
        this.outDate = outDate;
        return this;
    }

    public String getIsNew() {
        return isNew;
    }

    public HsConstBean setIsNew(String isNew) {
        this.isNew = isNew;
        return this;
    }

    @Override
    public String toString() {
        return "HsConstBean{" +
               "tsCode=" + tsCode + ", " +
               "hsType=" + hsType + ", " +
               "inDate=" + inDate + ", " +
               "outDate=" + outDate + ", " +
               "isNew=" + isNew + 
               "}";
    }
}