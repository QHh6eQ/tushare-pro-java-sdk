package com.github.tusharepro.core.entity;
import lombok.Data;

import com.github.tusharepro.core.bean.FundNav;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;

/**
 * 公募基金净值
 * https://tushare.pro/document/2?doc_id=119
 */
@Data
@Entity
@Table(name = "fund_nav")
@IdClass(FundNavEntity.PrimaryKey.class)
public class FundNavEntity implements FundNav {

    @Data public static class PrimaryKey implements Serializable {
        private String tsCode;
        private LocalDate endDate;
    }

    @Id
    @Column(name = "ts_code") protected String tsCode;  // TS代码
    @Column(name = "ann_date") protected LocalDate annDate;  // 公告日期
    @Id
    @Column(name = "end_date") protected LocalDate endDate;  // 截止日期
    @Column(name = "unit_nav") protected Double unitNav;  // 单位净值
    @Column(name = "accum_nav") protected Double accumNav;  // 累计净值
    @Column(name = "accum_div") protected Double accumDiv;  // 累计分红
    @Column(name = "net_asset") protected Double netAsset;  // 资产净值
    @Column(name = "total_netasset") protected Double totalNetasset;  // 合计资产净值
    @Column(name = "adj_nav") protected Double adjNav;  // 复权单位净值

}