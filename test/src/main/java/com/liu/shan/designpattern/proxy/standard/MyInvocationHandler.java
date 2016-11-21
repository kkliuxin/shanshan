package com.liu.shan.designpattern.proxy.standard;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * Created by BBF on 2016/11/21.
 */
public class MyInvocationHandler implements InvocationHandler{

    //被代理的对象
    private Subject subject = null;

    public MyInvocationHandler(Subject subject) {
        this.subject = subject;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Object result = method.invoke(this.subject,args);
        return result;
    }
}
