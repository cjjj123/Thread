package com.cjj.thread.demo07;

import java.util.concurrent.TimeUnit;

/**
 * xiangjiaoyun
 * author:chenjianjie
 * Date:2020/7/14
 * Time:23:23
 */
public class ThreadBack {
    public static void main(String[] args) {
        for (int i = 100; i > 0; i--) {
            try {
                TimeUnit.SECONDS.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(i);
        }
    }
}
