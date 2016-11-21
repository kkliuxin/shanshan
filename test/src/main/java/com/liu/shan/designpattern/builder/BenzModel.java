package com.liu.shan.designpattern.builder;

/**
 * Created by BBF on 2016/11/17.
 */
public class BenzModel extends CardModel {
    @Override
    protected void start() {
        System.out.println("奔驰车开始启动");
    }

    @Override
    protected void stop() {
        System.out.println("奔驰车停止");
    }

    @Override
    protected void alarm() {
        System.out.println("奔驰车的喇叭是嘟嘟嘟嘟。。。。。");
    }

    @Override
    protected void engineBoom() {
        System.out.println("奔驰车的引擎声音是嘎嘎嘎嘎。。。。。");
    }
}
