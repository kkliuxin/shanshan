package com.liu.shan.designpattern.Decorator.standard;

/**
 * Created by BBF on 2016/12/2.
 */
public abstract class Decorator implements Component {

    private Component component;

    public Decorator(Component component) {
        this.component = component;
    }

    @Override
    public void operstion() {
        this.component.operstion();
    }
}
