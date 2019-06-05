package com.github.tusharepro.core.entity;
import lombok.Data;

import com.github.tusharepro.core.bean.IndexWeigth;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;

/**
 * 指数成分和权重
 */
@Data
@Entity
@Table(name = "index_weigth")
@IdClass(IndexWeigthEntity.PrimaryKey.class)
public class IndexWeigthEntity implements IndexWeigth {

    @Data public static class PrimaryKey implements Serializable {
        private String indexCode;
        private String conCode;
        private LocalDate tradeDate;
    }

    @Id
    @Column(name = "index_code") protected String indexCode;  // 指数代码
    @Id
    @Column(name = "con_code") protected String conCode;  // 成分代码
    @Id
    @Column(name = "trade_date") protected LocalDate tradeDate;  // 交易日期
    @Column(name = "weight") protected Double weight;  // 权重

}