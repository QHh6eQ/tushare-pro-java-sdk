package com.github.tushare.pro.bean;

/**
 * 指数日线行情
 */
public class IndexDailyBean {

    protected String tsCode;  // TS指数代码
    protected String tradeDate;  // 交易日
    protected Double close;  // 收盘点位
    protected Double open;  // 开盘点位
    protected Double high;  // 最高点位
    protected Double low;  // 最低点位
    protected Double preClose;  // 昨日收盘点
    protected Double change;  // 涨跌点
    protected Double pctChange;  // 涨跌幅
    protected Double vol;  // 成交量（手）
    protected Double amount;  // 成交额（千元）

    public String getTsCode() {
        return tsCode;
    }

    public IndexDailyBean setTsCode(String tsCode) {
        this.tsCode = tsCode;
        return this;
    }

    public String getTradeDate() {
        return tradeDate;
    }

    public IndexDailyBean setTradeDate(String tradeDate) {
        this.tradeDate = tradeDate;
        return this;
    }

    public Double getClose() {
        return close;
    }

    public IndexDailyBean setClose(Double close) {
        this.close = close;
        return this;
    }

    public Double getOpen() {
        return open;
    }

    public IndexDailyBean setOpen(Double open) {
        this.open = open;
        return this;
    }

    public Double getHigh() {
        return high;
    }

    public IndexDailyBean setHigh(Double high) {
        this.high = high;
        return this;
    }

    public Double getLow() {
        return low;
    }

    public IndexDailyBean setLow(Double low) {
        this.low = low;
        return this;
    }

    public Double getPreClose() {
        return preClose;
    }

    public IndexDailyBean setPreClose(Double preClose) {
        this.preClose = preClose;
        return this;
    }

    public Double getChange() {
        return change;
    }

    public IndexDailyBean setChange(Double change) {
        this.change = change;
        return this;
    }

    public Double getPctChange() {
        return pctChange;
    }

    public IndexDailyBean setPctChange(Double pctChange) {
        this.pctChange = pctChange;
        return this;
    }

    public Double getVol() {
        return vol;
    }

    public IndexDailyBean setVol(Double vol) {
        this.vol = vol;
        return this;
    }

    public Double getAmount() {
        return amount;
    }

    public IndexDailyBean setAmount(Double amount) {
        this.amount = amount;
        return this;
    }

    @Override
    public String toString() {
        return "IndexDailyBean{" +
               "tsCode=" + tsCode + ", " +
               "tradeDate=" + tradeDate + ", " +
               "close=" + close + ", " +
               "open=" + open + ", " +
               "high=" + high + ", " +
               "low=" + low + ", " +
               "preClose=" + preClose + ", " +
               "change=" + change + ", " +
               "pctChange=" + pctChange + ", " +
               "vol=" + vol + ", " +
               "amount=" + amount + 
               "}";
    }
}