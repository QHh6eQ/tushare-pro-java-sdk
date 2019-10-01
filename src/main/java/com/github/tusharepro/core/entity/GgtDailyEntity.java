package com.github.tusharepro.core.entity;
import lombok.Data;

import com.github.tusharepro.core.bean.GgtDaily;

import javax.persistence.*;
import java.time.LocalDate;

/**
 * 港股通每日成交统计
 * https://tushare.pro/document/2?doc_id=196
 */
@Data
@Entity
@Table(name = "ggt_daily")
public class GgtDailyEntity implements GgtDaily {

    @Id
    @Column(name = "trade_date") protected LocalDate tradeDate;  // 交易日期
    @Column(name = "buy_amount") protected Double buyAmount;  // 买入成交金额（亿元）
    @Column(name = "buy_volume") protected Double buyVolume;  // 买入成交笔数（万笔）
    @Column(name = "sell_amount") protected Double sellAmount;  // 卖出成交金额（亿元）
    @Column(name = "sell_volume") protected Double sellVolume;  // 卖出成交笔数（万笔）

}