package com.github.tusharepro.core.entity;
import lombok.Data;

import com.github.tusharepro.core.bean.StkHoldernumber;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;

/**
 * 股东人数
 */
@Data
@Entity
@Table(name = "stk_holdernumber")
@IdClass(StkHoldernumberEntity.PrimaryKey.class)
public class StkHoldernumberEntity implements StkHoldernumber {

    @Data public static class PrimaryKey implements Serializable {
        private String tsCode;
        private LocalDate endDate;
    }

    @Id
    @Column(name = "ts_code") protected String tsCode;  // TS股票代码
    @Column(name = "ann_date") protected LocalDate annDate;  // 公告日期
    @Id
    @Column(name = "end_date") protected LocalDate endDate;  // 截止日期
    @Column(name = "holder_num") protected Integer holderNum;  // 股东户数

}