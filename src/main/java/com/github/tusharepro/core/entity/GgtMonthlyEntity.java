package com.github.tusharepro.core.entity;
import lombok.Data;

import com.github.tusharepro.core.bean.GgtMonthly;

import javax.persistence.*;

/**
 * 港股通每月成交统计
 * https://tushare.pro/document/2?doc_id=197
 */
@Data
@Entity
@Table(name = "ggt_monthly")
public class GgtMonthlyEntity implements GgtMonthly {

    @Id
    @Column(name = "month") protected String month;  // 交易日期
    @Column(name = "day_buy_amt") protected Double dayBuyAmt;  // 当月日均买入成交金额（亿元）
    @Column(name = "day_buy_vol") protected Double dayBuyVol;  // 当月日均买入成交笔数（万笔）
    @Column(name = "day_sell_amt") protected Double daySellAmt;  // 当月日均卖出成交金额（亿元）
    @Column(name = "day_sell_vol") protected Double daySellVol;  // 当月日均卖出成交笔数（万笔）
    @Column(name = "total_buy_amt") protected Double totalBuyAmt;  // 总买入成交金额（亿元）
    @Column(name = "total_buy_vol") protected Double totalBuyVol;  // 总买入成交笔数（万笔）
    @Column(name = "total_sell_amt") protected Double totalSellAmt;  // 总卖出成交金额（亿元）
    @Column(name = "total_sell_vol") protected Double totalSellVol;  // 总卖出成交笔数（万笔）

}