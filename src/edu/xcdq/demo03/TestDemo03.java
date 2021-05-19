package edu.xcdq.demo03;

import java.util.Map;

/**
 * @Author:hanxuejie
 * @Date:2021/5/19 9:26
 */

public class TestDemo03 {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("进入主线程"+Thread.currentThread().getName());

        DemoThread demoThread = new DemoThread();
        Thread thread = new Thread(demoThread);
        thread.setDaemon(true);
        thread.start();

        Thread.sleep(500);

        System.out.println("你好，世界");
        System.out.println("退出主线程"+Thread.currentThread().getName());
    }
}
