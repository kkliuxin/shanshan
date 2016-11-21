package com.liu.shan.designpattern.factory;

/**
 * Created by BBF on 2016/11/14.
 */
public class BalckHuman implements Human {
    public void getColor() {
        System.out.println("黑种人的皮肤是黑色的！");
    }

    public void talk() {
        System.out.println("黑人说的的话听不懂");
    }
}
