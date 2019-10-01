package com.github.tusharepro.core.bean;

import com.github.tusharepro.core.http.BaseRequestParam;

/**
 * 停复牌信息
 * https://tushare.pro/document/2?doc_id=31
 */
public interface Suspend extends BaseBean {

    String API_NAME = "suspend";

    interface Fields {
        String ts_code = "ts_code";  // 股票代码
        String suspend_date = "suspend_date";  // 停牌日期
        String resume_date = "resume_date";  // 复牌日期
        String ann_date = "ann_date";  // 公告日期
        String suspend_reason = "suspend_reason";  // 停牌原因
        String reason_type = "reason_type";  // 停牌原因类别
    }

    interface Params {

        ts_code ts_code = new ts_code();  // 股票代码(三选一)
        class ts_code extends BaseRequestParam {
            {key = "ts_code";}
        }

        suspend_date suspend_date = new suspend_date();  // 停牌日期(三选一)
        class suspend_date extends BaseRequestParam {
            {key = "suspend_date";}
        }

        resume_date resume_date = new resume_date();  // 复牌日期(三选一)
        class resume_date extends BaseRequestParam {
            {key = "resume_date";}
        }
    }

}