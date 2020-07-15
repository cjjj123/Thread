package com.cjj.thread.demo12;

import java.util.concurrent.TimeUnit;

/**
 * 模拟多人取票
 * xiangjiaoyun
 * author:chenjianjie
 * Date:2020/7/15
 * Time:15:23
 */
public class UnsafeTicket implements Runnable {

    private int ticket = 10;

    private boolean flag = true;

    @Override
    public void run() {
        while(flag){
            buyTicket();
        }
    }


    //synchronized 同步方法，锁的是this
    public synchronized void buyTicket(){
        if(ticket <= 0){
            flag = false;
            return;
        }
        /*try {
            TimeUnit.MILLISECONDS.sleep(300);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }*/
        System.out.println(Thread.currentThread().getName() + "买了" + ticket-- + "张票");
    }


}
