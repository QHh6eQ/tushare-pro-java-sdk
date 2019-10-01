package com.github.tusharepro.core.entity;
import lombok.Data;

import com.github.tusharepro.core.bean.HkHold;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;

/**
 * 沪深港股通持股明细
 * https://tushare.pro/document/2?doc_id=188
 */
@Data
@Entity
@Table(name = "hk_hold")
@IdClass(HkHoldEntity.PrimaryKey.class)
public class HkHoldEntity implements HkHold {

    @Data public static class PrimaryKey implements Serializable {
        private LocalDate tradeDate;
        private String tsCode;
    }

    @Column(name = "code") protected String code;  // 原始代码
    @Id
    @Column(name = "trade_date") protected LocalDate tradeDate;  // 交易日期
    @Id
    @Column(name = "ts_code") protected String tsCode;  // TS代码
    @Column(name = "name") protected String name;  // 股票名称
    @Column(name = "vol") protected Integer vol;  // 持股数量(股)
    @Column(name = "ratio") protected Double ratio;  // 持股占比（%）
    @Column(name = "exchange") protected String exchange;  // 类型：SH沪股通SZ深港通HK港股通

}