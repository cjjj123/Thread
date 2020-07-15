package com.cjj.thread.demo11;

/**
 * xiangjiaoyun
 * author:chenjianjie
 * Date:2020/7/15
 * Time:11:24
 */
public class PriorityThread implements Runnable {
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + "------" + Thread.currentThread().getPriority());
    }
}
