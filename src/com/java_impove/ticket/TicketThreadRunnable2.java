package com.java_impove.ticket;

public class TicketThreadRunnable2 implements Runnable {
    //多线程访问共享数据会导致数据错乱。
    private int ticket = 5;

    @Override
    public void run() {
        for(int i = 0; i < 100; i++){
            sale();
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
    public synchronized void sale(){
        if (ticket > 0) {
            System.out.println(Thread.currentThread().getName() + "正在出售第" + (ticket--) + "张票");
        }
    }
    public static void main(String[] args) {
        TicketThreadRunnable2 ticket = new TicketThreadRunnable2();
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
