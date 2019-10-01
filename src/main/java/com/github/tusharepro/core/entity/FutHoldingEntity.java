package com.github.tusharepro.core.entity;
import lombok.Data;

import com.github.tusharepro.core.bean.FutHolding;

import javax.persistence.*;
import java.time.LocalDate;

/**
 * 每日成交持仓排名
 * https://tushare.pro/document/2?doc_id=139
 */
@Data
@Entity
@Table(name = "fut_holding")
public class FutHoldingEntity implements FutHolding {

    @Id
    @Column(name = "trade_date") protected LocalDate tradeDate;  // 交易日期
    @Column(name = "symbol") protected String symbol;  // 合约代码或类型
    @Column(name = "broker") protected String broker;  // 期货公司会员简称
    @Column(name = "vol") protected Integer vol;  // 成交量
    @Column(name = "vol_chg") protected Integer volChg;  // 成交量变化
    @Column(name = "long_hld") protected Integer longHld;  // 持买仓量
    @Column(name = "long_chg") protected Integer longChg;  // 持买仓量变化
    @Column(name = "short_hld") protected Integer shortHld;  // 持卖仓量
    @Column(name = "short_chg") protected Integer shortChg;  // 持卖仓量变化
    @Column(name = "exchange") protected String exchange;  // 交易所

}