package com.java_impove.multiThread;

import java.awt.*;

public class ThreadApiDemo extends Thread{
    public static void main(String[] args) {
        //获取当前线程对象
        Thread thread = Thread.currentThread();
        //获取当前线程名称
        System.out.println(thread.getName());
        //获取线程id
        System.out.println(thread.getId());
        //获取线程的优先级，再一般范围内0-10，如果没有进行设置，默认为5.
        System.out.println(thread.getPriority());
        //设置线程池的优先级
        /*
            优先级越高的线程最先被执行吗？
            不一定，只是优先级越高被最先执行的概率大。
         */
        thread.setPriority(10);
        System.out.println(thread.getPriority());
        ThreadApiDemo t2 = new ThreadApiDemo();
        t2.start();
        System.out.println(t2.getPriority());
        for(int i = 0; i < 5; i++) {
            System.out.println(Thread.currentThread().getName() + " -------" + i);
        }
    }

    @Override
    public void run() {
        for(int i = 0; i < 5; i++) {
            System.out.println(Thread.currentThread().getName() + " -------" + i);
        }
    }
}
