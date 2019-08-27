/*
 */
package com.liu.shan.leetcode;

/**
 * <p>TODO
 * </p>
 *
 * @author shanwang
 * @date 2019-08-18 13:31
 **/
public class 数字反转 {

    public static void main(String[] args) {
        int num = 1223221;
        int reverseNum = reverseNum(num);
        System.out.println("reverseNum = " + reverseNum);
        System.out.println("isPalindrome(num) = " + isPalindrome(num));
    }

    public static int reverseNum(int num) {


        int r = 0;
        while (num > 0) {
            r = num % 10 + r * 10;
            num /= 10;
        }
        return r;
    }

    public static boolean isPalindrome(int num) {
        if(num == 0) {
            return false;
        }
        if(num % 10 == 0 || num < 0) {
            return false;
        }
        int r = 0;
        while (num > r) {
            r = num % 10 + r * 10;
            num /= 10;
        }
        return r == num || r/10 == num;
    }

}
