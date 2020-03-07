package com.github.tusharepro.core.entity;
import lombok.Data;

import com.github.tusharepro.core.bean.IndexGlobal;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;

/**
 * 国际指数
 * https://tushare.pro/document/2?doc_id=211
 */
@Data
@Entity
@Table(name = "index_global")
@IdClass(IndexGlobalEntity.PrimaryKey.class)
public class IndexGlobalEntity implements IndexGlobal {

    @Data public static class PrimaryKey implements Serializable {
        private String tsCode;
        private LocalDate tradeDate;
    }

    @Id
    @Column(name = "ts_code") protected String tsCode;  // TS指数代码
    @Id
    @Column(name = "trade_date") protected LocalDate tradeDate;  // 交易日
    @Column(name = "open") protected Double open;  // 开盘点位
    @Column(name = "close") protected Double close;  // 收盘点位
    @Column(name = "high") protected Double high;  // 最高点位
    @Column(name = "low") protected Double low;  // 最低点位
    @Column(name = "pre_close") protected Double preClose;  // 昨日收盘点
    @Column(name = "change") protected Double change;  // 涨跌点位
    @Column(name = "pct_chg") protected Double pctChg;  // 涨跌幅
    @Column(name = "vol") protected Double vol;  // 成交量 （大部分无此项数据）
    @Column(name = "amount") protected Double amount;  // 成交额 （大部分无此项数据）

}