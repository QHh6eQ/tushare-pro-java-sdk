package com.github.tushare.pro.bean;

/**
 * 融资融券交易明细
 */
public class MarginDetailBean {

    protected String tradeDate;  // 交易日期
    protected String tsCode;  // TS股票代码
    protected Double rzye;  // 融资余额(元)
    protected Double rqye;  // 融券余额(元)
    protected Double rzmre;  // 融资买入额(元)
    protected Double rqyl;  // 融券余量（手）
    protected Double rzche;  // 融资偿还额(元)
    protected Double rqchl;  // 融券偿还量(手)
    protected Double rqmcl;  // 融券卖出量(股,份,手)
    protected Double rzrqye;  // 融资融券余额(元)

    public String getTradeDate() {
        return tradeDate;
    }

    public MarginDetailBean setTradeDate(String tradeDate) {
        this.tradeDate = tradeDate;
        return this;
    }

    public String getTsCode() {
        return tsCode;
    }

    public MarginDetailBean setTsCode(String tsCode) {
        this.tsCode = tsCode;
        return this;
    }

    public Double getRzye() {
        return rzye;
    }

    public MarginDetailBean setRzye(Double rzye) {
        this.rzye = rzye;
        return this;
    }

    public Double getRqye() {
        return rqye;
    }

    public MarginDetailBean setRqye(Double rqye) {
        this.rqye = rqye;
        return this;
    }

    public Double getRzmre() {
        return rzmre;
    }

    public MarginDetailBean setRzmre(Double rzmre) {
        this.rzmre = rzmre;
        return this;
    }

    public Double getRqyl() {
        return rqyl;
    }

    public MarginDetailBean setRqyl(Double rqyl) {
        this.rqyl = rqyl;
        return this;
    }

    public Double getRzche() {
        return rzche;
    }

    public MarginDetailBean setRzche(Double rzche) {
        this.rzche = rzche;
        return this;
    }

    public Double getRqchl() {
        return rqchl;
    }

    public MarginDetailBean setRqchl(Double rqchl) {
        this.rqchl = rqchl;
        return this;
    }

    public Double getRqmcl() {
        return rqmcl;
    }

    public MarginDetailBean setRqmcl(Double rqmcl) {
        this.rqmcl = rqmcl;
        return this;
    }

    public Double getRzrqye() {
        return rzrqye;
    }

    public MarginDetailBean setRzrqye(Double rzrqye) {
        this.rzrqye = rzrqye;
        return this;
    }

    @Override
    public String toString() {
        return "MarginDetailBean{" +
               "tradeDate=" + tradeDate + ", " +
               "tsCode=" + tsCode + ", " +
               "rzye=" + rzye + ", " +
               "rqye=" + rqye + ", " +
               "rzmre=" + rzmre + ", " +
               "rqyl=" + rqyl + ", " +
               "rzche=" + rzche + ", " +
               "rqchl=" + rqchl + ", " +
               "rqmcl=" + rqmcl + ", " +
               "rzrqye=" + rzrqye + 
               "}";
    }
}