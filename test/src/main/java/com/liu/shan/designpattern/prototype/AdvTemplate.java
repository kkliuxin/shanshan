package com.liu.shan.designpattern.prototype;

/**
 * Created by BBF on 2016/11/22.
 */
public class AdvTemplate {
    private String advSubject = "xx银行国庆信用卡抽奖活动";

    private String advContext = "国庆抽奖通知：只要抽奖送100万大礼";

    public String getAdvSubject() {
        return advSubject;
    }

    public void setAdvSubject(String advSubject) {
        this.advSubject = advSubject;
    }

    public String getAdvContext() {
        return advContext;
    }

    public void setAdvContext(String advContext) {
        this.advContext = advContext;
    }
}
