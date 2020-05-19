package com.example.demo.test;

/**
 * @program: demo
 * @description: 线程A
 * @author: dennis
 * @create: 2019-06-18 16:39
 **/
public class ThreadB extends Thread {
    private MyList list;
    public ThreadB(MyList list){
        super();
        this.list=list;
    }
    @Override
    public void run(){
        try {
            while (true){
                if (list.size() == 5) {
                    System.out.println("==5啦！线程b要退出啦！");
                    throw new InterruptedException();
                }
            }
        }catch (InterruptedException e){
            e.printStackTrace();
        }


    }

}
