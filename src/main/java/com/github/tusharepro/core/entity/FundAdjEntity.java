package com.github.tusharepro.core.entity;
import lombok.Data;

import com.github.tusharepro.core.bean.FundAdj;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;

/**
 * 基金复权因子
 * https://tushare.pro/document/2?doc_id=199
 */
@Data
@Entity
@Table(name = "fund_adj")
@IdClass(FundAdjEntity.PrimaryKey.class)
public class FundAdjEntity implements FundAdj {

    @Data public static class PrimaryKey implements Serializable {
        private String tsCode;
        private LocalDate tradeDate;
    }

    @Id
    @Column(name = "ts_code") protected String tsCode;  // ts基金代码
    @Id
    @Column(name = "trade_date") protected LocalDate tradeDate;  // 交易日期
    @Column(name = "adj_factor") protected Double adjFactor;  // 复权因子

}