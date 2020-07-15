package com.cjj.thread.demo07;

import java.util.concurrent.TimeUnit;

/**
 * xiangjiaoyun
 * author:chenjianjie
 * Date:2020/7/14
 * Time:23:16
 */
public class ThreadSleep implements Runnable {

    private int ticket = 10;

    @Override
    public void run() {
        while(true){
            if(ticket <= 0){
                break;
            }
            try {
                TimeUnit.MILLISECONDS.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() +"拿到第" + ticket-- + "张票");
        }
    }


}
