package com.github.tusharepro.core.entity;
import lombok.Data;

import com.github.tusharepro.core.bean.MoneyflowHsgt;

import javax.persistence.*;
import java.time.LocalDate;

/**
 * 沪深港通资金流向
 * https://tushare.pro/document/2?doc_id=47
 */
@Data
@Entity
@Table(name = "moneyflow_hsgt")
public class MoneyflowHsgtEntity implements MoneyflowHsgt {

    @Id
    @Column(name = "trade_date") protected LocalDate tradeDate;  // 交易日期
    @Column(name = "ggt_ss") protected Double ggtSs;  // 港股通（上海）
    @Column(name = "ggt_sz") protected Double ggtSz;  // 港股通（深圳）
    @Column(name = "hgt") protected Double hgt;  // 沪股通（百万元）
    @Column(name = "sgt") protected Double sgt;  // 深股通（百万元）
    @Column(name = "north_money") protected Double northMoney;  // 北向资金（百万元）
    @Column(name = "south_money") protected Double southMoney;  // 南向资金（百万元）

}