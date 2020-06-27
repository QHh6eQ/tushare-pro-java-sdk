package com.github.tusharepro.core.entity;
import lombok.Data;

import com.github.tusharepro.core.bean.FutWeeklyDetail;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;

/**
 * 期货主要品种交易周报
 * https://tushare.pro/document/2?doc_id=216
 */
@Data
@Entity
@Table(name = "fut_weekly_detail")
@IdClass(FutWeeklyDetailEntity.PrimaryKey.class)
public class FutWeeklyDetailEntity implements FutWeeklyDetail {

    @Data public static class PrimaryKey implements Serializable {
        private String exchange;
        private String prd;
        private LocalDate weekDate;
    }

    @Id
    @Column(name = "exchange") protected String exchange;  // 交易所代码
    @Id
    @Column(name = "prd") protected String prd;  // 期货品种代码
    @Column(name = "name") protected String name;  // 品种名称
    @Column(name = "vol") protected Integer vol;  // 成交量（手）
    @Column(name = "vol_yoy") protected Double volYoy;  // 同比增减（%）
    @Column(name = "amount") protected Double amount;  // 成交金额（亿元）
    @Column(name = "amout_yoy") protected Double amoutYoy;  // 同比增减（%）
    @Column(name = "cumvol") protected Integer cumvol;  // 年累计成交总量（手）
    @Column(name = "cumvol_yoy") protected Double cumvolYoy;  // 同比增减（%）
    @Column(name = "cumamt") protected Double cumamt;  // 年累计成交金额（亿元）
    @Column(name = "cumamt_yoy") protected Double cumamtYoy;  // 同比增减（%）
    @Column(name = "open_interest") protected Integer openInterest;  // 持仓量（手）
    @Column(name = "interest_wow") protected Double interestWow;  // 环比增减（%）
    @Column(name = "mc_close") protected Double mcClose;  // 本周主力合约收盘价
    @Column(name = "close_wow") protected Double closeWow;  // 环比涨跌（%）
    @Column(name = "week") protected String week;  // 周期
    @Id
    @Column(name = "week_date") protected LocalDate weekDate;  // 周日期

}