package com.cjj.thread.demo02;

/**
 * xiangjiaoyun
 * author:chenjianjie
 * Date:2020/7/14
 * Time:16:07
 */
public class TestThread2 extends Thread {

    private String url;

    private String name;

    public TestThread2(String url, String name) {
        this.url = url;
        this.name = name;
    }

    @Override
    public void run() {
        UrlDownload urlDownload = new UrlDownload();
        urlDownload.down(url, name);
    }
}
