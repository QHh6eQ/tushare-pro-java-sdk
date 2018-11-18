package com.github.tushare.pro.bean;

/**
 * 指数成分和权重
 */
public class IndexWeigthBean {

    protected String indexCode;  // 指数代码
    protected String conCode;  // 成分代码
    protected String tradeDate;  // 交易日期
    protected Double weight;  // 权重

    public String getIndexCode() {
        return indexCode;
    }

    public IndexWeigthBean setIndexCode(String indexCode) {
        this.indexCode = indexCode;
        return this;
    }

    public String getConCode() {
        return conCode;
    }

    public IndexWeigthBean setConCode(String conCode) {
        this.conCode = conCode;
        return this;
    }

    public String getTradeDate() {
        return tradeDate;
    }

    public IndexWeigthBean setTradeDate(String tradeDate) {
        this.tradeDate = tradeDate;
        return this;
    }

    public Double getWeight() {
        return weight;
    }

    public IndexWeigthBean setWeight(Double weight) {
        this.weight = weight;
        return this;
    }

    @Override
    public String toString() {
        return "IndexWeigthBean{" +
               "indexCode=" + indexCode + ", " +
               "conCode=" + conCode + ", " +
               "tradeDate=" + tradeDate + ", " +
               "weight=" + weight + 
               "}";
    }
}