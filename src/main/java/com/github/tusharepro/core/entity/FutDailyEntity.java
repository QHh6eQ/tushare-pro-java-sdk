package com.github.tusharepro.core.entity;
import lombok.Data;

import com.github.tusharepro.core.bean.FutDaily;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;

/**
 * 期货日线行情
 * https://tushare.pro/document/2?doc_id=138
 */
@Data
@Entity
@Table(name = "fut_daily")
@IdClass(FutDailyEntity.PrimaryKey.class)
public class FutDailyEntity implements FutDaily {

    @Data public static class PrimaryKey implements Serializable {
        private String tsCode;
        private LocalDate tradeDate;
    }

    @Id
    @Column(name = "ts_code") protected String tsCode;  // TS合约代码
    @Id
    @Column(name = "trade_date") protected LocalDate tradeDate;  // 交易日期
    @Column(name = "pre_close") protected Double preClose;  // 昨收盘价
    @Column(name = "pre_settle") protected Double preSettle;  // 昨结算价
    @Column(name = "open") protected Double open;  // 开盘价
    @Column(name = "high") protected Double high;  // 最高价
    @Column(name = "low") protected Double low;  // 最低价
    @Column(name = "close") protected Double close;  // 收盘价
    @Column(name = "settle") protected Double settle;  // 结算价
    @Column(name = "change1") protected Double change1;  // 涨跌1 收盘价-昨结算价
    @Column(name = "change2") protected Double change2;  // 涨跌2 结算价-昨结算价
    @Column(name = "vol") protected Double vol;  // 成交量(手)
    @Column(name = "amount") protected Double amount;  // 成交金额(万元)
    @Column(name = "oi") protected Double oi;  // 持仓量(手)
    @Column(name = "oi_chg") protected Double oiChg;  // 持仓量变化
    @Column(name = "delv_settle") protected Double delvSettle;  // 交割结算价

}