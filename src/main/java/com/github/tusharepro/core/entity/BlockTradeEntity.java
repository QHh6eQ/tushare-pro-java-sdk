package com.github.tusharepro.core.entity;

import com.github.tusharepro.core.bean.BlockTrade;
import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;

/**
 * 大宗交易
 */
@Data
@Entity
@Table(name = "block_trade")
@IdClass(BlockTradeEntity.PrimaryKey.class)
public class BlockTradeEntity implements BlockTrade {

    // 可能某个交易日出现相同金额的大宗交易
    @Data public static class PrimaryKey implements Serializable {
        private String tsCode;
        private LocalDate tradeDate;
        private Double amount;
    }

    @Id
    @Column(name = "ts_code") protected String tsCode;  // TS代码
    @Id
    @Column(name = "trade_date") protected LocalDate tradeDate;  // 交易日历
    @Column(name = "price") protected Double price;  // 成交价
    @Column(name = "vol") protected Double vol;  // 成交量（万股）
    @Id
    @Column(name = "amount") protected Double amount;  // 成交金额
    @Column(name = "buyer") protected String buyer;  // 买方营业部
    @Column(name = "seller") protected String seller;  // 卖方营业部

}