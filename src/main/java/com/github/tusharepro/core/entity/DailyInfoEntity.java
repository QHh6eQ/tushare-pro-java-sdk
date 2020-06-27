package com.github.tusharepro.core.entity;
import lombok.Data;

import com.github.tusharepro.core.bean.DailyInfo;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;

/**
 * 市场交易统计
 * https://tushare.pro/document/2?doc_id=215
 */
@Data
@Entity
@Table(name = "daily_info")
@IdClass(DailyInfoEntity.PrimaryKey.class)
public class DailyInfoEntity implements DailyInfo {

    @Data public static class PrimaryKey implements Serializable {
        private LocalDate tradeDate;
        private String tsCode;
    }

    @Id
    @Column(name = "trade_date") protected LocalDate tradeDate;  // 交易日期
    @Id
    @Column(name = "ts_code") protected String tsCode;  // 市场代码
    @Column(name = "ts_name") protected String tsName;  // 市场名称
    @Column(name = "com_count") protected Integer comCount;  // 挂牌数
    @Column(name = "total_share") protected Double totalShare;  // 总股本（亿股）
    @Column(name = "float_share") protected Double floatShare;  // 流通股本（亿股）
    @Column(name = "total_mv") protected Double totalMv;  // 总市值（亿元）
    @Column(name = "float_mv") protected Double floatMv;  // 流通市值（亿元）
    @Column(name = "amount") protected Double amount;  // 交易金额（亿元）
    @Column(name = "vol") protected Double vol;  // 成交量（亿股）
    @Column(name = "trans_count") protected Integer transCount;  // 成交笔数（万笔）
    @Column(name = "pe") protected Double pe;  // 平均市盈率
    @Column(name = "tr") protected Double tr;  // 换手率（％），注：深交所暂无此列
    @Column(name = "exchange") protected String exchange;  // 交易所（SH上交所 SZ深交所）

}