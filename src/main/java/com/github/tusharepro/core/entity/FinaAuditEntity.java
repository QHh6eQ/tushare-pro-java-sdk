package com.github.tusharepro.core.entity;
import lombok.Data;

import com.github.tusharepro.core.bean.FinaAudit;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;

/**
 * 财务审计意见
 */
@Data
@Entity
@Table(name = "fina_audit")
@IdClass(FinaAuditEntity.PrimaryKey.class)
public class FinaAuditEntity implements FinaAudit {

    @Data public static class PrimaryKey implements Serializable {
        private String tsCode;
        private LocalDate endDate;
    }

    @Id
    @Column(name = "ts_code") protected String tsCode;  // TS股票代码
    @Column(name = "ann_date") protected LocalDate annDate;  // 公告日期
    @Id
    @Column(name = "end_date") protected LocalDate endDate;  // 报告期
    @Column(name = "audit_result") protected String auditResult;  // 审计结果
    @Column(name = "audit_fees") protected Double auditFees;  // 审计总费用（元）
    @Column(name = "audit_agency") protected String auditAgency;  // 会计事务所
    @Column(name = "audit_sign") protected String auditSign;  // 签字会计师

}