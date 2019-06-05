package com.github.tusharepro.core.entity;
import lombok.Data;

import com.github.tusharepro.core.bean.StockBasic;

import javax.persistence.*;
import java.time.LocalDate;

/**
 * 股票列表
 */
@Data
@Entity
@Table(name = "stock_basic")
public class StockBasicEntity implements StockBasic {

    @Id
    @Column(name = "ts_code") protected String tsCode;  // TS代码
    @Column(name = "symbol") protected String symbol;  // 股票代码
    @Column(name = "name") protected String name;  // 股票名称
    @Column(name = "area") protected String area;  // 所在地域
    @Column(name = "industry") protected String industry;  // 所属行业
    @Column(name = "fullname") protected String fullname;  // 股票全称
    @Column(name = "enname") protected String enname;  // 英文全称
    @Column(name = "market") protected String market;  // 市场类型 （主板/中小板/创业板）
    @Column(name = "exchange") protected String exchange;  // 交易所代码
    @Column(name = "curr_type") protected String currType;  // 交易货币
    @Column(name = "list_status") protected String listStatus;  // 上市状态： L上市 D退市 P暂停上市
    @Column(name = "list_date") protected LocalDate listDate;  // 上市日期
    @Column(name = "delist_date") protected LocalDate delistDate;  // 退市日期
    @Column(name = "is_hs") protected String isHs;  // 是否沪深港通标的，N否 H沪股通 S深股通

}