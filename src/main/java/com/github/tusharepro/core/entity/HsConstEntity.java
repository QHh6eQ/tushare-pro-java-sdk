package com.github.tusharepro.core.entity;
import lombok.Data;

import com.github.tusharepro.core.bean.HsConst;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;

/**
 * 沪深股通成份股
 * https://tushare.pro/document/2?doc_id=104
 */
@Data
@Entity
@Table(name = "hs_const"
//        indexes = {@Index(columnList = "is_new")}
        )
@IdClass(HsConstEntity.PrimaryKey.class)
public class HsConstEntity implements HsConst {

    @Data public static class PrimaryKey implements Serializable {
        private String tsCode;
        private LocalDate inDate;
    }

    @Id
    @Column(name = "ts_code") protected String tsCode;  // TS代码
    @Column(name = "hs_type") protected String hsType;  // 沪深港通类型SH沪SZ深
    @Id
    @Column(name = "in_date") protected LocalDate inDate;  // 纳入日期
    @Column(name = "out_date") protected LocalDate outDate;  // 剔除日期
    @Column(name = "is_new") protected String isNew;  // 是否最新 1是 0否

}