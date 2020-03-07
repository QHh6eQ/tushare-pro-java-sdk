package com.github.tusharepro.core.bean;

import com.github.tusharepro.core.http.BaseRequestParam;

/**
 * 公募基金经理
 * https://tushare.pro/document/2?doc_id=208
 */
public interface FundManager extends BaseBean {

    String API_NAME = "fund_manager";

    interface Fields {
        String ts_code = "ts_code";  // 基金代码
        String ann_date = "ann_date";  // 公告日期
        String name = "name";  // 基金经理姓名
        String gender = "gender";  // 性别
        String birth_year = "birth_year";  // 出生年份
        String edu = "edu";  // 学历
        String nationality = "nationality";  // 国籍
        String begin_date = "begin_date";  // 任职日期
        String end_date = "end_date";  // 离任日期
        String resume = "resume";  // 简历
    }

    interface Params {

        ts_code ts_code = new ts_code();  // 基金代码，支持多只基金，逗号分隔
        class ts_code extends BaseRequestParam {
            {key = "ts_code";}
        }

        ann_date ann_date = new ann_date();  // 公告日期，格式：YYYYMMDD
        class ann_date extends BaseRequestParam {
            {key = "ann_date";}
        }

        name name = new name();  // 基金经理姓名
        class name extends BaseRequestParam {
            {key = "name";}
        }

        offset offset = new offset();  // 开始行数
        class offset extends BaseRequestParam {
            {key = "offset";}
        }

        limit limit = new limit();  // 每页行数
        class limit extends BaseRequestParam {
            {key = "limit";}
        }
    }

}