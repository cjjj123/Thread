package com.cjj.thread.demo01;

/**
 * xiangjiaoyun
 * author:chenjianjie
 * Date:2020/7/14
 * Time:15:05
 */
public class TestThread1 extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 20; i++) {
            System.out.println("Thread" + i);
        }
    }

    public static void main(String[] args) {

        TestThread1 testThread1 = new TestThread1();
        testThread1.start();

        for (int i = 0; i < 2000; i++) {
            System.out.println("main" + i);
        }
    }
}
