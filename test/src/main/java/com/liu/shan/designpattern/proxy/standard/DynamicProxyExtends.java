package com.liu.shan.designpattern.proxy.standard;

import java.lang.reflect.InvocationHandler;

/**
 * Created by BBF on 2016/11/21.
 */
public class DynamicProxyExtends<T> extends DynamicProxy<T> {

    public static <T> T newProxyInstance(Object obj) {
        //获取Classloader
        ClassLoader classLoader = obj.getClass().getClassLoader();
        Class<?>[] interfaces = obj.getClass().getInterfaces();
        //获取invocationHandler
        InvocationHandler handler = new MyInvocationHandler(obj);
        return newProxyInstance(classLoader,interfaces,handler);
    }
}
