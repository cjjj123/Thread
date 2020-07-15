package com.cjj.thread.demo04;

/**
 * M模拟龟兔赛跑
 * xiangjiaoyun
 * author:chenjianjie
 * Date:2020/7/14
 * Time:18:30
 */
public class TestThread4 implements Runnable{

    private String winner;

    public void run() {
        for (int i = 0; i <= 100; i++) {
            if(getWinner(i)){
                break;
            }
            System.out.println(Thread.currentThread().getName() + "跑了" + i + "步");
        }
    }

    public boolean getWinner(int number){
        if(winner != null){
            return true;
        }else{
            if(number == 100){
                winner = Thread.currentThread().getName();
                System.out.println("冠军是：" + winner);
                return true;
            }
        }
        return false;
    }



}
