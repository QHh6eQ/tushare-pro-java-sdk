package com.github.tusharepro.core.entity;
import lombok.Data;

import com.github.tusharepro.core.bean.ConceptDetail;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;

/**
 * 概念股列表
 * https://tushare.pro/document/2?doc_id=126
 */
@Data
@Entity
@Table(name = "concept_detail")
@IdClass(ConceptDetailEntity.PrimaryKey.class)
public class ConceptDetailEntity implements ConceptDetail {

    @Data public static class PrimaryKey implements Serializable {
        private String id;
        private String tsCode;
    }

    @Id
    @Column(name = "id") protected String id;  // 概念代码
    @Column(name = "concept_name") protected String conceptName;  // 概念名称
    @Id
    @Column(name = "ts_code") protected String tsCode;  // 股票代码
    @Column(name = "name") protected String name;  // 股票名称
    @Column(name = "in_date") protected LocalDate inDate;  // 纳入日期
    @Column(name = "out_date") protected LocalDate outDate;  // 剔除日期

}