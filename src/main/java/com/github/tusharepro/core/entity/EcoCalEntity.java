package com.github.tusharepro.core.entity;
import lombok.Data;

import com.github.tusharepro.core.bean.EcoCal;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;

/**
 * 财经日历
 * https://tushare.pro/document/2?doc_id=233
 */
@Data
@Entity
@Table(name = "eco_cal")
@IdClass(EcoCalEntity.PrimaryKey.class)
public class EcoCalEntity implements EcoCal {

    @Data public static class PrimaryKey implements Serializable {
        private LocalDate date;
        private String time;
        private String event;
    }

    @Id
    @Column(name = "date") protected LocalDate date;  // 日期
    @Id
    @Column(name = "time") protected String time;  // 时间
    @Column(name = "currency") protected String currency;  // 货币代码
    @Column(name = "country") protected String country;  // 国家
    @Id
    @Column(name = "event") protected String event;  // 经济事件
    @Column(name = "value") protected String value;  // 今值
    @Column(name = "pre_value") protected String preValue;  // 前值
    @Column(name = "fore_value") protected String foreValue;  // 预测值

}