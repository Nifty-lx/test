package com.java_impove.multiThread;

public class yieldDemo {
    public static void main(String[] args) {
        MyRun myRun = new MyRun();
        Thread thread = new Thread(myRun);
        thread.start();
        for(int i = 0; i < 5; i++){
            System.out.println(thread.currentThread().getName() + "-----" + i);
            if(i==3){
                    thread.yield();
                    System.out.println(Thread.currentThread().getName()+ "=========" + i + "礼让一次");
            }
            else{
                System.out.println(Thread.currentThread().getName()+ "========" + i);
            }
        }
    }
}
