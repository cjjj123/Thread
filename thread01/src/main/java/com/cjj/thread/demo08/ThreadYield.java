package com.cjj.thread.demo08;

/**
 * xiangjiaoyun
 * author:chenjianjie
 * Date:2020/7/15
 * Time:0:24
 */
public class ThreadYield implements Runnable {
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + "线程开始执行");
        System.out.println(Thread.currentThread().getName() + "线程结束执行");
    }
}
