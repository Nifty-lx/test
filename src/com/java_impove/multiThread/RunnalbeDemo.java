package com.java_impove.multiThread;
public class RunnalbeDemo implements Runnable{

    @Override
    public void run() {
        for(int i = 0; i< 5 ; i++){
            System.out.println(Thread.currentThread().getName() + "-----" + i);
        }
    }
    public static void main(String[] args) {
        Runnable r = new RunnalbeDemo();
        Thread thread1 = new Thread(r);
        thread1.start();
        for(int i=0; i < 5; i++){
            System.out.println(Thread.currentThread().getName()+"======" + i);
        }
    }
}
