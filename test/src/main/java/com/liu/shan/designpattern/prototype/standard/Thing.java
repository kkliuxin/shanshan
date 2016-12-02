package com.liu.shan.designpattern.prototype.standard;

import java.util.ArrayList;

/**
 * Created by BBF on 2016/11/22.
 */
public class Thing implements Cloneable {

    private ArrayList<String> arrayList = new ArrayList<>();

    private String name = "";

    public Thing() {
        System.out.println("ting 构造函数被执行");
    }

    public Thing(String name) {
        this.name = name;
    }

    public void doSometing(){
        System.out.println("嘎嘎嘎嘎");
    }
    @Override
    protected Thing clone(){
        Thing thing = null;
        try {
            thing = (Thing) super.clone();
            thing.arrayList = (ArrayList<String>) arrayList.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return thing;
    }

    public void setValue(String value) {
        this.arrayList.add(value);
    }

    public ArrayList<String> getVaule() {
        return this.arrayList;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
