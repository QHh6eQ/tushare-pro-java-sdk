package com.github.tusharepro.core.entity;
import lombok.Data;

import com.github.tusharepro.core.bean.IndexBasic;

import javax.persistence.*;

/**
 * 指数基本信息
 */
@Data
@Entity
@Table(name = "index_basic")
public class IndexBasicEntity implements IndexBasic {

    @Id
    @Column(name = "ts_code") protected String tsCode;  // TS代码
    @Column(name = "name") protected String name;  // 简称
    @Column(name = "fullname") protected String fullname;  // 指数全称
    @Column(name = "market") protected String market;  // 市场
    @Column(name = "publisher") protected String publisher;  // 发布方
    @Column(name = "index_type") protected String indexType;  // 指数风格
    @Column(name = "category") protected String category;  // 指数类别
    @Column(name = "base_date") protected String baseDate;  // 基期
    @Column(name = "base_point") protected Double basePoint;  // 基点
    @Column(name = "list_date") protected String listDate;  // 发布日期
    @Column(name = "weight_rule") protected String weightRule;  // 加权方式
    @Column(name = "\"desc\"") protected String desc;  // 描述
    @Column(name = "exp_date") protected String expDate;  // 终止日期

}