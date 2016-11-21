package com.liu.shan.designpattern.proxy.standard;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
 * Created by BBF on 2016/11/21.
 */
public class DynamicProxy<T> {
    public static<T> T newProxyInstance(ClassLoader loader, Class<?>[] instances,InvocationHandler handler) {
        if(true){
            new BeforeAviceImpl().exec();
        }
        return (T) Proxy.newProxyInstance(loader,instances,handler);
    }
}
