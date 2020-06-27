package com.github.tusharepro.core.entity;
import lombok.Data;

import com.github.tusharepro.core.bean.Suspend;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;

/**
 * 停复牌信息(停)
 * https://tushare.pro/document/2?doc_id=31
 */
@Data
@Entity
@Table(name = "suspend")
@IdClass(SuspendEntity.PrimaryKey.class)
public class SuspendEntity implements Suspend {

    @Data public static class PrimaryKey implements Serializable {
        private String tsCode;
        private LocalDate suspendDate;
    }

    @Id
    @Column(name = "ts_code") protected String tsCode;  // 股票代码
    @Id
    @Column(name = "suspend_date") protected LocalDate suspendDate;  // 停牌日期
    @Column(name = "resume_date") protected LocalDate resumeDate;  // 复牌日期
    @Column(name = "ann_date") protected LocalDate annDate;  // 公告日期
    @Column(name = "suspend_reason") protected String suspendReason;  // 停牌原因
    @Column(name = "reason_type") protected String reasonType;  // 停牌原因类别

}