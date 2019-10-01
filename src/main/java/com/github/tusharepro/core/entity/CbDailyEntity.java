package com.github.tusharepro.core.entity;
import lombok.Data;

import com.github.tusharepro.core.bean.CbDaily;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;

/**
 * 可转债行情
 * https://tushare.pro/document/2?doc_id=187
 */
@Data
@Entity
@Table(name = "cb_daily")
@IdClass(CbDailyEntity.PrimaryKey.class)
public class CbDailyEntity implements CbDaily {

    @Data public static class PrimaryKey implements Serializable {
        private String tsCode;
        private LocalDate tradeDate;
    }

    @Id
    @Column(name = "ts_code") protected String tsCode;  // 转债代码
    @Id
    @Column(name = "trade_date") protected LocalDate tradeDate;  // 交易日期
    @Column(name = "pre_close") protected Double preClose;  // 昨收盘价(元)
    @Column(name = "open") protected Double open;  // 开盘价(元)
    @Column(name = "high") protected Double high;  // 最高价(元)
    @Column(name = "low") protected Double low;  // 最低价(元)
    @Column(name = "close") protected Double close;  // 收盘价(元)
    @Column(name = "change") protected Double change;  // 涨跌(元)
    @Column(name = "pct_chg") protected Double pctChg;  // 涨跌幅(%)
    @Column(name = "vol") protected Double vol;  // 成交量(手)
    @Column(name = "amount") protected Double amount;  // 成交金额(万元)

}