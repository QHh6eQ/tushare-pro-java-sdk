package com.github.tusharepro.core.entity;
import lombok.Data;

import com.github.tusharepro.core.bean.FutSettle;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;

/**
 * 结算参数
 * https://tushare.pro/document/2?doc_id=141
 */
@Data
@Entity
@Table(name = "fut_settle")
@IdClass(FutSettleEntity.PrimaryKey.class)
public class FutSettleEntity implements FutSettle {

    @Data public static class PrimaryKey implements Serializable {
        private String tsCode;
        private LocalDate tradeDate;
    }

    @Id
    @Column(name = "ts_code") protected String tsCode;  // 合约代码
    @Id
    @Column(name = "trade_date") protected LocalDate tradeDate;  // 交易日期
    @Column(name = "settle") protected Double settle;  // 结算价
    @Column(name = "trading_fee_rate") protected Double tradingFeeRate;  // 交易手续费率
    @Column(name = "trading_fee") protected Double tradingFee;  // 交易手续费
    @Column(name = "delivery_fee") protected Double deliveryFee;  // 交割手续费
    @Column(name = "b_hedging_margin_rate") protected Double bHedgingMarginRate;  // 买套保交易保证金率
    @Column(name = "s_hedging_margin_rate") protected Double sHedgingMarginRate;  // 卖套保交易保证金率
    @Column(name = "long_margin_rate") protected Double longMarginRate;  // 买投机交易保证金率
    @Column(name = "short_margin_rate") protected Double shortMarginRate;  // 卖投机交易保证金率
    @Column(name = "offset_today_fee") protected Double offsetTodayFee;  // 平今仓手续率
    @Column(name = "exchange") protected String exchange;  // 交易所

}