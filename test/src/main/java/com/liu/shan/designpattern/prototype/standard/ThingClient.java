package com.liu.shan.designpattern.prototype.standard;

/**
 * Created by BBF on 2016/11/22.
 */
public class ThingClient {

    public static void main(String[] args) {
        int max = 5;
        int i = 0;
        Thing thing = new Thing("异类");
        while (i < max){
            Thing clone = thing.clone();
            clone.setValue("shanshan " + i);
            clone.doSometing();
            clone.setName("异类 " + i);
            System.out.println("name \t" + clone.getName());
            System.out.println(clone.getVaule());
            i++;
        }
    }
}
