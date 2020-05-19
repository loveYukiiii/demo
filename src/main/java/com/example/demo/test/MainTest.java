package com.example.demo.test;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

/**
 * @program: demo
 * @description: 主程序测试类
 * @author: dennis
 * @create: 2020-01-19 17:54
 **/
public class MainTest {
//    public static void main(String[] args) {
//        int [] num = {0,1,3,2,2,0};
//        int len=6;
//        int[] duplication=new int[6];
//        Soluation s=new Soluation();
//        boolean b = s.duplicate(num, len, duplication);
//        System.out.println(b);
//
//    }
    private static boolean flag = false;
    private static volatile int i = 0;
    public static void main(String[] args) {
        new Thread(new Runnable() {

            @Override
            public void run() {
                try {
                    TimeUnit.SECONDS.sleep(1);

                    flag = true;

                    System.out.println("改变了flag的值....");

                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }).start();

        while (!flag) {
            i++;
  //          System.out.println(i);
        }
        System.out.println("执行完了。 i = " + i);
    }
}
