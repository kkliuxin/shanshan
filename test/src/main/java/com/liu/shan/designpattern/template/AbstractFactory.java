package com.liu.shan.designpattern.template;

/**
 * Created by BBF on 2016/11/16.
 */
public abstract class AbstractFactory {
    public abstract  <T extends HummerModel> T createHummer(Class<T> C);
}
