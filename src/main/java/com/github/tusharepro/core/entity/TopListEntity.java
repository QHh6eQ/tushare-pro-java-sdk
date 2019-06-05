package com.github.tusharepro.core.entity;
import lombok.Data;

import com.github.tusharepro.core.bean.TopList;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;

/**
 * 龙虎榜每日明细
 */
@Data
@Entity
@Table(name = "top_list")
@IdClass(TopListEntity.PrimaryKey.class)
public class TopListEntity implements TopList {

    @Data public static class PrimaryKey implements Serializable {
        private LocalDate tradeDate;
        private String tsCode;
    }

    @Id
    @Column(name = "trade_date") protected LocalDate tradeDate;  // 交易日期
    @Id
    @Column(name = "ts_code") protected String tsCode;  // TS代码
    @Column(name = "name") protected String name;  // 名称
    @Column(name = "close") protected Double close;  // 收盘价
    @Column(name = "pct_change") protected Double pctChange;  // 涨跌幅
    @Column(name = "turnover_rate") protected Double turnoverRate;  // 换手率
    @Column(name = "amount") protected Double amount;  // 总成交额
    @Column(name = "l_sell") protected Double lSell;  // 龙虎榜卖出额
    @Column(name = "l_buy") protected Double lBuy;  // 龙虎榜买入额
    @Column(name = "l_amount") protected Double lAmount;  // 龙虎榜成交额
    @Column(name = "net_amount") protected Double netAmount;  // 龙虎榜净买入额
    @Column(name = "net_rate") protected Double netRate;  // 龙虎榜净买额占比
    @Column(name = "amount_rate") protected Double amountRate;  // 龙虎榜成交额占比
    @Column(name = "float_values") protected Double floatValues;  // 当日流通市值
    @Column(name = "reason") protected String reason;  // 上榜理由

}