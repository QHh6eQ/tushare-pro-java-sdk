package com.github.tusharepro.core.entity;
import lombok.Data;

import com.github.tusharepro.core.bean.FxObasic;

import javax.persistence.*;
import java.time.LocalDate;

/**
 * 外汇基础信息（海外）
 * https://tushare.pro/document/2?doc_id=178
 */
@Data
@Entity
@Table(name = "fx_obasic")
public class FxObasicEntity implements FxObasic {

    @Id
    @Column(name = "ts_code") protected String tsCode;  // 外汇代码
    @Column(name = "name") protected String name;  // 名称
    @Column(name = "classify") protected String classify;  // 分类
    @Column(name = "exchange") protected String exchange;  // 交易商
    @Column(name = "min_unit") protected Double minUnit;  // 最小交易单位
    @Column(name = "max_unit") protected Double maxUnit;  // 最大交易单位
    @Column(name = "pip") protected Double pip;  // 最大交易单位
    @Column(name = "pip_cost") protected Double pipCost;  // 点值
    @Column(name = "traget_spread") protected Double tragetSpread;  // 目标差价
    @Column(name = "min_stop_distance") protected Double minStopDistance;  // 最小止损距离（点子）
    @Column(name = "trading_hours") protected LocalDate tradingHours;  // 交易时间
    @Column(name = "break_time") protected LocalDate breakTime;  // 休市时间

}