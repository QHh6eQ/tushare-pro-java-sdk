package com.github.tushare.pro.bean;

/**
 * 龙虎榜每日明细
 */
public class TopListBean {

    protected String tradeDate;  // 交易日期
    protected String tsCode;  // TS代码
    protected String name;  // 名称
    protected Double close;  // 收盘价
    protected Double pctChange;  // 涨跌幅
    protected Double turnoverRate;  // 换手率
    protected Double amount;  // 总成交额
    protected Double lSell;  // 龙虎榜卖出额
    protected Double lBuy;  // 龙虎榜买入额
    protected Double lAmount;  // 龙虎榜成交额
    protected Double netAmount;  // 龙虎榜净买入额
    protected Double netRate;  // 龙虎榜净买额占比
    protected Double amountRate;  // 龙虎榜成交额占比
    protected Double floatValues;  // 当日流通市值
    protected String reason;  // 上榜理由

    public String getTradeDate() {
        return tradeDate;
    }

    public TopListBean setTradeDate(String tradeDate) {
        this.tradeDate = tradeDate;
        return this;
    }

    public String getTsCode() {
        return tsCode;
    }

    public TopListBean setTsCode(String tsCode) {
        this.tsCode = tsCode;
        return this;
    }

    public String getName() {
        return name;
    }

    public TopListBean setName(String name) {
        this.name = name;
        return this;
    }

    public Double getClose() {
        return close;
    }

    public TopListBean setClose(Double close) {
        this.close = close;
        return this;
    }

    public Double getPctChange() {
        return pctChange;
    }

    public TopListBean setPctChange(Double pctChange) {
        this.pctChange = pctChange;
        return this;
    }

    public Double getTurnoverRate() {
        return turnoverRate;
    }

    public TopListBean setTurnoverRate(Double turnoverRate) {
        this.turnoverRate = turnoverRate;
        return this;
    }

    public Double getAmount() {
        return amount;
    }

    public TopListBean setAmount(Double amount) {
        this.amount = amount;
        return this;
    }

    public Double getLSell() {
        return lSell;
    }

    public TopListBean setLSell(Double lSell) {
        this.lSell = lSell;
        return this;
    }

    public Double getLBuy() {
        return lBuy;
    }

    public TopListBean setLBuy(Double lBuy) {
        this.lBuy = lBuy;
        return this;
    }

    public Double getLAmount() {
        return lAmount;
    }

    public TopListBean setLAmount(Double lAmount) {
        this.lAmount = lAmount;
        return this;
    }

    public Double getNetAmount() {
        return netAmount;
    }

    public TopListBean setNetAmount(Double netAmount) {
        this.netAmount = netAmount;
        return this;
    }

    public Double getNetRate() {
        return netRate;
    }

    public TopListBean setNetRate(Double netRate) {
        this.netRate = netRate;
        return this;
    }

    public Double getAmountRate() {
        return amountRate;
    }

    public TopListBean setAmountRate(Double amountRate) {
        this.amountRate = amountRate;
        return this;
    }

    public Double getFloatValues() {
        return floatValues;
    }

    public TopListBean setFloatValues(Double floatValues) {
        this.floatValues = floatValues;
        return this;
    }

    public String getReason() {
        return reason;
    }

    public TopListBean setReason(String reason) {
        this.reason = reason;
        return this;
    }

    @Override
    public String toString() {
        return "TopListBean{" +
               "tradeDate=" + tradeDate + ", " +
               "tsCode=" + tsCode + ", " +
               "name=" + name + ", " +
               "close=" + close + ", " +
               "pctChange=" + pctChange + ", " +
               "turnoverRate=" + turnoverRate + ", " +
               "amount=" + amount + ", " +
               "lSell=" + lSell + ", " +
               "lBuy=" + lBuy + ", " +
               "lAmount=" + lAmount + ", " +
               "netAmount=" + netAmount + ", " +
               "netRate=" + netRate + ", " +
               "amountRate=" + amountRate + ", " +
               "floatValues=" + floatValues + ", " +
               "reason=" + reason + 
               "}";
    }
}