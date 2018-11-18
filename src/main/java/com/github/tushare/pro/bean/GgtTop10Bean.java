package com.github.tushare.pro.bean;

/**
 * 港股通十大成交股
 */
public class GgtTop10Bean {

    protected String tradeDate;  // 交易日期
    protected String tsCode;  // 股票代码
    protected String name;  // 股票名称
    protected Double close;  // 收盘价
    protected Double pChange;  // 涨跌幅
    protected String rank;  // 资金排名
    protected String marketType;  // 市场类型 2：港股通（沪） 4：港股通（深）
    protected Double amount;  // 累计成交金额（元）
    protected Double netAmount;  // 净买入金额（元）
    protected Double shAmount;  // 沪市成交金额（元）
    protected Double shNetAmount;  // 沪市净买入金额（元）
    protected Double shBuy;  // 沪市买入金额（元）
    protected Double shSell;  // 沪市卖出金额
    protected Double szAmount;  // 深市成交金额（元）
    protected Double szNetAmount;  // 深市净买入金额（元）
    protected Double szBuy;  // 深市买入金额（元）
    protected Double szSell;  // 深市卖出金额（元）

    public String getTradeDate() {
        return tradeDate;
    }

    public GgtTop10Bean setTradeDate(String tradeDate) {
        this.tradeDate = tradeDate;
        return this;
    }

    public String getTsCode() {
        return tsCode;
    }

    public GgtTop10Bean setTsCode(String tsCode) {
        this.tsCode = tsCode;
        return this;
    }

    public String getName() {
        return name;
    }

    public GgtTop10Bean setName(String name) {
        this.name = name;
        return this;
    }

    public Double getClose() {
        return close;
    }

    public GgtTop10Bean setClose(Double close) {
        this.close = close;
        return this;
    }

    public Double getPChange() {
        return pChange;
    }

    public GgtTop10Bean setPChange(Double pChange) {
        this.pChange = pChange;
        return this;
    }

    public String getRank() {
        return rank;
    }

    public GgtTop10Bean setRank(String rank) {
        this.rank = rank;
        return this;
    }

    public String getMarketType() {
        return marketType;
    }

    public GgtTop10Bean setMarketType(String marketType) {
        this.marketType = marketType;
        return this;
    }

    public Double getAmount() {
        return amount;
    }

    public GgtTop10Bean setAmount(Double amount) {
        this.amount = amount;
        return this;
    }

    public Double getNetAmount() {
        return netAmount;
    }

    public GgtTop10Bean setNetAmount(Double netAmount) {
        this.netAmount = netAmount;
        return this;
    }

    public Double getShAmount() {
        return shAmount;
    }

    public GgtTop10Bean setShAmount(Double shAmount) {
        this.shAmount = shAmount;
        return this;
    }

    public Double getShNetAmount() {
        return shNetAmount;
    }

    public GgtTop10Bean setShNetAmount(Double shNetAmount) {
        this.shNetAmount = shNetAmount;
        return this;
    }

    public Double getShBuy() {
        return shBuy;
    }

    public GgtTop10Bean setShBuy(Double shBuy) {
        this.shBuy = shBuy;
        return this;
    }

    public Double getShSell() {
        return shSell;
    }

    public GgtTop10Bean setShSell(Double shSell) {
        this.shSell = shSell;
        return this;
    }

    public Double getSzAmount() {
        return szAmount;
    }

    public GgtTop10Bean setSzAmount(Double szAmount) {
        this.szAmount = szAmount;
        return this;
    }

    public Double getSzNetAmount() {
        return szNetAmount;
    }

    public GgtTop10Bean setSzNetAmount(Double szNetAmount) {
        this.szNetAmount = szNetAmount;
        return this;
    }

    public Double getSzBuy() {
        return szBuy;
    }

    public GgtTop10Bean setSzBuy(Double szBuy) {
        this.szBuy = szBuy;
        return this;
    }

    public Double getSzSell() {
        return szSell;
    }

    public GgtTop10Bean setSzSell(Double szSell) {
        this.szSell = szSell;
        return this;
    }

    @Override
    public String toString() {
        return "GgtTop10Bean{" +
               "tradeDate=" + tradeDate + ", " +
               "tsCode=" + tsCode + ", " +
               "name=" + name + ", " +
               "close=" + close + ", " +
               "pChange=" + pChange + ", " +
               "rank=" + rank + ", " +
               "marketType=" + marketType + ", " +
               "amount=" + amount + ", " +
               "netAmount=" + netAmount + ", " +
               "shAmount=" + shAmount + ", " +
               "shNetAmount=" + shNetAmount + ", " +
               "shBuy=" + shBuy + ", " +
               "shSell=" + shSell + ", " +
               "szAmount=" + szAmount + ", " +
               "szNetAmount=" + szNetAmount + ", " +
               "szBuy=" + szBuy + ", " +
               "szSell=" + szSell + 
               "}";
    }
}