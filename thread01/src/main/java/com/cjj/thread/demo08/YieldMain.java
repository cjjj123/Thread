package com.cjj.thread.demo08;

/**
 * 线程礼让
 * xiangjiaoyun
 * author:chenjianjie
 * Date:2020/7/15
 * Time:0:25
 */
public class YieldMain {
    public static void main(String[] args) {
        ThreadYield threadYield = new ThreadYield();
        new Thread(threadYield, "线程A").start();
        new Thread(threadYield, "线程B").start();
    }
}
