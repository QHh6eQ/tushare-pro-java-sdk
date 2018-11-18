package com.github.tushare.pro.bean;

/**
 * 股票列表
 */
public class StockBasicBean {

    protected String tsCode;  // TS代码
    protected String symbol;  // 股票代码
    protected String name;  // 股票名称
    protected String area;  // 所在地域
    protected String industry;  // 所属行业
    protected String fullname;  // 股票全称
    protected String enname;  // 英文全称
    protected String market;  // 市场类型 （主板/中小板/创业板）
    protected String exchange;  // 交易所代码
    protected String currType;  // 交易货币
    protected String listStatus;  // 上市状态： L上市 D退市 P暂停上市
    protected String listDate;  // 上市日期
    protected String delistDate;  // 退市日期
    protected String isHs;  // 是否沪深港通标的，N否 H沪股通 S深股通

    public String getTsCode() {
        return tsCode;
    }

    public StockBasicBean setTsCode(String tsCode) {
        this.tsCode = tsCode;
        return this;
    }

    public String getSymbol() {
        return symbol;
    }

    public StockBasicBean setSymbol(String symbol) {
        this.symbol = symbol;
        return this;
    }

    public String getName() {
        return name;
    }

    public StockBasicBean setName(String name) {
        this.name = name;
        return this;
    }

    public String getArea() {
        return area;
    }

    public StockBasicBean setArea(String area) {
        this.area = area;
        return this;
    }

    public String getIndustry() {
        return industry;
    }

    public StockBasicBean setIndustry(String industry) {
        this.industry = industry;
        return this;
    }

    public String getFullname() {
        return fullname;
    }

    public StockBasicBean setFullname(String fullname) {
        this.fullname = fullname;
        return this;
    }

    public String getEnname() {
        return enname;
    }

    public StockBasicBean setEnname(String enname) {
        this.enname = enname;
        return this;
    }

    public String getMarket() {
        return market;
    }

    public StockBasicBean setMarket(String market) {
        this.market = market;
        return this;
    }

    public String getExchange() {
        return exchange;
    }

    public StockBasicBean setExchange(String exchange) {
        this.exchange = exchange;
        return this;
    }

    public String getCurrType() {
        return currType;
    }

    public StockBasicBean setCurrType(String currType) {
        this.currType = currType;
        return this;
    }

    public String getListStatus() {
        return listStatus;
    }

    public StockBasicBean setListStatus(String listStatus) {
        this.listStatus = listStatus;
        return this;
    }

    public String getListDate() {
        return listDate;
    }

    public StockBasicBean setListDate(String listDate) {
        this.listDate = listDate;
        return this;
    }

    public String getDelistDate() {
        return delistDate;
    }

    public StockBasicBean setDelistDate(String delistDate) {
        this.delistDate = delistDate;
        return this;
    }

    public String getIsHs() {
        return isHs;
    }

    public StockBasicBean setIsHs(String isHs) {
        this.isHs = isHs;
        return this;
    }

    @Override
    public String toString() {
        return "StockBasicBean{" +
               "tsCode=" + tsCode + ", " +
               "symbol=" + symbol + ", " +
               "name=" + name + ", " +
               "area=" + area + ", " +
               "industry=" + industry + ", " +
               "fullname=" + fullname + ", " +
               "enname=" + enname + ", " +
               "market=" + market + ", " +
               "exchange=" + exchange + ", " +
               "currType=" + currType + ", " +
               "listStatus=" + listStatus + ", " +
               "listDate=" + listDate + ", " +
               "delistDate=" + delistDate + ", " +
               "isHs=" + isHs + 
               "}";
    }
}