package com.github.tusharepro.core.bean;

import com.github.tusharepro.core.http.BaseRequestParam;

/**
 * 期货主要品种交易周报
 * https://tushare.pro/document/2?doc_id=216
 */
public interface FutWeeklyDetail extends BaseBean {

    String API_NAME = "fut_weekly_detail";

    interface Fields {
        String exchange = "exchange";  // 交易所代码
        String prd = "prd";  // 期货品种代码
        String name = "name";  // 品种名称
        String vol = "vol";  // 成交量（手）
        String vol_yoy = "vol_yoy";  // 同比增减（%）
        String amount = "amount";  // 成交金额（亿元）
        String amout_yoy = "amout_yoy";  // 同比增减（%）
        String cumvol = "cumvol";  // 年累计成交总量（手）
        String cumvol_yoy = "cumvol_yoy";  // 同比增减（%）
        String cumamt = "cumamt";  // 年累计成交金额（亿元）
        String cumamt_yoy = "cumamt_yoy";  // 同比增减（%）
        String open_interest = "open_interest";  // 持仓量（手）
        String interest_wow = "interest_wow";  // 环比增减（%）
        String mc_close = "mc_close";  // 本周主力合约收盘价
        String close_wow = "close_wow";  // 环比涨跌（%）
        String week = "week";  // 周期
        String week_date = "week_date";  // 周日期
    }

    interface Params {

        week week = new week();  // 周期（每年第几周，e.g. 202001 表示2020第1周）
        class week extends BaseRequestParam {
            {key = "week";}
        }

        prd prd = new prd();  // 期货品种（支持多品种输入，逗号分隔）
        class prd extends BaseRequestParam {
            {key = "prd";}
        }

        start_week start_week = new start_week();  // 开始周期
        class start_week extends BaseRequestParam {
            {key = "start_week";}
        }

        end_week end_week = new end_week();  // 结束周期
        class end_week extends BaseRequestParam {
            {key = "end_week";}
        }

        exchange exchange = new exchange();  // 交易所（请参考<a href="https://tushare.pro/document/2?doc_id=134">交易所说明</a>）
        class exchange extends BaseRequestParam {
            {key = "exchange";}
        }

        fields fields = new fields();  // 提取的字段，e.g. fields=&#39;prd,name,vol&#39;
        class fields extends BaseRequestParam {
            {key = "fields";}
        }
    }

}