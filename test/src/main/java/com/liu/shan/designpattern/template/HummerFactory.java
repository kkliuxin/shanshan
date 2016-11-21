package com.liu.shan.designpattern.template;

/**
 * Created by BBF on 2016/11/16.
 */
public class HummerFactory extends AbstractFactory {
    public <T extends HummerModel> T createHummer(Class<T> C) {
        HummerModel hummerModel = null;
        try {
            hummerModel = (HummerModel) Class.forName(C.getName()).newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return (T)hummerModel;
    }
}
