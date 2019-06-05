package com.github.tusharepro.core.entity;
import lombok.Data;

import com.github.tusharepro.core.bean.FinaMainbz;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;

/**
 * 主营业务构成
 */
@Data
@Entity
@Table(name = "fina_mainbz")
@IdClass(FinaMainbzEntity.PrimaryKey.class)
public class FinaMainbzEntity implements FinaMainbz {

    @Data public static class PrimaryKey implements Serializable {
        private String tsCode;
        private LocalDate endDate;
        private String bzItem;
    }

    @Id
    @Column(name = "ts_code") protected String tsCode;  // TS代码
    @Id
    @Column(name = "end_date") protected LocalDate endDate;  // 报告期
    @Id
    @Column(name = "bz_item") protected String bzItem;  // 主营业务来源
    @Column(name = "bz_sales") protected Double bzSales;  // 主营业务收入(元)
    @Column(name = "bz_profit") protected Double bzProfit;  // 主营业务利润(元)
    @Column(name = "bz_cost") protected Double bzCost;  // 主营业务成本(元)
    @Column(name = "curr_type") protected String currType;  // 货币代码
    @Column(name = "update_flag") protected String updateFlag;  // 是否更新
    @Column(name = "type") protected String type;  // 类型：P按产品 D按地区

}