package com.github.tusharepro.core.entity;
import lombok.Data;

import com.github.tusharepro.core.bean.IndexMember;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;

/**
 * 申万行业成分构成
 * https://tushare.pro/document/2?doc_id=182
 */
@Data
@Entity
@Table(name = "index_member")
@IdClass(IndexMemberEntity.PrimaryKey.class)
public class IndexMemberEntity implements IndexMember {

    @Data public static class PrimaryKey implements Serializable {
        private String indexCode;
        private String conCode;
        private LocalDate inDate;
    }

    @Id
    @Column(name = "index_code") protected String indexCode;  // 指数代码
    @Column(name = "index_name") protected String indexName;  // 指数名称
    @Id
    @Column(name = "con_code") protected String conCode;  // 成分股票代码
    @Column(name = "con_name") protected String conName;  // 成分股票名称
    @Id
    @Column(name = "in_date") protected LocalDate inDate;  // 纳入日期
    @Column(name = "out_date") protected LocalDate outDate;  // 剔除日期
    @Column(name = "is_new") protected String isNew;  // 是否最新Y是N否

}