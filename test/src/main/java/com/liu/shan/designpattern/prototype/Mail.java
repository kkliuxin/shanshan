package com.liu.shan.designpattern.prototype;

/**
 * Created by BBF on 2016/11/22.
 */
public class Mail implements Cloneable{

    private String receiver;

    private String subject;

    private String appellation;

    private String context;

    private String tail;

    public Mail(AdvTemplate advTemplate) {
        this.context = advTemplate.getAdvContext();
        this.subject = advTemplate.getAdvSubject();
    }

    @Override
    protected Mail clone() throws CloneNotSupportedException {
        return (Mail) super.clone();
    }

    public String getReceiver() {
        return receiver;
    }

    public void setReceiver(String receiver) {
        this.receiver = receiver;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getAppellation() {
        return appellation;
    }

    public void setAppellation(String appellation) {
        this.appellation = appellation;
    }

    public String getContext() {
        return context;
    }

    public void setContext(String context) {
        this.context = context;
    }

    public String getTail() {
        return tail;
    }

    public void setTail(String tail) {
        this.tail = tail;
    }
}
