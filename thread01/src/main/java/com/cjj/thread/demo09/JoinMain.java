package com.cjj.thread.demo09;

/**
 * 线程合并
 * xiangjiaoyun
 * author:chenjianjie
 * Date:2020/7/15
 * Time:0:36
 */
public class JoinMain {

    public static void main(String[] args) {
        JoinThread joinThread = new JoinThread();
        Thread thread = new Thread(joinThread);
        thread.start();

        for (int i = 0; i < 500; i++) {
            if(i == 200){
                try {
                    thread.join();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.println("main" + i);
        }
    }
}
