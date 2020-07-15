package com.cjj.thread.demo12;

/**
 * 模拟银行取钱
 * xiangjiaoyun
 * author:chenjianjie
 * Date:2020/7/15
 * Time:15:36
 */
public class UnsafeBank {
    public static void main(String[] args) {
        Account account = new Account(100, "结婚基金");
        Darwing darwing1 = new Darwing(account, 50, "我");
        Darwing darwing2 = new Darwing(account, 100, "你");
        darwing1.start();
        darwing2.start();
    }
}
