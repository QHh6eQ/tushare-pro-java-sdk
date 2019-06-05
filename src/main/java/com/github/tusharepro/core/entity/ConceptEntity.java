package com.github.tusharepro.core.entity;
import lombok.Data;

import com.github.tusharepro.core.bean.Concept;

import javax.persistence.*;

/**
 * 概念股分类
 */
@Data
@Entity
@Table(name = "concept")
public class ConceptEntity implements Concept {

    @Id
    @Column(name = "code") protected String code;  // 概念分类ID
    @Column(name = "name") protected String name;  // 概念分类名称
    @Column(name = "src") protected String src;  // 来源

}