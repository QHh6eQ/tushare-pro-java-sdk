package com.github.tushare.pro.bean;

/**
 * 融资融券交易汇总
 */
public class MarginBean {

    protected String tradeDate;  // 交易日期
    protected String exchangeId;  // 交易所代码（SSE上交所SZSE深交所）
    protected Double rzye;  // 融资余额(元)
    protected Double rzmre;  // 融资买入额(元)
    protected Double rzche;  // 融资偿还额(元)
    protected Double rqye;  // 融券余额(元)
    protected Double rqmcl;  // 融券卖出量(股,份,手)
    protected Double rzrqye;  // 融资融券余额(元)

    public String getTradeDate() {
        return tradeDate;
    }

    public MarginBean setTradeDate(String tradeDate) {
        this.tradeDate = tradeDate;
        return this;
    }

    public String getExchangeId() {
        return exchangeId;
    }

    public MarginBean setExchangeId(String exchangeId) {
        this.exchangeId = exchangeId;
        return this;
    }

    public Double getRzye() {
        return rzye;
    }

    public MarginBean setRzye(Double rzye) {
        this.rzye = rzye;
        return this;
    }

    public Double getRzmre() {
        return rzmre;
    }

    public MarginBean setRzmre(Double rzmre) {
        this.rzmre = rzmre;
        return this;
    }

    public Double getRzche() {
        return rzche;
    }

    public MarginBean setRzche(Double rzche) {
        this.rzche = rzche;
        return this;
    }

    public Double getRqye() {
        return rqye;
    }

    public MarginBean setRqye(Double rqye) {
        this.rqye = rqye;
        return this;
    }

    public Double getRqmcl() {
        return rqmcl;
    }

    public MarginBean setRqmcl(Double rqmcl) {
        this.rqmcl = rqmcl;
        return this;
    }

    public Double getRzrqye() {
        return rzrqye;
    }

    public MarginBean setRzrqye(Double rzrqye) {
        this.rzrqye = rzrqye;
        return this;
    }

    @Override
    public String toString() {
        return "MarginBean{" +
               "tradeDate=" + tradeDate + ", " +
               "exchangeId=" + exchangeId + ", " +
               "rzye=" + rzye + ", " +
               "rzmre=" + rzmre + ", " +
               "rzche=" + rzche + ", " +
               "rqye=" + rqye + ", " +
               "rqmcl=" + rqmcl + ", " +
               "rzrqye=" + rzrqye + 
               "}";
    }
}