package com.github.tusharepro.core.entity;
import lombok.Data;

import com.github.tusharepro.core.bean.IndexClassify;

import javax.persistence.*;

/**
 * 申万行业分类
 * https://tushare.pro/document/2?doc_id=181
 */
@Data
@Entity
@Table(name = "index_classify")
public class IndexClassifyEntity implements IndexClassify {

    @Id
    @Column(name = "index_code") protected String indexCode;  // 指数代码
    @Column(name = "industry_name") protected String industryName;  // 行业名称
    @Column(name = "level") protected String level;  // 行业名称
    @Column(name = "industry_code") protected String industryCode;  // 行业代码
    @Column(name = "src") protected String src;  // 行业分类（SW申万）

}