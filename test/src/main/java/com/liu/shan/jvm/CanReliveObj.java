package com.liu.shan.jvm;

public class CanReliveObj {

    public static CanReliveObj obj;

    @Override
    protected void finalize() throws Throwable {
        super.finalize();
        System.out.println("CanReliveObj finalize called");
        obj = this;
    }

    @Override
    public String toString() {
        return "I am CanReliveObj";
    }


    public static void main(String[] args) throws InterruptedException {
//        obj = new CanReliveObj();
//        obj = null;   //可复活
//        System.gc();
//        Thread.sleep(1000);
//        if (obj == null) {
//            System.out.println("obj 是 null");
//        } else {
//            System.out.println("obj 可用");
//        }
//        System.out.println("第二次gc");
//        obj = null;    //不可复活
//        System.gc();
//        Thread.sleep(1000);
//        if (obj == null) {
//            System.out.println("obj 是 null");
//        } else {
//            System.out.println("obj 可用");
//        }
//        System.gc();
//
//        if (obj == null) {
//            System.out.println("obj 是 null");
//        } else {
//            System.out.println("obj 可用");
//        }

        byte[] b=null;
        for(int i=0;i<10;i++)
            b=new byte[1*1024*1024];

    }


}
