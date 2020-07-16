package com.cjj.thread.demo15;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * 模拟多线程生产者消费者
 * xiangjiaoyun
 * author:chenjianjie
 * Date:2020/7/16
 * Time:15:14
 */
public class ThreadMain {
    public static void main(String[] args) {
        Baozi baozi = new Baozi();
        Product product = new Product(baozi);
        Consumer consumer = new Consumer(baozi);
        new Thread(product).start();
        new Thread(consumer).start();
    }



}


class Product implements Runnable{

    private Baozi baozi;

    public Product(Baozi baozi) {
        this.baozi = baozi;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            baozi.done(i);
        }
    }
}

class Consumer implements Runnable{

    private Baozi baozi;

    public Consumer(Baozi baozi) {
        this.baozi = baozi;
    }


    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            int eat = baozi.eat();
            System.out.println(eat);
        }

    }
}

class Baozi{

    Queue<Integer> queue = new LinkedList();

    int count = 10;

    //生产者生产
    public synchronized void done(int val){
        if(queue.size() > count){
            //让生产者停止
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        queue.add(val);
        notify();

    }

    //消费者消费
    public synchronized int eat(){
        if(queue.size() == 0){
            //当包子没有了，消费者等待
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        Integer poll = queue.poll();
        notify();
        return poll;

    }



}