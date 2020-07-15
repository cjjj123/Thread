package com.cjj.thread.demo10;

/**
 * 线程状态测试
 * xiangjiaoyun
 * author:chenjianjie
 * Date:2020/7/15
 * Time:10:23
 */
public class StateThread implements Runnable{


    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(i);
        }
    }


    public static void main(String[] args) {
        StateThread stateThread = new StateThread();
        Thread thread = new Thread(stateThread);
        Thread.State state = thread.getState();
        System.out.println(state);
        thread.start();
        state = thread.getState();
        System.out.println(state);
        while(state != Thread.State.TERMINATED){
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            state = thread.getState();
            System.out.println(state);
        }
    }
}
