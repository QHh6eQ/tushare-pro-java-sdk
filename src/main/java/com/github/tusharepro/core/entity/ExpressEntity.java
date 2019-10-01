package com.github.tusharepro.core.entity;
import lombok.Data;

import com.github.tusharepro.core.bean.Express;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;

/**
 * 业绩快报
 * https://tushare.pro/document/2?doc_id=46
 */
@Data
@Entity
@Table(name = "express")
@IdClass(ExpressEntity.PrimaryKey.class)
public class ExpressEntity implements Express {

    @Data public static class PrimaryKey implements Serializable {
        private String tsCode;
        private LocalDate endDate;
    }

    @Id
    @Column(name = "ts_code") protected String tsCode;  // TS股票代码
    @Column(name = "ann_date") protected LocalDate annDate;  // 公告日期
    @Id
    @Column(name = "end_date") protected LocalDate endDate;  // 报告期
    @Column(name = "revenue") protected Double revenue;  // 营业收入(元)
    @Column(name = "operate_profit") protected Double operateProfit;  // 营业利润(元)
    @Column(name = "total_profit") protected Double totalProfit;  // 利润总额(元)
    @Column(name = "n_income") protected Double nIncome;  // 净利润(元)
    @Column(name = "total_assets") protected Double totalAssets;  // 总资产(元)
    @Column(name = "total_hldr_eqy_exc_min_int") protected Double totalHldrEqyExcMinInt;  // 股东权益合计(不含少数股东权益)(元)
    @Column(name = "diluted_eps") protected Double dilutedEps;  // 每股收益(摊薄)(元)
    @Column(name = "diluted_roe") protected Double dilutedRoe;  // 净资产收益率(摊薄)(%)
    @Column(name = "yoy_net_profit") protected Double yoyNetProfit;  // 去年同期修正后净利润
    @Column(name = "bps") protected Double bps;  // 每股净资产
    @Column(name = "yoy_sales") protected Double yoySales;  // 同比增长率:营业收入
    @Column(name = "yoy_op") protected Double yoyOp;  // 同比增长率:营业利润
    @Column(name = "yoy_tp") protected Double yoyTp;  // 同比增长率:利润总额
    @Column(name = "yoy_dedu_np") protected Double yoyDeduNp;  // 同比增长率:归属母公司股东的净利润
    @Column(name = "yoy_eps") protected Double yoyEps;  // 同比增长率:基本每股收益
    @Column(name = "yoy_roe") protected Double yoyRoe;  // 同比增减:加权平均净资产收益率
    @Column(name = "growth_assets") protected Double growthAssets;  // 比年初增长率:总资产
    @Column(name = "yoy_equity") protected Double yoyEquity;  // 比年初增长率:归属母公司的股东权益
    @Column(name = "growth_bps") protected Double growthBps;  // 比年初增长率:归属于母公司股东的每股净资产
    @Column(name = "or_last_year") protected Double orLastYear;  // 去年同期营业收入
    @Column(name = "op_last_year") protected Double opLastYear;  // 去年同期营业利润
    @Column(name = "tp_last_year") protected Double tpLastYear;  // 去年同期利润总额
    @Column(name = "np_last_year") protected Double npLastYear;  // 去年同期净利润
    @Column(name = "eps_last_year") protected Double epsLastYear;  // 去年同期每股收益
    @Column(name = "open_net_assets") protected Double openNetAssets;  // 期初净资产
    @Column(name = "open_bps") protected Double openBps;  // 期初每股净资产
    @Column(name = "perf_summary") protected String perfSummary;  // 业绩简要说明
    @Column(name = "is_audit") protected Integer isAudit;  // 是否审计： 1是 0否
    @Column(name = "remark") protected String remark;  // 备注

}