package com.github.tusharepro.core.bean;

import com.github.tusharepro.core.http.BaseRequestParam;

/**
 * 港股通每月成交统计
 * https://tushare.pro/document/2?doc_id=197
 */
public interface GgtMonthly extends BaseBean {

    String API_NAME = "ggt_monthly";

    interface Fields {
        String month = "month";  // 交易日期
        String day_buy_amt = "day_buy_amt";  // 当月日均买入成交金额（亿元）
        String day_buy_vol = "day_buy_vol";  // 当月日均买入成交笔数（万笔）
        String day_sell_amt = "day_sell_amt";  // 当月日均卖出成交金额（亿元）
        String day_sell_vol = "day_sell_vol";  // 当月日均卖出成交笔数（万笔）
        String total_buy_amt = "total_buy_amt";  // 总买入成交金额（亿元）
        String total_buy_vol = "total_buy_vol";  // 总买入成交笔数（万笔）
        String total_sell_amt = "total_sell_amt";  // 总卖出成交金额（亿元）
        String total_sell_vol = "total_sell_vol";  // 总卖出成交笔数（万笔）
    }

    interface Params {

        month month = new month();  // 月度（格式YYYYMM，下同，支持多个输入）
        class month extends BaseRequestParam {
            {key = "month";}
        }

        start_month start_month = new start_month();  // 开始月度
        class start_month extends BaseRequestParam {
            {key = "start_month";}
        }

        end_month end_month = new end_month();  // 结束月度
        class end_month extends BaseRequestParam {
            {key = "end_month";}
        }
    }

}