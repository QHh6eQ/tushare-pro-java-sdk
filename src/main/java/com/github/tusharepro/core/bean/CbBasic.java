package com.github.tusharepro.core.bean;

import com.github.tusharepro.core.http.BaseRequestParam;

/**
 * 可转债基本信息
 * https://tushare.pro/document/2?doc_id=185
 */
public interface CbBasic extends BaseBean {

    String API_NAME = "cb_basic";

    interface Fields {
        String ts_code = "ts_code";  // 转债代码
        String bond_full_name = "bond_full_name";  // 转债名称
        String bond_short_name = "bond_short_name";  // 转债简称
        String stk_code = "stk_code";  // 正股代码
        String stk_short_name = "stk_short_name";  // 正股简称
        String maturity = "maturity";  // 发行期限（年）
        String par = "par";  // 面值
        String issue_price = "issue_price";  // 发行价格
        String issue_size = "issue_size";  // 发行总额（元）
        String remain_size = "remain_size";  // 债券余额（元）
        String value_date = "value_date";  // 起息日期
        String maturity_date = "maturity_date";  // 到期日期
        String rate_type = "rate_type";  // 利率类型
        String coupon_rate = "coupon_rate";  // 票面利率（%）
        String add_rate = "add_rate";  // 补偿利率（%）
        String pay_per_year = "pay_per_year";  // 年付息次数
        String list_date = "list_date";  // 上市日期
        String delist_date = "delist_date";  // 摘牌日
        String exchange = "exchange";  // 上市地点
        String conv_start_date = "conv_start_date";  // 转股起始日
        String conv_end_date = "conv_end_date";  // 转股截止日
        String first_conv_price = "first_conv_price";  // 初始转股价
        String conv_price = "conv_price";  // 最新转股价
        String rate_clause = "rate_clause";  // 利率说明
        String put_clause = "put_clause";  // 赎回条款
        String maturity_put_price = "maturity_put_price";  // 到期赎回价格(含税)
        String call_clause = "call_clause";  // 回售条款
        String reset_clause = "reset_clause";  // 特别向下修正条款
        String conv_clause = "conv_clause";  // 转股条款
        String guarantor = "guarantor";  // 担保人
        String guarantee_type = "guarantee_type";  // 担保方式
        String issue_rating = "issue_rating";  // 发行信用等级
        String newest_rating = "newest_rating";  // 最新信用等级
        String rating_comp = "rating_comp";  // 最新评级机构
    }

    interface Params {

        ts_code ts_code = new ts_code();  // 转债代码
        class ts_code extends BaseRequestParam {
            {key = "ts_code";}
        }

        list_date list_date = new list_date();  // 上市日期
        class list_date extends BaseRequestParam {
            {key = "list_date";}
        }

        exchange exchange = new exchange();  // 上市地点
        class exchange extends BaseRequestParam {
            {key = "exchange";}
        }
    }

}