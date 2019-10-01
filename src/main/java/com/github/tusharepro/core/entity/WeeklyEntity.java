package com.github.tusharepro.core.entity;
import lombok.Data;

import com.github.tusharepro.core.bean.Weekly;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;

/**
 * 周线行情
 * https://tushare.pro/document/2?doc_id=144
 */
@Data
@Entity
@Table(name = "weekly")
@IdClass(WeeklyEntity.PrimaryKey.class)
public class WeeklyEntity implements Weekly {

    @Data public static class PrimaryKey implements Serializable {
        private String tsCode;
        private LocalDate tradeDate;
    }

    @Id
    @Column(name = "ts_code") protected String tsCode;  // 股票代码
    @Id
    @Column(name = "trade_date") protected LocalDate tradeDate;  // 交易日期
    @Column(name = "close") protected Double close;  // 周收盘价
    @Column(name = "open") protected Double open;  // 周开盘价
    @Column(name = "high") protected Double high;  // 周最高价
    @Column(name = "low") protected Double low;  // 周最低价
    @Column(name = "pre_close") protected Double preClose;  // 上一周收盘价
    @Column(name = "change") protected Double change;  // 周涨跌额
    @Column(name = "pct_chg") protected Double pctChg;  // 周涨跌幅 （未复权，如果是复权请用 <a href="https://tushare.pro/document/2?doc_id=109">通用行情接口</a> ）
    @Column(name = "vol") protected Double vol;  // 周成交量
    @Column(name = "amount") protected Double amount;  // 周成交额

}