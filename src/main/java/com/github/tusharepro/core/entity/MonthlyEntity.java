package com.github.tusharepro.core.entity;
import lombok.Data;

import com.github.tusharepro.core.bean.Monthly;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;

/**
 * 月线行情
 */
@Data
@Entity
@Table(name = "monthly")
@IdClass(MonthlyEntity.PrimaryKey.class)
public class MonthlyEntity implements Monthly {

    @Data public static class PrimaryKey implements Serializable {
        private String tsCode;
        private LocalDate tradeDate;
    }

    @Id
    @Column(name = "ts_code") protected String tsCode;  // 股票代码
    @Id
    @Column(name = "trade_date") protected LocalDate tradeDate;  // 交易日期
    @Column(name = "close") protected Double close;  // 月收盘价
    @Column(name = "open") protected Double open;  // 月开盘价
    @Column(name = "high") protected Double high;  // 月最高价
    @Column(name = "low") protected Double low;  // 月最低价
    @Column(name = "pre_close") protected Double preClose;  // 上月收盘价
    @Column(name = "change") protected Double change;  // 月涨跌额
    @Column(name = "pct_chg") protected Double pctChg;  // 月涨跌幅 （未复权，如果是复权请用 <a href="https://tushare.pro/document/2?doc_id=109">通用行情接口</a> ）
    @Column(name = "vol") protected Double vol;  // 月成交量
    @Column(name = "amount") protected Double amount;  // 月成交额

}