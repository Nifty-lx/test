package com.java_impove.multiThread;

public class JoinTest {
    public static void main(String[] args) {
        MyRun myRun = new MyRun();
        Thread thread = new Thread(myRun);
        thread.start();

        for(int i = 0; i < 5; i++){
            System.out.println(thread.currentThread().getName() + "-----" + i);
            if(i==3){
                try {
                    thread.join();//使其他线程变为阻塞状态。执行完毕后再执行其他线程
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
