package com.liu.shan.designpattern.template;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by BBF on 2016/11/16.
 */
public class Client {
    public static void main(String[] args) throws IOException {
        AbstractFactory factory = new HummerFactory();
        HummerH1Model h1 = factory.createHummer(new HummerH1Model().getClass());
        HummerH2Model h2 = factory.createHummer(new HummerH2Model().getClass());
        System.out.println("H1型号的悍马是否需要喇叭声音？0-不需要1-需要");
        String type = (new BufferedReader(new InputStreamReader(System.in))).readLine();
        if(type.equals("0")){
            h1.setAlarmFalg(false);
        }
        System.out.println("H1悍马开始启动");
        h1.run();
        System.out.println("H2悍马开始启动");
        h2.run();
    }
}
