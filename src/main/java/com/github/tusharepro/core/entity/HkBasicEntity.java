package com.github.tusharepro.core.entity;
import lombok.Data;

import com.github.tusharepro.core.bean.HkBasic;

import javax.persistence.*;
import java.time.LocalDate;

/**
 * 港股列表
 * https://tushare.pro/document/2?doc_id=191
 */
@Data
@Entity
@Table(name = "hk_basic")
public class HkBasicEntity implements HkBasic {

    @Id
    @Column(name = "ts_code") protected String tsCode;  // 
    @Column(name = "name") protected String name;  // 股票简称
    @Column(name = "fullname") protected String fullname;  // 公司全称
    @Column(name = "enname") protected String enname;  // 英文名称
    @Column(name = "cn_spell") protected String cnSpell;  // 拼音
    @Column(name = "market") protected String market;  // 市场类别
    @Column(name = "list_status") protected String listStatus;  // 上市状态
    @Column(name = "list_date") protected LocalDate listDate;  // 上市日期
    @Column(name = "delist_date") protected LocalDate delistDate;  // 退市日期
    @Column(name = "trade_unit") protected Double tradeUnit;  // 交易单位
    @Column(name = "isin") protected String isin;  // ISIN代码
    @Column(name = "curr_type") protected String currType;  // 货币代码

}