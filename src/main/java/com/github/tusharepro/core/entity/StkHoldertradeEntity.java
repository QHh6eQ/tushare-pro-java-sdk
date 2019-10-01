package com.github.tusharepro.core.entity;
import lombok.Data;

import com.github.tusharepro.core.bean.StkHoldertrade;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;

/**
 * 股东增减持
 * https://tushare.pro/document/2?doc_id=175
 */
@Data
@Entity
@Table(name = "stk_holdertrade")
@IdClass(StkHoldertradeEntity.PrimaryKey.class)
public class StkHoldertradeEntity implements StkHoldertrade {

    @Data public static class PrimaryKey implements Serializable {
        private String tsCode;
        private LocalDate annDate;
        private String holderName;
        private Double totalShare;
    }

    @Id
    @Column(name = "ts_code") protected String tsCode;  // TS代码
    @Id
    @Column(name = "ann_date") protected LocalDate annDate;  // 公告日期
    @Id
    @Column(name = "holder_name") protected String holderName;  // 股东名称
    @Column(name = "holder_type") protected String holderType;  // 股东类型G高管P个人C公司
    @Column(name = "in_de") protected String inDe;  // 类型IN增持DE减持
    @Column(name = "change_vol") protected Double changeVol;  // 变动数量
    @Column(name = "change_ratio") protected Double changeRatio;  // 占流通比例（%）
    @Column(name = "after_share") protected Double afterShare;  // 变动后持股
    @Column(name = "after_ratio") protected Double afterRatio;  // 变动后占流通比例（%）
    @Column(name = "avg_price") protected Double avgPrice;  // 平均价格
    @Id
    @Column(name = "total_share") protected Double totalShare;  // 持股总数
    @Column(name = "begin_date") protected LocalDate beginDate;  // 增减持开始日期
    @Column(name = "close_date") protected LocalDate closeDate;  // 增减持结束日期

}