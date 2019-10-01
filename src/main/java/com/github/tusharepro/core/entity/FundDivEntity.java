package com.github.tusharepro.core.entity;
import lombok.Data;

import com.github.tusharepro.core.bean.FundDiv;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;

/**
 * 公募基金分红
 * https://tushare.pro/document/2?doc_id=120
 */
@Data
@Entity
@Table(name = "fund_div")
@IdClass(FundDivEntity.PrimaryKey.class)
public class FundDivEntity implements FundDiv {

    @Data public static class PrimaryKey implements Serializable {
        private String tsCode;
        private LocalDate annDate;
    }

    @Id
    @Column(name = "ts_code") protected String tsCode;  // TS代码
    @Id
    @Column(name = "ann_date") protected LocalDate annDate;  // 公告日期
    @Column(name = "imp_anndate") protected LocalDate impAnndate;  // 分红实施公告日
    @Column(name = "base_date") protected LocalDate baseDate;  // 分配收益基准日
    @Column(name = "div_proc") protected String divProc;  // 方案进度
    @Column(name = "record_date") protected LocalDate recordDate;  // 权益登记日
    @Column(name = "ex_date") protected LocalDate exDate;  // 除息日
    @Column(name = "pay_date") protected LocalDate payDate;  // 派息日
    @Column(name = "earpay_date") protected LocalDate earpayDate;  // 收益支付日
    @Column(name = "net_ex_date") protected LocalDate netExDate;  // 净值除权日
    @Column(name = "div_cash") protected Double divCash;  // 每股派息(元)
    @Column(name = "base_unit") protected Double baseUnit;  // 基准基金份额(万份)
    @Column(name = "ear_distr") protected Double earDistr;  // 可分配收益(元)
    @Column(name = "ear_amount") protected Double earAmount;  // 收益分配金额(元)
    @Column(name = "account_date") protected LocalDate accountDate;  // 红利再投资到账日
    @Column(name = "base_year") protected String baseYear;  // 份额基准年度

}