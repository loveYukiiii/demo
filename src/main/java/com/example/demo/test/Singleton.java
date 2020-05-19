package com.example.demo.test;

/**
 * @program: demo
 * @description: 单例模式
 * @author: dennis
 * @create: 2020-05-14 15:06
 **/
public class Singleton {
    private static Singleton instance= new Singleton();
    //构造函数私有化
    private Singleton(){

    }

    public static Singleton getInstance() {
        return instance;
    }

    public void print(){
        System.out.println("hello world");
    }

}
