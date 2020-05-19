package com.example.demo.model;

import java.lang.reflect.Type;

/**
 * @program: demo
 * @description: test
 * @author: dennis
 * @create: 2019-03-20 16:32
 **/
public class Dish {
    private final String name;
    private final boolean vegetarian;
    private final int calories;
    private final Type type;


    //这样的类只能通过新建对象的时候就固定参数，不能直接new一个
    public Dish(String name,boolean vegetarian, int calories, Type type){
        this.name=name;
        this.vegetarian=vegetarian;
        this.calories=calories;
        this.type=type;

    }

    public String getName(){
        return name;
    }
    public boolean isVegetarian(){
        return vegetarian;
    }
    public int getCalories(){
        return calories;
    }
    public Type getType(){
        return type;
    }

    @Override
    public String toString(){
        return name;
    }

    public enum Type{
        MEAT,FISH, OTHER
    }
}
