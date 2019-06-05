package com.github.tusharepro.core.entity;
import lombok.Data;

import com.github.tusharepro.core.bean.MarginDetail;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;

/**
 * 融资融券交易明细
 */
@Data
@Entity
@Table(name = "margin_detail")
@IdClass(MarginDetailEntity.PrimaryKey.class)
public class MarginDetailEntity implements MarginDetail {

    @Data public static class PrimaryKey implements Serializable {
        private LocalDate tradeDate;
        private String tsCode;
    }

    @Id
    @Column(name = "trade_date") protected LocalDate tradeDate;  // 交易日期
    @Id
    @Column(name = "ts_code") protected String tsCode;  // TS股票代码
    @Column(name = "rzye") protected Double rzye;  // 融资余额(元)
    @Column(name = "rqye") protected Double rqye;  // 融券余额(元)
    @Column(name = "rzmre") protected Double rzmre;  // 融资买入额(元)
    @Column(name = "rqyl") protected Double rqyl;  // 融券余量（手）
    @Column(name = "rzche") protected Double rzche;  // 融资偿还额(元)
    @Column(name = "rqchl") protected Double rqchl;  // 融券偿还量(手)
    @Column(name = "rqmcl") protected Double rqmcl;  // 融券卖出量(股,份,手)
    @Column(name = "rzrqye") protected Double rzrqye;  // 融资融券余额(元)

}