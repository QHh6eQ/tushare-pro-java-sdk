package com.github.tusharepro.core.entity;
import lombok.Data;

import com.github.tusharepro.core.bean.NewShare;

import javax.persistence.*;

/**
 * IPO新股列表
 * https://tushare.pro/document/2?doc_id=123
 */
@Data
@Entity
@Table(name = "new_share")
public class NewShareEntity implements NewShare {

    @Id
    @Column(name = "ts_code") protected String tsCode;  // TS股票代码
    @Column(name = "sub_code") protected String subCode;  // 申购代码
    @Column(name = "name") protected String name;  // 名称
    @Column(name = "ipo_date") protected String ipoDate;  // 上网发行日期
    @Column(name = "issue_date") protected String issueDate;  // 上市日期
    @Column(name = "amount") protected Double amount;  // 发行总量（万股）
    @Column(name = "market_amount") protected Double marketAmount;  // 上网发行总量（万股）
    @Column(name = "price") protected Double price;  // 发行价格
    @Column(name = "pe") protected Double pe;  // 市盈率
    @Column(name = "limit_amount") protected Double limitAmount;  // 个人申购上限（万股）
    @Column(name = "funds") protected Double funds;  // 募集资金（亿元）
    @Column(name = "ballot") protected Double ballot;  // 中签率

}