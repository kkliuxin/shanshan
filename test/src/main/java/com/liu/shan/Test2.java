package com.liu.shan;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

/**
 * Created by liuxin on 2017/4/8.
 */
public class Test2 {


    public static void main(String[] args) {


        System.out.println(1/3);
        System.out.println(9/3 == 9/3.0);
    }

}


class StringReverse {

    public void swap(char[] arr, int begin, int end) {
        while(begin < end) {
            char temp = arr[begin];
            arr[begin] = arr[end];
            arr[end] = temp;
            begin++;
            end--;
        }
    }
    //I love java
    public String swapWords(String str) {
        char[] arr = str.toCharArray();
        swap(arr, 0, arr.length - 1);
        int begin = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] == ' ') {
                swap(arr, begin, i - 1);
                begin = i + 1;
            }
        }
        return new String(arr);
    }

    public static void main(String[] args) {
        String str = "I love java";
        System.out.println(new StringReverse().swapWords(str));

        int a = 345;
        int b = 999999998;
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("a :" + a + " b:" + b);

        a = a^b;
        b = a^b;
        a = a^b;
        System.out.println("a :" + a + " b:" + b);
    }

}