package com.github.tushare.pro.bean;

/**
 * 沪深港通资金流向
 */
public class MoneyflowHsgtBean {

    protected String tradeDate;  // 交易日期
    protected String ggtSs;  // 港股通（上海）
    protected String ggtSz;  // 港股通（深圳）
    protected String hgt;  // 沪股通（百万元）
    protected String sgt;  // 深股通（百万元）
    protected String northMoney;  // 北向资金（百万元）
    protected String southMoney;  // 南向资金（百万元）

    public String getTradeDate() {
        return tradeDate;
    }

    public MoneyflowHsgtBean setTradeDate(String tradeDate) {
        this.tradeDate = tradeDate;
        return this;
    }

    public String getGgtSs() {
        return ggtSs;
    }

    public MoneyflowHsgtBean setGgtSs(String ggtSs) {
        this.ggtSs = ggtSs;
        return this;
    }

    public String getGgtSz() {
        return ggtSz;
    }

    public MoneyflowHsgtBean setGgtSz(String ggtSz) {
        this.ggtSz = ggtSz;
        return this;
    }

    public String getHgt() {
        return hgt;
    }

    public MoneyflowHsgtBean setHgt(String hgt) {
        this.hgt = hgt;
        return this;
    }

    public String getSgt() {
        return sgt;
    }

    public MoneyflowHsgtBean setSgt(String sgt) {
        this.sgt = sgt;
        return this;
    }

    public String getNorthMoney() {
        return northMoney;
    }

    public MoneyflowHsgtBean setNorthMoney(String northMoney) {
        this.northMoney = northMoney;
        return this;
    }

    public String getSouthMoney() {
        return southMoney;
    }

    public MoneyflowHsgtBean setSouthMoney(String southMoney) {
        this.southMoney = southMoney;
        return this;
    }

    @Override
    public String toString() {
        return "MoneyflowHsgtBean{" +
               "tradeDate=" + tradeDate + ", " +
               "ggtSs=" + ggtSs + ", " +
               "ggtSz=" + ggtSz + ", " +
               "hgt=" + hgt + ", " +
               "sgt=" + sgt + ", " +
               "northMoney=" + northMoney + ", " +
               "southMoney=" + southMoney + 
               "}";
    }
}