package com.github.tushare.pro;

import com.github.tushare.pro.bean.*;
import com.github.tushare.pro.http.*;
import com.github.tushare.pro.http.request.*;

import java.io.IOException;
import java.util.List;

public interface TushareProService {

    /**
     * 股票列表
     */
    static <T extends StockBasicRequest> List<StockBasicBean> stockBasic(Request<T> request) throws IOException {
        return stockBasic(StockBasicBean.class, request);
    }

    /**
     * 股票列表
     */
    static <T extends StockBasicRequest, C extends StockBasicBean> List<C> stockBasic(Class<C> beanClass, Request<T> request) throws IOException {
        return Client.beanList(beanClass, request);
    }

    /**
     * 交易日历
     */
    static <T extends TradeCalRequest> List<TradeCalBean> tradeCal(Request<T> request) throws IOException {
        return tradeCal(TradeCalBean.class, request);
    }

    /**
     * 交易日历
     */
    static <T extends TradeCalRequest, C extends TradeCalBean> List<C> tradeCal(Class<C> beanClass, Request<T> request) throws IOException {
        return Client.beanList(beanClass, request);
    }

    /**
     * 股票曾用名
     */
    static <T extends NamechangeRequest> List<NamechangeBean> namechange(Request<T> request) throws IOException {
        return namechange(NamechangeBean.class, request);
    }

    /**
     * 股票曾用名
     */
    static <T extends NamechangeRequest, C extends NamechangeBean> List<C> namechange(Class<C> beanClass, Request<T> request) throws IOException {
        return Client.beanList(beanClass, request);
    }

    /**
     * 沪深股通成份股
     */
    static <T extends HsConstRequest> List<HsConstBean> hsConst(Request<T> request) throws IOException {
        return hsConst(HsConstBean.class, request);
    }

    /**
     * 沪深股通成份股
     */
    static <T extends HsConstRequest, C extends HsConstBean> List<C> hsConst(Class<C> beanClass, Request<T> request) throws IOException {
        return Client.beanList(beanClass, request);
    }

    /**
     * 上市公司基本信息
     */
    static <T extends StockCompanyRequest> List<StockCompanyBean> stockCompany(Request<T> request) throws IOException {
        return stockCompany(StockCompanyBean.class, request);
    }

    /**
     * 上市公司基本信息
     */
    static <T extends StockCompanyRequest, C extends StockCompanyBean> List<C> stockCompany(Class<C> beanClass, Request<T> request) throws IOException {
        return Client.beanList(beanClass, request);
    }

    /**
     * 日线行情
     */
    static <T extends DailyRequest> List<DailyBean> daily(Request<T> request) throws IOException {
        return daily(DailyBean.class, request);
    }

    /**
     * 日线行情
     */
    static <T extends DailyRequest, C extends DailyBean> List<C> daily(Class<C> beanClass, Request<T> request) throws IOException {
        return Client.beanList(beanClass, request);
    }

    /**
     * 复权因子
     */
    static <T extends AdjFactorRequest> List<AdjFactorBean> adjFactor(Request<T> request) throws IOException {
        return adjFactor(AdjFactorBean.class, request);
    }

    /**
     * 复权因子
     */
    static <T extends AdjFactorRequest, C extends AdjFactorBean> List<C> adjFactor(Class<C> beanClass, Request<T> request) throws IOException {
        return Client.beanList(beanClass, request);
    }

    /**
     * 停复牌信息
     */
    static <T extends SuspendRequest> List<SuspendBean> suspend(Request<T> request) throws IOException {
        return suspend(SuspendBean.class, request);
    }

    /**
     * 停复牌信息
     */
    static <T extends SuspendRequest, C extends SuspendBean> List<C> suspend(Class<C> beanClass, Request<T> request) throws IOException {
        return Client.beanList(beanClass, request);
    }

    /**
     * 每日指标
     */
    static <T extends DailyBasicRequest> List<DailyBasicBean> dailyBasic(Request<T> request) throws IOException {
        return dailyBasic(DailyBasicBean.class, request);
    }

    /**
     * 每日指标
     */
    static <T extends DailyBasicRequest, C extends DailyBasicBean> List<C> dailyBasic(Class<C> beanClass, Request<T> request) throws IOException {
        return Client.beanList(beanClass, request);
    }

    /**
     * 利润表
     */
    static <T extends IncomeRequest> List<IncomeBean> income(Request<T> request) throws IOException {
        return income(IncomeBean.class, request);
    }

    /**
     * 利润表
     */
    static <T extends IncomeRequest, C extends IncomeBean> List<C> income(Class<C> beanClass, Request<T> request) throws IOException {
        return Client.beanList(beanClass, request);
    }

    /**
     * 资产负债表
     */
    static <T extends BalancesheetRequest> List<BalancesheetBean> balancesheet(Request<T> request) throws IOException {
        return balancesheet(BalancesheetBean.class, request);
    }

    /**
     * 资产负债表
     */
    static <T extends BalancesheetRequest, C extends BalancesheetBean> List<C> balancesheet(Class<C> beanClass, Request<T> request) throws IOException {
        return Client.beanList(beanClass, request);
    }

    /**
     * 现金流量表
     */
    static <T extends CashflowRequest> List<CashflowBean> cashflow(Request<T> request) throws IOException {
        return cashflow(CashflowBean.class, request);
    }

    /**
     * 现金流量表
     */
    static <T extends CashflowRequest, C extends CashflowBean> List<C> cashflow(Class<C> beanClass, Request<T> request) throws IOException {
        return Client.beanList(beanClass, request);
    }

    /**
     * 业绩预告
     */
    static <T extends ForecastRequest> List<ForecastBean> forecast(Request<T> request) throws IOException {
        return forecast(ForecastBean.class, request);
    }

    /**
     * 业绩预告
     */
    static <T extends ForecastRequest, C extends ForecastBean> List<C> forecast(Class<C> beanClass, Request<T> request) throws IOException {
        return Client.beanList(beanClass, request);
    }

    /**
     * 分红送股
     */
    static <T extends DividendRequest> List<DividendBean> dividend(Request<T> request) throws IOException {
        return dividend(DividendBean.class, request);
    }

    /**
     * 分红送股
     */
    static <T extends DividendRequest, C extends DividendBean> List<C> dividend(Class<C> beanClass, Request<T> request) throws IOException {
        return Client.beanList(beanClass, request);
    }

    /**
     * 业绩快报
     */
    static <T extends ExpressRequest> List<ExpressBean> express(Request<T> request) throws IOException {
        return express(ExpressBean.class, request);
    }

    /**
     * 业绩快报
     */
    static <T extends ExpressRequest, C extends ExpressBean> List<C> express(Class<C> beanClass, Request<T> request) throws IOException {
        return Client.beanList(beanClass, request);
    }

    /**
     * 财务指标数据
     */
    static <T extends FinaIndicatorRequest> List<FinaIndicatorBean> finaIndicator(Request<T> request) throws IOException {
        return finaIndicator(FinaIndicatorBean.class, request);
    }

    /**
     * 财务指标数据
     */
    static <T extends FinaIndicatorRequest, C extends FinaIndicatorBean> List<C> finaIndicator(Class<C> beanClass, Request<T> request) throws IOException {
        return Client.beanList(beanClass, request);
    }

    /**
     * 财务审计意见
     */
    static <T extends FinaAuditRequest> List<FinaAuditBean> finaAudit(Request<T> request) throws IOException {
        return finaAudit(FinaAuditBean.class, request);
    }

    /**
     * 财务审计意见
     */
    static <T extends FinaAuditRequest, C extends FinaAuditBean> List<C> finaAudit(Class<C> beanClass, Request<T> request) throws IOException {
        return Client.beanList(beanClass, request);
    }

    /**
     * 主营业务构成
     */
    static <T extends FinaMainbzRequest> List<FinaMainbzBean> finaMainbz(Request<T> request) throws IOException {
        return finaMainbz(FinaMainbzBean.class, request);
    }

    /**
     * 主营业务构成
     */
    static <T extends FinaMainbzRequest, C extends FinaMainbzBean> List<C> finaMainbz(Class<C> beanClass, Request<T> request) throws IOException {
        return Client.beanList(beanClass, request);
    }

    /**
     * 沪深港通资金流向
     */
    static <T extends MoneyflowHsgtRequest> List<MoneyflowHsgtBean> moneyflowHsgt(Request<T> request) throws IOException {
        return moneyflowHsgt(MoneyflowHsgtBean.class, request);
    }

    /**
     * 沪深港通资金流向
     */
    static <T extends MoneyflowHsgtRequest, C extends MoneyflowHsgtBean> List<C> moneyflowHsgt(Class<C> beanClass, Request<T> request) throws IOException {
        return Client.beanList(beanClass, request);
    }

    /**
     * 沪深股通十大成交股
     */
    static <T extends HsgtTop10Request> List<HsgtTop10Bean> hsgtTop10(Request<T> request) throws IOException {
        return hsgtTop10(HsgtTop10Bean.class, request);
    }

    /**
     * 沪深股通十大成交股
     */
    static <T extends HsgtTop10Request, C extends HsgtTop10Bean> List<C> hsgtTop10(Class<C> beanClass, Request<T> request) throws IOException {
        return Client.beanList(beanClass, request);
    }

    /**
     * 港股通十大成交股
     */
    static <T extends GgtTop10Request> List<GgtTop10Bean> ggtTop10(Request<T> request) throws IOException {
        return ggtTop10(GgtTop10Bean.class, request);
    }

    /**
     * 港股通十大成交股
     */
    static <T extends GgtTop10Request, C extends GgtTop10Bean> List<C> ggtTop10(Class<C> beanClass, Request<T> request) throws IOException {
        return Client.beanList(beanClass, request);
    }

    /**
     * 融资融券交易汇总
     */
    static <T extends MarginRequest> List<MarginBean> margin(Request<T> request) throws IOException {
        return margin(MarginBean.class, request);
    }

    /**
     * 融资融券交易汇总
     */
    static <T extends MarginRequest, C extends MarginBean> List<C> margin(Class<C> beanClass, Request<T> request) throws IOException {
        return Client.beanList(beanClass, request);
    }

    /**
     * 融资融券交易明细
     */
    static <T extends MarginDetailRequest> List<MarginDetailBean> marginDetail(Request<T> request) throws IOException {
        return marginDetail(MarginDetailBean.class, request);
    }

    /**
     * 融资融券交易明细
     */
    static <T extends MarginDetailRequest, C extends MarginDetailBean> List<C> marginDetail(Class<C> beanClass, Request<T> request) throws IOException {
        return Client.beanList(beanClass, request);
    }

    /**
     * 前十大股东
     */
    static <T extends Top10HoldersRequest> List<Top10HoldersBean> top10Holders(Request<T> request) throws IOException {
        return top10Holders(Top10HoldersBean.class, request);
    }

    /**
     * 前十大股东
     */
    static <T extends Top10HoldersRequest, C extends Top10HoldersBean> List<C> top10Holders(Class<C> beanClass, Request<T> request) throws IOException {
        return Client.beanList(beanClass, request);
    }

    /**
     * 前十大流通股东
     */
    static <T extends Top10FloatholdersRequest> List<Top10FloatholdersBean> top10Floatholders(Request<T> request) throws IOException {
        return top10Floatholders(Top10FloatholdersBean.class, request);
    }

    /**
     * 前十大流通股东
     */
    static <T extends Top10FloatholdersRequest, C extends Top10FloatholdersBean> List<C> top10Floatholders(Class<C> beanClass, Request<T> request) throws IOException {
        return Client.beanList(beanClass, request);
    }

    /**
     * 龙虎榜每日明细
     */
    static <T extends TopListRequest> List<TopListBean> topList(Request<T> request) throws IOException {
        return topList(TopListBean.class, request);
    }

    /**
     * 龙虎榜每日明细
     */
    static <T extends TopListRequest, C extends TopListBean> List<C> topList(Class<C> beanClass, Request<T> request) throws IOException {
        return Client.beanList(beanClass, request);
    }

    /**
     * 龙虎榜机构明细
     */
    static <T extends TopInstRequest> List<TopInstBean> topInst(Request<T> request) throws IOException {
        return topInst(TopInstBean.class, request);
    }

    /**
     * 龙虎榜机构明细
     */
    static <T extends TopInstRequest, C extends TopInstBean> List<C> topInst(Class<C> beanClass, Request<T> request) throws IOException {
        return Client.beanList(beanClass, request);
    }

    /**
     * 指数基本信息
     */
    static <T extends IndexBasicRequest> List<IndexBasicBean> indexBasic(Request<T> request) throws IOException {
        return indexBasic(IndexBasicBean.class, request);
    }

    /**
     * 指数基本信息
     */
    static <T extends IndexBasicRequest, C extends IndexBasicBean> List<C> indexBasic(Class<C> beanClass, Request<T> request) throws IOException {
        return Client.beanList(beanClass, request);
    }

    /**
     * 指数日线行情
     */
    static <T extends IndexDailyRequest> List<IndexDailyBean> indexDaily(Request<T> request) throws IOException {
        return indexDaily(IndexDailyBean.class, request);
    }

    /**
     * 指数日线行情
     */
    static <T extends IndexDailyRequest, C extends IndexDailyBean> List<C> indexDaily(Class<C> beanClass, Request<T> request) throws IOException {
        return Client.beanList(beanClass, request);
    }

    /**
     * 指数成分和权重
     */
    static <T extends IndexWeigthRequest> List<IndexWeigthBean> indexWeigth(Request<T> request) throws IOException {
        return indexWeigth(IndexWeigthBean.class, request);
    }

    /**
     * 指数成分和权重
     */
    static <T extends IndexWeigthRequest, C extends IndexWeigthBean> List<C> indexWeigth(Class<C> beanClass, Request<T> request) throws IOException {
        return Client.beanList(beanClass, request);
    }
}