package com.github.tushare.pro.bean;

/**
 * 指数基本信息
 */
public class IndexBasicBean {

    protected String tsCode;  // TS代码
    protected String name;  // 简称
    protected String fullname;  // 指数全称
    protected String market;  // 市场
    protected String publisher;  // 发布方
    protected String indexType;  // 指数风格
    protected String category;  // 指数类别
    protected String baseDate;  // 基期
    protected Double basePoint;  // 基点
    protected String listDate;  // 发布日期
    protected String weightRule;  // 加权方式
    protected String desc;  // 描述
    protected String expDate;  // 终止日期

    public String getTsCode() {
        return tsCode;
    }

    public IndexBasicBean setTsCode(String tsCode) {
        this.tsCode = tsCode;
        return this;
    }

    public String getName() {
        return name;
    }

    public IndexBasicBean setName(String name) {
        this.name = name;
        return this;
    }

    public String getFullname() {
        return fullname;
    }

    public IndexBasicBean setFullname(String fullname) {
        this.fullname = fullname;
        return this;
    }

    public String getMarket() {
        return market;
    }

    public IndexBasicBean setMarket(String market) {
        this.market = market;
        return this;
    }

    public String getPublisher() {
        return publisher;
    }

    public IndexBasicBean setPublisher(String publisher) {
        this.publisher = publisher;
        return this;
    }

    public String getIndexType() {
        return indexType;
    }

    public IndexBasicBean setIndexType(String indexType) {
        this.indexType = indexType;
        return this;
    }

    public String getCategory() {
        return category;
    }

    public IndexBasicBean setCategory(String category) {
        this.category = category;
        return this;
    }

    public String getBaseDate() {
        return baseDate;
    }

    public IndexBasicBean setBaseDate(String baseDate) {
        this.baseDate = baseDate;
        return this;
    }

    public Double getBasePoint() {
        return basePoint;
    }

    public IndexBasicBean setBasePoint(Double basePoint) {
        this.basePoint = basePoint;
        return this;
    }

    public String getListDate() {
        return listDate;
    }

    public IndexBasicBean setListDate(String listDate) {
        this.listDate = listDate;
        return this;
    }

    public String getWeightRule() {
        return weightRule;
    }

    public IndexBasicBean setWeightRule(String weightRule) {
        this.weightRule = weightRule;
        return this;
    }

    public String getDesc() {
        return desc;
    }

    public IndexBasicBean setDesc(String desc) {
        this.desc = desc;
        return this;
    }

    public String getExpDate() {
        return expDate;
    }

    public IndexBasicBean setExpDate(String expDate) {
        this.expDate = expDate;
        return this;
    }

    @Override
    public String toString() {
        return "IndexBasicBean{" +
               "tsCode=" + tsCode + ", " +
               "name=" + name + ", " +
               "fullname=" + fullname + ", " +
               "market=" + market + ", " +
               "publisher=" + publisher + ", " +
               "indexType=" + indexType + ", " +
               "category=" + category + ", " +
               "baseDate=" + baseDate + ", " +
               "basePoint=" + basePoint + ", " +
               "listDate=" + listDate + ", " +
               "weightRule=" + weightRule + ", " +
               "desc=" + desc + ", " +
               "expDate=" + expDate + 
               "}";
    }
}