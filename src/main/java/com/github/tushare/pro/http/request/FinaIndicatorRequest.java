package com.github.tushare.pro.http.request;

import com.github.tushare.pro.TusharePro;
import com.github.tushare.pro.common.KeyValue;
import com.github.tushare.pro.http.BaseRequestParam;
import com.github.tushare.pro.http.Request;

/**
 * 财务指标数据
 */
public final class FinaIndicatorRequest extends Request<FinaIndicatorRequest> {

    public FinaIndicatorRequest() {
        this(null);
    }

    public FinaIndicatorRequest(TusharePro tusharePro) {
        super(tusharePro);
        setApi_name("fina_indicator");
    }

    public static class Fields {
        public static final String ts_code = "ts_code";  // TS代码
        public static final String ann_date = "ann_date";  // 公告日期
        public static final String end_date = "end_date";  // 报告期
        public static final String eps = "eps";  // 基本每股收益
        public static final String dt_eps = "dt_eps";  // 稀释每股收益
        public static final String total_revenue_ps = "total_revenue_ps";  // 每股营业总收入
        public static final String revenue_ps = "revenue_ps";  // 每股营业收入
        public static final String capital_rese_ps = "capital_rese_ps";  // 每股资本公积
        public static final String surplus_rese_ps = "surplus_rese_ps";  // 每股盈余公积
        public static final String undist_profit_ps = "undist_profit_ps";  // 每股未分配利润
        public static final String extra_item = "extra_item";  // 非经常性损益
        public static final String profit_dedt = "profit_dedt";  // 扣除非经常性损益后的净利润
        public static final String gross_margin = "gross_margin";  // 毛利
        public static final String current_ratio = "current_ratio";  // 流动比率
        public static final String quick_ratio = "quick_ratio";  // 速动比率
        public static final String cash_ratio = "cash_ratio";  // 保守速动比率
        public static final String invturn_days = "invturn_days";  // 存货周转天数
        public static final String arturn_days = "arturn_days";  // 应收账款周转天数
        public static final String inv_turn = "inv_turn";  // 存货周转率
        public static final String ar_turn = "ar_turn";  // 应收账款周转率
        public static final String ca_turn = "ca_turn";  // 流动资产周转率
        public static final String fa_turn = "fa_turn";  // 固定资产周转率
        public static final String assets_turn = "assets_turn";  // 总资产周转率
        public static final String op_income = "op_income";  // 经营活动净收益
        public static final String valuechange_income = "valuechange_income";  // 价值变动净收益
        public static final String interst_income = "interst_income";  // 利息费用
        public static final String daa = "daa";  // 折旧与摊销
        public static final String ebit = "ebit";  // 息税前利润
        public static final String ebitda = "ebitda";  // 息税折旧摊销前利润
        public static final String fcff = "fcff";  // 企业自由现金流量
        public static final String fcfe = "fcfe";  // 股权自由现金流量
        public static final String current_exint = "current_exint";  // 无息流动负债
        public static final String noncurrent_exint = "noncurrent_exint";  // 无息非流动负债
        public static final String interestdebt = "interestdebt";  // 带息债务
        public static final String netdebt = "netdebt";  // 净债务
        public static final String tangible_asset = "tangible_asset";  // 有形资产
        public static final String working_capital = "working_capital";  // 营运资金
        public static final String networking_capital = "networking_capital";  // 营运流动资本
        public static final String invest_capital = "invest_capital";  // 全部投入资本
        public static final String retained_earnings = "retained_earnings";  // 留存收益
        public static final String diluted2_eps = "diluted2_eps";  // 期末摊薄每股收益
        public static final String bps = "bps";  // 每股净资产
        public static final String ocfps = "ocfps";  // 每股经营活动产生的现金流量净额
        public static final String retainedps = "retainedps";  // 每股留存收益
        public static final String cfps = "cfps";  // 每股现金流量净额
        public static final String ebit_ps = "ebit_ps";  // 每股息税前利润
        public static final String fcff_ps = "fcff_ps";  // 每股企业自由现金流量
        public static final String fcfe_ps = "fcfe_ps";  // 每股股东自由现金流量
        public static final String netprofit_margin = "netprofit_margin";  // 销售净利率
        public static final String grossprofit_margin = "grossprofit_margin";  // 销售毛利率
        public static final String cogs_of_sales = "cogs_of_sales";  // 销售成本率
        public static final String expense_of_sales = "expense_of_sales";  // 销售期间费用率
        public static final String profit_to_gr = "profit_to_gr";  // 净利润/营业总收入
        public static final String saleexp_to_gr = "saleexp_to_gr";  // 销售费用/营业总收入
        public static final String adminexp_of_gr = "adminexp_of_gr";  // 管理费用/营业总收入
        public static final String finaexp_of_gr = "finaexp_of_gr";  // 财务费用/营业总收入
        public static final String impai_ttm = "impai_ttm";  // 资产减值损失/营业总收入
        public static final String gc_of_gr = "gc_of_gr";  // 营业总成本/营业总收入
        public static final String op_of_gr = "op_of_gr";  // 营业利润/营业总收入
        public static final String ebit_of_gr = "ebit_of_gr";  // 息税前利润/营业总收入
        public static final String roe = "roe";  // 净资产收益率
        public static final String roe_waa = "roe_waa";  // 加权平均净资产收益率
        public static final String roe_dt = "roe_dt";  // 净资产收益率(扣除非经常损益)
        public static final String roa = "roa";  // 总资产报酬率
        public static final String npta = "npta";  // 总资产净利润
        public static final String roic = "roic";  // 投入资本回报率
        public static final String roe_yearly = "roe_yearly";  // 年化净资产收益率
        public static final String roa2_yearly = "roa2_yearly";  // 年化总资产报酬率
        public static final String roe_avg = "roe_avg";  // 平均净资产收益率(增发条件)
        public static final String opincome_of_ebt = "opincome_of_ebt";  // 经营活动净收益/利润总额
        public static final String investincome_of_ebt = "investincome_of_ebt";  // 价值变动净收益/利润总额
        public static final String n_op_profit_of_ebt = "n_op_profit_of_ebt";  // 营业外收支净额/利润总额
        public static final String tax_to_ebt = "tax_to_ebt";  // 所得税/利润总额
        public static final String dtprofit_to_profit = "dtprofit_to_profit";  // 扣除非经常损益后的净利润/净利润
        public static final String salescash_to_or = "salescash_to_or";  // 销售商品提供劳务收到的现金/营业收入
        public static final String ocf_to_or = "ocf_to_or";  // 经营活动产生的现金流量净额/营业收入
        public static final String ocf_to_opincome = "ocf_to_opincome";  // 经营活动产生的现金流量净额/经营活动净收益
        public static final String capitalized_to_da = "capitalized_to_da";  // 资本支出/折旧和摊销
        public static final String debt_to_assets = "debt_to_assets";  // 资产负债率
        public static final String assets_to_eqt = "assets_to_eqt";  // 权益乘数
        public static final String dp_assets_to_eqt = "dp_assets_to_eqt";  // 权益乘数(杜邦分析)
        public static final String ca_to_assets = "ca_to_assets";  // 流动资产/总资产
        public static final String nca_to_assets = "nca_to_assets";  // 非流动资产/总资产
        public static final String tbassets_to_totalassets = "tbassets_to_totalassets";  // 有形资产/总资产
        public static final String int_to_talcap = "int_to_talcap";  // 带息债务/全部投入资本
        public static final String eqt_to_talcapital = "eqt_to_talcapital";  // 归属于母公司的股东权益/全部投入资本
        public static final String currentdebt_to_debt = "currentdebt_to_debt";  // 流动负债/负债合计
        public static final String longdeb_to_debt = "longdeb_to_debt";  // 非流动负债/负债合计
        public static final String ocf_to_shortdebt = "ocf_to_shortdebt";  // 经营活动产生的现金流量净额/流动负债
        public static final String debt_to_eqt = "debt_to_eqt";  // 产权比率
        public static final String eqt_to_debt = "eqt_to_debt";  // 归属于母公司的股东权益/负债合计
        public static final String eqt_to_interestdebt = "eqt_to_interestdebt";  // 归属于母公司的股东权益/带息债务
        public static final String tangibleasset_to_debt = "tangibleasset_to_debt";  // 有形资产/负债合计
        public static final String tangasset_to_intdebt = "tangasset_to_intdebt";  // 有形资产/带息债务
        public static final String tangibleasset_to_netdebt = "tangibleasset_to_netdebt";  // 有形资产/净债务
        public static final String ocf_to_debt = "ocf_to_debt";  // 经营活动产生的现金流量净额/负债合计
        public static final String ocf_to_interestdebt = "ocf_to_interestdebt";  // 经营活动产生的现金流量净额/带息债务
        public static final String ocf_to_netdebt = "ocf_to_netdebt";  // 经营活动产生的现金流量净额/净债务
        public static final String ebit_to_interest = "ebit_to_interest";  // 已获利息倍数(EBIT/利息费用)
        public static final String longdebt_to_workingcapital = "longdebt_to_workingcapital";  // 长期债务与营运资金比率
        public static final String ebitda_to_debt = "ebitda_to_debt";  // 息税折旧摊销前利润/负债合计
        public static final String turn_days = "turn_days";  // 营业周期
        public static final String roa_yearly = "roa_yearly";  // 年化总资产净利率
        public static final String roa_dp = "roa_dp";  // 总资产净利率(杜邦分析)
        public static final String fixed_assets = "fixed_assets";  // 固定资产合计
        public static final String profit_prefin_exp = "profit_prefin_exp";  // 扣除财务费用前营业利润
        public static final String non_op_profit = "non_op_profit";  // 非营业利润
        public static final String op_to_ebt = "op_to_ebt";  // 营业利润／利润总额
        public static final String nop_to_ebt = "nop_to_ebt";  // 非营业利润／利润总额
        public static final String ocf_to_profit = "ocf_to_profit";  // 经营活动产生的现金流量净额／营业利润
        public static final String cash_to_liqdebt = "cash_to_liqdebt";  // 货币资金／流动负债
        public static final String cash_to_liqdebt_withinterest = "cash_to_liqdebt_withinterest";  // 货币资金／带息流动负债
        public static final String op_to_liqdebt = "op_to_liqdebt";  // 营业利润／流动负债
        public static final String op_to_debt = "op_to_debt";  // 营业利润／负债合计
        public static final String roic_yearly = "roic_yearly";  // 年化投入资本回报率
        public static final String total_fa_trun = "total_fa_trun";  // 固定资产合计周转率
        public static final String profit_to_op = "profit_to_op";  // 利润总额／营业收入
        public static final String q_opincome = "q_opincome";  // 经营活动单季度净收益
        public static final String q_investincome = "q_investincome";  // 价值变动单季度净收益
        public static final String q_dtprofit = "q_dtprofit";  // 扣除非经常损益后的单季度净利润
        public static final String q_eps = "q_eps";  // 每股收益(单季度)
        public static final String q_netprofit_margin = "q_netprofit_margin";  // 销售净利率(单季度)
        public static final String q_gsprofit_margin = "q_gsprofit_margin";  // 销售毛利率(单季度)
        public static final String q_exp_to_sales = "q_exp_to_sales";  // 销售期间费用率(单季度)
        public static final String q_profit_to_gr = "q_profit_to_gr";  // 净利润／营业总收入(单季度)
        public static final String q_saleexp_to_gr = "q_saleexp_to_gr";  // 销售费用／营业总收入 (单季度)
        public static final String q_adminexp_to_gr = "q_adminexp_to_gr";  // 管理费用／营业总收入 (单季度)
        public static final String q_finaexp_to_gr = "q_finaexp_to_gr";  // 财务费用／营业总收入 (单季度)
        public static final String q_impair_to_gr_ttm = "q_impair_to_gr_ttm";  // 资产减值损失／营业总收入(单季度)
        public static final String q_gc_to_gr = "q_gc_to_gr";  // 营业总成本／营业总收入 (单季度)
        public static final String q_op_to_gr = "q_op_to_gr";  // 营业利润／营业总收入(单季度)
        public static final String q_roe = "q_roe";  // 净资产收益率(单季度)
        public static final String q_dt_roe = "q_dt_roe";  // 净资产单季度收益率(扣除非经常损益)
        public static final String q_npta = "q_npta";  // 总资产净利润(单季度)
        public static final String q_opincome_to_ebt = "q_opincome_to_ebt";  // 经营活动净收益／利润总额(单季度)
        public static final String q_investincome_to_ebt = "q_investincome_to_ebt";  // 价值变动净收益／利润总额(单季度)
        public static final String q_dtprofit_to_profit = "q_dtprofit_to_profit";  // 扣除非经常损益后的净利润／净利润(单季度)
        public static final String q_salescash_to_or = "q_salescash_to_or";  // 销售商品提供劳务收到的现金／营业收入(单季度)
        public static final String q_ocf_to_sales = "q_ocf_to_sales";  // 经营活动产生的现金流量净额／营业收入(单季度)
        public static final String q_ocf_to_or = "q_ocf_to_or";  // 经营活动产生的现金流量净额／经营活动净收益(单季度)
        public static final String basic_eps_yoy = "basic_eps_yoy";  // 基本每股收益同比增长率(%)
        public static final String dt_eps_yoy = "dt_eps_yoy";  // 稀释每股收益同比增长率(%)
        public static final String cfps_yoy = "cfps_yoy";  // 每股经营活动产生的现金流量净额同比增长率(%)
        public static final String op_yoy = "op_yoy";  // 营业利润同比增长率(%)
        public static final String ebt_yoy = "ebt_yoy";  // 利润总额同比增长率(%)
        public static final String netprofit_yoy = "netprofit_yoy";  // 归属母公司股东的净利润同比增长率(%)
        public static final String dt_netprofit_yoy = "dt_netprofit_yoy";  // 归属母公司股东的净利润-扣除非经常损益同比增长率(%)
        public static final String ocf_yoy = "ocf_yoy";  // 经营活动产生的现金流量净额同比增长率(%)
        public static final String roe_yoy = "roe_yoy";  // 净资产收益率(摊薄)同比增长率(%)
        public static final String bps_yoy = "bps_yoy";  // 每股净资产相对年初增长率(%)
        public static final String assets_yoy = "assets_yoy";  // 资产总计相对年初增长率(%)
        public static final String eqt_yoy = "eqt_yoy";  // 归属母公司的股东权益相对年初增长率(%)
        public static final String tr_yoy = "tr_yoy";  // 营业总收入同比增长率(%)
        public static final String or_yoy = "or_yoy";  // 营业收入同比增长率(%)
        public static final String q_gr_yoy = "q_gr_yoy";  // 营业总收入同比增长率(%)(单季度)
        public static final String q_gr_qoq = "q_gr_qoq";  // 营业总收入环比增长率(%)(单季度)
        public static final String q_sales_yoy = "q_sales_yoy";  // 营业收入同比增长率(%)(单季度)
        public static final String q_sales_qoq = "q_sales_qoq";  // 营业收入环比增长率(%)(单季度)
        public static final String q_op_yoy = "q_op_yoy";  // 营业利润同比增长率(%)(单季度)
        public static final String q_op_qoq = "q_op_qoq";  // 营业利润环比增长率(%)(单季度)
        public static final String q_profit_yoy = "q_profit_yoy";  // 净利润同比增长率(%)(单季度)
        public static final String q_profit_qoq = "q_profit_qoq";  // 净利润环比增长率(%)(单季度)
        public static final String q_netprofit_yoy = "q_netprofit_yoy";  // 归属母公司股东的净利润同比增长率(%)(单季度)
        public static final String q_netprofit_qoq = "q_netprofit_qoq";  // 归属母公司股东的净利润环比增长率(%)(单季度)
        public static final String equity_yoy = "equity_yoy";  // 净资产同比增长率
        public static final String rd_exp = "rd_exp";  // 研发费用
    }

    public static class Params {

        public static final ts_code ts_code = new ts_code();  // TS股票代码,e.g. 600001.SH/000001.SZ
        public static class ts_code extends BaseRequestParam {
            {key = "ts_code";}
        }

        public static final ann_date ann_date = new ann_date();  // 公告日期
        public static class ann_date extends BaseRequestParam {
            {key = "ann_date";}
        }

        public static final start_date start_date = new start_date();  // 报告期开始日期
        public static class start_date extends BaseRequestParam {
            {key = "start_date";}
        }

        public static final end_date end_date = new end_date();  // 报告期结束日期
        public static class end_date extends BaseRequestParam {
            {key = "end_date";}
        }

        public static final period period = new period();  // 报告期(每个季度最后一天的日期,比如20171231表示年报)
        public static class period extends BaseRequestParam {
            {key = "period";}
        }
    }

}