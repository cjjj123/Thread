package com.cjj.thread.demo04;

/**
 * 模拟龟兔赛跑
 * xiangjiaoyun
 * author:chenjianjie
 * Date:2020/7/14
 * Time:18:29
 */
public class ThreadMain4 {


    public static void main(String[] args) {
        TestThread4 testThread4 = new TestThread4();
        new Thread(testThread4, "兔子").start();
        new Thread(testThread4, "乌龟").start();
    }

}
