package com.github.tusharepro.core.entity;
import lombok.Data;

import com.github.tusharepro.core.bean.TradeCal;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;

/**
 * 交易日历
 * https://tushare.pro/document/2?doc_id=26
 */
@Data
@Entity
@Table(name = "trade_cal")
@IdClass(TradeCalEntity.PrimaryKey.class)
public class TradeCalEntity implements TradeCal {

    @Data public static class PrimaryKey implements Serializable {
        private String exchange;
        private LocalDate calDate;
    }

    @Id
    @Column(name = "exchange") protected String exchange;  // 交易所 SSE上交所 SZSE深交所
    @Id
    @Column(name = "cal_date") protected LocalDate calDate;  // 日历日期
    @Column(name = "is_open") protected Integer isOpen;  // 是否交易 0休市 1交易
    @Column(name = "pretrade_date") protected String pretradeDate;  // 上一个交易日

}