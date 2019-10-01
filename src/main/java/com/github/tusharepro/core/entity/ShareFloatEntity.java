package com.github.tusharepro.core.entity;
import lombok.Data;

import com.github.tusharepro.core.bean.ShareFloat;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;

/**
 * 限售股解禁
 * https://tushare.pro/document/2?doc_id=160
 *
 * 一些首发股可能会超过5000行限制
 */
@Data
@Entity
@Table(name = "share_float")
@IdClass(ShareFloatEntity.PrimaryKey.class)
public class ShareFloatEntity implements ShareFloat {

    @Data public static class PrimaryKey implements Serializable {
        private String tsCode;
        private LocalDate floatDate;
        private String holderName;
    }

    @Id
    @Column(name = "ts_code") protected String tsCode;  // TS代码
    @Column(name = "ann_date") protected LocalDate annDate;  // 公告日期
    @Id
    @Column(name = "float_date") protected LocalDate floatDate;  // 解禁日期
    @Column(name = "float_share") protected Double floatShare;  // 流通股份
    @Column(name = "float_ratio") protected Double floatRatio;  // 流通股份占总股本比率
    @Id
    @Column(name = "holder_name") protected String holderName;  // 股东名称
    @Column(name = "share_type") protected String shareType;  // 股份类型

}