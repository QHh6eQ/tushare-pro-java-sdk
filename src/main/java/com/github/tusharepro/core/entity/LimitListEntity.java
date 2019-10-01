package com.github.tusharepro.core.entity;
import lombok.Data;

import com.github.tusharepro.core.bean.LimitList;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;

/**
 * 每日涨跌停统计
 * https://tushare.pro/document/2?doc_id=198
 */
@Data
@Entity
@Table(name = "limit_list")
@IdClass(LimitListEntity.PrimaryKey.class)
public class LimitListEntity implements LimitList {

    @Data public static class PrimaryKey implements Serializable {
        private LocalDate tradeDate;
        private String tsCode;
    }

    @Id
    @Column(name = "trade_date") protected LocalDate tradeDate;  // 交易日期
    @Id
    @Column(name = "ts_code") protected String tsCode;  // 股票代码
    @Column(name = "name") protected String name;  // 股票名称
    @Column(name = "close") protected Double close;  // 收盘价
    @Column(name = "pct_chg") protected Double pctChg;  // 涨跌幅
    @Column(name = "amp") protected Double amp;  // 振幅
    @Column(name = "fc_ratio") protected Double fcRatio;  // 封单金额/日成交金额
    @Column(name = "fl_ratio") protected Double flRatio;  // 封单手数/流通股本
    @Column(name = "fd_amount") protected Double fdAmount;  // 封单金额
    @Column(name = "first_time") protected String firstTime;  // 首次涨停时间
    @Column(name = "last_time") protected String lastTime;  // 最后封板时间
    @Column(name = "open_times") protected Integer openTimes;  // 打开次数
    @Column(name = "strth") protected Double strth;  // 涨跌停强度
    @Column(name = "limit") protected String limit;  // D跌停U涨停

}