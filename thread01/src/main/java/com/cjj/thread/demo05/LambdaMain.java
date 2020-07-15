package com.cjj.thread.demo05;

/**
 * lambda表达式
 * xiangjiaoyun
 * author:chenjianjie
 * Date:2020/7/14
 * Time:21:01
 */
public class LambdaMain {
    public static void main(String[] args) {
        LambdaService lambdaService = (name,age) -> {
            System.out.println("haha" + name);
            System.out.println("haha" + age);
        };
        lambdaService.lambdaTest("lambda", 500);
    }
}
