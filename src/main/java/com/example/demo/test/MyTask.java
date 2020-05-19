package com.example.demo.test;

import java.util.HashMap;

/**
 * @program: demo
 * @description: 实现Runnable接口
 * @author: dennis
 * @create: 2020-05-04 23:57
 **/
public class MyTask implements Runnable{
    private int taskNum;

    public MyTask(int num) {
        this.taskNum = num;
    }

    @Override
    public void run() {
        System.out.println("正在执行task "+taskNum);
        try {
            Thread.currentThread().sleep(4000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("task "+taskNum+"执行完毕");
    }
}
