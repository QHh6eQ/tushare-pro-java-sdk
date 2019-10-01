package com.github.tusharepro.core.entity;
import lombok.Data;

import com.github.tusharepro.core.bean.StkAccountOld;

import javax.persistence.*;
import java.time.LocalDate;

/**
 * 股票账户开户数据（旧）
 * https://tushare.pro/document/2?doc_id=165
 */
@Data
@Entity
@Table(name = "stk_account_old")
public class StkAccountOldEntity implements StkAccountOld {

    @Id
    @Column(name = "date") protected LocalDate date;  // 统计周期
    @Column(name = "new_sh") protected Integer newSh;  // 本周新增（上海，户）
    @Column(name = "new_sz") protected Integer newSz;  // 本周新增（深圳，户）
    @Column(name = "active_sh") protected Double activeSh;  // 期末有效账户（上海，万户）
    @Column(name = "active_sz") protected Double activeSz;  // 期末有效账户（深圳，万户）
    @Column(name = "total_sh") protected Double totalSh;  // 期末账户数（上海，万户）
    @Column(name = "total_sz") protected Double totalSz;  // 期末账户数（深圳，万户）
    @Column(name = "trade_sh") protected Double tradeSh;  // 参与交易账户数（上海，万户）
    @Column(name = "trade_sz") protected Double tradeSz;  // 参与交易账户数（深圳，万户）

}