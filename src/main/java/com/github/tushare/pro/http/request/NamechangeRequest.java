package com.github.tushare.pro.http.request;

import com.github.tushare.pro.TusharePro;
import com.github.tushare.pro.common.KeyValue;
import com.github.tushare.pro.http.BaseRequestParam;
import com.github.tushare.pro.http.Request;

/**
 * 股票曾用名
 */
public final class NamechangeRequest extends Request<NamechangeRequest> {

    public NamechangeRequest() {
        this(null);
    }

    public NamechangeRequest(TusharePro tusharePro) {
        super(tusharePro);
        setApi_name("namechange");
    }

    public static class Fields {
        public static final String ts_code = "ts_code";  // TS代码
        public static final String name = "name";  // 证券名称
        public static final String start_date = "start_date";  // 开始日期
        public static final String end_date = "end_date";  // 结束日期
        public static final String ann_date = "ann_date";  // 公告日期
        public static final String change_reason = "change_reason";  // 变更原因
    }

    public static class Params {

        public static final ts_code ts_code = new ts_code();  // TS代码
        public static class ts_code extends BaseRequestParam {
            {key = "ts_code";}
        }

        public static final start_date start_date = new start_date();  // 公告开始日期
        public static class start_date extends BaseRequestParam {
            {key = "start_date";}
        }

        public static final end_date end_date = new end_date();  // 公告结束日期
        public static class end_date extends BaseRequestParam {
            {key = "end_date";}
        }
    }

}