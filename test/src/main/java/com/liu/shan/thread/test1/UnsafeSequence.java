package com.liu.shan.thread.test1;

/**
 * Created by BBF on 2016/12/5.
 */
public class UnsafeSequence {
    private static int value;

    public int getNext(){
        int temp = 100;
        System.out.println(Thread.currentThread().getName() + " temp " + --temp);
        return value++;
    }
}

class UnsafeSequneceTest{
    public static void main(String[] args) {

        int i = 0;
        while (i < 2){
            Thread unsafeSequenceThread = new Thread(new Runnable() {
                @Override
                public void run() {
                    UnsafeSequence unsafeSequence = new UnsafeSequence();
                    System.out.println(Thread.currentThread().getName() + " " + unsafeSequence.getNext());
                }
            });
            unsafeSequenceThread.start();
            i++;
        }


    }
}