package com.example.demo.test;


import java.time.*;
import java.time.temporal.ChronoField;

import static java.time.temporal.TemporalAdjusters.lastDayOfMonth;
import static java.time.temporal.TemporalAdjusters.nextOrSame;

/**
 * @program: demo
 * @description: 关于java8新特性之时间方法的改变
 * @author: dennis
 * @create: 2019-05-28 17:28
 **/
public class Java8Date {
    public static void main(String[] args) {
        LocalDate now = LocalDate.now();
        int year = now.getYear();
        Month month = now.getMonth();
        int dayOfMonth = now.getDayOfMonth();
        DayOfWeek dayOfWeek = now.getDayOfWeek();
        int year1 = now.get(ChronoField.YEAR);
        int  month1=now.get(ChronoField.MONTH_OF_YEAR);
        int day = now.get(ChronoField.DAY_OF_MONTH);
        LocalTime localTime = LocalTime.of(1, 2, 3);
        localTime.getHour();
        localTime.getMinute();
        localTime.getSecond();
        LocalTime parse = LocalTime.parse("11:11:12");
        System.out.println(parse);
        LocalDateTime localDateTime = LocalDateTime.now();
        localDateTime.toLocalDate();
        localDateTime.toLocalTime();
        LocalDateTime dateTime = LocalDateTime.of(now, localTime);
       // Duration between = Duration.between(now, localDateTime);
        //System.out.println(between);
        LocalDate date = LocalDate.of(2019, 9, 30);
        date = date.withDayOfMonth(12);
        date = date.withYear(2099);
        date = date.with(lastDayOfMonth());
        date = date.with(nextOrSame(DayOfWeek.MONDAY));
        System.out.println(date);
        int a=16;
        int c=  1 << 2;
        int b= 4>>2;
        System.out.println(c);
        System.out.println(b);

    }
}
