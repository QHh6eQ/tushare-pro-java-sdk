package com.github.tushare.pro.bean;

/**
 * 日线行情
 */
public class DailyBean {

    protected String tsCode;  // 股票代码
    protected String tradeDate;  // 交易日期
    protected Double open;  // 开盘价
    protected Double high;  // 最高价
    protected Double low;  // 最低价
    protected Double close;  // 收盘价
    protected Double preClose;  // 昨收价
    protected Double change;  // 涨跌额
    protected Double pctChange;  // 涨跌幅
    protected Double vol;  // 成交量 （手）
    protected Double amount;  // 成交额 （千元）

    public String getTsCode() {
        return tsCode;
    }

    public DailyBean setTsCode(String tsCode) {
        this.tsCode = tsCode;
        return this;
    }

    public String getTradeDate() {
        return tradeDate;
    }

    public DailyBean setTradeDate(String tradeDate) {
        this.tradeDate = tradeDate;
        return this;
    }

    public Double getOpen() {
        return open;
    }

    public DailyBean setOpen(Double open) {
        this.open = open;
        return this;
    }

    public Double getHigh() {
        return high;
    }

    public DailyBean setHigh(Double high) {
        this.high = high;
        return this;
    }

    public Double getLow() {
        return low;
    }

    public DailyBean setLow(Double low) {
        this.low = low;
        return this;
    }

    public Double getClose() {
        return close;
    }

    public DailyBean setClose(Double close) {
        this.close = close;
        return this;
    }

    public Double getPreClose() {
        return preClose;
    }

    public DailyBean setPreClose(Double preClose) {
        this.preClose = preClose;
        return this;
    }

    public Double getChange() {
        return change;
    }

    public DailyBean setChange(Double change) {
        this.change = change;
        return this;
    }

    public Double getPctChange() {
        return pctChange;
    }

    public DailyBean setPctChange(Double pctChange) {
        this.pctChange = pctChange;
        return this;
    }

    public Double getVol() {
        return vol;
    }

    public DailyBean setVol(Double vol) {
        this.vol = vol;
        return this;
    }

    public Double getAmount() {
        return amount;
    }

    public DailyBean setAmount(Double amount) {
        this.amount = amount;
        return this;
    }

    @Override
    public String toString() {
        return "DailyBean{" +
               "tsCode=" + tsCode + ", " +
               "tradeDate=" + tradeDate + ", " +
               "open=" + open + ", " +
               "high=" + high + ", " +
               "low=" + low + ", " +
               "close=" + close + ", " +
               "preClose=" + preClose + ", " +
               "change=" + change + ", " +
               "pctChange=" + pctChange + ", " +
               "vol=" + vol + ", " +
               "amount=" + amount + 
               "}";
    }
}