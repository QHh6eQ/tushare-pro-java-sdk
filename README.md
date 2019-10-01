Tushare Pro Java SDK
- 相关参考: [https://tushare.pro](https://tushare.pro)
- HTTP API: [https://tushare.pro/document/1?doc_id=130](https://tushare.pro/document/1?doc_id=130)

### 环境需求
- Java 8

### 快速上手
```xml
<dependency>
  <groupId>com.github.qhh6eq</groupId>
  <artifactId>tushare-pro-java-sdk</artifactId>
  <version>2.0.1-RELEASE</version>
</dependency>
```
```java
TusharePro.setGlobal(new TusharePro.Builder()
        .setToken("**********")  // 你的token
        .build());  // 设置全局配置
                
// 打印 上海交易所所有上市的沪股通股票 信息
TushareProService.stockBasic(new Request<StockBasicEntity>() {}  // 使用全局配置
        .allFields()  // 所有字段
        .param(StockBasic.Params.exchange.value("SSE"))  // 参数
        .param(StockBasic.Params.list_status.value("L"))  // 参数
        .param("is_hs", "H"))  // 参数
        .forEach(System.out::println);
```

### 持久化
- 自带的Entity类能完成绝大多数需求, 并且支持JPA. 具体可以关注 [tushare-pro-persistence](https://github.com/QHh6eQ/tushare-pro-persistence)
```java
@Autowired private StockBasicRepository stockBasicRepository;
```
```java
for (final String value : new String[]{"L", "D", "P"}) {
    stockBasicRepository.saveAll(TushareProService.stockBasic(new Request<StockBasicEntity>() {}
            .allFields()
            .param(StockBasic.Params.list_status.value(value))));
}
```
### 自定义映射
- 映射类(如自带的Entity类)也可以自行实现, 只要implements对应的接口(可在祖先里; 不能出现多个BaseBean), 并且把Fields内部类下的字段全部在实现类中以小驼峰式声明(未来可能会支持自定义映射, 但不建议这么折腾)
```java
public class MyStockBasic implements StockBasic {
    protected String tsCode;  // TS代码 对应 StockBasic.Fields.ts_code
    // ...
}
```
```java
final List<MyStockBasic> list = TushareProService.stockBasic(new Request<MyStockBasic>() {})
```

### 完整例子
```java
final TusharePro.Builder builder = new TusharePro.Builder()
        .setToken("**********");  // 你的token

TusharePro.setGlobal(builder.build());  // 设置全局配置

final KeyValue<String, String> list_status = StockBasic.Params.list_status.value("L");

// 打印 上海交易所所有上市的沪股通股票 信息
TushareProService.stockBasic(new Request<StockBasicEntity>() {}  // 使用全局配置
        .allFields()  // 所有字段
        .param(StockBasic.Params.exchange.value("SSE"))  // 参数
        .param(list_status)  // 参数
        .param("is_hs", "H"))  // 参数
        .forEach(System.out::println);

// 一个完整的例子
TushareProService.stockBasic(
        new Request<StockBasicEntity>(builder.copy()  // 将配置拷贝
                .setMaxRetries(5)  // 设置重试次数, 默认为0
                .setRetrySleepTimeUnit(TimeUnit.SECONDS)  // 设置重试sleep单位, 默认毫秒
                .setRetrySleepTimeOut(60L)  // 设置重试sleep时间, 默认为0
                .setRequestExecutor(Executors.newSingleThreadExecutor((r -> {
                    Thread thread = new Thread(r);
                    thread.setDaemon(true);
                    return thread;
                })))  // 设置请求线程池, 默认CachedThreadPool
                .build()){}
        .allFields()
        .param(StockBasic.Params.exchange.value("SZSE"))
        .param(list_status))
        .stream()
        .filter(x -> "银行".equals(x.getIndustry()))
        .forEach(System.out::println);
```