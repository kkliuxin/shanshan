package com.liu.shan.designpattern.factory;

/**
 * Created by BBF on 2016/11/14.
 */
public class YellowHuman implements Human {
    public void getColor() {
        System.out.println("黄种人说皮肤是黄颜色的");
    }

    public void talk() {
        System.out.println("黄种人说的话是双字节");
    }
}
