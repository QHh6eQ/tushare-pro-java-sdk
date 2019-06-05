package com.github.tusharepro.core.entity;

import com.github.tusharepro.core.bean.AdjFactor;
import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;

/**
 * 复权因子
 */
@Data
@Entity
@Table(name = "adj_factor")
@IdClass(AdjFactorEntity.PrimaryKey.class)
public class AdjFactorEntity implements AdjFactor {

    @Data public static class PrimaryKey implements Serializable {
        private String tsCode;
        private LocalDate tradeDate;
    }

    @Id
    @Column(name = "ts_code") protected String tsCode;  // 股票代码
    @Id
    @Column(name = "trade_date") protected LocalDate tradeDate;  // 交易日期
    @Column(name = "adj_factor") protected Double adjFactor;  // 复权因子

}