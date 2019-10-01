package com.github.tusharepro.core.entity;
import lombok.Data;

import com.github.tusharepro.core.bean.FundDaily;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;

/**
 * 场内基金日线行情
 * https://tushare.pro/document/2?doc_id=127
 */
@Data
@Entity
@Table(name = "fund_daily")
@IdClass(FundDailyEntity.PrimaryKey.class)
public class FundDailyEntity implements FundDaily {

    @Data public static class PrimaryKey implements Serializable {
        private String tsCode;
        private LocalDate tradeDate;
    }

    @Id
    @Column(name = "ts_code") protected String tsCode;  // TS代码
    @Id
    @Column(name = "trade_date") protected LocalDate tradeDate;  // 交易日期
    @Column(name = "open") protected Double open;  // 开盘价(元)
    @Column(name = "high") protected Double high;  // 最高价(元)
    @Column(name = "low") protected Double low;  // 最低价(元)
    @Column(name = "close") protected Double close;  // 收盘价(元)
    @Column(name = "pre_close") protected Double preClose;  // 昨收盘价(元)
    @Column(name = "change") protected Double change;  // 涨跌额(元)
    @Column(name = "pct_chg") protected Double pctChg;  // 涨跌幅(%)
    @Column(name = "vol") protected Double vol;  // 成交量(手)
    @Column(name = "amount") protected Double amount;  // 成交额(千元)

}