package com.github.tusharepro.core.entity;
import lombok.Data;

import com.github.tusharepro.core.bean.Margin;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;

/**
 * 融资融券交易汇总
 */
@Data
@Entity
@Table(name = "margin")
@IdClass(MarginEntity.PrimaryKey.class)
public class MarginEntity implements Margin {

    @Data public static class PrimaryKey implements Serializable {
        private LocalDate tradeDate;
        private String exchangeId;
    }

    @Id
    @Column(name = "trade_date") protected LocalDate tradeDate;  // 交易日期
    @Id
    @Column(name = "exchange_id") protected String exchangeId;  // 交易所代码（SSE上交所SZSE深交所）
    @Column(name = "rzye") protected Double rzye;  // 融资余额(元)
    @Column(name = "rzmre") protected Double rzmre;  // 融资买入额(元)
    @Column(name = "rzche") protected Double rzche;  // 融资偿还额(元)
    @Column(name = "rqye") protected Double rqye;  // 融券余额(元)
    @Column(name = "rqmcl") protected Double rqmcl;  // 融券卖出量(股,份,手)
    @Column(name = "rzrqye") protected Double rzrqye;  // 融资融券余额(元)

}