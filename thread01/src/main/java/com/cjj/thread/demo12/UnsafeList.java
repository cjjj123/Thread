package com.cjj.thread.demo12;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

/**
 * 线程不安全集合
 * xiangjiaoyun
 * author:chenjianjie
 * Date:2020/7/15
 * Time:15:20
 */
public class UnsafeList {
    public static void main(String[] args) {
        List list = new ArrayList();
        for (int i = 0; i < 10000; i++) {
            new Thread(() -> {
                list.add(Thread.currentThread().getName());
            }).start();
        }
        try {
            TimeUnit.SECONDS.sleep(5);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(list.size());
    }
}
