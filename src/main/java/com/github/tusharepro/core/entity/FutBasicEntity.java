package com.github.tusharepro.core.entity;
import lombok.Data;

import com.github.tusharepro.core.bean.FutBasic;

import javax.persistence.*;
import java.time.LocalDate;

/**
 * 期货合约信息表
 * https://tushare.pro/document/2?doc_id=135
 */
@Data
@Entity
@Table(name = "fut_basic")
public class FutBasicEntity implements FutBasic {

    @Id
    @Column(name = "ts_code") protected String tsCode;  // 合约代码
    @Column(name = "symbol") protected String symbol;  // 交易标识
    @Column(name = "exchange") protected String exchange;  // 交易市场
    @Column(name = "name") protected String name;  // 中文简称
    @Column(name = "fut_code") protected String futCode;  // 合约产品代码
    @Column(name = "multiplier") protected Double multiplier;  // 合约乘数
    @Column(name = "trade_unit") protected String tradeUnit;  // 交易计量单位
    @Column(name = "per_unit") protected Double perUnit;  // 交易单位(每手)
    @Column(name = "quote_unit") protected String quoteUnit;  // 报价单位
    @Column(name = "quote_unit_desc") protected String quoteUnitDesc;  // 最小报价单位说明
    @Column(name = "d_mode_desc") protected String dModeDesc;  // 交割方式说明
    @Column(name = "list_date") protected LocalDate listDate;  // 上市日期
    @Column(name = "delist_date") protected LocalDate delistDate;  // 最后交易日期
    @Column(name = "d_month") protected String dMonth;  // 交割月份
    @Column(name = "last_ddate") protected LocalDate lastDdate;  // 最后交割日
    @Column(name = "trade_time_desc") protected String tradeTimeDesc;  // 交易时间说明

}