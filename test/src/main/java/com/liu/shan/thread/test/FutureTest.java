package com.liu.shan.thread.test;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class FutureTest {

    public static void main(String[] args) throws Exception {

//        test2();
        test3();
    }

    public static void test1 () {
        CompletableFuture<Integer> future = CompletableFuture.supplyAsync(() -> {
            return 10;
        });
        future.thenAccept(System.out::println);
    }

    public static void test2() throws ExecutionException, InterruptedException {
        CompletableFuture<Integer> future = CompletableFuture.supplyAsync(() -> {
            return 10;
        });
        System.out.println(future.thenAcceptBoth(CompletableFuture.supplyAsync(() -> {
            return 20;
        }),(x,y) -> System.out.println(x+y)).get());

    }

    public static void test3() throws ExecutionException, InterruptedException {
        CompletableFuture<Integer> future = CompletableFuture.supplyAsync(() -> {
            return 10;
        });
        System.out.println(future.thenCompose(i -> CompletableFuture.supplyAsync(() -> { return i+1;})).get());
    }


}
