package edu.xcdq.demo01;

/**
 * @Author:hanxuejie
 * @Date:2021/5/19 8:34
 */

public class TestDemo01 {
    public static void main(String[] args) {
        /*Demo01 demo01 = new Demo01("线程1");
        demo01.start();*/

        Demo01 demo01 = new Demo01("1");
        Demo01 demo02 = new Demo01("2");
        Demo01 demo03 = new Demo01("3");
        Demo01 demo04 = new Demo01("4");

        //线程的优先级
        demo01.setPriority(1);
        demo01.setPriority(3);
        demo01.setPriority(7);
        demo01.setPriority(10);

        demo01.start();
        demo02.start();
        demo03.start();
        demo04.start();
    }
}
/*
    1.实现接口
    2.复写run方法
    3.创建线程测试
*
* */