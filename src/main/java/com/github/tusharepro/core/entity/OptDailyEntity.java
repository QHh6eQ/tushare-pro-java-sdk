package com.github.tusharepro.core.entity;
import lombok.Data;

import com.github.tusharepro.core.bean.OptDaily;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;

/**
 * 期权日线行情
 * https://tushare.pro/document/2?doc_id=159
 */
@Data
@Entity
@Table(name = "opt_daily")
@IdClass(OptDailyEntity.PrimaryKey.class)
public class OptDailyEntity implements OptDaily {

    @Data public static class PrimaryKey implements Serializable {
        private String tsCode;
        private LocalDate tradeDate;
    }

    @Id
    @Column(name = "ts_code") protected String tsCode;  // TS代码
    @Id
    @Column(name = "trade_date") protected LocalDate tradeDate;  // 交易日期
    @Column(name = "exchange") protected String exchange;  // 交易市场
    @Column(name = "pre_settle") protected Double preSettle;  // 昨结算价
    @Column(name = "pre_close") protected Double preClose;  // 前收盘价
    @Column(name = "open") protected Double open;  // 开盘价
    @Column(name = "high") protected Double high;  // 最高价
    @Column(name = "low") protected Double low;  // 最低价
    @Column(name = "close") protected Double close;  // 收盘价
    @Column(name = "settle") protected Double settle;  // 结算价
    @Column(name = "vol") protected Double vol;  // 成交量(手)
    @Column(name = "amount") protected Double amount;  // 成交金额(万元)
    @Column(name = "oi") protected Double oi;  // 持仓量(手)

}