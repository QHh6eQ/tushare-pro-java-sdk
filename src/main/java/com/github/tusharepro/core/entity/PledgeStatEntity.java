package com.github.tusharepro.core.entity;
import lombok.Data;

import com.github.tusharepro.core.bean.PledgeStat;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;

/**
 * 股权质押统计数据
 * https://tushare.pro/document/2?doc_id=110
 */
@Data
@Entity
@Table(name = "pledge_stat")
@IdClass(PledgeStatEntity.PrimaryKey.class)
public class PledgeStatEntity implements PledgeStat {

    @Data public static class PrimaryKey implements Serializable {
        private String tsCode;
        private LocalDate endDate;
    }

    @Id
    @Column(name = "ts_code") protected String tsCode;  // TS代码
    @Id
    @Column(name = "end_date") protected LocalDate endDate;  // 截止日期
    @Column(name = "pledge_count") protected Integer pledgeCount;  // 质押次数
    @Column(name = "unrest_pledge") protected Double unrestPledge;  // 无限售股质押数量（万）
    @Column(name = "rest_pledge") protected Double restPledge;  // 限售股份质押数量（万）
    @Column(name = "total_share") protected Double totalShare;  // 总股本
    @Column(name = "pledge_ratio") protected Double pledgeRatio;  // 质押比例

}