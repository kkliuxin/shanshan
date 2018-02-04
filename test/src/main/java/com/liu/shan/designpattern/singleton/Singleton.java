package com.liu.shan.designpattern.singleton;

/**
 * Created by BBF on 2016/11/14.
 */
public class Singleton {
    //饿汉模式
    private static volatile Singleton singleton ;
    private Long cout = 0l;
    private Singleton(){
    }

    public static Singleton getSingleton() {
        if(null == singleton) {
            synchronized (Singleton.class) {
                if(null == singleton) {
                    singleton = new Singleton();
                }
            }
        }
        return singleton;
    }


    public Long getCout() {
        return cout;
    }

    public void setCout(Long cout) {
        this.cout = cout;
    }
}

class SingletonTest {
    public static void main(String[] args) {
        Singleton singleton = Singleton.getSingleton();
        singleton.setCout(3l);
        System.out.println(singleton.getCout());
        Singleton singleton1 = Singleton.getSingleton();
        System.out.println(singleton1.getCout());

    }
}