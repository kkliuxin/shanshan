package com.liu.shan.designpattern.builder;

/**
 * Created by BBF on 2016/11/17.
 */
public class BMWModel extends CardModel {
    @Override
    protected void start() {
        System.out.println("宝马车开始启动");
    }

    @Override
    protected void stop() {
        System.out.println("宝马车停止");

    }

    @Override
    protected void alarm() {
        System.out.println("宝马车的喇叭是滴滴滴滴滴");

    }

    @Override
    protected void engineBoom() {
        System.out.println("宝马车的引擎是卡塔卡塔卡塔");
    }
}
