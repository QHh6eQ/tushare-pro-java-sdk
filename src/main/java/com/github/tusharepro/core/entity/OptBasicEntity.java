package com.github.tusharepro.core.entity;
import lombok.Data;

import com.github.tusharepro.core.bean.OptBasic;

import javax.persistence.*;
import java.time.LocalDate;

/**
 * 期权合约信息
 * https://tushare.pro/document/2?doc_id=158
 */
@Data
@Entity
@Table(name = "opt_basic")
public class OptBasicEntity implements OptBasic {

    @Id
    @Column(name = "ts_code") protected String tsCode;  // TS代码
    @Column(name = "exchange") protected String exchange;  // 交易市场
    @Column(name = "name") protected String name;  // 合约名称
    @Column(name = "per_unit") protected String perUnit;  // 合约单位
    @Column(name = "opt_code") protected String optCode;  // 标准合约代码
    @Column(name = "opt_type") protected String optType;  // 合约类型
    @Column(name = "call_put") protected String callPut;  // 期权类型
    @Column(name = "exercise_type") protected String exerciseType;  // 行权方式
    @Column(name = "exercise_price") protected Double exercisePrice;  // 行权价格
    @Column(name = "s_month") protected String sMonth;  // 结算月
    @Column(name = "maturity_date") protected LocalDate maturityDate;  // 到期日
    @Column(name = "list_price") protected Double listPrice;  // 挂牌基准价
    @Column(name = "list_date") protected LocalDate listDate;  // 开始交易日期
    @Column(name = "delist_date") protected LocalDate delistDate;  // 最后交易日期
    @Column(name = "last_edate") protected LocalDate lastEdate;  // 最后行权日期
    @Column(name = "last_ddate") protected LocalDate lastDdate;  // 最后交割日期
    @Column(name = "quote_unit") protected String quoteUnit;  // 报价单位
    @Column(name = "min_price_chg") protected String minPriceChg;  // 最小价格波幅

}