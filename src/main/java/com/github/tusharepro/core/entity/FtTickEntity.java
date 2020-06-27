package com.github.tusharepro.core.entity;
import lombok.Data;

import com.github.tusharepro.core.bean.FtTick;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;

/**
 * 期货期权TICK数据
 * 本数据归属上海中期期货有限公司，具备该公司交易账号才可以获取
 * https://tushare.pro/document/2?doc_id=235
 */
@Data
@Entity
@Table(name = "ft_tick")
@IdClass(FtTickEntity.PrimaryKey.class)
public class FtTickEntity implements FtTick {

    @Data public static class PrimaryKey implements Serializable {
        private String symbol;
        private String tradeTime;
        private String tradeMs;
    }

    @Id
    @Column(name = "symbol") protected String symbol;  // 交易代码
    @Id
    @Column(name = "trade_time") protected String tradeTime;  // 交易时间
    @Id
    @Column(name = "trade_ms") protected String tradeMs;  // 交易毫秒数
    @Column(name = "price") protected String price;  // 当前价
    @Column(name = "vol") protected String vol;  // 成交量
    @Column(name = "amount") protected String amount;  // 成交金额
    @Column(name = "ask_p1") protected String askP1;  // 申卖价一
    @Column(name = "ask_v1") protected String askV1;  // 申卖量一
    @Column(name = "bid_p1") protected String bidP1;  // 申买价一
    @Column(name = "bid_v1") protected String bidV1;  // 申买量一
    @Column(name = "oi") protected String oi;  // 持仓量

}