package com.example.demo.test;

import java.util.ArrayList;
import java.util.List;

/**
 * @program: demo
 * @description: 线程同步
 * @author: dennis
 * @create: 2019-06-18 15:00
 **/
public class MyList {
    private List list=new ArrayList();
    public void add(){
        list.add("a");
    }
    public int size(){
        return list.size();
    }

}
