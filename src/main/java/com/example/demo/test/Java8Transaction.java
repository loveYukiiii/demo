package com.example.demo.test;

import com.example.demo.model.Trader;
import com.example.demo.model.Transaction;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import static java.util.Comparator.comparing;


/**
 * @program: demo
 * @description: test作业
 * @author: dennis
 * @create: 2019-03-26 17:23
 **/
public class Java8Transaction {
    public static void main(String[] args) {
        Trader raoul=new Trader("Raoul","Cambridge");
        Trader mario=new Trader("Mario","Milan");
        Trader alan=new Trader("Alan","Cambridge");
        Trader brian=new Trader("Brian","Cambridge");
        List<Transaction> transactions= Arrays.asList(
                new Transaction(brian,2011,300),
                new Transaction(raoul,2012,1000),
                new Transaction(raoul,2011,400),
                new Transaction(mario,2012,710),
                new Transaction(mario,2012,700),
                new Transaction(alan,2012,950)

        );
        //找出所有2011年发生的交易，并按交易额排序
        List<Transaction> collect = transactions.stream()
                .filter(transaction -> transaction.getYear() == 2011)
                .sorted(comparing(Transaction::getValue))
                .collect(Collectors.toList());
        System.out.println(collect);
        //找出交易猿呆过的不同城市
        List<String> address = transactions.stream().map(t -> t.getTrader().getCity()).distinct().collect(Collectors.toList());
        System.out.println(address);
        //按名字排序所有交易员
        List<String> nameSorted = transactions.stream()
                .filter(t -> t.getTrader().getCity() .equals("Cambridge") )
                .map(t -> t.getTrader().getName())
                .distinct()
                .sorted()
                .collect(Collectors.toList());
        System.out.println(nameSorted);
        //名字字符串排序
        String sortedName = transactions.stream()
                .map(t -> t.getTrader().getName())
                .distinct()
                .sorted()
                .reduce("", (n1, n2) -> n1 + n2);
        System.out.println(sortedName);
        //有无交易员在米兰工作
        transactions.stream()
                .anyMatch(t->t.getTrader().getCity().equals("Milan"));
        //打印剑桥交易员所有交易额
        transactions.stream()
                .filter(t -> t.getTrader().getCity().equals("Cambridge"))
                .map(t -> t.getValue())
                .forEach(System.out::print);
        //所有交易中交易额最高的
        Optional<Integer> max = transactions.stream()
                .map(Transaction::getValue)
                .reduce(Integer::max);
        System.out.println(max);
        Optional<Transaction> min = transactions.stream()
                .min(comparing(Transaction::getValue));
        System.out.println(min);

    }



}
