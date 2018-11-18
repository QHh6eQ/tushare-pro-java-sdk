package com.github.tushare.pro.bean;

/**
 * 主营业务构成
 */
public class FinaMainbzBean {

    protected String tsCode;  // TS代码
    protected String endDate;  // 报告期
    protected String bzItem;  // 主营业务来源
    protected Double bzSales;  // 主营业务收入(元)
    protected Double bzProfit;  // 主营业务利润(元)
    protected Double bzCost;  // 主营业务成本(元)
    protected String currType;  // 货币代码
    protected String updateFlag;  // 是否更新

    public String getTsCode() {
        return tsCode;
    }

    public FinaMainbzBean setTsCode(String tsCode) {
        this.tsCode = tsCode;
        return this;
    }

    public String getEndDate() {
        return endDate;
    }

    public FinaMainbzBean setEndDate(String endDate) {
        this.endDate = endDate;
        return this;
    }

    public String getBzItem() {
        return bzItem;
    }

    public FinaMainbzBean setBzItem(String bzItem) {
        this.bzItem = bzItem;
        return this;
    }

    public Double getBzSales() {
        return bzSales;
    }

    public FinaMainbzBean setBzSales(Double bzSales) {
        this.bzSales = bzSales;
        return this;
    }

    public Double getBzProfit() {
        return bzProfit;
    }

    public FinaMainbzBean setBzProfit(Double bzProfit) {
        this.bzProfit = bzProfit;
        return this;
    }

    public Double getBzCost() {
        return bzCost;
    }

    public FinaMainbzBean setBzCost(Double bzCost) {
        this.bzCost = bzCost;
        return this;
    }

    public String getCurrType() {
        return currType;
    }

    public FinaMainbzBean setCurrType(String currType) {
        this.currType = currType;
        return this;
    }

    public String getUpdateFlag() {
        return updateFlag;
    }

    public FinaMainbzBean setUpdateFlag(String updateFlag) {
        this.updateFlag = updateFlag;
        return this;
    }

    @Override
    public String toString() {
        return "FinaMainbzBean{" +
               "tsCode=" + tsCode + ", " +
               "endDate=" + endDate + ", " +
               "bzItem=" + bzItem + ", " +
               "bzSales=" + bzSales + ", " +
               "bzProfit=" + bzProfit + ", " +
               "bzCost=" + bzCost + ", " +
               "currType=" + currType + ", " +
               "updateFlag=" + updateFlag + 
               "}";
    }
}