package com.liu.shan.designpattern.proxy.standard;

import java.lang.reflect.InvocationHandler;

/**
 * Created by BBF on 2016/11/21.
 */
public class Client {

    protected String name;
    public static void main(String[] args) {
        Subject subject = new RealSubject();
        InvocationHandler handler = new MyInvocationHandler(subject);
//        Subject proxy = (Subject) Proxy.newProxyInstance(subject.getClass().getClassLoader(),subject.getClass().getInterfaces(),handler);
//        proxy.doSomething();
//        Subject proxy = DynamicProxy.newProxyInstance(handler.getClass().getClassLoader(),subject.getClass().getInterfaces(),handler);
//        proxy.doSomething();

        Subject proxy = DynamicProxyExtends.newProxyInstance(subject);
        proxy.doSomething();
    }
}
