package com.liu.shan.designpattern.factory;

/**
 * Created by BBF on 2016/11/14.
 */
public class HumanFactory extends AbstractHumanFactory {
    public <T extends Human> T createHuman(Class<T> C) {
        Human humma = null;
        try {
            humma = (Human) Class.forName(C.getName()).newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return (T)humma;
    }
}
