package com.github.tusharepro.core;

import com.github.tusharepro.core.bean.*;
import com.github.tusharepro.core.http.Client;
import com.github.tusharepro.core.http.Request;

import java.io.IOException;
import java.util.List;

public interface TushareProService {

    /*
     * 股票列表
     * https://tushare.pro/document/2?doc_id=25
     */
    static <T extends StockBasic> List<T> stockBasic(Request<T> request) throws IOException {
        return Client.beanList(request);
    }

    /*
     * 交易日历
     * https://tushare.pro/document/2?doc_id=26
     */
    static <T extends TradeCal> List<T> tradeCal(Request<T> request) throws IOException {
        return Client.beanList(request);
    }

    /*
     * 股票曾用名
     * https://tushare.pro/document/2?doc_id=100
     */
    static <T extends Namechange> List<T> namechange(Request<T> request) throws IOException {
        return Client.beanList(request);
    }

    /*
     * 沪深股通成份股
     * https://tushare.pro/document/2?doc_id=104
     */
    static <T extends HsConst> List<T> hsConst(Request<T> request) throws IOException {
        return Client.beanList(request);
    }

    /*
     * 上市公司基本信息
     * https://tushare.pro/document/2?doc_id=112
     */
    static <T extends StockCompany> List<T> stockCompany(Request<T> request) throws IOException {
        return Client.beanList(request);
    }

    /*
     * 上市公司管理层
     * https://tushare.pro/document/2?doc_id=193
     */
    static <T extends StkManagers> List<T> stkManagers(Request<T> request) throws IOException {
        return Client.beanList(request);
    }

    /*
     * 管理层薪酬和持股
     * https://tushare.pro/document/2?doc_id=194
     */
    static <T extends StkRewards> List<T> stkRewards(Request<T> request) throws IOException {
        return Client.beanList(request);
    }

    /*
     * IPO新股列表
     * https://tushare.pro/document/2?doc_id=123
     */
    static <T extends NewShare> List<T> newShare(Request<T> request) throws IOException {
        return Client.beanList(request);
    }

    /*
     * 日线行情
     * https://tushare.pro/document/2?doc_id=27
     */
    static <T extends Daily> List<T> daily(Request<T> request) throws IOException {
        return Client.beanList(request);
    }

    /*
     * 周线行情
     * https://tushare.pro/document/2?doc_id=144
     */
    static <T extends Weekly> List<T> weekly(Request<T> request) throws IOException {
        return Client.beanList(request);
    }

    /*
     * 月线行情
     * https://tushare.pro/document/2?doc_id=145
     */
    static <T extends Monthly> List<T> monthly(Request<T> request) throws IOException {
        return Client.beanList(request);
    }

    /*
     * 复权因子
     * https://tushare.pro/document/2?doc_id=28
     */
    static <T extends AdjFactor> List<T> adjFactor(Request<T> request) throws IOException {
        return Client.beanList(request);
    }

    /*
     * 停复牌信息
     * https://tushare.pro/document/2?doc_id=31
     */
    static <T extends Suspend> List<T> suspend(Request<T> request) throws IOException {
        return Client.beanList(request);
    }

    /*
     * 每日指标
     * https://tushare.pro/document/2?doc_id=32
     */
    static <T extends DailyBasic> List<T> dailyBasic(Request<T> request) throws IOException {
        return Client.beanList(request);
    }

    /*
     * 个股资金流向
     * https://tushare.pro/document/2?doc_id=170
     */
    static <T extends Moneyflow> List<T> moneyflow(Request<T> request) throws IOException {
        return Client.beanList(request);
    }

    /*
     * 每日涨跌停价格
     * https://tushare.pro/document/2?doc_id=183
     */
    static <T extends StkLimit> List<T> stkLimit(Request<T> request) throws IOException {
        return Client.beanList(request);
    }

    /*
     * 每日涨跌停统计
     * https://tushare.pro/document/2?doc_id=198
     */
    static <T extends LimitList> List<T> limitList(Request<T> request) throws IOException {
        return Client.beanList(request);
    }

    /*
     * 沪深港通资金流向
     * https://tushare.pro/document/2?doc_id=47
     */
    static <T extends MoneyflowHsgt> List<T> moneyflowHsgt(Request<T> request) throws IOException {
        return Client.beanList(request);
    }

    /*
     * 沪深股通十大成交股
     * https://tushare.pro/document/2?doc_id=48
     */
    static <T extends HsgtTop10> List<T> hsgtTop10(Request<T> request) throws IOException {
        return Client.beanList(request);
    }

    /*
     * 沪深港股通持股明细
     * https://tushare.pro/document/2?doc_id=188
     */
    static <T extends HkHold> List<T> hkHold(Request<T> request) throws IOException {
        return Client.beanList(request);
    }

    /*
     * 港股通每日成交统计
     * https://tushare.pro/document/2?doc_id=196
     */
    static <T extends GgtDaily> List<T> ggtDaily(Request<T> request) throws IOException {
        return Client.beanList(request);
    }

    /*
     * 港股通每月成交统计
     * https://tushare.pro/document/2?doc_id=197
     */
    static <T extends GgtMonthly> List<T> ggtMonthly(Request<T> request) throws IOException {
        return Client.beanList(request);
    }

    /*
     * 利润表
     * https://tushare.pro/document/2?doc_id=33
     */
    static <T extends Income> List<T> income(Request<T> request) throws IOException {
        return Client.beanList(request);
    }

    /*
     * 资产负债表
     * https://tushare.pro/document/2?doc_id=36
     */
    static <T extends Balancesheet> List<T> balancesheet(Request<T> request) throws IOException {
        return Client.beanList(request);
    }

    /*
     * 现金流量表
     * https://tushare.pro/document/2?doc_id=44
     */
    static <T extends Cashflow> List<T> cashflow(Request<T> request) throws IOException {
        return Client.beanList(request);
    }

    /*
     * 业绩预告
     * https://tushare.pro/document/2?doc_id=45
     */
    static <T extends Forecast> List<T> forecast(Request<T> request) throws IOException {
        return Client.beanList(request);
    }

    /*
     * 业绩快报
     * https://tushare.pro/document/2?doc_id=46
     */
    static <T extends Express> List<T> express(Request<T> request) throws IOException {
        return Client.beanList(request);
    }

    /*
     * 分红送股
     * https://tushare.pro/document/2?doc_id=103
     */
    static <T extends Dividend> List<T> dividend(Request<T> request) throws IOException {
        return Client.beanList(request);
    }

    /*
     * 财务指标数据
     * https://tushare.pro/document/2?doc_id=79
     */
    static <T extends FinaIndicator> List<T> finaIndicator(Request<T> request) throws IOException {
        return Client.beanList(request);
    }

    /*
     * 财务审计意见
     * https://tushare.pro/document/2?doc_id=80
     */
    static <T extends FinaAudit> List<T> finaAudit(Request<T> request) throws IOException {
        return Client.beanList(request);
    }

    /*
     * 主营业务构成
     * https://tushare.pro/document/2?doc_id=81
     */
    static <T extends FinaMainbz> List<T> finaMainbz(Request<T> request) throws IOException {
        return Client.beanList(request);
    }

    /*
     * 财报披露计划
     * https://tushare.pro/document/2?doc_id=162
     */
    static <T extends DisclosureDate> List<T> disclosureDate(Request<T> request) throws IOException {
        return Client.beanList(request);
    }

    /*
     * 港股通十大成交股
     * https://tushare.pro/document/2?doc_id=49
     */
    static <T extends GgtTop10> List<T> ggtTop10(Request<T> request) throws IOException {
        return Client.beanList(request);
    }

    /*
     * 融资融券交易汇总
     * https://tushare.pro/document/2?doc_id=58
     */
    static <T extends Margin> List<T> margin(Request<T> request) throws IOException {
        return Client.beanList(request);
    }

    /*
     * 融资融券交易明细
     * https://tushare.pro/document/2?doc_id=59
     */
    static <T extends MarginDetail> List<T> marginDetail(Request<T> request) throws IOException {
        return Client.beanList(request);
    }

    /*
     * 前十大股东
     * https://tushare.pro/document/2?doc_id=61
     */
    static <T extends Top10Holders> List<T> top10Holders(Request<T> request) throws IOException {
        return Client.beanList(request);
    }

    /*
     * 前十大流通股东
     * https://tushare.pro/document/2?doc_id=62
     */
    static <T extends Top10Floatholders> List<T> top10Floatholders(Request<T> request) throws IOException {
        return Client.beanList(request);
    }

    /*
     * 龙虎榜每日明细
     * https://tushare.pro/document/2?doc_id=106
     */
    static <T extends TopList> List<T> topList(Request<T> request) throws IOException {
        return Client.beanList(request);
    }

    /*
     * 龙虎榜机构明细
     * https://tushare.pro/document/2?doc_id=107
     */
    static <T extends TopInst> List<T> topInst(Request<T> request) throws IOException {
        return Client.beanList(request);
    }

    /*
     * 股权质押统计数据
     * https://tushare.pro/document/2?doc_id=110
     */
    static <T extends PledgeStat> List<T> pledgeStat(Request<T> request) throws IOException {
        return Client.beanList(request);
    }

    /*
     * 股权质押明细
     * https://tushare.pro/document/2?doc_id=111
     */
    static <T extends PledgeDetail> List<T> pledgeDetail(Request<T> request) throws IOException {
        return Client.beanList(request);
    }

    /*
     * 股票回购
     * https://tushare.pro/document/2?doc_id=124
     */
    static <T extends Repurchase> List<T> repurchase(Request<T> request) throws IOException {
        return Client.beanList(request);
    }

    /*
     * 概念股分类
     * https://tushare.pro/document/2?doc_id=125
     */
    static <T extends Concept> List<T> concept(Request<T> request) throws IOException {
        return Client.beanList(request);
    }

    /*
     * 概念股列表
     * https://tushare.pro/document/2?doc_id=126
     */
    static <T extends ConceptDetail> List<T> conceptDetail(Request<T> request) throws IOException {
        return Client.beanList(request);
    }

    /*
     * 限售股解禁
     * https://tushare.pro/document/2?doc_id=160
     */
    static <T extends ShareFloat> List<T> shareFloat(Request<T> request) throws IOException {
        return Client.beanList(request);
    }

    /*
     * 大宗交易
     * https://tushare.pro/document/2?doc_id=161
     */
    static <T extends BlockTrade> List<T> blockTrade(Request<T> request) throws IOException {
        return Client.beanList(request);
    }

    /*
     * 股票账户开户数据
     * https://tushare.pro/document/2?doc_id=164
     */
    static <T extends StkAccount> List<T> stkAccount(Request<T> request) throws IOException {
        return Client.beanList(request);
    }

    /*
     * 股票账户开户数据（旧）
     * https://tushare.pro/document/2?doc_id=165
     */
    static <T extends StkAccountOld> List<T> stkAccountOld(Request<T> request) throws IOException {
        return Client.beanList(request);
    }

    /*
     * 股东人数
     * https://tushare.pro/document/2?doc_id=166
     */
    static <T extends StkHoldernumber> List<T> stkHoldernumber(Request<T> request) throws IOException {
        return Client.beanList(request);
    }

    /*
     * 股东增减持
     * https://tushare.pro/document/2?doc_id=175
     */
    static <T extends StkHoldertrade> List<T> stkHoldertrade(Request<T> request) throws IOException {
        return Client.beanList(request);
    }

    /*
     * 指数基本信息
     * https://tushare.pro/document/2?doc_id=94
     */
    static <T extends IndexBasic> List<T> indexBasic(Request<T> request) throws IOException {
        return Client.beanList(request);
    }

    /*
     * 指数日线行情
     * https://tushare.pro/document/2?doc_id=95
     */
    static <T extends IndexDaily> List<T> indexDaily(Request<T> request) throws IOException {
        return Client.beanList(request);
    }

    /*
     * 指数周线行情
     * https://tushare.pro/document/2?doc_id=171
     */
    static <T extends IndexWeekly> List<T> indexWeekly(Request<T> request) throws IOException {
        return Client.beanList(request);
    }

    /*
     * 指数月线行情
     * https://tushare.pro/document/2?doc_id=172
     */
    static <T extends IndexMonthly> List<T> indexMonthly(Request<T> request) throws IOException {
        return Client.beanList(request);
    }

    /*
     * 指数成分和权重
     * https://tushare.pro/document/2?doc_id=96
     */
    static <T extends IndexWeigth> List<T> indexWeigth(Request<T> request) throws IOException {
        return Client.beanList(request);
    }

    /*
     * 大盘指数每日指标
     * https://tushare.pro/document/2?doc_id=128
     */
    static <T extends IndexDailybasic> List<T> indexDailybasic(Request<T> request) throws IOException {
        return Client.beanList(request);
    }

    /*
     * 申万行业分类
     * https://tushare.pro/document/2?doc_id=181
     */
    static <T extends IndexClassify> List<T> indexClassify(Request<T> request) throws IOException {
        return Client.beanList(request);
    }

    /*
     * 申万行业成分构成
     * https://tushare.pro/document/2?doc_id=182
     */
    static <T extends IndexMember> List<T> indexMember(Request<T> request) throws IOException {
        return Client.beanList(request);
    }

    /*
     * 公募基金列表
     * https://tushare.pro/document/2?doc_id=19
     */
    static <T extends FundBasic> List<T> fundBasic(Request<T> request) throws IOException {
        return Client.beanList(request);
    }

    /*
     * 公募基金公司
     * https://tushare.pro/document/2?doc_id=118
     */
    static <T extends FundCompany> List<T> fundCompany(Request<T> request) throws IOException {
        return Client.beanList(request);
    }

    /*
     * 公募基金净值
     * https://tushare.pro/document/2?doc_id=119
     */
    static <T extends FundNav> List<T> fundNav(Request<T> request) throws IOException {
        return Client.beanList(request);
    }

    /*
     * 公募基金分红
     * https://tushare.pro/document/2?doc_id=120
     */
    static <T extends FundDiv> List<T> fundDiv(Request<T> request) throws IOException {
        return Client.beanList(request);
    }

    /*
     * 公募基金持仓数据
     * https://tushare.pro/document/2?doc_id=121
     */
    static <T extends FundPortfolio> List<T> fundPortfolio(Request<T> request) throws IOException {
        return Client.beanList(request);
    }

    /*
     * 场内基金日线行情
     * https://tushare.pro/document/2?doc_id=127
     */
    static <T extends FundDaily> List<T> fundDaily(Request<T> request) throws IOException {
        return Client.beanList(request);
    }

    /*
     * 基金复权因子
     * https://tushare.pro/document/2?doc_id=199
     */
    static <T extends FundAdj> List<T> fundAdj(Request<T> request) throws IOException {
        return Client.beanList(request);
    }

    /*
     * 期货合约信息表
     * https://tushare.pro/document/2?doc_id=135
     */
    static <T extends FutBasic> List<T> futBasic(Request<T> request) throws IOException {
        return Client.beanList(request);
    }

    /*
     * 期货日线行情
     * https://tushare.pro/document/2?doc_id=138
     */
    static <T extends FutDaily> List<T> futDaily(Request<T> request) throws IOException {
        return Client.beanList(request);
    }

    /*
     * 每日成交持仓排名
     * https://tushare.pro/document/2?doc_id=139
     */
    static <T extends FutHolding> List<T> futHolding(Request<T> request) throws IOException {
        return Client.beanList(request);
    }

    /*
     * 仓单日报
     * https://tushare.pro/document/2?doc_id=140
     */
    static <T extends FutWsr> List<T> futWsr(Request<T> request) throws IOException {
        return Client.beanList(request);
    }

    /*
     * 结算参数
     * https://tushare.pro/document/2?doc_id=141
     */
    static <T extends FutSettle> List<T> futSettle(Request<T> request) throws IOException {
        return Client.beanList(request);
    }

    /*
     * 期货主力与连续合约
     * https://tushare.pro/document/2?doc_id=189
     */
    static <T extends FutMapping> List<T> futMapping(Request<T> request) throws IOException {
        return Client.beanList(request);
    }

    /*
     * 期权合约信息
     * https://tushare.pro/document/2?doc_id=158
     */
    static <T extends OptBasic> List<T> optBasic(Request<T> request) throws IOException {
        return Client.beanList(request);
    }

    /*
     * 期权日线行情
     * https://tushare.pro/document/2?doc_id=159
     */
    static <T extends OptDaily> List<T> optDaily(Request<T> request) throws IOException {
        return Client.beanList(request);
    }

    /*
     * 可转债基本信息
     * https://tushare.pro/document/2?doc_id=185
     */
    static <T extends CbBasic> List<T> cbBasic(Request<T> request) throws IOException {
        return Client.beanList(request);
    }

    /*
     * 可转债发行
     * https://tushare.pro/document/2?doc_id=186
     */
    static <T extends CbIssue> List<T> cbIssue(Request<T> request) throws IOException {
        return Client.beanList(request);
    }

    /*
     * 可转债行情
     * https://tushare.pro/document/2?doc_id=187
     */
    static <T extends CbDaily> List<T> cbDaily(Request<T> request) throws IOException {
        return Client.beanList(request);
    }

    /*
     * 中债收益率曲线
     * https://tushare.pro/document/2?doc_id=201
     */
    static <T extends YcCb> List<T> ycCb(Request<T> request) throws IOException {
        return Client.beanList(request);
    }

    /*
     * 外汇基础信息（海外）
     * https://tushare.pro/document/2?doc_id=178
     */
    static <T extends FxObasic> List<T> fxObasic(Request<T> request) throws IOException {
        return Client.beanList(request);
    }

    /*
     * 外汇日线行情
     * https://tushare.pro/document/2?doc_id=179
     */
    static <T extends FxDaily> List<T> fxDaily(Request<T> request) throws IOException {
        return Client.beanList(request);
    }

    /*
     * 港股列表
     * https://tushare.pro/document/2?doc_id=191
     */
    static <T extends HkBasic> List<T> hkBasic(Request<T> request) throws IOException {
        return Client.beanList(request);
    }

    /*
     * 港股行情
     * https://tushare.pro/document/2?doc_id=192
     */
    static <T extends HkDaily> List<T> hkDaily(Request<T> request) throws IOException {
        return Client.beanList(request);
    }

}