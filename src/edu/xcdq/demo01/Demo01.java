package edu.xcdq.demo01;

/**
 * @Author:hanxuejie
 * @Date:2021/5/19 7:52
 */

public class Demo01 extends Thread{
    public Demo01(){

    }
    public Demo01(String name){
        super(name);
    }

    @Override
    public void run() {
        System.out.println("这是一个新的线程，自己实现的");
        System.out.println("名字"+Thread.currentThread().getName());
    }
}
