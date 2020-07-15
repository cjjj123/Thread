package com.cjj.thread.demo06;

/**
 * 线程自定义结束
 * xiangjiaoyun
 * author:chenjianjie
 * Date:2020/7/14
 * Time:22:57
 */
public class TestThread6 implements Runnable {

    private boolean flag = true;

    @Override
    public void run() {
        int i = 0;
        while (flag){
            System.out.println("Thread线程" + i++);
        }
    }

    public void stop(int number){
        if(number == 900){
            this.flag = false;
        }
    }

    public static void main(String[] args) {
        TestThread6 testThread6 = new TestThread6();
        new Thread(testThread6).start();

        for (int i = 0; i < 1000; i++) {
            testThread6.stop(i);
            System.out.println("主线程" + i);
        }

    }
}
