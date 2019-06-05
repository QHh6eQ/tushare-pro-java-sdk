package com.github.tusharepro.core.bean;

import com.github.tusharepro.core.http.BaseRequestParam;

/**
 * 资产负债表
 */
public interface Balancesheet extends BaseBean {

    String API_NAME = "balancesheet";

    class Fields {
        public static final String ts_code = "ts_code";  // TS股票代码
        public static final String ann_date = "ann_date";  // 公告日期
        public static final String f_ann_date = "f_ann_date";  // 实际公告日期
        public static final String end_date = "end_date";  // 报告期
        public static final String report_type = "report_type";  // 报表类型：见下方详细说明
        public static final String comp_type = "comp_type";  // 公司类型：1一般工商业 2银行 3保险 4证券
        public static final String total_share = "total_share";  // 期末总股本
        public static final String cap_rese = "cap_rese";  // 资本公积金 (元，下同)
        public static final String undistr_porfit = "undistr_porfit";  // 未分配利润
        public static final String surplus_rese = "surplus_rese";  // 盈余公积金
        public static final String special_rese = "special_rese";  // 专项储备
        public static final String money_cap = "money_cap";  // 货币资金
        public static final String trad_asset = "trad_asset";  // 交易性金融资产
        public static final String notes_receiv = "notes_receiv";  // 应收票据
        public static final String accounts_receiv = "accounts_receiv";  // 应收账款
        public static final String oth_receiv = "oth_receiv";  // 其他应收款
        public static final String prepayment = "prepayment";  // 预付款项
        public static final String div_receiv = "div_receiv";  // 应收股利
        public static final String int_receiv = "int_receiv";  // 应收利息
        public static final String inventories = "inventories";  // 存货
        public static final String amor_exp = "amor_exp";  // 长期待摊费用
        public static final String nca_within_1y = "nca_within_1y";  // 一年内到期的非流动资产
        public static final String sett_rsrv = "sett_rsrv";  // 结算备付金
        public static final String loanto_oth_bank_fi = "loanto_oth_bank_fi";  // 拆出资金
        public static final String premium_receiv = "premium_receiv";  // 应收保费
        public static final String reinsur_receiv = "reinsur_receiv";  // 应收分保账款
        public static final String reinsur_res_receiv = "reinsur_res_receiv";  // 应收分保合同准备金
        public static final String pur_resale_fa = "pur_resale_fa";  // 买入返售金融资产
        public static final String oth_cur_assets = "oth_cur_assets";  // 其他流动资产
        public static final String total_cur_assets = "total_cur_assets";  // 流动资产合计
        public static final String fa_avail_for_sale = "fa_avail_for_sale";  // 可供出售金融资产
        public static final String htm_invest = "htm_invest";  // 持有至到期投资
        public static final String lt_eqt_invest = "lt_eqt_invest";  // 长期股权投资
        public static final String invest_real_estate = "invest_real_estate";  // 投资性房地产
        public static final String time_deposits = "time_deposits";  // 定期存款
        public static final String oth_assets = "oth_assets";  // 其他资产
        public static final String lt_rec = "lt_rec";  // 长期应收款
        public static final String fix_assets = "fix_assets";  // 固定资产
        public static final String cip = "cip";  // 在建工程
        public static final String const_materials = "const_materials";  // 工程物资
        public static final String fixed_assets_disp = "fixed_assets_disp";  // 固定资产清理
        public static final String produc_bio_assets = "produc_bio_assets";  // 生产性生物资产
        public static final String oil_and_gas_assets = "oil_and_gas_assets";  // 油气资产
        public static final String intan_assets = "intan_assets";  // 无形资产
        public static final String r_and_d = "r_and_d";  // 研发支出
        public static final String goodwill = "goodwill";  // 商誉
        public static final String lt_amor_exp = "lt_amor_exp";  // 长期待摊费用
        public static final String defer_tax_assets = "defer_tax_assets";  // 递延所得税资产
        public static final String decr_in_disbur = "decr_in_disbur";  // 发放贷款及垫款
        public static final String oth_nca = "oth_nca";  // 其他非流动资产
        public static final String total_nca = "total_nca";  // 非流动资产合计
        public static final String cash_reser_cb = "cash_reser_cb";  // 现金及存放中央银行款项
        public static final String depos_in_oth_bfi = "depos_in_oth_bfi";  // 存放同业和其它金融机构款项
        public static final String prec_metals = "prec_metals";  // 贵金属
        public static final String deriv_assets = "deriv_assets";  // 衍生金融资产
        public static final String rr_reins_une_prem = "rr_reins_une_prem";  // 应收分保未到期责任准备金
        public static final String rr_reins_outstd_cla = "rr_reins_outstd_cla";  // 应收分保未决赔款准备金
        public static final String rr_reins_lins_liab = "rr_reins_lins_liab";  // 应收分保寿险责任准备金
        public static final String rr_reins_lthins_liab = "rr_reins_lthins_liab";  // 应收分保长期健康险责任准备金
        public static final String refund_depos = "refund_depos";  // 存出保证金
        public static final String ph_pledge_loans = "ph_pledge_loans";  // 保户质押贷款
        public static final String refund_cap_depos = "refund_cap_depos";  // 存出资本保证金
        public static final String indep_acct_assets = "indep_acct_assets";  // 独立账户资产
        public static final String client_depos = "client_depos";  // 其中：客户资金存款
        public static final String client_prov = "client_prov";  // 其中：客户备付金
        public static final String transac_seat_fee = "transac_seat_fee";  // 其中:交易席位费
        public static final String invest_as_receiv = "invest_as_receiv";  // 应收款项类投资
        public static final String total_assets = "total_assets";  // 资产总计
        public static final String lt_borr = "lt_borr";  // 长期借款
        public static final String st_borr = "st_borr";  // 短期借款
        public static final String cb_borr = "cb_borr";  // 向中央银行借款
        public static final String depos_ib_deposits = "depos_ib_deposits";  // 吸收存款及同业存放
        public static final String loan_oth_bank = "loan_oth_bank";  // 拆入资金
        public static final String trading_fl = "trading_fl";  // 交易性金融负债
        public static final String notes_payable = "notes_payable";  // 应付票据
        public static final String acct_payable = "acct_payable";  // 应付账款
        public static final String adv_receipts = "adv_receipts";  // 预收款项
        public static final String sold_for_repur_fa = "sold_for_repur_fa";  // 卖出回购金融资产款
        public static final String comm_payable = "comm_payable";  // 应付手续费及佣金
        public static final String payroll_payable = "payroll_payable";  // 应付职工薪酬
        public static final String taxes_payable = "taxes_payable";  // 应交税费
        public static final String int_payable = "int_payable";  // 应付利息
        public static final String div_payable = "div_payable";  // 应付股利
        public static final String oth_payable = "oth_payable";  // 其他应付款
        public static final String acc_exp = "acc_exp";  // 预提费用
        public static final String deferred_inc = "deferred_inc";  // 递延收益
        public static final String st_bonds_payable = "st_bonds_payable";  // 应付短期债券
        public static final String payable_to_reinsurer = "payable_to_reinsurer";  // 应付分保账款
        public static final String rsrv_insur_cont = "rsrv_insur_cont";  // 保险合同准备金
        public static final String acting_trading_sec = "acting_trading_sec";  // 代理买卖证券款
        public static final String acting_uw_sec = "acting_uw_sec";  // 代理承销证券款
        public static final String non_cur_liab_due_1y = "non_cur_liab_due_1y";  // 一年内到期的非流动负债
        public static final String oth_cur_liab = "oth_cur_liab";  // 其他流动负债
        public static final String total_cur_liab = "total_cur_liab";  // 流动负债合计
        public static final String bond_payable = "bond_payable";  // 应付债券
        public static final String lt_payable = "lt_payable";  // 长期应付款
        public static final String specific_payables = "specific_payables";  // 专项应付款
        public static final String estimated_liab = "estimated_liab";  // 预计负债
        public static final String defer_tax_liab = "defer_tax_liab";  // 递延所得税负债
        public static final String defer_inc_non_cur_liab = "defer_inc_non_cur_liab";  // 递延收益-非流动负债
        public static final String oth_ncl = "oth_ncl";  // 其他非流动负债
        public static final String total_ncl = "total_ncl";  // 非流动负债合计
        public static final String depos_oth_bfi = "depos_oth_bfi";  // 同业和其它金融机构存放款项
        public static final String deriv_liab = "deriv_liab";  // 衍生金融负债
        public static final String depos = "depos";  // 吸收存款
        public static final String agency_bus_liab = "agency_bus_liab";  // 代理业务负债
        public static final String oth_liab = "oth_liab";  // 其他负债
        public static final String prem_receiv_adva = "prem_receiv_adva";  // 预收保费
        public static final String depos_received = "depos_received";  // 存入保证金
        public static final String ph_invest = "ph_invest";  // 保户储金及投资款
        public static final String reser_une_prem = "reser_une_prem";  // 未到期责任准备金
        public static final String reser_outstd_claims = "reser_outstd_claims";  // 未决赔款准备金
        public static final String reser_lins_liab = "reser_lins_liab";  // 寿险责任准备金
        public static final String reser_lthins_liab = "reser_lthins_liab";  // 长期健康险责任准备金
        public static final String indept_acc_liab = "indept_acc_liab";  // 独立账户负债
        public static final String pledge_borr = "pledge_borr";  // 其中:质押借款
        public static final String indem_payable = "indem_payable";  // 应付赔付款
        public static final String policy_div_payable = "policy_div_payable";  // 应付保单红利
        public static final String total_liab = "total_liab";  // 负债合计
        public static final String treasury_share = "treasury_share";  // 减:库存股
        public static final String ordin_risk_reser = "ordin_risk_reser";  // 一般风险准备
        public static final String forex_differ = "forex_differ";  // 外币报表折算差额
        public static final String invest_loss_unconf = "invest_loss_unconf";  // 未确认的投资损失
        public static final String minority_int = "minority_int";  // 少数股东权益
        public static final String total_hldr_eqy_exc_min_int = "total_hldr_eqy_exc_min_int";  // 股东权益合计(不含少数股东权益)
        public static final String total_hldr_eqy_inc_min_int = "total_hldr_eqy_inc_min_int";  // 股东权益合计(含少数股东权益)
        public static final String total_liab_hldr_eqy = "total_liab_hldr_eqy";  // 负债及股东权益总计
        public static final String lt_payroll_payable = "lt_payroll_payable";  // 长期应付职工薪酬
        public static final String oth_comp_income = "oth_comp_income";  // 其他综合收益
        public static final String oth_eqt_tools = "oth_eqt_tools";  // 其他权益工具
        public static final String oth_eqt_tools_p_shr = "oth_eqt_tools_p_shr";  // 其他权益工具(优先股)
        public static final String lending_funds = "lending_funds";  // 融出资金
        public static final String acc_receivable = "acc_receivable";  // 应收款项
        public static final String st_fin_payable = "st_fin_payable";  // 应付短期融资款
        public static final String payables = "payables";  // 应付款项
        public static final String hfs_assets = "hfs_assets";  // 持有待售的资产
        public static final String hfs_sales = "hfs_sales";  // 持有待售的负债
    }

    class Params {

        public static final ts_code ts_code = new ts_code();  // 股票代码
        public static class ts_code extends BaseRequestParam {
            {key = "ts_code";}
        }

        public static final ann_date ann_date = new ann_date();  // 公告日期
        public static class ann_date extends BaseRequestParam {
            {key = "ann_date";}
        }

        public static final start_date start_date = new start_date();  // 公告开始日期
        public static class start_date extends BaseRequestParam {
            {key = "start_date";}
        }

        public static final end_date end_date = new end_date();  // 公告结束日期
        public static class end_date extends BaseRequestParam {
            {key = "end_date";}
        }

        public static final period period = new period();  // 报告期(每个季度最后一天的日期，比如20171231表示年报)
        public static class period extends BaseRequestParam {
            {key = "period";}
        }

        public static final report_type report_type = new report_type();  // 报告类型：见下方详细说明
        public static class report_type extends BaseRequestParam {
            {key = "report_type";}
        }

        public static final comp_type comp_type = new comp_type();  // 公司类型：1一般工商业 2银行 3保险 4证券
        public static class comp_type extends BaseRequestParam {
            {key = "comp_type";}
        }
    }

}