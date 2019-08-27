/*
 */
package com.liu.shan.collection;

import java.util.HashSet;
import java.util.Set;

/**
 * <p>TODO
 * </p>
 *
 * @author shanwang
 * @date 2019/8/26 12:37 上午
 **/
public class SetTest {
    public static void main(String[] args) {
        Set set1 = new HashSet<Integer>();
        set1.add(32);
        set1.add(323);
        set1.add(32);

        for (int i = set1.size() - 1; i >= 0; i--) {
        }
        for (Object o : set1) {
            System.out.println("o = " + o);
        }
    }
}
