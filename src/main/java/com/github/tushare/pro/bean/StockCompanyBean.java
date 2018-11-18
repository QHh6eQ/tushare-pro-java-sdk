package com.github.tushare.pro.bean;

/**
 * 上市公司基本信息
 */
public class StockCompanyBean {

    protected String tsCode;  // 股票代码
    protected String exchange;  // 交易所代码 ，SSE上交所 SZSE深交所
    protected String chairman;  // 法人代表
    protected String manager;  // 总经理
    protected String secretary;  // 董秘
    protected Double regCapital;  // 注册资本
    protected String setupDate;  // 注册日期
    protected String province;  // 所在省份
    protected String city;  // 所在城市
    protected String introduction;  // 公司介绍
    protected String website;  // 公司主页
    protected String email;  // 电子邮件
    protected String office;  // 办公室
    protected Integer employees;  // 员工人数
    protected String mainBusiness;  // 主要业务及产品
    protected String businessScope;  // 经营范围

    public String getTsCode() {
        return tsCode;
    }

    public StockCompanyBean setTsCode(String tsCode) {
        this.tsCode = tsCode;
        return this;
    }

    public String getExchange() {
        return exchange;
    }

    public StockCompanyBean setExchange(String exchange) {
        this.exchange = exchange;
        return this;
    }

    public String getChairman() {
        return chairman;
    }

    public StockCompanyBean setChairman(String chairman) {
        this.chairman = chairman;
        return this;
    }

    public String getManager() {
        return manager;
    }

    public StockCompanyBean setManager(String manager) {
        this.manager = manager;
        return this;
    }

    public String getSecretary() {
        return secretary;
    }

    public StockCompanyBean setSecretary(String secretary) {
        this.secretary = secretary;
        return this;
    }

    public Double getRegCapital() {
        return regCapital;
    }

    public StockCompanyBean setRegCapital(Double regCapital) {
        this.regCapital = regCapital;
        return this;
    }

    public String getSetupDate() {
        return setupDate;
    }

    public StockCompanyBean setSetupDate(String setupDate) {
        this.setupDate = setupDate;
        return this;
    }

    public String getProvince() {
        return province;
    }

    public StockCompanyBean setProvince(String province) {
        this.province = province;
        return this;
    }

    public String getCity() {
        return city;
    }

    public StockCompanyBean setCity(String city) {
        this.city = city;
        return this;
    }

    public String getIntroduction() {
        return introduction;
    }

    public StockCompanyBean setIntroduction(String introduction) {
        this.introduction = introduction;
        return this;
    }

    public String getWebsite() {
        return website;
    }

    public StockCompanyBean setWebsite(String website) {
        this.website = website;
        return this;
    }

    public String getEmail() {
        return email;
    }

    public StockCompanyBean setEmail(String email) {
        this.email = email;
        return this;
    }

    public String getOffice() {
        return office;
    }

    public StockCompanyBean setOffice(String office) {
        this.office = office;
        return this;
    }

    public Integer getEmployees() {
        return employees;
    }

    public StockCompanyBean setEmployees(Integer employees) {
        this.employees = employees;
        return this;
    }

    public String getMainBusiness() {
        return mainBusiness;
    }

    public StockCompanyBean setMainBusiness(String mainBusiness) {
        this.mainBusiness = mainBusiness;
        return this;
    }

    public String getBusinessScope() {
        return businessScope;
    }

    public StockCompanyBean setBusinessScope(String businessScope) {
        this.businessScope = businessScope;
        return this;
    }

    @Override
    public String toString() {
        return "StockCompanyBean{" +
               "tsCode=" + tsCode + ", " +
               "exchange=" + exchange + ", " +
               "chairman=" + chairman + ", " +
               "manager=" + manager + ", " +
               "secretary=" + secretary + ", " +
               "regCapital=" + regCapital + ", " +
               "setupDate=" + setupDate + ", " +
               "province=" + province + ", " +
               "city=" + city + ", " +
               "introduction=" + introduction + ", " +
               "website=" + website + ", " +
               "email=" + email + ", " +
               "office=" + office + ", " +
               "employees=" + employees + ", " +
               "mainBusiness=" + mainBusiness + ", " +
               "businessScope=" + businessScope + 
               "}";
    }
}