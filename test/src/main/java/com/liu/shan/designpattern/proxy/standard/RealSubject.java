package com.liu.shan.designpattern.proxy.standard;

/**
 * Created by BBF on 2016/11/21.
 */
public class RealSubject implements Subject {

    @Override
    public void doSomething() {
        System.out.println("我今天吃了好多的辣子，好辣好辣");
    }
}
