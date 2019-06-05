package com.github.tusharepro.core;

import com.github.tusharepro.core.bean.*;
import com.github.tusharepro.core.http.Client;
import com.github.tusharepro.core.http.Request;

import java.io.IOException;
import java.util.List;

public interface TushareProService {

    /*
     * 股票列表
     */
    static <T extends StockBasic> List<T> stockBasic(Request<T> request) throws IOException {
        return Client.beanList(request);
    }

    /*
     * 交易日历
     */
    static <T extends TradeCal> List<T> tradeCal(Request<T> request) throws IOException {
        return Client.beanList(request);
    }

    /*
     * 股票曾用名
     */
    static <T extends Namechange> List<T> namechange(Request<T> request) throws IOException {
        return Client.beanList(request);
    }

    /*
     * 沪深股通成份股
     */
    static <T extends HsConst> List<T> hsConst(Request<T> request) throws IOException {
        return Client.beanList(request);
    }

    /*
     * 上市公司基本信息
     */
    static <T extends StockCompany> List<T> stockCompany(Request<T> request) throws IOException {
        return Client.beanList(request);
    }

    /*
     * IPO新股列表
     */
    static <T extends NewShare> List<T> newShare(Request<T> request) throws IOException {
        return Client.beanList(request);
    }

    /*
     * 日线行情
     */
    static <T extends Daily> List<T> daily(Request<T> request) throws IOException {
        return Client.beanList(request);
    }

    /*
     * 周线行情
     */
    static <T extends Weekly> List<T> weekly(Request<T> request) throws IOException {
        return Client.beanList(request);
    }

    /*
     * 月线行情
     */
    static <T extends Monthly> List<T> monthly(Request<T> request) throws IOException {
        return Client.beanList(request);
    }

    /*
     * 每日指标
     */
    static <T extends DailyBasic> List<T> dailyBasic(Request<T> request) throws IOException {
        return Client.beanList(request);
    }

    /*
     * 复权因子
     */
    static <T extends AdjFactor> List<T> adjFactor(Request<T> request) throws IOException {
        return Client.beanList(request);
    }

    /*
     * 停复牌信息
     */
    static <T extends Suspend> List<T> suspend(Request<T> request) throws IOException {
        return Client.beanList(request);
    }

    /*
     * 个股资金流向
     */
    static <T extends Moneyflow> List<T> moneyflow(Request<T> request) throws IOException {
        return Client.beanList(request);
    }

    /*
     * 利润表
     */
    static <T extends Income> List<T> income(Request<T> request) throws IOException {
        return Client.beanList(request);
    }

    /*
     * 资产负债表
     */
    static <T extends Balancesheet> List<T> balancesheet(Request<T> request) throws IOException {
        return Client.beanList(request);
    }

    /*
     * 现金流量表
     */
    static <T extends Cashflow> List<T> cashflow(Request<T> request) throws IOException {
        return Client.beanList(request);
    }

    /*
     * 业绩预告
     */
    static <T extends Forecast> List<T> forecast(Request<T> request) throws IOException {
        return Client.beanList(request);
    }

    /*
     * 分红送股
     */
    static <T extends Dividend> List<T> dividend(Request<T> request) throws IOException {
        return Client.beanList(request);
    }

    /*
     * 业绩快报
     */
    static <T extends Express> List<T> express(Request<T> request) throws IOException {
        return Client.beanList(request);
    }

    /*
     * 财务指标数据
     */
    static <T extends FinaIndicator> List<T> finaIndicator(Request<T> request) throws IOException {
        return Client.beanList(request);
    }

    /*
     * 财务审计意见
     */
    static <T extends FinaAudit> List<T> finaAudit(Request<T> request) throws IOException {
        return Client.beanList(request);
    }

    /*
     * 主营业务构成
     */
    static <T extends FinaMainbz> List<T> finaMainbz(Request<T> request) throws IOException {
        return Client.beanList(request);
    }

    /*
     * 财报披露计划
     */
    static <T extends DisclosureDate> List<T> disclosureDate(Request<T> request) throws IOException {
        return Client.beanList(request);
    }

    /*
     * 沪深港通资金流向
     */
    static <T extends MoneyflowHsgt> List<T> moneyflowHsgt(Request<T> request) throws IOException {
        return Client.beanList(request);
    }

    /*
     * 沪深股通十大成交股
     */
    static <T extends HsgtTop10> List<T> hsgtTop10(Request<T> request) throws IOException {
        return Client.beanList(request);
    }

    /*
     * 港股通十大成交股
     */
    static <T extends GgtTop10> List<T> ggtTop10(Request<T> request) throws IOException {
        return Client.beanList(request);
    }

    /*
     * 融资融券交易汇总
     */
    static <T extends Margin> List<T> margin(Request<T> request) throws IOException {
        return Client.beanList(request);
    }

    /*
     * 融资融券交易明细
     */
    static <T extends MarginDetail> List<T> marginDetail(Request<T> request) throws IOException {
        return Client.beanList(request);
    }

    /*
     * 前十大股东
     */
    static <T extends Top10Holders> List<T> top10Holders(Request<T> request) throws IOException {
        return Client.beanList(request);
    }

    /*
     * 前十大流通股东
     */
    static <T extends Top10Floatholders> List<T> top10Floatholders(Request<T> request) throws IOException {
        return Client.beanList(request);
    }

    /*
     * 龙虎榜每日明细
     */
    static <T extends TopList> List<T> topList(Request<T> request) throws IOException {
        return Client.beanList(request);
    }

    /*
     * 龙虎榜机构明细
     */
    static <T extends TopInst> List<T> topInst(Request<T> request) throws IOException {
        return Client.beanList(request);
    }

    /*
     * 股权质押统计数据
     */
    static <T extends PledgeStat> List<T> pledgeStat(Request<T> request) throws IOException {
        return Client.beanList(request);
    }

    /*
     * 股权质押明细
     */
    static <T extends PledgeDetail> List<T> pledgeDetail(Request<T> request) throws IOException {
        return Client.beanList(request);
    }

    /*
     * 股票回购
     */
    static <T extends Repurchase> List<T> repurchase(Request<T> request) throws IOException {
        return Client.beanList(request);
    }

    /*
     * 概念股分类
     */
    static <T extends Concept> List<T> concept(Request<T> request) throws IOException {
        return Client.beanList(request);
    }

    /*
     * 概念股列表
     */
    static <T extends ConceptDetail> List<T> conceptDetail(Request<T> request) throws IOException {
        return Client.beanList(request);
    }

    /*
     * 限售股解禁
     */
    static <T extends ShareFloat> List<T> shareFloat(Request<T> request) throws IOException {
        return Client.beanList(request);
    }

    /*
     * 大宗交易
     */
    static <T extends BlockTrade> List<T> blockTrade(Request<T> request) throws IOException {
        return Client.beanList(request);
    }

    /*
     * 股票账户开户数据
     */
    static <T extends StkAccount> List<T> stkAccount(Request<T> request) throws IOException {
        return Client.beanList(request);
    }

    /*
     * 股票账户开户数据（旧）
     */
    static <T extends StkAccountOld> List<T> stkAccountOld(Request<T> request) throws IOException {
        return Client.beanList(request);
    }

    /*
     * 股东人数
     */
    static <T extends StkHoldernumber> List<T> stkHoldernumber(Request<T> request) throws IOException {
        return Client.beanList(request);
    }

    /*
     * 股东增减持
     */
    static <T extends StkHoldertrade> List<T> stkHoldertrade(Request<T> request) throws IOException {
        return Client.beanList(request);
    }

    /*
     * 指数基本信息
     */
    static <T extends IndexBasic> List<T> indexBasic(Request<T> request) throws IOException {
        return Client.beanList(request);
    }

    /*
     * 指数日线行情
     */
    static <T extends IndexDaily> List<T> indexDaily(Request<T> request) throws IOException {
        return Client.beanList(request);
    }

    /*
     * 指数周线行情
     */
    static <T extends IndexWeekly> List<T> indexWeekly(Request<T> request) throws IOException {
        return Client.beanList(request);
    }

    /*
     * 指数月线行情
     */
    static <T extends IndexMonthly> List<T> indexMonthly(Request<T> request) throws IOException {
        return Client.beanList(request);
    }

    /*
     * 指数成分和权重
     */
    static <T extends IndexWeigth> List<T> indexWeigth(Request<T> request) throws IOException {
        return Client.beanList(request);
    }

    /*
     * 大盘指数每日指标
     */
    static <T extends IndexDailybasic> List<T> indexDailybasic(Request<T> request) throws IOException {
        return Client.beanList(request);
    }

}