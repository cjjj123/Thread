package com.cjj.thread.demo03;

/**
 * xiangjiaoyun
 * author:chenjianjie
 * Date:2020/7/14
 * Time:17:36
 */
public class ThreadMain {
    public static void main(String[] args) {
        TestThread3 testThread3 = new TestThread3();
        new Thread(testThread3, "小明").start();
        new Thread(testThread3, "小红").start();
        new Thread(testThread3, "小黄").start();
    }
}
