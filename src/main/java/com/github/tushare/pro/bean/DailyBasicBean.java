package com.github.tushare.pro.bean;

/**
 * 每日指标
 */
public class DailyBasicBean {

    protected String tsCode;  // TS股票代码
    protected String tradeDate;  // 交易日期
    protected Double close;  // 当日收盘价
    protected Double turnoverRate;  // 换手率
    protected Double turnoverRateF;  // 换手率（自由流通股）
    protected Double volumeRatio;  // 量比
    protected Double pe;  // 市盈率（总市值/净利润）
    protected Double peTtm;  // 市盈率（TTM）
    protected Double pb;  // 市净率（总市值/净资产）
    protected Double ps;  // 市销率
    protected Double psTtm;  // 市销率（TTM）
    protected Double totalShare;  // 总股本 （万）
    protected Double floatShare;  // 流通股本 （万）
    protected Double freeShare;  // 自由流通股本 （万）
    protected Double totalMv;  // 总市值 （万元）
    protected Double circMv;  // 流通市值（万元）

    public String getTsCode() {
        return tsCode;
    }

    public DailyBasicBean setTsCode(String tsCode) {
        this.tsCode = tsCode;
        return this;
    }

    public String getTradeDate() {
        return tradeDate;
    }

    public DailyBasicBean setTradeDate(String tradeDate) {
        this.tradeDate = tradeDate;
        return this;
    }

    public Double getClose() {
        return close;
    }

    public DailyBasicBean setClose(Double close) {
        this.close = close;
        return this;
    }

    public Double getTurnoverRate() {
        return turnoverRate;
    }

    public DailyBasicBean setTurnoverRate(Double turnoverRate) {
        this.turnoverRate = turnoverRate;
        return this;
    }

    public Double getTurnoverRateF() {
        return turnoverRateF;
    }

    public DailyBasicBean setTurnoverRateF(Double turnoverRateF) {
        this.turnoverRateF = turnoverRateF;
        return this;
    }

    public Double getVolumeRatio() {
        return volumeRatio;
    }

    public DailyBasicBean setVolumeRatio(Double volumeRatio) {
        this.volumeRatio = volumeRatio;
        return this;
    }

    public Double getPe() {
        return pe;
    }

    public DailyBasicBean setPe(Double pe) {
        this.pe = pe;
        return this;
    }

    public Double getPeTtm() {
        return peTtm;
    }

    public DailyBasicBean setPeTtm(Double peTtm) {
        this.peTtm = peTtm;
        return this;
    }

    public Double getPb() {
        return pb;
    }

    public DailyBasicBean setPb(Double pb) {
        this.pb = pb;
        return this;
    }

    public Double getPs() {
        return ps;
    }

    public DailyBasicBean setPs(Double ps) {
        this.ps = ps;
        return this;
    }

    public Double getPsTtm() {
        return psTtm;
    }

    public DailyBasicBean setPsTtm(Double psTtm) {
        this.psTtm = psTtm;
        return this;
    }

    public Double getTotalShare() {
        return totalShare;
    }

    public DailyBasicBean setTotalShare(Double totalShare) {
        this.totalShare = totalShare;
        return this;
    }

    public Double getFloatShare() {
        return floatShare;
    }

    public DailyBasicBean setFloatShare(Double floatShare) {
        this.floatShare = floatShare;
        return this;
    }

    public Double getFreeShare() {
        return freeShare;
    }

    public DailyBasicBean setFreeShare(Double freeShare) {
        this.freeShare = freeShare;
        return this;
    }

    public Double getTotalMv() {
        return totalMv;
    }

    public DailyBasicBean setTotalMv(Double totalMv) {
        this.totalMv = totalMv;
        return this;
    }

    public Double getCircMv() {
        return circMv;
    }

    public DailyBasicBean setCircMv(Double circMv) {
        this.circMv = circMv;
        return this;
    }

    @Override
    public String toString() {
        return "DailyBasicBean{" +
               "tsCode=" + tsCode + ", " +
               "tradeDate=" + tradeDate + ", " +
               "close=" + close + ", " +
               "turnoverRate=" + turnoverRate + ", " +
               "turnoverRateF=" + turnoverRateF + ", " +
               "volumeRatio=" + volumeRatio + ", " +
               "pe=" + pe + ", " +
               "peTtm=" + peTtm + ", " +
               "pb=" + pb + ", " +
               "ps=" + ps + ", " +
               "psTtm=" + psTtm + ", " +
               "totalShare=" + totalShare + ", " +
               "floatShare=" + floatShare + ", " +
               "freeShare=" + freeShare + ", " +
               "totalMv=" + totalMv + ", " +
               "circMv=" + circMv + 
               "}";
    }
}