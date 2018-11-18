package com.github.tushare.pro.bean;

/**
 * 复权因子
 */
public class AdjFactorBean {

    protected String tsCode;  // 股票代码
    protected String tradeDate;  // 交易日期
    protected Double adjFactor;  // 复权因子
    protected String startDate;  // 开始日期
    protected String endDate;  // 结束日期

    public String getTsCode() {
        return tsCode;
    }

    public AdjFactorBean setTsCode(String tsCode) {
        this.tsCode = tsCode;
        return this;
    }

    public String getTradeDate() {
        return tradeDate;
    }

    public AdjFactorBean setTradeDate(String tradeDate) {
        this.tradeDate = tradeDate;
        return this;
    }

    public Double getAdjFactor() {
        return adjFactor;
    }

    public AdjFactorBean setAdjFactor(Double adjFactor) {
        this.adjFactor = adjFactor;
        return this;
    }

    public String getStartDate() {
        return startDate;
    }

    public AdjFactorBean setStartDate(String startDate) {
        this.startDate = startDate;
        return this;
    }

    public String getEndDate() {
        return endDate;
    }

    public AdjFactorBean setEndDate(String endDate) {
        this.endDate = endDate;
        return this;
    }

    @Override
    public String toString() {
        return "AdjFactorBean{" +
               "tsCode=" + tsCode + ", " +
               "tradeDate=" + tradeDate + ", " +
               "adjFactor=" + adjFactor + ", " +
               "startDate=" + startDate + ", " +
               "endDate=" + endDate + 
               "}";
    }
}