package com.github.tushare.pro.bean;

/**
 * 交易日历
 */
public class TradeCalBean {

    protected String exchange;  // 交易所 SSE上交所 SZSE深交所
    protected String calDate;  // 日历日期
    protected Integer isOpen;  // 是否交易 0休市 1交易
    protected String pretradeDate;  // 上一个交易日

    public String getExchange() {
        return exchange;
    }

    public TradeCalBean setExchange(String exchange) {
        this.exchange = exchange;
        return this;
    }

    public String getCalDate() {
        return calDate;
    }

    public TradeCalBean setCalDate(String calDate) {
        this.calDate = calDate;
        return this;
    }

    public Integer getIsOpen() {
        return isOpen;
    }

    public TradeCalBean setIsOpen(Integer isOpen) {
        this.isOpen = isOpen;
        return this;
    }

    public String getPretradeDate() {
        return pretradeDate;
    }

    public TradeCalBean setPretradeDate(String pretradeDate) {
        this.pretradeDate = pretradeDate;
        return this;
    }

    @Override
    public String toString() {
        return "TradeCalBean{" +
               "exchange=" + exchange + ", " +
               "calDate=" + calDate + ", " +
               "isOpen=" + isOpen + ", " +
               "pretradeDate=" + pretradeDate + 
               "}";
    }
}