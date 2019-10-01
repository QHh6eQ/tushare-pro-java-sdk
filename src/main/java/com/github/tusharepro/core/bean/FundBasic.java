package com.github.tusharepro.core.bean;

import com.github.tusharepro.core.http.BaseRequestParam;

/**
 * 公募基金列表
 * https://tushare.pro/document/2?doc_id=19
 */
public interface FundBasic extends BaseBean {

    String API_NAME = "fund_basic";

    interface Fields {
        String ts_code = "ts_code";  // 基金代码
        String name = "name";  // 简称
        String management = "management";  // 管理人
        String custodian = "custodian";  // 托管人
        String fund_type = "fund_type";  // 投资类型
        String found_date = "found_date";  // 成立日期
        String due_date = "due_date";  // 到期日期
        String list_date = "list_date";  // 上市时间
        String issue_date = "issue_date";  // 发行日期
        String delist_date = "delist_date";  // 退市日期
        String issue_amount = "issue_amount";  // 发行份额(亿)
        String m_fee = "m_fee";  // 管理费
        String c_fee = "c_fee";  // 托管费
        String duration_year = "duration_year";  // 存续期
        String p_value = "p_value";  // 面值
        String min_amount = "min_amount";  // 起点金额(万元)
        String exp_return = "exp_return";  // 预期收益率
        String benchmark = "benchmark";  // 业绩比较基准
        String status = "status";  // 存续状态D摘牌 I发行 L已上市
        String invest_type = "invest_type";  // 投资风格
        String type = "type";  // 基金类型
        String trustee = "trustee";  // 受托人
        String purc_startdate = "purc_startdate";  // 日常申购起始日
        String redm_startdate = "redm_startdate";  // 日常赎回起始日
        String market = "market";  // E场内O场外
    }

    interface Params {

        market market = new market();  // 交易市场: E场内 O场外（默认E）
        class market extends BaseRequestParam {
            {key = "market";}
        }
    }

}