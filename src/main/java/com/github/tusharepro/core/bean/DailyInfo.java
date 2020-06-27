package com.github.tusharepro.core.bean;

import com.github.tusharepro.core.http.BaseRequestParam;

/**
 * 市场交易统计
 * https://tushare.pro/document/2?doc_id=215
 */
public interface DailyInfo extends BaseBean {

    String API_NAME = "daily_info";

    interface Fields {
        String trade_date = "trade_date";  // 交易日期
        String ts_code = "ts_code";  // 市场代码
        String ts_name = "ts_name";  // 市场名称
        String com_count = "com_count";  // 挂牌数
        String total_share = "total_share";  // 总股本（亿股）
        String float_share = "float_share";  // 流通股本（亿股）
        String total_mv = "total_mv";  // 总市值（亿元）
        String float_mv = "float_mv";  // 流通市值（亿元）
        String amount = "amount";  // 交易金额（亿元）
        String vol = "vol";  // 成交量（亿股）
        String trans_count = "trans_count";  // 成交笔数（万笔）
        String pe = "pe";  // 平均市盈率
        String tr = "tr";  // 换手率（％），注：深交所暂无此列
        String exchange = "exchange";  // 交易所（SH上交所 SZ深交所）
    }

    interface Params {

        trade_date trade_date = new trade_date();  // 交易日期（YYYYMMDD格式，下同）
        class trade_date extends BaseRequestParam {
            {key = "trade_date";}
        }

        ts_code ts_code = new ts_code();  // 板块代码（请参阅下方列表）
        class ts_code extends BaseRequestParam {
            {key = "ts_code";}
        }

        exchange exchange = new exchange();  // 股票市场（SH上交所 SZ深交所）
        class exchange extends BaseRequestParam {
            {key = "exchange";}
        }

        start_date start_date = new start_date();  // 开始日期
        class start_date extends BaseRequestParam {
            {key = "start_date";}
        }

        end_date end_date = new end_date();  // 结束日期
        class end_date extends BaseRequestParam {
            {key = "end_date";}
        }

        fields fields = new fields();  // 指定提取字段
        class fields extends BaseRequestParam {
            {key = "fields";}
        }
    }

}