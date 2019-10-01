package com.github.tusharepro.core.entity;
import lombok.Data;

import com.github.tusharepro.core.bean.FutMapping;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;

/**
 * 期货主力与连续合约
 * https://tushare.pro/document/2?doc_id=189
 */
@Data
@Entity
@Table(name = "fut_mapping")
@IdClass(FutMappingEntity.PrimaryKey.class)
public class FutMappingEntity implements FutMapping {

    @Data public static class PrimaryKey implements Serializable {
        private String tsCode;
        private LocalDate tradeDate;
        private String mappingTsCode;
    }

    @Id
    @Column(name = "ts_code") protected String tsCode;  // 连续合约代码
    @Id
    @Column(name = "trade_date") protected LocalDate tradeDate;  // 起始日期
    @Id
    @Column(name = "mapping_ts_code") protected String mappingTsCode;  // 期货合约代码

}