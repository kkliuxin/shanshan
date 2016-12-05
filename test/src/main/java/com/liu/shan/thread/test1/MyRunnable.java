package com.liu.shan.thread.test1;

import java.util.Date;
import java.util.Objects;

/**
 * Created by BBF on 2016/12/5.
 */
public class MyRunnable implements Runnable {
    @Override
    public void run() {
        methodOne();
    }

    public  void methodOne () {
        int localVariabel = 10;

        synchronized (Date.class) {
            while (MyShareObject.shareInstance.long1 > 0) {
            Thread.yield();
                localVariabel --;
                System.out.println(Thread.currentThread().getName() + " 1 MyShareObject.shareInstance.long1 " +  MyShareObject.shareInstance.long1--);
                methodTwo();
            }
        }


    }

    public void methodTwo () {
        Integer localvariable1 = new Integer(99);
        System.out.println(Thread.currentThread().getName() + " 2 MyShareObject.shareInstance.long1 " +  MyShareObject.shareInstance.long1--);
    }
}

class MyShareObject {

    public static final MyShareObject shareInstance = new MyShareObject();

    public Integer int1 = new Integer(2);

    public Integer int2 = new Integer(3);

    public long long1 = 20;

    public  long long2 = 234234;
}

class MyRunnableTest {
    public static void main(String[] args) {
        MyRunnable myRunnable = new MyRunnable();
        int i = 0;
        Thread thread = null;
        while (i < 10) {
            thread = new Thread(myRunnable);
            thread.start();
            i++;
        }
        try {
            thread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName() + MyShareObject.shareInstance.long1);
    }
}