package com.github.tusharepro.core.entity;
import lombok.Data;

import com.github.tusharepro.core.bean.Namechange;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;

/**
 * 股票曾用名
 * https://tushare.pro/document/2?doc_id=100
 *
 * 有10000行限制 by 20190515
 */
@Data
@Entity
@Table(name = "namechange")
@IdClass(NamechangeEntity.PrimaryKey.class)
public class NamechangeEntity implements Namechange {

    @Data public static class PrimaryKey implements Serializable {
        private String tsCode;
        private LocalDate startDate;
    }

    @Id
    @Column(name = "ts_code") protected String tsCode;  // TS代码
    @Column(name = "name") protected String name;  // 证券名称
    @Id
    @Column(name = "start_date") protected LocalDate startDate;  // 开始日期
    @Column(name = "end_date") protected LocalDate endDate;  // 结束日期
    @Column(name = "ann_date") protected LocalDate annDate;  // 公告日期
    @Column(name = "change_reason") protected String changeReason;  // 变更原因

}