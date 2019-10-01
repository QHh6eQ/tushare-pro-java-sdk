package com.github.tusharepro.core.entity;
import lombok.Data;

import com.github.tusharepro.core.bean.StkManagers;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;

/**
 * 上市公司管理层
 * https://tushare.pro/document/2?doc_id=193
 */
@Data
@Entity
@Table(name = "stk_managers")
@IdClass(StkManagersEntity.PrimaryKey.class)
public class StkManagersEntity implements StkManagers {

    @Data public static class PrimaryKey implements Serializable {
        private String tsCode;
        private LocalDate annDate;
    }

    @Id
    @Column(name = "ts_code") protected String tsCode;  // TS股票代码
    @Id
    @Column(name = "ann_date") protected LocalDate annDate;  // 公告日期
    @Column(name = "name") protected String name;  // 姓名
    @Column(name = "gender") protected String gender;  // 性别
    @Column(name = "lev") protected String lev;  // 岗位类别
    @Column(name = "title") protected String title;  // 岗位
    @Column(name = "edu") protected String edu;  // 学历
    @Column(name = "national") protected String national;  // 国籍
    @Column(name = "birthday") protected LocalDate birthday;  // 出生年月
    @Column(name = "begin_date") protected LocalDate beginDate;  // 上任日期
    @Column(name = "end_date") protected LocalDate endDate;  // 离任日期
    @Column(name = "resume") protected String resume;  // 个人简历

}