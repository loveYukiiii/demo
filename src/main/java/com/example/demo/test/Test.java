package com.example.demo.test;

/**
 * @program: demo
 * @description: 线程测试
 * @author: dennis
 * @create: 2019-06-18 17:03
 **/
public class Test {
    public static void main(String[] args) {
        MyList list = new MyList();
        ThreadA a = new ThreadA(list);
//        a.setName("A");
        a.start();
        ThreadB b = new ThreadB(list);
//        b.setName("B");
        b.start();

    }
}
