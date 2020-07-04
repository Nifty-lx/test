package com.java_impove;

public class ThreadRun extends Thread {
    @Override
    public void run() {
        for(int i = 0; i< 5 ; i++){
            System.out.println(Thread.currentThread().getName() + "-----" + i);
        }
    }

    public static void main(String[] args) {
        ThreadRun thread1 = new ThreadRun();
        thread1.start();
        for(int i=0; i < 5; i++){
            System.out.println(Thread.currentThread().getName()+"======" + i);
        }
    }
}
