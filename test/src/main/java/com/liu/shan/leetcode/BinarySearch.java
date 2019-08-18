package com.liu.shan.leetcode;

public class BinarySearch {

    public static void main(String[] args) {
        int [] num = {1,2,5,6,7,8,23,64};
        int key = 1;
        System.out.println(binarySearch(num, key));

    }


    public static int binarySearch(int [] num, int key) {
        int l = 0, r = num.length -1;
        while (l <= r) {
            int m = l + (r - l) / 2;
            if(num[m] == key) {
                return m;
            } else if (num[m] > key) {
                r = m -1;
            } else if (num[m] < key) {
                l = m + 1;
            }
        }

        return -1;
    }
}
