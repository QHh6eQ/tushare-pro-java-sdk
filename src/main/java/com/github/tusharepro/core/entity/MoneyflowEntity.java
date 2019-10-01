package com.github.tusharepro.core.entity;
import lombok.Data;

import com.github.tusharepro.core.bean.Moneyflow;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;

/**
 * 个股资金流向
 * https://tushare.pro/document/2?doc_id=170
 */
@Data
@Entity
@Table(name = "moneyflow")
@IdClass(MoneyflowEntity.PrimaryKey.class)
public class MoneyflowEntity implements Moneyflow {

    @Data public static class PrimaryKey implements Serializable {
        private String tsCode;
        private LocalDate tradeDate;
    }

    @Id
    @Column(name = "ts_code") protected String tsCode;  // TS代码
    @Id
    @Column(name = "trade_date") protected LocalDate tradeDate;  // 交易日期
    @Column(name = "buy_sm_vol") protected Integer buySmVol;  // 小单买入量（手）
    @Column(name = "buy_sm_amount") protected Double buySmAmount;  // 小单买入金额（万元）
    @Column(name = "sell_sm_vol") protected Integer sellSmVol;  // 小单卖出量（手）
    @Column(name = "sell_sm_amount") protected Double sellSmAmount;  // 小单卖出金额（万元）
    @Column(name = "buy_md_vol") protected Integer buyMdVol;  // 中单买入量（手）
    @Column(name = "buy_md_amount") protected Double buyMdAmount;  // 中单买入金额（万元）
    @Column(name = "sell_md_vol") protected Integer sellMdVol;  // 中单卖出量（手）
    @Column(name = "sell_md_amount") protected Double sellMdAmount;  // 中单卖出金额（万元）
    @Column(name = "buy_lg_vol") protected Integer buyLgVol;  // 大单买入量（手）
    @Column(name = "buy_lg_amount") protected Double buyLgAmount;  // 大单买入金额（万元）
    @Column(name = "sell_lg_vol") protected Integer sellLgVol;  // 大单卖出量（手）
    @Column(name = "sell_lg_amount") protected Double sellLgAmount;  // 大单卖出金额（万元）
    @Column(name = "buy_elg_vol") protected Integer buyElgVol;  // 特大单买入量（手）
    @Column(name = "buy_elg_amount") protected Double buyElgAmount;  // 特大单买入金额（万元）
    @Column(name = "sell_elg_vol") protected Integer sellElgVol;  // 特大单卖出量（手）
    @Column(name = "sell_elg_amount") protected Double sellElgAmount;  // 特大单卖出金额（万元）
    @Column(name = "net_mf_vol") protected Integer netMfVol;  // 净流入量（手）
    @Column(name = "net_mf_amount") protected Double netMfAmount;  // 净流入额（万元）

}