package com.cjj.thread.demo02;

/**
 * xiangjiaoyun
 * author:chenjianjie
 * Date:2020/7/14
 * Time:16:14
 */
public class ThreadMain {
    public static void main(String[] args) {
        TestThread2 t1 = new TestThread2("https://nie.res.netease.com/r/pic/20161116/38d2d9ac-dd4e-4b07-ada9-b5a3f4891b6e","D://1.jpg");
        TestThread2 t2 = new TestThread2("https://nie.res.netease.com/r/pic/20161116/80ea5dba-3b42-4fe1-9e00-3024f11531cc","2.jpg");
        TestThread2 t3 = new TestThread2("https://nie.res.netease.com/r/pic/20161116/477e132a-ae42-4e03-80f6-91ff23d1c65b","3.jpg");

        t1.start();
        t2.start();
        t3.start();
    }
}
