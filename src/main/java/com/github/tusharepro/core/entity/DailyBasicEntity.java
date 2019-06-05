package com.github.tusharepro.core.entity;
import lombok.Data;

import com.github.tusharepro.core.bean.DailyBasic;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;

/**
 * 每日指标
 */
@Data
@Entity
@Table(name = "daily_basic")
@IdClass(DailyBasicEntity.PrimaryKey.class)
public class DailyBasicEntity implements DailyBasic {

    @Data public static class PrimaryKey implements Serializable {
        private String tsCode;
        private LocalDate tradeDate;
    }

    @Id
    @Column(name = "ts_code") protected String tsCode;  // TS股票代码
    @Id
    @Column(name = "trade_date") protected LocalDate tradeDate;  // 交易日期
    @Column(name = "close") protected Double close;  // 当日收盘价
    @Column(name = "turnover_rate") protected Double turnoverRate;  // 换手率（%）
    @Column(name = "turnover_rate_f") protected Double turnoverRateF;  // 换手率（自由流通股）
    @Column(name = "volume_ratio") protected Double volumeRatio;  // 量比
    @Column(name = "pe") protected Double pe;  // 市盈率（总市值/净利润）
    @Column(name = "pe_ttm") protected Double peTtm;  // 市盈率（TTM）
    @Column(name = "pb") protected Double pb;  // 市净率（总市值/净资产）
    @Column(name = "ps") protected Double ps;  // 市销率
    @Column(name = "ps_ttm") protected Double psTtm;  // 市销率（TTM）
    @Column(name = "total_share") protected Double totalShare;  // 总股本 （万股）
    @Column(name = "float_share") protected Double floatShare;  // 流通股本 （万股）
    @Column(name = "free_share") protected Double freeShare;  // 自由流通股本 （万）
    @Column(name = "total_mv") protected Double totalMv;  // 总市值 （万元）
    @Column(name = "circ_mv") protected Double circMv;  // 流通市值（万元）

}