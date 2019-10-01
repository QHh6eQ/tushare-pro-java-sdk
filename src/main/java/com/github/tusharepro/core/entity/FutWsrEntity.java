package com.github.tusharepro.core.entity;
import lombok.Data;

import com.github.tusharepro.core.bean.FutWsr;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;

/**
 * 仓单日报
 * https://tushare.pro/document/2?doc_id=140
 */
@Data
@Entity
@Table(name = "fut_wsr")
@IdClass(FutWsrEntity.PrimaryKey.class)
public class FutWsrEntity implements FutWsr {

    @Data public static class PrimaryKey implements Serializable {
        private LocalDate tradeDate;
        private String symbol;
        private String whId;
    }

    @Id
    @Column(name = "trade_date") protected LocalDate tradeDate;  // 交易日期
    @Id
    @Column(name = "symbol") protected String symbol;  // 产品代码
    @Column(name = "fut_name") protected String futName;  // 产品名称
    @Column(name = "warehouse") protected String warehouse;  // 仓库名称
    @Id
    @Column(name = "wh_id") protected String whId;  // 仓库编号
    @Column(name = "pre_vol") protected Integer preVol;  // 昨日仓单量
    @Column(name = "vol") protected Integer vol;  // 今日仓单量
    @Column(name = "vol_chg") protected Integer volChg;  // 增减量
    @Column(name = "area") protected String area;  // 地区
    @Column(name = "year") protected String year;  // 年度
    @Column(name = "grade") protected String grade;  // 等级
    @Column(name = "brand") protected String brand;  // 品牌
    @Column(name = "place") protected String place;  // 产地
    @Column(name = "pd") protected Integer pd;  // 升贴水
    @Column(name = "is_ct") protected String isCt;  // 是否折算仓单
    @Column(name = "unit") protected String unit;  // 单位
    @Column(name = "exchange") protected String exchange;  // 交易所

}