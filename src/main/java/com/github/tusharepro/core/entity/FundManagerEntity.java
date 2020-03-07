package com.github.tusharepro.core.entity;
import lombok.Data;

import com.github.tusharepro.core.bean.FundManager;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;

/**
 * 公募基金经理
 * https://tushare.pro/document/2?doc_id=208
 */
@Data
@Entity
@Table(name = "fund_manager")
@IdClass(FundManagerEntity.PrimaryKey.class)
public class FundManagerEntity implements FundManager {

    @Data public static class PrimaryKey implements Serializable {
        private String tsCode;
        private LocalDate annDate;
        private String name;
    }

    @Id
    @Column(name = "ts_code") protected String tsCode;  // 基金代码
    @Id
    @Column(name = "ann_date") protected LocalDate annDate;  // 公告日期
    @Id
    @Column(name = "name") protected String name;  // 基金经理姓名
    @Column(name = "gender") protected String gender;  // 性别
    @Column(name = "birth_year") protected String birthYear;  // 出生年份
    @Column(name = "edu") protected String edu;  // 学历
    @Column(name = "nationality") protected String nationality;  // 国籍
    @Column(name = "begin_date") protected LocalDate beginDate;  // 任职日期
    @Column(name = "end_date") protected LocalDate endDate;  // 离任日期
    @Column(name = "resume") protected String resume;  // 简历

}