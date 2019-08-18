package com.liu.shan.designpattern.template;

/**
 * Created by BBF on 2016/11/16.
 */
public abstract class HummerModel {
    protected abstract void start();

    protected abstract void stop();

    protected abstract void alarm();

    protected abstract void engineBoom();

    protected final void run() {
        this.start();
        this.engineBoom();
        if (isAlarm()) {
            this.alarm();
        }
        this.stop();
    }

    protected boolean isAlarm() {
        return true;
    }
}
