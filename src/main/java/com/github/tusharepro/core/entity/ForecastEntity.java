package com.github.tusharepro.core.entity;
import lombok.Data;

import com.github.tusharepro.core.bean.Forecast;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;

/**
 * 业绩预告
 */
@Data
@Entity
@Table(name = "forecast")
@IdClass(ForecastEntity.PrimaryKey.class)
public class ForecastEntity implements Forecast {

    @Data public static class PrimaryKey implements Serializable {
        private String tsCode;
        private LocalDate endDate;
    }

    @Id
    @Column(name = "ts_code") protected String tsCode;  // TS股票代码
    @Column(name = "ann_date") protected String annDate;  // 公告日期
    @Id
    @Column(name = "end_date") protected LocalDate endDate;  // 报告期
    @Column(name = "type") protected String type;  // 业绩预告类型(预增/预减/扭亏/首亏/续亏/续盈/略增/略减)
    @Column(name = "p_change_min") protected Double pChangeMin;  // 预告净利润变动幅度下限（%）
    @Column(name = "p_change_max") protected Double pChangeMax;  // 预告净利润变动幅度上限（%）
    @Column(name = "net_profit_min") protected Double netProfitMin;  // 预告净利润下限（万元）
    @Column(name = "net_profit_max") protected Double netProfitMax;  // 预告净利润上限（万元）
    @Column(name = "last_parent_net") protected Double lastParentNet;  // 上年同期归属母公司净利润
    @Column(name = "first_ann_date") protected String firstAnnDate;  // 首次公告日
    @Column(name = "summary") protected String summary;  // 业绩预告摘要
    @Column(name = "change_reason") protected String changeReason;  // 业绩变动原因

}