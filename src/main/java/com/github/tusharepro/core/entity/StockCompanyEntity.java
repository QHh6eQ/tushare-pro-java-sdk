package com.github.tusharepro.core.entity;
import lombok.Data;

import com.github.tusharepro.core.bean.StockCompany;

import javax.persistence.*;
import java.time.LocalDate;

/**
 * 上市公司基本信息
 */
@Data
@Entity
@Table(name = "stock_company")
public class StockCompanyEntity implements StockCompany {

    @Id
    @Column(name = "ts_code") protected String tsCode;  // 股票代码
    @Column(name = "exchange") protected String exchange;  // 交易所代码 ，SSE上交所 SZSE深交所
    @Column(name = "chairman") protected String chairman;  // 法人代表
    @Column(name = "manager") protected String manager;  // 总经理
    @Column(name = "secretary") protected String secretary;  // 董秘
    @Column(name = "reg_capital") protected Double regCapital;  // 注册资本
    @Column(name = "setup_date") protected LocalDate setupDate;  // 注册日期
    @Column(name = "province") protected String province;  // 所在省份
    @Column(name = "city") protected String city;  // 所在城市
    @Column(name = "introduction", length = 4096) protected String introduction;  // 公司介绍
    @Column(name = "website") protected String website;  // 公司主页
    @Column(name = "email") protected String email;  // 电子邮件
    @Column(name = "office") protected String office;  // 办公室
    @Column(name = "employees") protected Integer employees;  // 员工人数
    @Column(name = "main_business", length = 2048) protected String mainBusiness;  // 主要业务及产品
    @Column(name = "business_scope", length = 4096) protected String businessScope;  // 经营范围

}