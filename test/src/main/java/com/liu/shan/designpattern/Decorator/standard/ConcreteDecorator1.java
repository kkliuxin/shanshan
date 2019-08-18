package com.liu.shan.designpattern.Decorator.standard;

/**
 * Created by BBF on 2016/12/2.
 */
public class ConcreteDecorator1 extends Decorator {

    public ConcreteDecorator1(Component component) {
        super(component);
    }
    public void wakeUp() {
        System.out.println("小明醒来了");
    }
    @Override
    public void operstion() {
        this.wakeUp();
        super.operstion();
    }
}
