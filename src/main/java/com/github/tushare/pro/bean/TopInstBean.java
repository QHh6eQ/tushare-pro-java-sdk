package com.github.tushare.pro.bean;

/**
 * 龙虎榜机构明细
 */
public class TopInstBean {

    protected String tradeDate;  // 交易日期
    protected String tsCode;  // TS代码
    protected String exalter;  // 营业部名称
    protected Double buy;  // 买入额（万）
    protected Double buyRate;  // 买入占总成交比例
    protected Double sell;  // 卖出额（万）
    protected Double sellRate;  // 卖出占总成交比例
    protected Double netBuy;  // 净成交额（万）

    public String getTradeDate() {
        return tradeDate;
    }

    public TopInstBean setTradeDate(String tradeDate) {
        this.tradeDate = tradeDate;
        return this;
    }

    public String getTsCode() {
        return tsCode;
    }

    public TopInstBean setTsCode(String tsCode) {
        this.tsCode = tsCode;
        return this;
    }

    public String getExalter() {
        return exalter;
    }

    public TopInstBean setExalter(String exalter) {
        this.exalter = exalter;
        return this;
    }

    public Double getBuy() {
        return buy;
    }

    public TopInstBean setBuy(Double buy) {
        this.buy = buy;
        return this;
    }

    public Double getBuyRate() {
        return buyRate;
    }

    public TopInstBean setBuyRate(Double buyRate) {
        this.buyRate = buyRate;
        return this;
    }

    public Double getSell() {
        return sell;
    }

    public TopInstBean setSell(Double sell) {
        this.sell = sell;
        return this;
    }

    public Double getSellRate() {
        return sellRate;
    }

    public TopInstBean setSellRate(Double sellRate) {
        this.sellRate = sellRate;
        return this;
    }

    public Double getNetBuy() {
        return netBuy;
    }

    public TopInstBean setNetBuy(Double netBuy) {
        this.netBuy = netBuy;
        return this;
    }

    @Override
    public String toString() {
        return "TopInstBean{" +
               "tradeDate=" + tradeDate + ", " +
               "tsCode=" + tsCode + ", " +
               "exalter=" + exalter + ", " +
               "buy=" + buy + ", " +
               "buyRate=" + buyRate + ", " +
               "sell=" + sell + ", " +
               "sellRate=" + sellRate + ", " +
               "netBuy=" + netBuy + 
               "}";
    }
}