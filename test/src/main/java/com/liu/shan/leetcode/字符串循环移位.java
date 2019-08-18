package com.liu.shan.leetcode;

public class 字符串循环移位 {
    public static void main(String[] args) {

        String source = "AABBDD11";
        String key = "11AA";
        System.out.println(isContain(source, key));
        System.out.println("===========第二种============");
        System.out.println(isContain1(source, key));
    }

    public static boolean isContain(String source, String key) {
        if (source.contains(key)) {
            return true;
        }
        int size = source.length();
        for (int index = 0; index < size; index++) {
            char[] chars = source.toCharArray();
            char firstChar = chars[0];

            for (int i = 0; i < chars.length - 1; i++) {
                chars[i] = chars[i + 1];
                if (i == chars.length - 2) {
                    chars[i + 1] = firstChar;
                }
            }
            source = String.copyValueOf(chars);
            System.out.println("第 " + (index + 1) + " 次移位, source :" + source);
            if (source.contains(key)) {
                return true;
            }
        }
        return false;
    }

    public static boolean isContain1(String source, String key) {
        if (source.contains(key)) {
            return true;
        }
        int size = source.length();
        for (int index = 0; index < size; index++) {
            String left = source.substring(0, size -1 - index);
            String right = source.substring(size -1 - index);
            String newSource = right + left;
            System.out.println("第 " + (index) + " 次移位, source :" + newSource);
            if(newSource.contains(key)) {
                return true;
            }
        }
        return false;
    }
}
