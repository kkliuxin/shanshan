package com.liu.shan.leetcode;

public class 两数之和 {

    public static void main(String[] args) {

        int [] num = new int []{-3,5,6,-7,-23};
        int taget = 2;

        int[] result = getResult(num, taget);

        for (int i : result) {
            System.out.println(i);
        }


    }

    public static int [] getResult(int [] num, int taget) {
        int [] result = new int[2];
        int idx_a = 0 , indx_b = 0;
        boolean flag = false;
        if (null != num) {
           for(int i = 0; i < num.length - 1; i++) {
               result[0] = num[i];
               idx_a = i;
               int diff = taget - result[0];
               for (int j = i + 1; j < num.length; j++) {
                   if (num[j] == diff) {
                       result[1] = num[j];
                       flag = true;
                       indx_b = j;
                       break;
                   }
               }
               if (flag) {
                   break;
               }
           }
        }
        return flag ?  new int []{idx_a, indx_b} : null;
    }



}


