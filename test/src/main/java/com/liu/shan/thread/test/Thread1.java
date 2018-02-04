package com.liu.shan.thread.test;

/**
 * Created by liuxin on 16/12/4.
 */
public class Thread1 implements Runnable {

    volatile int cout = 0;

    @Override
    public  void run() {
        while (cout <= 99){
//            synchronized (this){
//                System.out.println(Thread.currentThread().getName() + " 刘鑫爱珊珊 " + cout);
//            }
            System.out.println(Thread.currentThread().getName() + Thread.currentThread().getId() + " love shan shan " + cout++);
            System.out.println("\n");
            Thread.yield();
        }

    }
}

class Trhead1Test {

    public static void main(String[] args) {
        Thread1 t = new Thread1();
        Thread1 t2 = new Thread1();

        Thread thread = new Thread(t);
        thread.setName("liux");
        Thread thread1 = new Thread(t);
        thread1.setName("shanshan");
        thread.start();
        thread1.start();
        try {
            thread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println( " result : " + t.cout);
    }
}
