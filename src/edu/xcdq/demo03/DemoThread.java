package edu.xcdq.demo03;

/**
 * @Author:hanxuejie
 * @Date:2021/5/19 9:26
 */

public class DemoThread implements Runnable{
    @Override
    public void run() {
        System.out.println("进入守护线程"+Thread.currentThread().getName());
        System.out.println("守护线程开工了........");
        writeToFile();
        System.out.println("退出守护线程"+Thread.currentThread().getName());
    }
    private void writeToFile(){
        int count = 0;
        while (count < 999){
            System.out.println("守护线程"+Thread.currentThread().getName());
            count++;
        }
    }
}
