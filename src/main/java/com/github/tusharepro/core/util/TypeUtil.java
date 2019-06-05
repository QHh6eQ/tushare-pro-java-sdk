package com.github.tusharepro.core.util;

//import com.sun.deploy.util.ReflectionUtil;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.List;

public final class TypeUtil {

    // 参考jackson的TypeReference实现
    // http://gafter.blogspot.com/2006/12/super-type-tokens.html
    public static Class getActualTypeArgumentClass(Class<?> c) throws ClassNotFoundException {
        Type superClass = c.getGenericSuperclass();
        if (superClass instanceof Class<?>) { // sanity check, should never happen
            throw new IllegalArgumentException("Internal error: Request constructed without actual type information");
        }

        Type beanType = ((ParameterizedType) superClass).getActualTypeArguments()[0];

        // ReflectionUtil.getClass 也是类似做法
        return Class.forName(beanType.getTypeName());
    }

    /**
     * 通过目标的父class寻找目标class
     * @param targetSupperClass 目标的父class
     * @param currentClass 当前class
     * @param classList class列表
     * @param targetClassList 目标class
     */
    public static void findClasses(
            Class targetSupperClass,
            Class currentClass, List<Class> classList, List<Class> targetClassList) {
        classList.add(currentClass);
        // 寻找接口
        for (Class interfaceClass : currentClass.getInterfaces()) {
            if (interfaceClass.equals(targetSupperClass)) targetClassList.add(currentClass);
            findClasses(targetSupperClass, interfaceClass, classList, targetClassList);
        }

        // 寻找父类
        Class superClass = currentClass.getSuperclass();
        if (superClass == null) return;
        findClasses(targetSupperClass, superClass, classList, targetClassList);
    }

}
