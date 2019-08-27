/*
 */
package com.liu.shan.collection;

import java.util.ArrayList;

import org.apache.activemq.util.StopWatch;

/**
 * <p>TODO
 * </p>
 *
 * @author shanwang
 * @date 2019/8/25 9:36 下午
 **/
public class EnsureCapacityTest {

    public static void main(String[] args) {
        ArrayList<Object> list = new ArrayList<Object>();
        final int N = 10000000;
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < N; i++) {
            list.add(i);
        }
        long endTime = System.currentTimeMillis();
        System.out.println("使用ensureCapacity方法前："+(endTime - startTime));

        list = new ArrayList<Object>();
        long startTime1 = System.currentTimeMillis();
        list.ensureCapacity(N);
        for (int i = 0; i < N; i++) {
            list.add(i);
        }
        long endTime1 = System.currentTimeMillis();
        System.out.println("使用ensureCapacity方法后："+(endTime1 - startTime1));


        list = new ArrayList<>(N);
        long startTime2 = System.currentTimeMillis();
//        StopWatch stopWatch = new StopWatch( );
        for (int i = 0; i < N; i++) {
            list.add(i);
        }
        long endTime2 = System.currentTimeMillis();
        System.out.println("初始化容量方法后： " + (endTime2 - startTime2));
//        System.out.println("stopWatch = " + stopWatch.stop());
    }
}
