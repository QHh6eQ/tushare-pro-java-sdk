package com.github.tushare.pro.generator;

import com.github.tushare.pro.common.Util;
import com.github.tushare.pro.http.Client;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 根据api文档生成java代码
 */
public class CodeGenerator {

//    public static void main(String[] args) throws IOException {
//        Arrays.stream(apiDocs).forEach(x -> {
//            try {
//                start(x);
//            } catch (IOException e) {
//                e.printStackTrace();
//            }
//        });
//
////        start(new ApiDoc().setName("dividend").setZhName("分红送股").setUrl("https://tushare.pro/document/2?doc_id=103"));
////        start(new ApiDoc().setName("top10_holders").setZhName("前十大股东").setUrl("https://tushare.pro/document/2?doc_id=61"));
////        start(new ApiDoc().setName("top10_floatholders").setZhName("前十大流通股东").setUrl("https://tushare.pro/document/2?doc_id=62"));
//    }

    private static ApiDoc[] apiDocs = {
            // => 沪深股票
            // => 沪深股票 => 基础数据
            new ApiDoc().setName("stock_basic").setZhName("股票列表").setUrl("https://tushare.pro/document/2?doc_id=25"),
            new ApiDoc().setName("trade_cal").setZhName("交易日历").setUrl("https://tushare.pro/document/2?doc_id=26"),
            new ApiDoc().setName("namechange").setZhName("股票曾用名").setUrl("https://tushare.pro/document/2?doc_id=100"),
            new ApiDoc().setName("hs_const").setZhName("沪深股通成份股").setUrl("https://tushare.pro/document/2?doc_id=104"),
            new ApiDoc().setName("stock_company").setZhName("上市公司基本信息").setUrl("https://tushare.pro/document/2?doc_id=112"),
            // => 沪深股票 => 行情数据
            new ApiDoc().setName("daily").setZhName("日线行情").setUrl("https://tushare.pro/document/2?doc_id=27"),
            new ApiDoc().setName("adj_factor").setZhName("复权因子").setUrl("https://tushare.pro/document/2?doc_id=28"),
            new ApiDoc().setName("suspend").setZhName("停复牌信息").setUrl("https://tushare.pro/document/2?doc_id=31"),
            new ApiDoc().setName("daily_basic").setZhName("每日指标").setUrl("https://tushare.pro/document/2?doc_id=32"),
            // => 沪深股票 => 财务数据
            new ApiDoc().setName("income").setZhName("利润表").setUrl("https://tushare.pro/document/2?doc_id=33"),
            new ApiDoc().setName("balancesheet").setZhName("资产负债表").setUrl("https://tushare.pro/document/2?doc_id=36"),
            new ApiDoc().setName("cashflow").setZhName("现金流量表").setUrl("https://tushare.pro/document/2?doc_id=44"),
            new ApiDoc().setName("forecast").setZhName("业绩预告").setUrl("https://tushare.pro/document/2?doc_id=45"),
            new ApiDoc().setName("dividend").setZhName("分红送股").setUrl("https://tushare.pro/document/2?doc_id=103"),
            new ApiDoc().setName("express").setZhName("业绩快报").setUrl("https://tushare.pro/document/2?doc_id=46"),
            new ApiDoc().setName("fina_indicator").setZhName("财务指标数据").setUrl("https://tushare.pro/document/2?doc_id=79"),
            new ApiDoc().setName("fina_audit").setZhName("财务审计意见").setUrl("https://tushare.pro/document/2?doc_id=80"),
            new ApiDoc().setName("fina_mainbz").setZhName("主营业务构成").setUrl("https://tushare.pro/document/2?doc_id=81"),
            // => 沪深股票 => 市场参考数据
            new ApiDoc().setName("moneyflow_hsgt").setZhName("沪深港通资金流向").setUrl("https://tushare.pro/document/2?doc_id=47"),
            new ApiDoc().setName("hsgt_top10").setZhName("沪深股通十大成交股").setUrl("https://tushare.pro/document/2?doc_id=48"),
            new ApiDoc().setName("ggt_top10").setZhName("港股通十大成交股").setUrl("https://tushare.pro/document/2?doc_id=49"),
            new ApiDoc().setName("margin").setZhName("融资融券交易汇总").setUrl("https://tushare.pro/document/2?doc_id=58"),
            new ApiDoc().setName("margin_detail").setZhName("融资融券交易明细").setUrl("https://tushare.pro/document/2?doc_id=59"),
            new ApiDoc().setName("top10_holders").setZhName("前十大股东").setUrl("https://tushare.pro/document/2?doc_id=61"),
            new ApiDoc().setName("top10_floatholders").setZhName("前十大流通股东").setUrl("https://tushare.pro/document/2?doc_id=62"),
            new ApiDoc().setName("top_list").setZhName("龙虎榜每日明细").setUrl("https://tushare.pro/document/2?doc_id=106"),
            new ApiDoc().setName("top_inst").setZhName("龙虎榜机构明细").setUrl("https://tushare.pro/document/2?doc_id=107"),
            // => 指数
            new ApiDoc().setName("index_basic").setZhName("指数基本信息").setUrl("https://tushare.pro/document/2?doc_id=94"),
            new ApiDoc().setName("index_daily").setZhName("指数日线行情").setUrl("https://tushare.pro/document/2?doc_id=95"),
            new ApiDoc().setName("index_weigth").setZhName("指数成分和权重").setUrl("https://tushare.pro/document/2?doc_id=96"),
    };

    private static void start(ApiDoc apiDoc) throws IOException {

        String apiDocHtml = Client.getApiDoc(apiDoc.getUrl()).replace("\n", "");
//        System.out.println(apiDocHtml);

        // 输入参数
        getTdList(1, apiDoc, apiDocHtml, "<p><strong>输入参数</strong></p>" +
                "<table>" +
                "<thead>" +
                "<tr>" +
                "<th>名称</th>" +
                "<th>类型</th>" +
                "<th>必选</th>" +
                "<th>描述</th>" +
                "</tr>" +
                "</thead>");

        // type 2, 3 , 4只会匹配一个
        getTdList(2, apiDoc, apiDocHtml, "<p><strong>输出参数</strong></p>" +
                "<table>" +
                "<thead>" +
                "<tr>" +
                "<th>名称</th>" +
                "<th>类型</th>" +
                "<th>描述</th>" +
                "</tr>" +
                "</thead>");
        getTdList(3, apiDoc, apiDocHtml, "<p><strong>输出参数</strong></p>" +
                "<table>" +
                "<thead>" +
                "<tr>" +
                "<th>名称</th>" +
                "<th>类型</th>" +
                "<th>默认输出</th>" +
                "<th>描述</th>" +
                "</tr>" +
                "</thead>");

        getTdList(3, apiDoc, apiDocHtml, "<p><strong>输出参数</strong></p>" +
                "<table>" +
                "<thead>" +
                "<tr>" +
                "<th>名称</th>" +
                "<th>类型</th>" +
                "<th>默认显示</th>" +
                "<th>描述</th>" +
                "</tr>" +
                "</thead>");


        System.out.println(apiDoc);

        // 首字大写, _大写
        String apiFileNameTemp = Util.camelName(apiDoc.getName());
        String apiFileName = apiFileNameTemp.substring(0, 1).toUpperCase() + apiFileNameTemp.substring(1);
        System.out.println("apiFileName:" + apiFileName);

        // 写入request文件
        writeToRequest(apiFileName, apiDoc);
        writeToBean(apiFileName, apiDoc);
        writeToService(apiFileName, apiDoc);
    }

    private static void getTdList(Integer type, ApiDoc apiDoc, String apiDocHtml, String matcherInputStartStr) {

        Matcher matcherInput = Pattern.compile(matcherInputStartStr + ".*?</tbody></table>").matcher(apiDocHtml);

        while (matcherInput.find()) {
            String inputGroup = matcherInput.group().replace(matcherInputStartStr, "");
//            System.out.println("*****");
//            System.out.println(inputGroup);

            Matcher matcherInputTr = Pattern.compile("<tr>.*?</tr>").matcher(inputGroup);
            while (matcherInputTr.find()) {
                String inputTrGroup = matcherInputTr.group();
                Matcher matcherInputTd = Pattern.compile("<td>.*?</td>").matcher(inputTrGroup);

                List<String> strings = new ArrayList<>();
                while (matcherInputTd.find()) {
                    String inputTdGroup = matcherInputTd.group();
//                    System.out.println(inputTdGroup);
                    strings.add(inputTdGroup.replace("<td>", "").replace("</td>", ""));
                }

                if (type == 1) {  // 输入参数
                    apiDoc.getRequest().add(new ApiDoc.RequestParam()
                            .setName(strings.get(0))
                            .setType(strings.get(1))
                            .setRequired(strings.get(2))
                            .setDescription(strings.get(3))
                    );
                }
                else if (type == 2) {  // 输出参数
                    apiDoc.getResponse().add(new ApiDoc.ResponseParam()
                            .setName(strings.get(0))
                            .setType(strings.get(1))
                            .setDescription(strings.get(2))
                    );
                }
                else if (type == 3) {  // 输出参数
                    apiDoc.getResponse().add(new ApiDoc.ResponseParam()
                            .setName(strings.get(0))
                            .setType(strings.get(1))
                            .setDefaultOutput(strings.get(2))
                            .setDescription(strings.get(3))
                    );
                }
            }
        }
    }

    // 写入request
    private static void writeToRequest(String apiFileName, ApiDoc apiDoc) throws IOException {
        String className = apiFileName + "Request";

        String strA = "package com.github.tushare.pro.http.request;\n" +
                "\n" +
                "import com.github.tushare.pro.TusharePro;\n" +
                "import com.github.tushare.pro.common.KeyValue;\n" +
                "import com.github.tushare.pro.http.BaseRequestParam;\n" +
                "import com.github.tushare.pro.http.Request;\n" +
                "\n" +
                "/**\n" +
                " * " + apiDoc.getZhName() + "\n" +
                " */\n" +
                "public final class " + className + " extends Request<" + className + "> {\n" +
                "\n" +
                "    public "+ className + "() {\n" +
                "        this(null);\n" +
                "    }\n" +
                "\n" +
                "    public " + className + "(TusharePro tusharePro) {\n" +
                "        super(tusharePro);\n" +
                "        setApi_name(\"" + apiDoc.getName() + "\");\n" +
                "    }\n" +
                "\n";

        String[] fieldStr = {"    public static class Fields {"};
        fieldStr[0] += apiDoc.getResponse().stream()
                .map(responseParam -> "\n        public static final String " + responseParam.getName() + " = \"" + responseParam.getName() + "\";  // " + responseParam.getDescription())
                .reduce((a, b) -> a += b).orElse("")
                + "\n    }\n\n";

        String[] paramStr = {"    public static class Params {"};
        paramStr[0] += apiDoc.getRequest().stream()
                .map(requestParam -> "\n\n        public static final " + requestParam.getName() + " " + requestParam.getName() + " = new " + requestParam.getName() + "();  // " + requestParam.getDescription() + "\n" +
                    "        public static class " + requestParam.getName() + " extends BaseRequestParam {\n" +
                    "            {key = \"" + requestParam.getName() + "\";}\n" +
                    "        }")
                .reduce((a, b) -> a += b).orElse("")
                + "\n    }\n";

        String fileStr = strA + fieldStr[0] + paramStr[0] + "\n}";

        System.out.println(fileStr);

        // write....

//        System.out.println(System.getProperty("user.dir"));

        String path = new File("").getCanonicalPath() + "/src/main/java/com/github/tushare/pro/http/request/";
        System.out.println(path);
        if (!Files.exists(Paths.get(path))) {
            new File(path).mkdirs();
        }
        if (!Files.exists(Paths.get(path + className + ".java"))) {
            Files.write(Paths.get(path + className + ".java"), fileStr.getBytes());
        }
    }

    // 写入bean
    private static void writeToBean(String apiFileName, ApiDoc apiDoc) throws IOException {
        String className = apiFileName + "Bean";
        String strA = "package com.github.tushare.pro.bean;\n" +
                "\n" +
                "/**\n" +
                " * " + apiDoc.getZhName() + "\n" +
                " */\n" +
                "public class " + className + " {\n" +
                "\n";

        final Function<String, String> typeFunction = x -> {
            switch (x) {
                case "str":
                    return "String";
                case "int":
                    return "Integer";
                case "float":
                    return "Double";
                case "None":  // 暂时这么处理
                    return "String";
                default:
                    return "null";
            }
        };

        String field = apiDoc.getResponse().stream()
                .map(responseParam -> "    protected " + typeFunction.apply(responseParam.getType()) + " " + Util.camelName(responseParam.getName()) + ";  // " + responseParam.getDescription() + "\n")
                .reduce((a, b) -> a += b)
                .orElse("");

        String getterAndSetter = apiDoc.getResponse().stream()
                .map(responseParam -> {
                    String type = typeFunction.apply(responseParam.getType());
                    String camelName = Util.camelName(responseParam.getName());
                    String upperCamelName = camelName.substring(0, 1).toUpperCase() + camelName.substring(1);
                    return "\n    public " + type + " get" + upperCamelName + "() {\n" +
                            "        return " + camelName + ";\n" +
                            "    }\n" +
                            "\n" +
                            "    public " + className + " set" + upperCamelName + "(" + type + " " + camelName + ") {\n" +
                            "        this." + camelName + " = " + camelName + ";\n" +
                            "        return this;\n" +
                            "    }\n";
                })
                .reduce((a, b) -> a += b)
                .orElse("");

        String toString = "\n    @Override\n" +
                "    public String toString() {\n" +
                "        return \"" + className + "{\" +\n" +
                apiDoc.getResponse().stream()
                        .map(responseParam -> {
                            String camelName = Util.camelName(responseParam.getName());
                            return "               \"" + camelName + "=\" + " + camelName;
                        })
                        .reduce((a, b) -> a += " + \", \" +\n" + b)
                        .orElse("") +
                " + \n" +
                "               \"}\";\n" +
                "    }\n";

        String fileStr = strA + field + getterAndSetter + toString + "}";
        System.out.println(fileStr);

        String path = new File("").getCanonicalPath() + "/src/main/java/com/github/tushare/pro/bean/";
        System.out.println(path);
        if (!Files.exists(Paths.get(path))) {
            new File(path).mkdirs();
        }
        if (!Files.exists(Paths.get(path + className + ".java"))) {
            Files.write(Paths.get(path + className + ".java"), fileStr.getBytes());
        }
    }

    // 写入service
    private static void writeToService(String apiFileName, ApiDoc apiDoc) throws IOException {
        String path = new File("").getCanonicalPath() + "/src/main/java/com/github/tushare/pro/TushareProService.java";

        String staticMethod = "\n    /**\n" +
                "     * " + apiDoc.getZhName() + "\n" +
                "     */\n" +
                "    static <T extends " + apiFileName + "Request> List<" + apiFileName + "Bean> " + Util.camelName(apiDoc.getName()) + "(Request<T> request) throws IOException {\n" +
                "        return " + Util.camelName(apiDoc.getName()) + "(" + apiFileName + "Bean.class, request);\n" +
                "    }\n" +
                "\n    /**\n" +
                "     * " + apiDoc.getZhName() + "\n" +
                "     */\n" +
                "    static <T extends " + apiFileName + "Request, C extends " + apiFileName + "Bean> List<C> " + Util.camelName(apiDoc.getName()) + "(Class<C> beanClass, Request<T> request) throws IOException {\n" +
                "        return Client.beanList(beanClass, request);\n" +
                "    }\n";

        if (!Files.exists(Paths.get(path))) {  // 不存在
            String fileStr = "package com.github.tushare.pro;\n" +
                    "\n" +
                    "import com.github.tushare.pro.bean.*;\n" +
                    "import com.github.tushare.pro.http.*;\n" +
                    "import com.github.tushare.pro.http.request.*;\n" +
                    "\n" +
                    "import java.io.IOException;\n" +
                    "import java.util.List;\n" +
                    "\n" +
                    "public interface TushareProService {\n" + staticMethod + "}";
            System.out.println(fileStr);
            Files.write(Paths.get(path), fileStr.getBytes());
        }
        else {  // 存在为增量
//            String fileStr = Files.readString(Paths.get(path));
            String fileStr = new String(Files.readAllBytes(Paths.get(path)));
            fileStr = fileStr.substring(0, fileStr.lastIndexOf("}")) + staticMethod + "}";
            System.out.println(fileStr);
            Files.write(Paths.get(path), fileStr.getBytes());
        }
    }

}

class ApiDoc {

    public static class RequestParam {
        private String name;
        private String type;
        private String required;
        private String description;

        public String getName() {
            return name;
        }

        public RequestParam setName(String name) {
            this.name = name;
            return this;
        }

        public String getType() {
            return type;
        }

        public RequestParam setType(String type) {
            this.type = type;
            return this;
        }

        public String getRequired() {
            return required;
        }

        public RequestParam setRequired(String required) {
            this.required = required;
            return this;
        }

        public String getDescription() {
            return description;
        }

        public RequestParam setDescription(String description) {
            this.description = description;
            return this;
        }

        @Override
        public String toString() {
            return "Request{" +
                    "name='" + name + '\'' +
                    ", type='" + type + '\'' +
                    ", required='" + required + '\'' +
                    ", description='" + description + '\'' +
                    '}';
        }
    }

    public static class ResponseParam {
        private String name;
        private String type;
        private String defaultOutput;
        private String description;

        public String getName() {
            return name;
        }

        public ResponseParam setName(String name) {
            this.name = name;
            return this;
        }

        public String getType() {
            return type;
        }

        public ResponseParam setType(String type) {
            this.type = type;
            return this;
        }

        public String getDefaultOutput() {
            return defaultOutput;
        }

        public ResponseParam setDefaultOutput(String defaultOutput) {
            this.defaultOutput = defaultOutput;
            return this;
        }

        public String getDescription() {
            return description;
        }

        public ResponseParam setDescription(String description) {
            this.description = description;
            return this;
        }

        @Override
        public String toString() {
            return "Response{" +
                    "name='" + name + '\'' +
                    ", type='" + type + '\'' +
                    ", description='" + description + '\'' +
                    '}';
        }
    }

    private String url;
    private String name;
    private String zhName;
    private List<RequestParam> request = new ArrayList<>();
    private List<ResponseParam> response = new ArrayList<>();

    public String getUrl() {
        return url;
    }

    public ApiDoc setUrl(String url) {
        this.url = url;
        return this;
    }

    public String getName() {
        return name;
    }

    public ApiDoc setName(String name) {
        this.name = name;
        return this;
    }

    public String getZhName() {
        return zhName;
    }

    public ApiDoc setZhName(String zhName) {
        this.zhName = zhName;
        return this;
    }

    public List<RequestParam> getRequest() {
        return request;
    }

    public ApiDoc setRequest(List<RequestParam> request) {
        this.request = request;
        return this;
    }

    public List<ResponseParam> getResponse() {
        return response;
    }

    public ApiDoc setResponse(List<ResponseParam> response) {
        this.response = response;
        return this;
    }

    @Override
    public String toString() {
        return "ApiDoc{" +
                "url='" + url + '\'' +
                ", name='" + name + '\'' +
                ", zhName='" + zhName + '\'' +
                ", request=" + request +
                ", response=" + response +
                '}';
    }
}