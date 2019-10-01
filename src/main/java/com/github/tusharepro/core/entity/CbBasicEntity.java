package com.github.tusharepro.core.entity;
import lombok.Data;

import com.github.tusharepro.core.bean.CbBasic;

import javax.persistence.*;
import java.time.LocalDate;

/**
 * 可转债基本信息
 * https://tushare.pro/document/2?doc_id=185
 */
@Data
@Entity
@Table(name = "cb_basic")
public class CbBasicEntity implements CbBasic {

    @Id
    @Column(name = "ts_code") protected String tsCode;  // 转债代码
    @Column(name = "bond_full_name") protected String bondFullName;  // 转债名称
    @Column(name = "bond_short_name") protected String bondShortName;  // 转债简称
    @Column(name = "stk_code") protected String stkCode;  // 正股代码
    @Column(name = "stk_short_name") protected String stkShortName;  // 正股简称
    @Column(name = "maturity") protected Double maturity;  // 发行期限（年）
    @Column(name = "par") protected Double par;  // 面值
    @Column(name = "issue_price") protected Double issuePrice;  // 发行价格
    @Column(name = "issue_size") protected Double issueSize;  // 发行总额（元）
    @Column(name = "remain_size") protected Double remainSize;  // 债券余额（元）
    @Column(name = "value_date") protected String valueDate;  // 起息日期
    @Column(name = "maturity_date") protected String maturityDate;  // 到期日期
    @Column(name = "rate_type") protected String rateType;  // 利率类型
    @Column(name = "coupon_rate") protected Double couponRate;  // 票面利率（%）
    @Column(name = "add_rate") protected Double addRate;  // 补偿利率（%）
    @Column(name = "pay_per_year") protected Integer payPerYear;  // 年付息次数
    @Column(name = "list_date") protected LocalDate listDate;  // 上市日期
    @Column(name = "exchange") protected String exchange;  // 上市地点
    @Column(name = "conv_start_date") protected LocalDate convStartDate;  // 转股起始日
    @Column(name = "conv_end_date") protected LocalDate convEndDate;  // 转股截止日
    @Column(name = "first_conv_price") protected Double firstConvPrice;  // 初始转股价
    @Column(name = "conv_price") protected Double convPrice;  // 最新转股价
    @Column(name = "rate_clause") protected String rateClause;  // 利率说明
    @Column(name = "put_clause") protected String putClause;  // 赎回条款
    @Column(name = "call_clause") protected String callClause;  // 回售条款
    @Column(name = "reset_clause") protected String resetClause;  // 特别向下修正条款
    @Column(name = "conv_clause") protected String convClause;  // 转股条款
    @Column(name = "guarantor") protected String guarantor;  // 担保人
    @Column(name = "guarantee_type") protected String guaranteeType;  // 担保方式
    @Column(name = "issue_rating") protected String issueRating;  // 发行信用等级
    @Column(name = "newest_rating") protected String newestRating;  // 最新信用等级
    @Column(name = "rating_comp") protected String ratingComp;  // 最新评级机构

}