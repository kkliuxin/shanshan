/*
 * Copyright (C) 2019 VIPKID, Inc. All Rights Reserved.
 */
package com.liu.shan.algorithm;

/**
 * <p>TODO
 * </p>
 *
 * @author liuxin
 * @date 2019-02-23 23:12
 **/
public class Sort {

    public static void main(String[] args) {
        int [] arr = {434,3,45,63,4,2,5,75};
        insertSort(arr);
        for (int i : arr) {
            System.out.print(i + ",");
        }
    }
    public static void insertSort(int [] arr) {
        int i,j;
        for (i = 0; i < arr.length; i++) {
            int tmp = arr[i];
            for (j = i; j > 0 && arr[j - 1] > tmp; j--) {
                arr[j] = arr[j - 1];
            }
            arr[j] = tmp;
        }

    }
}
