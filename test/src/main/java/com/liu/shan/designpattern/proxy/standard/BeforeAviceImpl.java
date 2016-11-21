package com.liu.shan.designpattern.proxy.standard;

/**
 * Created by BBF on 2016/11/21.
 */
public class BeforeAviceImpl extends IAvice {

    @Override
    public void exec() {
        System.out.println("我是前置通知，我被执行了");
    }
}
