package com.github.tusharepro.core.entity;
import lombok.Data;

import com.github.tusharepro.core.bean.GgtTop10;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;

/**
 * 港股通十大成交股
 * https://tushare.pro/document/2?doc_id=49
 */
@Data
@Entity
@Table(name = "ggt_top10")
@IdClass(GgtTop10Entity.PrimaryKey.class)
public class GgtTop10Entity implements GgtTop10 {

    @Data public static class PrimaryKey implements Serializable {
        private LocalDate tradeDate;
        private String tsCode;
        private String marketType;
    }

    @Id
    @Column(name = "trade_date") protected LocalDate tradeDate;  // 交易日期
    @Id
    @Column(name = "ts_code") protected String tsCode;  // 股票代码
    @Column(name = "name") protected String name;  // 股票名称
    @Column(name = "close") protected Double close;  // 收盘价
    @Column(name = "p_change") protected Double pChange;  // 涨跌幅
    @Column(name = "rank") protected String rank;  // 资金排名
    @Id
    @Column(name = "market_type") protected String marketType;  // 市场类型 2：港股通（沪） 4：港股通（深）
    @Column(name = "amount") protected Double amount;  // 累计成交金额（元）
    @Column(name = "net_amount") protected Double netAmount;  // 净买入金额（元）
    @Column(name = "sh_amount") protected Double shAmount;  // 沪市成交金额（元）
    @Column(name = "sh_net_amount") protected Double shNetAmount;  // 沪市净买入金额（元）
    @Column(name = "sh_buy") protected Double shBuy;  // 沪市买入金额（元）
    @Column(name = "sh_sell") protected Double shSell;  // 沪市卖出金额
    @Column(name = "sz_amount") protected Double szAmount;  // 深市成交金额（元）
    @Column(name = "sz_net_amount") protected Double szNetAmount;  // 深市净买入金额（元）
    @Column(name = "sz_buy") protected Double szBuy;  // 深市买入金额（元）
    @Column(name = "sz_sell") protected Double szSell;  // 深市卖出金额（元）

}