package com.cjj.thread.demo16;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * xiangjiaoyun
 * author:chenjianjie
 * Date:2020/7/15
 * Time:23:18
 */
public class PoolThread implements Runnable {
    @Override
    public void run() {
            System.out.println(Thread.currentThread().getName());
    }

    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(10);
        PoolThread poolThread1 = new PoolThread();
        PoolThread poolThread2 = new PoolThread();
        PoolThread poolThread3 = new PoolThread();
        PoolThread poolThread4 = new PoolThread();
        executorService.execute(poolThread1);
        executorService.execute(poolThread1);
        executorService.execute(poolThread1);
        executorService.execute(poolThread1);

        executorService.shutdown();
    }
}
