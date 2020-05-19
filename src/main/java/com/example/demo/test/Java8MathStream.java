package com.example.demo.test;

import java.util.function.IntSupplier;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * @program: demo
 * @description: 数值流应用
 * @author: dennis
 * @create: 2019-03-28 17:35
 **/
public class Java8MathStream {
    public static void main(String[] args) {
//       IntStream.rangeClosed(1, 50).filter(n -> n % 3 == 0).forEach(System.out::println);
        Stream<int[]> stream = IntStream.rangeClosed(1, 100).boxed()
                .flatMap(
                        a ->
                                IntStream.rangeClosed(a, 100).filter(b -> Math.sqrt(a * a + b * b) % 1 == 0)
                                        .mapToObj(b -> new int[]{a, b, (int) Math.sqrt(a * a + b * b)})
                );
        stream.limit(10).forEach(
                t->System.out.println(t[0]+","+t[1]+","+t[2])
        );

       // Stream.iterate(0,n->n+2).forEach(System.out::println);

        Stream<String> stringStream = Stream.of("abc", "lamdba", "stream", "java8");
//        stringStream.map(String::toUpperCase).forEach(System.out::println);
//        Stream.iterate(new int[] {0,1},
//                t->new int[]{t[1],t[0]+t[1]}).limit(20).map(t->t[0]).forEach(System.out::println);
//        Stream.generate(Math::random).limit(10).forEach(System.out::println);
        IntSupplier fib= new IntSupplier() {
            private int p=0;
            private int c=1;
            @Override
            public int getAsInt() {
                int oldValue=this.p;
                int newValue =this.c+this.p;
                this.p=this.c;
                this.c=newValue;

                return oldValue;//打印的就是这个值
            }
        };
        IntStream.generate(fib).limit(10).forEach(System.out::println);


    }
}
