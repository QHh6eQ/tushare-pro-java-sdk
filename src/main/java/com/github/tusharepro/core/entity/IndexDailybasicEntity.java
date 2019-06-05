package com.github.tusharepro.core.entity;
import lombok.Data;

import com.github.tusharepro.core.bean.IndexDailybasic;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;

/**
 * 大盘指数每日指标
 */
@Data
@Entity
@Table(name = "index_dailybasic")
@IdClass(IndexDailybasicEntity.PrimaryKey.class)
public class IndexDailybasicEntity implements IndexDailybasic {

    @Data public static class PrimaryKey implements Serializable {
        private String tsCode;
        private LocalDate tradeDate;
    }

    @Id
    @Column(name = "ts_code") protected String tsCode;  // TS代码
    @Id
    @Column(name = "trade_date") protected LocalDate tradeDate;  // 交易日期
    @Column(name = "total_mv") protected Double totalMv;  // 当日总市值（元）
    @Column(name = "float_mv") protected Double floatMv;  // 当日流通市值（元）
    @Column(name = "total_share") protected Double totalShare;  // 当日总股本（股）
    @Column(name = "float_share") protected Double floatShare;  // 当日流通股本（股）
    @Column(name = "free_share") protected Double freeShare;  // 当日自由流通股本（股）
    @Column(name = "turnover_rate") protected Double turnoverRate;  // 换手率
    @Column(name = "turnover_rate_f") protected Double turnoverRateF;  // 换手率(基于自由流通股本)
    @Column(name = "pe") protected Double pe;  // 市盈率
    @Column(name = "pe_ttm") protected Double peTtm;  // 市盈率TTM
    @Column(name = "pb") protected Double pb;  // 市净率

}