package com.liu.shan;

import java.util.Random;

/**
 * Created by BBF on 2016/11/17.
 */
public class test {
    static final int MAX = 100000;
    static final String[] arr = new String[MAX];

    public static void main(String[] args) throws Exception {
        String str1 = new String("SEU") + new String("Calvin");
        System.out.println(str1.intern() == str1);
        System.out.println(str1 == "SEUCalvin");
    }


}
