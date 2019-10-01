package com.github.tusharepro.core.entity;
import lombok.Data;

import com.github.tusharepro.core.bean.TopInst;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;

/**
 * 龙虎榜机构明细
 * https://tushare.pro/document/2?doc_id=107
 */
@Data
@Entity
@Table(name = "top_inst")
@IdClass(TopInstEntity.PrimaryKey.class)
public class TopInstEntity implements TopInst {

    @Data public static class PrimaryKey implements Serializable {
        private LocalDate tradeDate;
        private String tsCode;
        private String exalter;
        private Double netBuy;
    }

    @Id
    @Column(name = "trade_date") protected LocalDate tradeDate;  // 交易日期
    @Id
    @Column(name = "ts_code") protected String tsCode;  // TS代码
    @Id
    @Column(name = "exalter") protected String exalter;  // 营业部名称
    @Column(name = "buy") protected Double buy;  // 买入额（万）
    @Column(name = "buy_rate") protected Double buyRate;  // 买入占总成交比例
    @Column(name = "sell") protected Double sell;  // 卖出额（万）
    @Column(name = "sell_rate") protected Double sellRate;  // 卖出占总成交比例
    @Id
    @Column(name = "net_buy") protected Double netBuy;  // 净成交额（万）

}