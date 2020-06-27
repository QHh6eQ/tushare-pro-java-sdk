package com.github.tusharepro.core.bean;

import com.github.tusharepro.core.http.BaseRequestParam;

/**
 * 期货期权TICK数据
 * 本数据归属上海中期期货有限公司，具备该公司交易账号才可以获取
 * https://tushare.pro/document/2?doc_id=235
 */
public interface FtTick extends BaseBean {

    String API_NAME = "ft_tick";

    interface Fields {
        String symbol = "symbol";  // 交易代码
        String trade_time = "trade_time";  // 交易时间
        String trade_ms = "trade_ms";  // 交易毫秒数
        String price = "price";  // 当前价
        String vol = "vol";  // 成交量
        String amount = "amount";  // 成交金额
        String ask_p1 = "ask_p1";  // 申卖价一
        String ask_v1 = "ask_v1";  // 申卖量一
        String bid_p1 = "bid_p1";  // 申买价一
        String bid_v1 = "bid_v1";  // 申买量一
        String oi = "oi";  // 持仓量
    }

    interface Params {

        symbol symbol = new symbol();  // 期货期权代码
        class symbol extends BaseRequestParam {
            {key = "symbol";}
        }

        start_date start_date = new start_date();  // 开始时间
        class start_date extends BaseRequestParam {
            {key = "start_date";}
        }

        end_date end_date = new end_date();  // 结束时间
        class end_date extends BaseRequestParam {
            {key = "end_date";}
        }
    }

}