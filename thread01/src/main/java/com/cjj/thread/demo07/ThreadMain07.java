package com.cjj.thread.demo07;

/**
 * 线程休眠
 * xiangjiaoyun
 * author:chenjianjie
 * Date:2020/7/14
 * Time:23:18
 */
public class ThreadMain07 {
    public static void main(String[] args) {
        ThreadSleep threadSleep = new ThreadSleep();

        new Thread(threadSleep, "小明").start();
        new Thread(threadSleep, "小红").start();
        new Thread(threadSleep, "小黄").start();
    }
}
