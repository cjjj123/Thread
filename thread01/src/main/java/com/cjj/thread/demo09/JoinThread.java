package com.cjj.thread.demo09;

/**
 * xiangjiaoyun
 * author:chenjianjie
 * Date:2020/7/15
 * Time:0:35
 */
public class JoinThread implements Runnable {


    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println("VIP来了" + i);
        }
    }
}
