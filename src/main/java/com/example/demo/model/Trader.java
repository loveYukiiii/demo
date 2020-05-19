package com.example.demo.model;

/**
 * @program: demo
 * @description: 交易员类
 * @author: dennis
 * @create: 2019-03-26 17:15
 **/
public class Trader {

    private final String name;
    private final String city;

    public Trader (String name, String city){
        this.city=city;
        this.name=name;
    }

    public String getName() {
        return name;
    }

    public String getCity() {
        return city;
    }

    public String toString(){
        return "Trader:"+this.name+"in"+this.city;
    }

}
