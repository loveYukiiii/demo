package com.example.demo.test;

/**
 * @program: demo
 * @description: 线程A
 * @author: dennis
 * @create: 2019-06-18 16:39
 **/
public class ThreadA extends Thread {
    private MyList list;
    public ThreadA(MyList list){
        super();
        this.list=list;
    }
    @Override
    public void run(){
        try {
            for (int i = 0; i <10 ; i++) {
                list.add();
                System.out.println("添加了第"+(i+1)+"个元素。");
                sleep(1000);
            }
        }catch (InterruptedException e){
            e.printStackTrace();
        }

    }

}
