package com.github.tushare.pro.sample;

import com.github.tushare.pro.TusharePro;
import com.github.tushare.pro.TushareProService;
import com.github.tushare.pro.bean.StockBasicBean;
import com.github.tushare.pro.common.KeyValue;
import com.github.tushare.pro.http.request.StockBasicRequest;

import java.io.IOException;
import java.util.Comparator;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;

public class StartTushareProSample {

//    public static void main(String[] args) throws IOException {
//        start();
//    }

    private static void start() throws IOException {

        final TusharePro.Builder builder = new TusharePro.Builder()
                .setToken("**********");  // 你的token

        TusharePro.setGlobal(builder.build());  // 设置全局配置

        final KeyValue<String, String> list_status = StockBasicRequest.Params.list_status.value("L");

        // 打印 上海交易所所有上市的沪股通股票 信息
        TushareProService.stockBasic(new StockBasicRequest()  // 使用全局配置
                .allFields()  // 所有字段
                .param(StockBasicRequest.Params.exchange.value("SSE"))  // 参数
                .param(list_status)  // 参数
                .param("is_hs", "H"))  // 参数
                .forEach(System.out::println);


        // 一个完整的例子
        TushareProService.stockBasic(
                SuperStockBasicSampleBean.class,  // 不能为内部类
                new StockBasicRequest(builder.copy()  // 将配置拷贝
                .setMaxRetries(5)  // 设置重试次数, 默认为3
                .setRetrySleepTimeUnit(TimeUnit.SECONDS)  // 设置重试sleep单位, 默认毫秒
                .setRetrySleepTimeOut(60L)  // 设置重试sleep时间, 默认为0
                .setRequestExecutor(Executors.newSingleThreadExecutor((r -> {
                    Thread thread = new Thread(r);
                    thread.setDaemon(true);
                    return thread;
                })))  // 设置请求线程池, 默认CachedThreadPool
                .build())
                .allFields()
                .param(StockBasicRequest.Params.exchange.value("SZSE"))
                .param(list_status))
                .stream()
                .filter(x -> "银行".equals(x.getIndustry()))
                .peek(x -> {
                    if ("主板".equals(x.getMarket())) x.weight++;
                    if ("江苏".equals(x.getArea()) || "深圳".equals(x.getArea())) x.weight++;
                })
                .sorted(Comparator.comparingInt(x -> x.weight))
                .collect(Collectors.groupingBy(x ->  x.weight, Collectors.toMap(StockBasicBean::getName, y -> y)))
                .forEach((weight, codeList) -> System.out.println(weight + " => " + codeList));
    }

}
