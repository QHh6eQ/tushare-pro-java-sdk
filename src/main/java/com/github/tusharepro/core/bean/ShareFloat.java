package com.github.tusharepro.core.bean;

import com.github.tusharepro.core.http.BaseRequestParam;

/**
 * 限售股解禁
 * https://tushare.pro/document/2?doc_id=160
 */
public interface ShareFloat extends BaseBean {

    String API_NAME = "share_float";

    interface Fields {
        String ts_code = "ts_code";  // TS代码
        String ann_date = "ann_date";  // 公告日期
        String float_date = "float_date";  // 解禁日期
        String float_share = "float_share";  // 流通股份
        String float_ratio = "float_ratio";  // 流通股份占总股本比率
        String holder_name = "holder_name";  // 股东名称
        String share_type = "share_type";  // 股份类型
    }

    interface Params {

        ts_code ts_code = new ts_code();  // TS股票代码（至少输入一个参数）
        class ts_code extends BaseRequestParam {
            {key = "ts_code";}
        }

        ann_date ann_date = new ann_date();  // 公告日期（日期格式：YYYYMMDD，下同）
        class ann_date extends BaseRequestParam {
            {key = "ann_date";}
        }

        float_date float_date = new float_date();  // 解禁日期
        class float_date extends BaseRequestParam {
            {key = "float_date";}
        }

        start_date start_date = new start_date();  // 解禁开始日期
        class start_date extends BaseRequestParam {
            {key = "start_date";}
        }

        end_date end_date = new end_date();  // 解禁结束日期
        class end_date extends BaseRequestParam {
            {key = "end_date";}
        }
    }

}