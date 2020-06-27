package com.github.tusharepro.core.entity;
import lombok.Data;

import com.github.tusharepro.core.bean.SuspendD;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;

/**
 * 每日停复牌信息
 * https://tushare.pro/document/2?doc_id=214
 */
@Data
@Entity
@Table(name = "suspend_d")
@IdClass(SuspendDEntity.PrimaryKey.class)
public class SuspendDEntity implements SuspendD {

    @Data public static class PrimaryKey implements Serializable {
        private String tsCode;
        private LocalDate tradeDate;
    }

    @Id
    @Column(name = "ts_code") protected String tsCode;  // TS代码
    @Id
    @Column(name = "trade_date") protected LocalDate tradeDate;  // 停复牌日期
    @Column(name = "suspend_timing") protected String suspendTiming;  // 日内停牌时间段
    @Column(name = "suspend_type") protected String suspendType;  // 停复牌类型：S-停牌，R-复牌

}