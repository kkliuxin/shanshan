package com.liu.shan.designpattern.Decorator.standard;

/**
 * Created by BBF on 2016/12/2.
 */
public class ConcreateComponent implements Component {

    private String name;

    public ConcreateComponent(String name) {
        this.name = name;
    }
    @Override
    public void operstion() {
        System.out.println( this.name + "早上吃了两个鸡蛋");
    }
}
