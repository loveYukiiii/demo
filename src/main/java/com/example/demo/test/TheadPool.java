package com.example.demo.test;

import javafx.concurrent.Task;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * @program: demo
 * @description: 线程池调用测试
 * @author: dennis
 * @create: 2020-05-04 23:44
 **/
public class TheadPool {
    public static void main(String[] args) {
        ThreadPoolExecutor executor=new ThreadPoolExecutor(5,10,200,
                TimeUnit.MILLISECONDS,new ArrayBlockingQueue<Runnable>(5));


        for (int i = 0; i <15; i++) {
            MyTask myTask=new MyTask(i);
            executor.execute(myTask);
            System.out.println("线程池中线程数目"+executor.getPoolSize()+
                    ",队列中的线程数目："+executor.getQueue().size()+",已经完成了的线程数目："+executor.getCompletedTaskCount());

        }
        executor.shutdown();
    }

}
