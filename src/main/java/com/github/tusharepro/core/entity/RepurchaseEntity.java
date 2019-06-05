package com.github.tusharepro.core.entity;
import lombok.Data;

import com.github.tusharepro.core.bean.Repurchase;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;

/**
 * 股票回购
 * 数据有点问题?
 */
@Data
@Entity
@Table(name = "repurchase")
@IdClass(RepurchaseEntity.PrimaryKey.class)
public class RepurchaseEntity implements Repurchase {

    @Data public static class PrimaryKey implements Serializable {
        private String tsCode;
        private LocalDate annDate;
        private Double vol;
    }

    @Id
    @Column(name = "ts_code") protected String tsCode;  // TS代码
    @Id
    @Column(name = "ann_date") protected LocalDate annDate;  // 公告日期
    @Column(name = "end_date") protected LocalDate endDate;  // 截止日期
    @Column(name = "proc") protected String proc;  // 进度
    @Column(name = "exp_date") protected LocalDate expDate;  // 过期日期
    @Id
    @Column(name = "vol") protected Double vol;  // 回购数量
    @Column(name = "amount") protected Double amount;  // 回购金额
    @Column(name = "high_limit") protected Double highLimit;  // 回购最高价
    @Column(name = "low_limit") protected Double lowLimit;  // 回购最低价

}