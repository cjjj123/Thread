package com.cjj.thread.demo15;

/**
 * xiangjiaoyun
 * author:chenjianjie
 * Date:2020/7/16
 * Time:22:14
 */
public class WordMain {


    public static void main(String[] args) {
        Student student = new Student();
        new Thread(new WriterDemo(student)).start();
        new Thread(new ReadDemo(student)).start();
    }

}


class WriterDemo implements Runnable{

    private Student student;

    public WriterDemo(Student student) {
        this.student = student;
    }

    @Override
    public void run() {
        int i = 0;
        while (true){
            synchronized (student){
                //当flag为true时，证明还没有输出，所以等待输出
                if(student.flag){
                    try {
                        student.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                if(i % 2 == 0){
                    student.name = "胡歌";
                    student.sex = "男";
                }else{
                    student.name = "杨幂";
                    student.sex = "女";
                }
                i++;
                student.notify();
                student.flag = true;
        }
        }
    }
}

class ReadDemo implements Runnable{

    private Student student;

    public ReadDemo(Student student) {
        this.student = student;
    }

    @Override
    public void run() {
            while (true) {
                synchronized(student) {
                    if(!student.flag){
                        try {
                            student.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                    System.out.println(student.name + "..." + student.sex);
                    student.notify();
                    student.flag = false;
            }
        }
    }
}

class Student{
    String name;
    String sex;
    boolean flag = false;
}
