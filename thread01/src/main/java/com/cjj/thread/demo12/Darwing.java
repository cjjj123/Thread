package com.cjj.thread.demo12;

import java.util.concurrent.TimeUnit;

/**
 * xiangjiaoyun
 * author:chenjianjie
 * Date:2020/7/15
 * Time:15:38
 */
public class Darwing extends Thread {

    Account account;

    int qumoney;

    int nowMoney;

    public Darwing(Account account, int qumoney, String name) {
        super(name);
        this.account = account;
        this.qumoney = qumoney;
    }

    @Override
    public void run() {
        if(account.money - qumoney < 0){
            System.out.println(Thread.currentThread().getName() + "钱不够，取不了");
            return;
        }
        try {
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        account.money = account.money - qumoney;

        nowMoney = nowMoney + qumoney;

        System.out.println(account.money + "余额为：" + account.money);

        System.out.println(this.getName() + "手里的钱：" + nowMoney);
    }
}
