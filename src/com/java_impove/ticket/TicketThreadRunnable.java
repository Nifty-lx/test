package com.java_impove.ticket;

public class TicketThreadRunnable implements Runnable {
    //多线程访问共享数据会导致数据错乱。
    private int ticket = 5;

    @Override
    public void run() {
        for(int i = 0; i < 100; i++){
            //同步代码块，同一时间，只能有一个线程能够访问该区域
            synchronized (this) {
                if (ticket > 0) {
                    System.out.println(Thread.currentThread().getName() + "正在出售第" + (ticket--) + "张票");
                }
            }
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }

    public static void main(String[] args) {
        TicketThreadRunnable ticket = new TicketThreadRunnable();
        Thread t1 = new Thread(ticket, "A");
        Thread t2 = new Thread(ticket, "B");
        Thread t3 = new Thread(ticket, "C");
        Thread t4 = new Thread(ticket, "D");
        t1.start();
        t2.start();
        t3.start();
        t4.start();
    }
}
