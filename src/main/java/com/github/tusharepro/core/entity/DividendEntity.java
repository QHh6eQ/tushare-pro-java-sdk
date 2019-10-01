package com.github.tusharepro.core.entity;
import lombok.Data;

import com.github.tusharepro.core.bean.Dividend;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;

/**
 * 分红送股
 * ~~有脏数据, 要把 每股送转 和 每股分红（税前）都为0的剔除???~~
 * https://tushare.pro/document/2?doc_id=103
 */
@Data
@Entity
@Table(name = "dividend")
@IdClass(DividendEntity.PrimaryKey.class)
public class DividendEntity implements Dividend {

    @Data public static class PrimaryKey implements Serializable {
        private String tsCode;
        private LocalDate endDate;
    }

    @Id
    @Column(name = "ts_code") protected String tsCode;  // TS代码
    @Id
    @Column(name = "end_date") protected LocalDate endDate;  // 分红年度
    @Column(name = "ann_date") protected LocalDate annDate;  // 预案公告日
    @Column(name = "div_proc") protected String divProc;  // 实施进度
    @Column(name = "stk_div") protected Double stkDiv;  // 每股送转
    @Column(name = "stk_bo_rate") protected Double stkBoRate;  // 每股送股比例
    @Column(name = "stk_co_rate") protected Double stkCoRate;  // 每股转增比例
    @Column(name = "cash_div") protected Double cashDiv;  // 每股分红（税后）
    @Column(name = "cash_div_tax") protected Double cashDivTax;  // 每股分红（税前）
    @Column(name = "record_date") protected LocalDate recordDate;  // 股权登记日
    @Column(name = "ex_date") protected LocalDate exDate;  // 除权除息日
    @Column(name = "pay_date") protected LocalDate payDate;  // 派息日
    @Column(name = "div_listdate") protected LocalDate divListdate;  // 红股上市日
    @Column(name = "imp_ann_date") protected LocalDate impAnnDate;  // 实施公告日
    @Column(name = "base_date") protected LocalDate baseDate;  // 基准日
    @Column(name = "base_share") protected Double baseShare;  // 基准股本（万）

}