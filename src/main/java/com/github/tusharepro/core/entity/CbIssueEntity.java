package com.github.tusharepro.core.entity;
import lombok.Data;

import com.github.tusharepro.core.bean.CbIssue;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;

/**
 * 可转债发行
 * https://tushare.pro/document/2?doc_id=186
 */
@Data
@Entity
@Table(name = "cb_issue")
public class CbIssueEntity implements CbIssue {

    @Id
    @Column(name = "ts_code") protected String tsCode;  // 转债代码
    @Column(name = "ann_date") protected LocalDate annDate;  // 发行公告日
    @Column(name = "res_ann_date") protected LocalDate resAnnDate;  // 发行结果公告日
    @Column(name = "plan_issue_size") protected Double planIssueSize;  // 计划发行总额（元）
    @Column(name = "issue_size") protected Double issueSize;  // 发行总额（元）
    @Column(name = "issue_price") protected Double issuePrice;  // 发行价格
    @Column(name = "issue_type") protected String issueType;  // 发行方式
    @Column(name = "issue_cost") protected Double issueCost;  // 发行费用（元）
    @Column(name = "onl_code") protected String onlCode;  // 网上申购代码
    @Column(name = "onl_name") protected String onlName;  // 网上申购简称
    @Column(name = "onl_date") protected LocalDate onlDate;  // 网上发行日期
    @Column(name = "onl_size") protected Double onlSize;  // 网上发行总额（元）
    @Column(name = "onl_pch_vol") protected Double onlPchVol;  // 网上发行有效申购数量（张）
    @Column(name = "onl_pch_num") protected Integer onlPchNum;  // 网上发行有效申购户数
    @Column(name = "onl_pch_excess") protected Double onlPchExcess;  // 网上发行超额认购倍数
    @Column(name = "onl_winning_rate") protected Double onlWinningRate;  // 网上发行中签率（%）
    @Column(name = "shd_ration_code") protected String shdRationCode;  // 老股东配售代码
    @Column(name = "shd_ration_name") protected String shdRationName;  // 老股东配售简称
    @Column(name = "shd_ration_date") protected LocalDate shdRationDate;  // 老股东配售日
    @Column(name = "shd_ration_record_date") protected LocalDate shdRationRecordDate;  // 老股东配售股权登记日
    @Column(name = "shd_ration_pay_date") protected LocalDate shdRationPayDate;  // 老股东配售缴款日
    @Column(name = "shd_ration_price") protected Double shdRationPrice;  // 老股东配售价格
    @Column(name = "shd_ration_ratio") protected Double shdRationRatio;  // 老股东配售比例
    @Column(name = "shd_ration_size") protected Double shdRationSize;  // 老股东配售数量（张）
    @Column(name = "shd_ration_vol") protected Double shdRationVol;  // 老股东配售有效申购数量（张）
    @Column(name = "shd_ration_num") protected Integer shdRationNum;  // 老股东配售有效申购户数
    @Column(name = "shd_ration_excess") protected Double shdRationExcess;  // 老股东配售超额认购倍数
    @Column(name = "offl_size") protected Double offlSize;  // 网下发行总额（元）
    @Column(name = "offl_deposit") protected Double offlDeposit;  // 网下发行定金比例（%）
    @Column(name = "offl_pch_vol") protected Double offlPchVol;  // 网下发行有效申购数量（张）
    @Column(name = "offl_pch_num") protected Integer offlPchNum;  // 网下发行有效申购户数
    @Column(name = "offl_pch_excess") protected Double offlPchExcess;  // 网下发行超额认购倍数
    @Column(name = "offl_winning_rate") protected Double offlWinningRate;  // 网下发行中签率
    @Column(name = "lead_underwriter") protected String leadUnderwriter;  // 主承销商
    @Column(name = "lead_underwriter_vol") protected Double leadUnderwriterVol;  // 主承销商包销数量（张）

}