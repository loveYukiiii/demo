package com.example.demo.test;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Supplier;

/**
 * @program: demo
 * @description: 方法引用测试
 * @author: dennis
 * @create: 2019-03-18 17:09
 **/
public class Java8FunctionTest {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("1", "2", "3", "5", "4", "0");
        strings.sort(String::compareTo);
        strings.sort((s1,s2)->s1.compareTo(s2));
        for (String s: strings){
            System.out.println(s);
        }


        Supplier<Apple> c=Apple::new;//构造函数引用指向默认的apple构造函数
        Apple apple = c.get();//调用Supplier的get方法产生一个新的Apple
        Function<Integer,Integer> f= x ->x+1;
        Function<Integer,Integer> g=x ->x*2;
        Function<Integer,Integer> h=f.andThen(g);
        Function<Integer,Integer> i=f.compose(g);
        Integer apply = h.apply(4);
        Integer apply1 = i.apply(4);
        System.out.println("复合函数计算结果andThen：-----"+apply);
        System.out.println("复合函数compose计算结果：-----"+apply1);

    }
}
