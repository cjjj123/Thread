package com.cjj.thread.demo02;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;
import java.net.URL;

/**
 * xiangjiaoyun
 * author:chenjianjie
 * Date:2020/7/14
 * Time:16:07
 */
public class UrlDownload {

    public void down(String url, String name){
        try {
            FileUtils.copyURLToFile(new URL(url), new File(name));
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("IO异常");
        }
    }
}
