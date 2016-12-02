package com.liu.shan.designpattern.Decorator.standard;

/**
 * Created by BBF on 2016/12/2.
 */
public class ConcreteDecorator2 extends Decorator {

    public ConcreteDecorator2(Component component) {
        super(component);
    }

    public void work() {
        System.out.println("小明去上班了");
    }
    @Override
    public void operstion() {
        this.work();
        super.operstion();
    }
}
