package com.liu.shan.algorithm;

import org.apache.activemq.util.StopWatch;

public class Fibonacci {

    public static void main(String[] args) {
        StopWatch stopWatch = new StopWatch();
        long result = fib1(30);
        System.out.println("result = " + result);
        long stop = stopWatch.stop();
        System.out.println("stop = " + stop);

        stopWatch.restart();
        result = fib2(90);
        System.out.printf("st√√op = " + stopWatch.stop());
        System.out.println("result = " + result);

        //language=JSON
        String a = "{\n" +
                "  \"json\": \"haoyong\",\n" +
                "  \"age\": 23\n" +
                "}";
        //language=SQL
        String sql = "select * from teacher ";


    }

    static long fib1(long n) {
        if (n <= 2) {
            return 1L;
        }
        return fib1(n - 1) + fib1(n - 2);
    }

    static long fib2(long n) {
        long x = 0, y = 1;
        for (int j = 1; j < n; j++) {
            y = x + y;
            x = y - x;
        }



        return y;
    }

}
