package com.github.tusharepro.core.entity;
import lombok.Data;

import com.github.tusharepro.core.bean.FundShare;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;

/**
 * 基金规模数据
 * https://tushare.pro/document/2?doc_id=207
 */
@Data
@Entity
@Table(name = "fund_share")
@IdClass(FundShareEntity.PrimaryKey.class)
public class FundShareEntity implements FundShare {

    @Data public static class PrimaryKey implements Serializable {
        private String tsCode;
        private LocalDate tradeDate;
    }

    @Id
    @Column(name = "ts_code") protected String tsCode;  // 基金代码，支持多只基金同时提取，用逗号分隔
    @Id
    @Column(name = "trade_date") protected LocalDate tradeDate;  // 交易（变动）日期，格式YYYYMMDD
    @Column(name = "fd_share") protected Double fdShare;  // 基金份额（万）

}