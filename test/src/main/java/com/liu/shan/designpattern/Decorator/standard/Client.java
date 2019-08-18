package com.liu.shan.designpattern.Decorator.standard;

/**
 * Created by BBF on 2016/12/2.
 */
public class Client {

    public static void main(String[] args) {
        Component xiaoming = new ConcreateComponent("小明");
        Component xiaosan = new ConcreateComponent("小三");
        xiaoming = new ConcreteDecorator1(xiaoming);
        xiaoming = new ConcreteDecorator2(xiaoming);
        xiaoming.operstion();
    }
}
