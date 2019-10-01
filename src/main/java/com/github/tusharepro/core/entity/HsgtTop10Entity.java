package com.github.tusharepro.core.entity;
import lombok.Data;

import com.github.tusharepro.core.bean.HsgtTop10;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;

/**
 * 沪深股通十大成交股
 * https://tushare.pro/document/2?doc_id=48
 */
@Data
@Entity
@Table(name = "hsgt_top10")
@IdClass(HsgtTop10Entity.PrimaryKey.class)
public class HsgtTop10Entity implements HsgtTop10 {

    @Data public static class PrimaryKey implements Serializable {
        private LocalDate tradeDate;
        private String tsCode;
    }

    @Id
    @Column(name = "trade_date") protected LocalDate tradeDate;  // 交易日期
    @Id
    @Column(name = "ts_code") protected String tsCode;  // 股票代码
    @Column(name = "name") protected String name;  // 股票名称
    @Column(name = "close") protected Double close;  // 收盘价
    @Column(name = "change") protected Double change;  // 涨跌额
    @Column(name = "rank") protected Integer rank;  // 资金排名
    @Column(name = "market_type") protected String marketType;  // 市场类型（1：沪市 3：深市）
    @Column(name = "amount") protected Double amount;  // 成交金额（元）
    @Column(name = "net_amount") protected Double netAmount;  // 净成交金额（元）
    @Column(name = "buy") protected Double buy;  // 买入金额（元）
    @Column(name = "sell") protected Double sell;  // 卖出金额（元）

}