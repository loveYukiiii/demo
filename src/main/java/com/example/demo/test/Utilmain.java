package com.example.demo.test;

import java.util.HashMap;
import java.util.concurrent.ThreadPoolExecutor;

/**
 * @program: demo
 * @description: 随便写点
 * @author: dennis
 * @create: 2019-06-20 12:36
 **/
public class Utilmain {
    public static void main(String[] args) {
       int i = 0;
       int c = (++i) + (i++);
        HashMap t= new HashMap();

        System.out.println(c);
    }
}

