package com.github.tusharepro.core.entity;
import lombok.Data;

import com.github.tusharepro.core.bean.Top10Floatholders;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;

/**
 * 前十大流通股东
 */
@Data
@Entity
@Table(name = "top10_floatholders")
@IdClass(Top10FloatholdersEntity.PrimaryKey.class)
public class Top10FloatholdersEntity implements Top10Floatholders {

    @Data public static class PrimaryKey implements Serializable {
        private String tsCode;
        private LocalDate endDate;
    }

    @Id
    @Column(name = "ts_code") protected String tsCode;  // TS股票代码
    @Column(name = "ann_date") protected LocalDate annDate;  // 公告日期
    @Id
    @Column(name = "end_date") protected LocalDate endDate;  // 报告期
    @Column(name = "holder_name") protected String holderName;  // 股东名称
    @Column(name = "hold_amount") protected Double holdAmount;  // 持有数量（股）

}