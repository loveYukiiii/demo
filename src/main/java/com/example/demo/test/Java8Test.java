package com.example.demo.test;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.function.Consumer;
import java.util.function.Function;

import static jdk.nashorn.internal.objects.Global.println;
import static jdk.nashorn.internal.objects.Global.setArrayBuffer;

/**
 * @program: demo
 * @description: 测试java8新特性
 * @author: dennis
 * @create: 2019-01-16 17:35
 **/
public class Java8Test {
    public static void main(String[] args) {
//        List<String> names=new ArrayList<>();
//        names.add("Google");
//        names.add("Runoob");
//        names.add("Taobao");
//        names.add("Baidu");
//        names.add("Sina");
//
//        names.forEach(System.out::println);
//
////        File[] hidden=new File(".").listFiles(File::isHidden);
//        int [] numbers={1,2,3,4,5,6,7,8};
//        List<Integer> nums=filter(numbers,(Predicate i) -> i);
//        Thread t= new Thread(new Runnable() {
//            @Override
//            public void run() {
//                System.out.println("java7");
//            }
//        });
//        Thread t1=new Thread(()-> System.out.println("java8"));
//        t.start();
//        t1.start();
//        Runnable r=()-> System.out.println("lambda!!!");
//        r.run();
//    }


        ArrayList listStrings=new ArrayList(){{
            add("");
            add("c");
            add("b");
            add("a");
            add("");
        }
        };

//        Predicate<String> nonempty=(String s)->!s.isEmpty();
        Predicate<String> nonempty=(String s)->s.length()==1;
        List<String> non=filter(listStrings,nonempty);
        for (String s: non
             ) {
            System.out.println(s);
        }

        forEach(Arrays.asList(1,2,3,4,5,6),(Integer i)-> System.out.println(i));

        List<Integer> list=map(Arrays.asList("lambdas","love","tencent","huawei"),(String s)->s.length());
        for (int a: list
             ) {
            System.out.println("Function:  "+a);
        }


    }

    public static <T> List < T > filter(List <T> list, Predicate < T > p) {
        List<T> result = new ArrayList<>();
        for (T e : list) {
            if (p.test(e)) {
                result.add(e);
            }else {
                System.out.println("发现一个空元素");
            }
        }
        return result;
    }

    public static <T> void forEach(List<T> list,Consumer<T> c){
        for (T i: list) {
            c.accept(i);
        }
    }

    public static <T,R> List<R> map(List<T> list,Function<T,R> f){
        List<R> result=new ArrayList<>();
        for (T s: list
             ) {
            result.add(f.apply(s));
        }
        return result;
    }

}
