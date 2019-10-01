package com.github.tusharepro.core.entity;
import lombok.Data;

import com.github.tusharepro.core.bean.FxDaily;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;

/**
 * 外汇日线行情
 * https://tushare.pro/document/2?doc_id=179
 */
@Data
@Entity
@Table(name = "fx_daily")
@IdClass(FxDailyEntity.PrimaryKey.class)
public class FxDailyEntity implements FxDaily {

    @Data public static class PrimaryKey implements Serializable {
        private String tsCode;
        private LocalDate tradeDate;
    }

    @Id
    @Column(name = "ts_code") protected String tsCode;  // 外汇代码
    @Id
    @Column(name = "trade_date") protected LocalDate tradeDate;  // 交易日期
    @Column(name = "bid_open") protected Double bidOpen;  // 买入开盘价
    @Column(name = "bid_close") protected Double bidClose;  // 买入收盘价
    @Column(name = "bid_high") protected Double bidHigh;  // 买入最高价
    @Column(name = "bid_low") protected Double bidLow;  // 买入最低价
    @Column(name = "ask_open") protected Double askOpen;  // 卖出开盘价
    @Column(name = "ask_close") protected Double askClose;  // 卖出收盘价
    @Column(name = "ask_high") protected Double askHigh;  // 卖出最高价
    @Column(name = "ask_low") protected Double askLow;  // 卖出最低价
    @Column(name = "tick_qty") protected Integer tickQty;  // 报价笔数
    @Column(name = "exchange") protected String exchange;  // 交易商

}