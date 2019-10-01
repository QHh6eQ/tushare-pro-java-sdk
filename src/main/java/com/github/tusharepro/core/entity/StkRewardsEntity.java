package com.github.tusharepro.core.entity;
import lombok.Data;

import com.github.tusharepro.core.bean.StkRewards;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;

/**
 * 管理层薪酬和持股
 * https://tushare.pro/document/2?doc_id=194
 */
@Data
@Entity
@Table(name = "stk_rewards")
@IdClass(StkRewardsEntity.PrimaryKey.class)
public class StkRewardsEntity implements StkRewards {

    @Data public static class PrimaryKey implements Serializable {
        private String tsCode;
        private LocalDate endDate;
        private String name;
    }

    @Id
    @Column(name = "ts_code") protected String tsCode;  // TS股票代码
    @Column(name = "ann_date") protected LocalDate annDate;  // 公告日期
    @Id
    @Column(name = "end_date") protected LocalDate endDate;  // 截止日期
    @Id
    @Column(name = "name") protected String name;  // 姓名
    @Column(name = "title") protected String title;  // 职务
    @Column(name = "reward") protected Double reward;  // 报酬
    @Column(name = "hold_vol") protected Double holdVol;  // 持股数

}