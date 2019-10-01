package com.github.tusharepro.core.entity;
import lombok.Data;

import com.github.tusharepro.core.bean.Daily;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;

/**
 * 日线行情
 * https://tushare.pro/document/2?doc_id=27
 */
@Data
@Entity
@Table(name = "daily")
@IdClass(DailyEntity.PrimaryKey.class)
public class DailyEntity implements Daily {

    @Data public static class PrimaryKey implements Serializable {
        private String tsCode;
        private LocalDate tradeDate;
    }

    @Id
    @Column(name = "ts_code") protected String tsCode;  // 股票代码
    @Id
    @Column(name = "trade_date") protected LocalDate tradeDate;  // 交易日期
    @Column(name = "open") protected Double open;  // 开盘价
    @Column(name = "high") protected Double high;  // 最高价
    @Column(name = "low") protected Double low;  // 最低价
    @Column(name = "close") protected Double close;  // 收盘价
    @Column(name = "pre_close") protected Double preClose;  // 昨收价
    @Column(name = "change") protected Double change;  // 涨跌额
    @Column(name = "pct_chg") protected Double pctChg;  // 涨跌幅 （未复权，如果是复权请用 <a href="https://tushare.pro/document/2?doc_id=109">通用行情接口</a> ）
    @Column(name = "vol") protected Double vol;  // 成交量 （手）
    @Column(name = "amount") protected Double amount;  // 成交额 （千元）

}