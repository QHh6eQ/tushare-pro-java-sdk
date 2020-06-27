package com.github.tusharepro.core.entity;
import lombok.Data;

import com.github.tusharepro.core.bean.YcCb;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;

/**
 * 中债收益率曲线
 * https://tushare.pro/document/2?doc_id=201
 */
@Deprecated
@Data
@Entity
@Table(name = "yc_cb")
public class YcCbEntity implements YcCb {

    @Data public static class PrimaryKey implements Serializable {
        private String tsCode;
        private LocalDate tradeDate;
        private String curveType;
        private Double curveTerm;
    }

    @Id
    @Column(name = "trade_date") protected String tradeDate;  // 交易日期
    @Id
    @Column(name = "ts_code") protected String tsCode;  // 曲线编码
    @Column(name = "curve_name") protected String curveName;  // 曲线名称
    @Id
    @Column(name = "curve_type") protected String curveType;  // 曲线类型：0-到期，1-即期
    @Id
    @Column(name = "curve_term") protected Double curveTerm;  // 期限(年)
    @Column(name = "yield") protected Double yield;  // 收益率(%)

}