package com.github.tusharepro.core.entity;
import lombok.Data;

import com.github.tusharepro.core.bean.StkAccount;

import javax.persistence.*;
import java.time.LocalDate;

/**
 * 股票账户开户数据
 */
@Data
@Entity
@Table(name = "stk_account")
public class StkAccountEntity implements StkAccount {

    @Id
    @Column(name = "date") protected LocalDate date;  // 统计周期
    @Column(name = "weekly_new") protected Double weeklyNew;  // 本周新增（万）
    @Column(name = "total") protected Double total;  // 期末总账户数（万）
    @Column(name = "weekly_hold") protected Double weeklyHold;  // 本周持仓账户数（万）
    @Column(name = "weekly_trade") protected Double weeklyTrade;  // 本周参与交易账户数（万）

}