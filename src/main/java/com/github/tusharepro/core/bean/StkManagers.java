package com.github.tusharepro.core.bean;

import com.github.tusharepro.core.http.BaseRequestParam;

/**
 * 上市公司管理层
 * https://tushare.pro/document/2?doc_id=193
 */
public interface StkManagers extends BaseBean {

    String API_NAME = "stk_managers";

    interface Fields {
        String ts_code = "ts_code";  // TS股票代码
        String ann_date = "ann_date";  // 公告日期
        String name = "name";  // 姓名
        String gender = "gender";  // 性别
        String lev = "lev";  // 岗位类别
        String title = "title";  // 岗位
        String edu = "edu";  // 学历
        String national = "national";  // 国籍
        String birthday = "birthday";  // 出生年月
        String begin_date = "begin_date";  // 上任日期
        String end_date = "end_date";  // 离任日期
        String resume = "resume";  // 个人简历
    }

    interface Params {

        ts_code ts_code = new ts_code();  // 股票代码，支持单个或多个股票输入
        class ts_code extends BaseRequestParam {
            {key = "ts_code";}
        }

        ann_date ann_date = new ann_date();  // 公告日期（YYYYMMDD格式，下同）
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