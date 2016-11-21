package com.liu.shan.designpattern.factory;

/**
 * Created by BBF on 2016/11/14.
 */

public abstract class AbstractHumanFactory {
    public abstract <T extends Human> T createHuman(Class<T> C);
}
