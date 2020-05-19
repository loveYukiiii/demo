package com.example.demo.test;

import com.example.demo.model.Dish;
import com.example.demo.model.UserInfo;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import static java.util.stream.Collectors.*;

/**
 * @program: demo
 * @description: 测试流
 * @author: dennis
 * @create: 2019-03-20 16:50
 **/
public class Java8StreamAPI {
    public static void main(String[] args) {
        List<Dish> menu= Arrays.asList(
                new Dish("pork",false,800,Dish.Type.MEAT),
                new Dish("beef",false,700,Dish.Type.MEAT),
                new Dish("chicken",false,400,Dish.Type.MEAT),
                new Dish("french fries",true,530,Dish.Type.OTHER),
                new Dish("rice",true,350,Dish.Type.OTHER),
                new Dish("season fruit",true,120,Dish.Type.OTHER),
                new Dish("pizza",true,550,Dish.Type.OTHER),
                new Dish("prawns",false,300,Dish.Type.FISH),
                new Dish("salmon",false,450,Dish.Type.FISH)

        );
       /* List<String> highCalories=menu.stream().filter(d->d.getCalories()>300).map(Dish::getName).limit(3)
                .collect(Collectors.toList());//将结果保存到另一个list
        System.out.println(highCalories);//[pork, beef, chicken]

        //用背后等迭代器做外部迭代
        List<String> names=new ArrayList<>();
        Iterator<Dish> iterator=menu.iterator();
        while (iterator.hasNext()){
            Dish next = iterator.next();
            names.add(next.getName());
        }
        System.out.println(names);

        //流：内部迭代
        List<String> sameNames=menu.stream().map(Dish::getName).collect(Collectors.toList());
        System.out.println(sameNames);

        int sum = menu.stream().mapToInt(Dish::getCalories).sum();
        System.out.println("所有卡路里的和：----"+sum);

        Map<Dish.Type, List<Dish>> collect = menu.stream().collect(Collectors.groupingBy(Dish::getType));
        System.out.println(collect);

        Optional<String> fullname=Optional.ofNullable("yuki");
        System.out.println("Fullname is set?"+fullname.isPresent());
        System.out.println("Fullname:"+fullname.orElseGet(()->"none"));

        menu.stream().forEach(System.out::println);

        long count = menu.stream().filter(d -> d.getCalories() > 300).distinct().limit(4).count();
        System.out.println("count--"+count);
    */

//        List<Integer> collect = menu.stream().map(Dish::getName).map(String::length).collect(Collectors.toList());
//        System.out.println(collect);
//        List<String> strings = Arrays.asList("hello", "world");
//        List<String> collect1 = strings.stream().map(words -> words.split("")).flatMap(Arrays::stream).distinct().collect(Collectors.toList());
//        System.out.println(collect1);
//        List<Integer> integers = Arrays.asList(1, 2, 3, 4, 5);
//        List<Integer> integers1 = Arrays.asList(6, 7, 8);
     //   List<Integer> collect2 = integers.stream().map(i -> i * i).collect(Collectors.toList());
////        System.out.println(collect2);
//        List<int[]> collect2 = integers.stream().flatMap(
//                i -> integers1.stream().map(j -> new int[]{i, j})
//        ).collect(Collectors.toList());
//        for (int[] s : collect2
//             ) {
//            System.out.println(s[0]+"--"+s[1]);
//        }
//        menu.stream().filter(Dish::isVegetarian).findAny().ifPresent(d-> System.out.println(d.getName()));
//        List<Integer> integers = Arrays.asList(1, 3, 5, 6, 3, 4);
//        Optional<Integer> sum = integers.stream().reduce( Integer::max);
//        System.out.println(sum);
//        Comparator<Dish> dishComparator = Comparator.comparingInt(Dish::getCalories);
//        Optional<Dish> collect = menu.stream().collect(maxBy(dishComparator));
//        //System.out.println(collect);
//        DoubleSummaryStatistics sumCalories= menu.stream().collect(summarizingDouble(Dish::getCalories));
//        System.out.println(sumCalories);
//        String s = menu.stream().map(Dish::getName).collect(Collectors.joining(","));
//        //System.out.println(s);
//        Map<Dish.Type, List<Dish>> listMap = menu.stream().collect(groupingBy(Dish::getType));
//        Map<String, List<Dish>> listMap1 = menu.stream().collect(groupingBy(dish -> {
//            if (dish.getCalories() <= 400) return "dief";
//            else if (dish.getCalories() <= 700) return "normal";
//            else return "fat";
//        }));
//        System.out.println(listMap1);
//        Map<Dish.Type, Map<String, List<Dish>>> mapMap = menu.stream().collect(groupingBy(Dish::getType, groupingBy(
//                dish -> {
//                    if (dish.getCalories() <= 400) return "dief";
//                    else if (dish.getCalories() <= 700) return "normal";
//                    else return "fat";
//                }
//        )));
//        System.out.println(mapMap);
        System.out.println(partitionPrimes(20));
        UserInfo userInfo=new UserInfo();
        Set<UserInfo> list = new HashSet<>();

        userInfo.setId("1");
        for (int i = 0; i < 10; i++) {
            userInfo.setId(""+i);
            list.add(userInfo);
        }
        for (UserInfo u: list
             ) {
            System.out.println(u);
        }


    }
    public static boolean isPrime(int candidate){
        return IntStream.range(2,candidate).noneMatch(i-> candidate %i ==0);
    }
    public static Map<Boolean,List<Integer>> partitionPrimes(int n){
        return IntStream.rangeClosed(2,n).boxed().collect(partitioningBy(candidate->isPrime(candidate)));
    }


}
