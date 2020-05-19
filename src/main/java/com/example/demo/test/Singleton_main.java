package com.example.demo.test;

/**
 * @program: demo
 * @description: 测试单例模式
 * @author: dennis
 * @create: 2020-05-14 15:10
 **/
public class Singleton_main {
    public static void main(String[] args) {
        Singleton s1=Singleton.getInstance();
        Singleton s2=Singleton.getInstance();
        Singleton s3=Singleton.getInstance();
        System.out.println("s1==s2==s3:"+ (s1==s2));

    }
}
