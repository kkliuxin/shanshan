package com.liu.shan;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;

/**
 * Created by BBF on 2016/11/17.
 */
public class test {


    public static void main(String[] args) {
        String a1 = null;
        String a2 = "test";

        System.out.println(Objects.equals(a2, a1));

        BigDecimal b1 = new BigDecimal(2.2f);
        BigDecimal b2 = BigDecimal.valueOf(2.2);

        System.out.println("b1 = " + b1);
        System.out.println("b2 = " + b2);

        Set<Integer> set1 = new HashSet<Integer>();
        set1.add(32);


    }

}
