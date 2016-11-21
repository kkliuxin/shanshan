package com.liu.shan.designpattern.singleton;

/**
 * Created by BBF on 2016/11/14.
 */
public class StaticSingleton {
    private static class SingletonHolder{
        private static final StaticSingleton INSTANCE = new StaticSingleton();
    }

    private StaticSingleton(){}

    public static final StaticSingleton getInstance(){
        return SingletonHolder.INSTANCE;
    }
}

class StaticSingletonTest{
    public static void main(String[] args) {
        StaticSingleton staticSingleton = StaticSingleton.getInstance();
        StaticSingleton staticSingleton1 = StaticSingleton.getInstance();
        System.out.println(staticSingleton == staticSingleton1);
    }

}
