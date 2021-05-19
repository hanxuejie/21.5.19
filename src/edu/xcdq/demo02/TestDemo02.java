package edu.xcdq.demo02;

/**
 * @Author:hanxuejie
 * @Date:2021/5/19 8:42
 */

public class TestDemo02 {
    public static void main(String[] args) {
        Demo02 demo02=new Demo02();
        Thread thread = new Thread(demo02);
        thread.start();
        //System.out.println("名字"+Thread.currentThread().getName());
    }
}
