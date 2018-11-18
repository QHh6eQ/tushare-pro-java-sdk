package com.github.tushare.pro.bean;

/**
 * 沪深股通十大成交股
 */
public class HsgtTop10Bean {

    protected String tradeDate;  // 交易日期
    protected String tsCode;  // 股票代码
    protected String name;  // 股票名称
    protected Double close;  // 收盘价
    protected Double change;  // 涨跌额
    protected Integer rank;  // 资金排名
    protected String marketType;  // 市场类型（1：沪市 3：深市）
    protected Double amount;  // 成交金额（元）
    protected Double netAmount;  // 净成交金额（元）
    protected Double buy;  // 买入金额（元）
    protected Double sell;  // 卖出金额（元）

    public String getTradeDate() {
        return tradeDate;
    }

    public HsgtTop10Bean setTradeDate(String tradeDate) {
        this.tradeDate = tradeDate;
        return this;
    }

    public String getTsCode() {
        return tsCode;
    }

    public HsgtTop10Bean setTsCode(String tsCode) {
        this.tsCode = tsCode;
        return this;
    }

    public String getName() {
        return name;
    }

    public HsgtTop10Bean setName(String name) {
        this.name = name;
        return this;
    }

    public Double getClose() {
        return close;
    }

    public HsgtTop10Bean setClose(Double close) {
        this.close = close;
        return this;
    }

    public Double getChange() {
        return change;
    }

    public HsgtTop10Bean setChange(Double change) {
        this.change = change;
        return this;
    }

    public Integer getRank() {
        return rank;
    }

    public HsgtTop10Bean setRank(Integer rank) {
        this.rank = rank;
        return this;
    }

    public String getMarketType() {
        return marketType;
    }

    public HsgtTop10Bean setMarketType(String marketType) {
        this.marketType = marketType;
        return this;
    }

    public Double getAmount() {
        return amount;
    }

    public HsgtTop10Bean setAmount(Double amount) {
        this.amount = amount;
        return this;
    }

    public Double getNetAmount() {
        return netAmount;
    }

    public HsgtTop10Bean setNetAmount(Double netAmount) {
        this.netAmount = netAmount;
        return this;
    }

    public Double getBuy() {
        return buy;
    }

    public HsgtTop10Bean setBuy(Double buy) {
        this.buy = buy;
        return this;
    }

    public Double getSell() {
        return sell;
    }

    public HsgtTop10Bean setSell(Double sell) {
        this.sell = sell;
        return this;
    }

    @Override
    public String toString() {
        return "HsgtTop10Bean{" +
               "tradeDate=" + tradeDate + ", " +
               "tsCode=" + tsCode + ", " +
               "name=" + name + ", " +
               "close=" + close + ", " +
               "change=" + change + ", " +
               "rank=" + rank + ", " +
               "marketType=" + marketType + ", " +
               "amount=" + amount + ", " +
               "netAmount=" + netAmount + ", " +
               "buy=" + buy + ", " +
               "sell=" + sell + 
               "}";
    }
}