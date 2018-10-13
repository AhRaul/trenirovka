package com.company;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
//    static class MyRunnableClass implements Runnable {
//        @Override
//        public void run() {
//            for (int i = 0; i < 10; i++) {
//                try {
//                    Thread.sleep(100);
//                    System.out.println("new thread: " + i);
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }
//            }
//        }
//    }
    public static void method1() {
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        executorService.execute(new Runnable() {
            public void run() {
                for (int i = 0; i < 100; i++) {
//                    try {
//                        Thread.sleep(100);
                        System.out.println("new thread: " + i);
//                    } catch (InterruptedException e) {
//                        e.printStackTrace();
//                    }
                }
            }
        });
        executorService.shutdown();
    }

    public static void main(String[] args) {
        method1();
        method1();
        method1();
    }
}