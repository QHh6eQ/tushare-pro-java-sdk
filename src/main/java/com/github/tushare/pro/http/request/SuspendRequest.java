package com.github.tushare.pro.http.request;

import com.github.tushare.pro.TusharePro;
import com.github.tushare.pro.common.KeyValue;
import com.github.tushare.pro.http.BaseRequestParam;
import com.github.tushare.pro.http.Request;

/**
 * 停复牌信息
 */
public final class SuspendRequest extends Request<SuspendRequest> {

    public SuspendRequest() {
        this(null);
    }

    public SuspendRequest(TusharePro tusharePro) {
        super(tusharePro);
        setApi_name("suspend");
    }

    public static class Fields {
        public static final String ts_code = "ts_code";  // 股票代码
        public static final String suspend_date = "suspend_date";  // 停牌日期
        public static final String resume_date = "resume_date";  // 复牌日期
        public static final String ann_date = "ann_date";  // 公告日期
        public static final String suspend_reason = "suspend_reason";  // 停牌原因
        public static final String reason_type = "reason_type";  // 停牌原因类别
    }

    public static class Params {

        public static final ts_code ts_code = new ts_code();  // 股票代码(三选一)
        public static class ts_code extends BaseRequestParam {
            {key = "ts_code";}
        }

        public static final suspend_date suspend_date = new suspend_date();  // 停牌日期(三选一)
        public static class suspend_date extends BaseRequestParam {
            {key = "suspend_date";}
        }

        public static final resume_date resume_date = new resume_date();  // 复牌日期(三选一)
        public static class resume_date extends BaseRequestParam {
            {key = "resume_date";}
        }
    }

}