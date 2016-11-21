package com.liu.shan.designpattern.factory;

/**
 * Created by BBF on 2016/11/14.
 */
public class WhiteHuman implements Human {
    public void getColor() {
        System.out.println("白种人的皮肤是白颜色的");

    }

    public void talk() {
        System.out.println("白种人说的话一般是单字节的");
    }
}
