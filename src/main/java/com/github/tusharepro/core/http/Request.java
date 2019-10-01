package com.github.tusharepro.core.http;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.github.tusharepro.core.TusharePro;
import com.github.tusharepro.core.bean.BaseBean;
import com.github.tusharepro.core.common.KeyValue;
import com.github.tusharepro.core.util.TypeUtil;
import lombok.Data;

import java.util.*;
import java.util.stream.Collectors;

@Data
public abstract class Request<T extends BaseBean> {

    private String token;
    private String api_name;
    private String fields = "";
    private Map<String, Object> params = new HashMap<>();

    @JsonIgnore public final TusharePro tusharePro;
    @JsonIgnore public final Class beanInterfaceClass;

    public Request(TusharePro tusharePro) {
        token = Optional.ofNullable(tusharePro).orElse(TusharePro.getGlobal()).token;
        this.tusharePro = Optional.ofNullable(tusharePro).orElse(TusharePro.getGlobal());

        try {
            final Class beanClass = TypeUtil.getActualTypeArgumentClass(getClass());

            final List<Class> classList = new ArrayList<>();
            final List<Class> targetClassList = new ArrayList<>();

            TypeUtil.findClasses(BaseBean.class, beanClass, classList, targetClassList);

            // 出现多个implements或没有
            if (targetClassList.size() != 1) throw new RuntimeException("implements BaseBean ERROR");

            beanInterfaceClass = targetClassList.get(0);

            api_name = (String) beanInterfaceClass.getField("API_NAME").get(null);
        }
        catch (ClassNotFoundException | NoSuchFieldException | IllegalAccessException e) {
            throw new RuntimeException();
        }
    }

    public Request() {
        this(null);
    }

    public Request<T> allFields() {
        return fields(Arrays.stream(
                Arrays.stream(beanInterfaceClass.getClasses())
                        .filter(x -> x.getSimpleName().equals("Fields"))
                        .findAny()
                        .orElse(Object.class)
                        .getFields()).map(x -> {
//            System.out.println(x);
            try {
                return (String) x.get(null);
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
            return "";
        }).collect(Collectors.toList()));
    }

    /**
     * 默认字段
     */
    public Request<T> defaultFields() {
        return fields("");
    }

    /**
     * 单个字段叠加
     */
    public Request<T> field(String field) {
        return fields(field);
    }

    /**
     * 多个字段叠加
     */
    public Request<T> fields(String fields) {
        if (fields == null) return this;
        this.fields += ("".equals(this.fields) ? "" : "," + fields);
        return this;
    }

    /**
     * 多个字段(列表)叠加
     */
    public Request<T> fields(List<String> fields) {
        this.fields += (("".equals(this.fields) ? "" : ",") + fields.stream().reduce((a, b) -> a += ("," + b)).orElse(""));
        return this;
    }

    public Request<T> param(String key, Object value) {
        getParams().put(key, value);
        return this;
    }

    public Request<T> param(KeyValue<String, ?> keyValue) {
        getParams().put(keyValue.key, keyValue.value);
        return this;
    }

}