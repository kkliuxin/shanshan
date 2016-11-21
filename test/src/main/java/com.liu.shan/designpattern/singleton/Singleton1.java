package com.liu.shan.designpattern.singleton;

/**
 * Created by BBF on 2016/11/14.
 */
public class Singleton1 {
    //懒汉模式
    //调用的时候创建对象，存在线程安全问题
    private static Singleton1 singleton1 = null;
    private  Singleton1(){

    }

    public static synchronized Singleton1 getInstence() {
        if(null == singleton1) {
            singleton1 = new Singleton1();
        }
        return singleton1;
    }

}
