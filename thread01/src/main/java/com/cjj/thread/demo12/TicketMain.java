package com.cjj.thread.demo12;

/**
 * xiangjiaoyun
 * author:chenjianjie
 * Date:2020/7/15
 * Time:15:26
 */
public class TicketMain {
    public static void main(String[] args) {
        UnsafeTicket unsafeTicket = new UnsafeTicket();

        new Thread(unsafeTicket, "小明").start();
        new Thread(unsafeTicket, "小黄").start();
        new Thread(unsafeTicket, "小红").start();
    }
}
