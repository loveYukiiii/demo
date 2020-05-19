package com.example.demo.test;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * @program: demo
 * @description: 乐观锁和悲观锁
 * @author: dennis
 * @create: 2020-05-01 11:10
 **/
public class ThreadLock {
    public static int v1=0;
    //AtomicInteger是java.util.concurrent.atomic包提供的原子类，利用CPU提供的CAS操作来保证原子性；
    public static AtomicInteger v2 =new AtomicInteger();
    public static int v3=0;
    public static synchronized void increaseV3(){
        v3++;
    }

    public static void main(String[] args) throws InterruptedException {
        for (int i = 0; i < 1000; ++i) {
            new Thread(new Runnable() {
                @Override
                public void run() {
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    v1++;
                    v2.getAndIncrement();
                    increaseV3();
                }
            }).start();
        }
        while (Thread.activeCount()>2){
            Thread.yield();
        }

        Thread.sleep(1000);
        System.out.println("线程不安全："+v1);
        System.out.println("乐观所："+v2);
        System.out.println("悲观锁："+v3);

    }

}
