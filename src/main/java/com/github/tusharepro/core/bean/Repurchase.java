package com.github.tusharepro.core.bean;

import com.github.tusharepro.core.http.BaseRequestParam;

/**
 * 股票回购
 * https://tushare.pro/document/2?doc_id=124
 */
public interface Repurchase extends BaseBean {

    String API_NAME = "repurchase";

    interface Fields {
        String ts_code = "ts_code";  // TS代码
        String ann_date = "ann_date";  // 公告日期
        String end_date = "end_date";  // 截止日期
        String proc = "proc";  // 进度
        String exp_date = "exp_date";  // 过期日期
        String vol = "vol";  // 回购数量
        String amount = "amount";  // 回购金额
        String high_limit = "high_limit";  // 回购最高价
        String low_limit = "low_limit";  // 回购最低价
    }

    interface Params {

        ann_date ann_date = new ann_date();  // 公告日期（任意填参数，如果都不填，单次默认返回2000条）
        class ann_date extends BaseRequestParam {
            {key = "ann_date";}
        }

        start_date start_date = new start_date();  // 公告开始日期
        class start_date extends BaseRequestParam {
            {key = "start_date";}
        }

        end_date end_date = new end_date();  // 公告结束日期
        class end_date extends BaseRequestParam {
            {key = "end_date";}
        }
    }

}