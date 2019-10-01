package com.github.tusharepro.core.entity;
import lombok.Data;

import com.github.tusharepro.core.bean.StkLimit;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;

/**
 * 每日涨跌停价格
 * https://tushare.pro/document/2?doc_id=183
 */
@Data
@Entity
@Table(name = "stk_limit")
@IdClass(StkLimitEntity.PrimaryKey.class)
public class StkLimitEntity implements StkLimit {

    @Data public static class PrimaryKey implements Serializable {
        private LocalDate tradeDate;
        private String tsCode;
    }

    @Id
    @Column(name = "trade_date") protected LocalDate tradeDate;  // 交易日期
    @Id
    @Column(name = "ts_code") protected String tsCode;  // TS股票代码
    @Column(name = "pre_close") protected Double preClose;  // 昨日收盘价
    @Column(name = "up_limit") protected Double upLimit;  // 涨停价
    @Column(name = "down_limit") protected Double downLimit;  // 跌停价

}