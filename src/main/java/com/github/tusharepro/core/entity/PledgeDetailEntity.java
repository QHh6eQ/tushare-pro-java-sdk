package com.github.tusharepro.core.entity;
import lombok.Data;

import com.github.tusharepro.core.bean.PledgeDetail;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;

/**
 * 股权质押明细
 * https://tushare.pro/document/2?doc_id=111
 */
@Data
@Entity
@Table(name = "pledge_detail")
@IdClass(PledgeDetailEntity.PrimaryKey.class)
public class PledgeDetailEntity implements PledgeDetail {

    @Data public static class PrimaryKey implements Serializable {
        private String tsCode;
        private Double pledgeAmount;
        private LocalDate startDate;
    }

    @Id
    @Column(name = "ts_code") protected String tsCode;  // TS股票代码
    @Column(name = "ann_date") protected String annDate;  // 公告日期
    @Column(name = "holder_name") protected String holderName;  // 股东名称
    @Id
    @Column(name = "pledge_amount") protected Double pledgeAmount;  // 质押数量（万股）
    @Id
    @Column(name = "start_date") protected LocalDate startDate;  // 质押开始日期
    @Column(name = "end_date") protected LocalDate endDate;  // 质押结束日期
    @Column(name = "is_release") protected String isRelease;  // 是否已解押
    @Column(name = "release_date") protected LocalDate releaseDate;  // 解押日期
    @Column(name = "pledgor") protected String pledgor;  // 质押方
    @Column(name = "holding_amount") protected Double holdingAmount;  // 持股总数（万股）
    @Column(name = "pledged_amount") protected Double pledgedAmount;  // 质押总数（万股）
    @Column(name = "p_total_ratio") protected Double pTotalRatio;  // 本次质押占总股本比例
    @Column(name = "h_total_ratio") protected Double hTotalRatio;  // 持股总数占总股本比例
    @Column(name = "is_buyback") protected String isBuyback;  // 是否回购

}