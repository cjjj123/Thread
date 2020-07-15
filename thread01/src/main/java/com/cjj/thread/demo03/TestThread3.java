package com.cjj.thread.demo03;

import java.util.concurrent.TimeUnit;

/**
 * xiangjiaoyun
 * author:chenjianjie
 * Date:2020/7/14
 * Time:17:36
 */
public class TestThread3 implements Runnable {

    int ticket = 10;

    public void run() {

        while(true){
            if(ticket <= 0){
                break;
            }
            try {
                TimeUnit.MILLISECONDS.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + "拿到第" + ticket-- + "张票");
        }
    }
}
