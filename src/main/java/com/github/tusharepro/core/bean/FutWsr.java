package com.github.tusharepro.core.bean;

import com.github.tusharepro.core.http.BaseRequestParam;

/**
 * 仓单日报
 * https://tushare.pro/document/2?doc_id=140
 */
public interface FutWsr extends BaseBean {

    String API_NAME = "fut_wsr";

    interface Fields {
        String trade_date = "trade_date";  // 交易日期
        String symbol = "symbol";  // 产品代码
        String fut_name = "fut_name";  // 产品名称
        String warehouse = "warehouse";  // 仓库名称
        String wh_id = "wh_id";  // 仓库编号
        String pre_vol = "pre_vol";  // 昨日仓单量
        String vol = "vol";  // 今日仓单量
        String vol_chg = "vol_chg";  // 增减量
        String area = "area";  // 地区
        String year = "year";  // 年度
        String grade = "grade";  // 等级
        String brand = "brand";  // 品牌
        String place = "place";  // 产地
        String pd = "pd";  // 升贴水
        String is_ct = "is_ct";  // 是否折算仓单
        String unit = "unit";  // 单位
        String exchange = "exchange";  // 交易所
    }

    interface Params {

        trade_date trade_date = new trade_date();  // 交易日期
        class trade_date extends BaseRequestParam {
            {key = "trade_date";}
        }

        symbol symbol = new symbol();  // 产品代码
        class symbol extends BaseRequestParam {
            {key = "symbol";}
        }

        start_date start_date = new start_date();  // 开始日期
        class start_date extends BaseRequestParam {
            {key = "start_date";}
        }

        end_date end_date = new end_date();  // 结束日期
        class end_date extends BaseRequestParam {
            {key = "end_date";}
        }

        exchange exchange = new exchange();  // 交易所代码
        class exchange extends BaseRequestParam {
            {key = "exchange";}
        }
    }

}