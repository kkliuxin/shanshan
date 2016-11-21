package com.liu.shan.designpattern.template;

/**
 * Created by BBF on 2016/11/16.
 */
public class HummerH2Model extends HummerModel {

    public void start() {
        System.out.println("悍马2跑起来");
    }

    public void stop() {
        System.out.println("悍马2停止");
    }

    public void alarm() {
        System.out.println("悍马2鸣笛");
    }

    public void engineBoom() {
        System.out.println("悍马1的引擎声音是呜呜呜呜呜");
    }

    @Override
    protected boolean isAlarm() {
        return false;
    }
}
