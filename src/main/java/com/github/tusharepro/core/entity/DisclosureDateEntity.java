package com.github.tusharepro.core.entity;
import lombok.Data;

import com.github.tusharepro.core.bean.DisclosureDate;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;

/**
 * 财报披露计划
 * https://tushare.pro/document/2?doc_id=162
 */
@Data
@Entity
@Table(name = "disclosure_date")
@IdClass(DisclosureDateEntity.PrimaryKey.class)
public class DisclosureDateEntity implements DisclosureDate {

    @Data public static class PrimaryKey implements Serializable {
        private String tsCode;
        private LocalDate endDate;
    }

    @Id
    @Column(name = "ts_code") protected String tsCode;  // TS代码
    @Column(name = "ann_date") protected LocalDate annDate;  // 最新披露公告日'
    @Id
    @Column(name = "end_date") protected LocalDate endDate;  // 报告期
    @Column(name = "pre_date") protected LocalDate preDate;  // 预计披露日期
    @Column(name = "actual_date") protected LocalDate actualDate;  // 实际披露日期
    @Column(name = "modify_date") protected String modifyDate;  // 披露日期修正记录

}