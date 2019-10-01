package com.github.tusharepro.core.entity;
import lombok.Data;

import com.github.tusharepro.core.bean.FundCompany;

import javax.persistence.*;
import java.time.LocalDate;

/**
 * 公募基金公司
 * https://tushare.pro/document/2?doc_id=118
 */
@Data
@Entity
@Table(name = "fund_company")
public class FundCompanyEntity implements FundCompany {

    @Id
    @Column(name = "name") protected String name;  // 基金公司名称
    @Column(name = "shortname") protected String shortname;  // 简称
    @Column(name = "short_enname") protected String shortEnname;  // 英文缩写
    @Column(name = "province") protected String province;  // 省份
    @Column(name = "city") protected String city;  // 城市
    @Column(name = "address") protected String address;  // 注册地址
    @Column(name = "phone") protected String phone;  // 电话
    @Column(name = "office") protected String office;  // 办公地址
    @Column(name = "website") protected String website;  // 公司网址
    @Column(name = "chairman") protected String chairman;  // 法人代表
    @Column(name = "manager") protected String manager;  // 总经理
    @Column(name = "reg_capital") protected Double regCapital;  // 注册资本
    @Column(name = "setup_date") protected LocalDate setupDate;  // 成立日期
    @Column(name = "end_date") protected LocalDate endDate;  // 公司终止日期
    @Column(name = "employees") protected Double employees;  // 员工总数
    @Column(name = "main_business") protected String mainBusiness;  // 主要产品及业务
    @Column(name = "org_code") protected String orgCode;  // 组织机构代码
    @Column(name = "credit_code") protected String creditCode;  // 统一社会信用代码

}