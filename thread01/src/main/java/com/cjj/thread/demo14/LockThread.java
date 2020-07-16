package com.cjj.thread.demo14;

import java.util.concurrent.locks.ReentrantLock;

/**
 * LOCK机制
 * xiangjiaoyun
 * author:chenjianjie
 * Date:2020/7/15
 * Time:22:23
 */
public class LockThread implements Runnable {

    private int ticket = 10;

    private final ReentrantLock reentrantLock = new ReentrantLock();

    @Override
    public void run() {
        while(true){
            try {
                reentrantLock.lock();
                if(ticket <= 0){
                    break;
                }
                System.out.println(Thread.currentThread().getName() + "拿到" + ticket-- + "票");
            }catch (Exception e){
                e.printStackTrace();
            }finally {
                reentrantLock.unlock();
            }
        }
    }


    public static void main(String[] args) {
        LockThread lockThread = new LockThread();
        new Thread(lockThread, "a").start();
        new Thread(lockThread, "b").start();
        new Thread(lockThread, "c").start();
    }
}
