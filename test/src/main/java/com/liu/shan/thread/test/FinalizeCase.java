package com.liu.shan.thread.test;

/**
 * Created by liuxin on 2017/7/12.
 */
public class FinalizeCase {

    private static Block holder = null;

    public static void main(String[] args) throws Exception {
        holder = new Block();
        holder = null;
        System.gc();
        //System.in.read();
    }

    static class Block {
        byte[] _200M = new byte[200*1024*1024];
    }

}
