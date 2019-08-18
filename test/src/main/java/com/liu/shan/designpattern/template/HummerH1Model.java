package com.liu.shan.designpattern.template;

/**
 * Created by BBF on 2016/11/16.
 */
public class HummerH1Model extends HummerModel {

    private boolean isAlarmFalg = true;
    public void start() {
        System.out.println("悍马1跑起来");
    }

    public void stop() {
        System.out.println("悍马1停止");
    }

    public void alarm() {
        System.out.println("悍马1鸣笛");
    }

    public void engineBoom() {
        System.out.println("悍马1的引擎声音是滴滴滴滴滴大大大");
    }

    public boolean isAlarm() {
        return this.isAlarmFalg();
    }

    public boolean isAlarmFalg() {
        return isAlarmFalg;
    }

    public void setAlarmFalg(boolean alarmFalg) {
        isAlarmFalg = alarmFalg;
    }
}
