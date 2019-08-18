package com.liu.shan.leetcode;

import java.util.Arrays;
import java.util.stream.Collectors;

public class 字符串中单词的翻转 {

    public static void main(String[] args) {


        String source = "I am teacher";
        System.out.println("true = " + turn(source));
    }

    public static String turn(String source) {
        String[] split = source.split(" ");
        String collect = Arrays.stream(split).map(one -> new StringBuilder(one).reverse()).collect(Collectors.joining(" "));
        System.out.println("collect = " + collect);
        return new StringBuilder(collect).reverse().toString();
    }
}
