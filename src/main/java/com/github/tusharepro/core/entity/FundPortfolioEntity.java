package com.github.tusharepro.core.entity;
import lombok.Data;

import com.github.tusharepro.core.bean.FundPortfolio;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;

/**
 * 公募基金持仓数据
 * https://tushare.pro/document/2?doc_id=121
 */
@Data
@Entity
@Table(name = "fund_portfolio")
@IdClass(FundPortfolioEntity.PrimaryKey.class)
public class FundPortfolioEntity implements FundPortfolio {

    @Data public static class PrimaryKey implements Serializable {
        private String tsCode;
        private LocalDate endDate;
    }

    @Id
    @Column(name = "ts_code") protected String tsCode;  // TS基金代码
    @Column(name = "ann_date") protected LocalDate annDate;  // 公告日期
    @Id
    @Column(name = "end_date") protected LocalDate endDate;  // 截止日期
    @Column(name = "symbol") protected String symbol;  // 股票代码
    @Column(name = "mkv") protected Double mkv;  // 持有股票市值(元)
    @Column(name = "amount") protected Double amount;  // 持有股票数量（股）
    @Column(name = "stk_mkv_ratio") protected Double stkMkvRatio;  // 占股票市值比
    @Column(name = "stk_float_ratio") protected Double stkFloatRatio;  // 占流通股本比例

}