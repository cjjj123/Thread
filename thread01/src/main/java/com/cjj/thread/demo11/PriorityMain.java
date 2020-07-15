package com.cjj.thread.demo11;

/**
 * 线程优先级
 * xiangjiaoyun
 * author:chenjianjie
 * Date:2020/7/15
 * Time:11:26
 */
public class PriorityMain {
    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getPriority());

        PriorityThread priorityThread = new PriorityThread();
        Thread thread1 = new Thread(priorityThread,"1");
        Thread thread2 = new Thread(priorityThread,"2");
        Thread thread3 = new Thread(priorityThread,"3");
        Thread thread4 = new Thread(priorityThread,"4");
        Thread thread5 = new Thread(priorityThread,"5");

        thread1.setPriority(1);
        thread1.start();

        thread2.setPriority(Thread.MAX_PRIORITY);
        thread2.start();

        thread3.setPriority(Thread.MIN_PRIORITY);
        thread3.start();

        thread4.setPriority(7);
        thread4.start();

        thread5.setPriority(Thread.NORM_PRIORITY);
        thread5.start();




    }
}
