package com.example.demo.test;

import java.lang.reflect.Method;

/**
 * @program: demo
 * @description: 反射使用分析
 * @author: dennis
 * @create: 2019-06-18 12:42
 **/
public class Reflection {
    public void print(int num){
        System.out.println(num);
    }

    public static void main(String[] args) throws Exception {
        long currentTimeMillis = System.currentTimeMillis();
        Object instance = Class.forName("Reflection").newInstance();
        Method print = Reflection.class.getDeclaredMethod("print", int.class);
        print.invoke(instance,123);
    }
}
