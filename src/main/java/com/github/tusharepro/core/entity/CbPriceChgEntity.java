package com.github.tusharepro.core.entity;
import lombok.Data;

import com.github.tusharepro.core.bean.CbPriceChg;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;

/**
 * 可转债转股价变动
 * https://tushare.pro/document/2?doc_id=246
 */
@Data
@Entity
@Table(name = "cb_price_chg")
@IdClass(CbPriceChgEntity.PrimaryKey.class)
public class CbPriceChgEntity implements CbPriceChg {

    @Data public static class PrimaryKey implements Serializable {
        private String tsCode;
        private LocalDate changeDate;
    }

    @Id
    @Column(name = "ts_code") protected String tsCode;  // 转债代码
    @Column(name = "bond_short_name") protected String bondShortName;  // 转债简称
    @Column(name = "publish_date") protected LocalDate publishDate;  // 公告日期
    @Id
    @Column(name = "change_date") protected LocalDate changeDate;  // 变动日期
    @Column(name = "convert_price_initial") protected Double convertPriceInitial;  // 初始转股价格
    @Column(name = "convertprice_bef") protected Double convertpriceBef;  // 修正前转股价格
    @Column(name = "convertprice_aft") protected Double convertpriceAft;  // 修正后转股价格

}