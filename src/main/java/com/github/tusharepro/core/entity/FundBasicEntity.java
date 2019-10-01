package com.github.tusharepro.core.entity;
import lombok.Data;

import com.github.tusharepro.core.bean.FundBasic;

import javax.persistence.*;
import java.time.LocalDate;

/**
 * 公募基金列表
 * https://tushare.pro/document/2?doc_id=19
 */
@Data
@Entity
@Table(name = "fund_basic")
public class FundBasicEntity implements FundBasic {

    @Id
    @Column(name = "ts_code") protected String tsCode;  // 基金代码
    @Column(name = "name") protected String name;  // 简称
    @Column(name = "management") protected String management;  // 管理人
    @Column(name = "custodian") protected String custodian;  // 托管人
    @Column(name = "fund_type") protected String fundType;  // 投资类型
    @Column(name = "found_date") protected LocalDate foundDate;  // 成立日期
    @Column(name = "due_date") protected LocalDate dueDate;  // 到期日期
    @Column(name = "list_date") protected LocalDate listDate;  // 上市时间
    @Column(name = "issue_date") protected LocalDate issueDate;  // 发行日期
    @Column(name = "delist_date") protected LocalDate delistDate;  // 退市日期
    @Column(name = "issue_amount") protected Double issueAmount;  // 发行份额(亿)
    @Column(name = "m_fee") protected Double mFee;  // 管理费
    @Column(name = "c_fee") protected Double cFee;  // 托管费
    @Column(name = "duration_year") protected Double durationYear;  // 存续期
    @Column(name = "p_value") protected Double pValue;  // 面值
    @Column(name = "min_amount") protected Double minAmount;  // 起点金额(万元)
    @Column(name = "exp_return") protected Double expReturn;  // 预期收益率
    @Column(name = "benchmark") protected String benchmark;  // 业绩比较基准
    @Column(name = "status") protected String status;  // 存续状态D摘牌 I发行 L已上市
    @Column(name = "invest_type") protected String investType;  // 投资风格
    @Column(name = "type") protected String type;  // 基金类型
    @Column(name = "trustee") protected String trustee;  // 受托人
    @Column(name = "purc_startdate") protected LocalDate purcStartdate;  // 日常申购起始日
    @Column(name = "redm_startdate") protected LocalDate redmStartdate;  // 日常赎回起始日
    @Column(name = "market") protected String market;  // E场内O场外

}