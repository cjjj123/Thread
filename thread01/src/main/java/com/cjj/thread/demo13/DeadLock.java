package com.cjj.thread.demo13;

import java.util.concurrent.TimeUnit;

/**
 * xiangjiaoyun
 * author:chenjianjie
 * Date:2020/7/15
 * Time:16:53
 */
public class DeadLock {
    public static void main(String[] args) {
        new Huazhuang(0,"小花").start();
        new Huazhuang(1,"小红").start();
    }

}

class Kouhong{

}

class Jingzi{

}

class Huazhuang extends Thread{

    private int select;

    public Huazhuang(int select, String name) {
        super(name);
        this.select = select;

    }

    static Kouhong kouhong = new Kouhong();
    static Jingzi jingzi = new Jingzi();

    @Override
    public void run() {
        makeUp();
    }

    public void makeUp(){
        if(select == 0){
            synchronized (kouhong){
                System.out.println(Thread.currentThread().getName() + "拿到了口红");
                try {
                    TimeUnit.MILLISECONDS.sleep(2000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            synchronized (jingzi){
                System.out.println(Thread.currentThread().getName() + "拿到了镜子");
            }
        }else{
            synchronized (jingzi){
                System.out.println(Thread.currentThread().getName() + "拿到了镜子");
                try {
                    TimeUnit.MILLISECONDS.sleep(2000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            synchronized (kouhong){
                System.out.println(Thread.currentThread().getName() + "拿到了口红");
            }
        }
    }
}
