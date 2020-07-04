package com.java_impove.ticket;

public class TicketThread extends Thread{
    //多线程访问共享数据会导致数据错乱。
    private static int ticket = 5;

    @Override
    public void run() {
        while (ticket > 0){
            System.out.println(Thread.currentThread().getName() + "正在出售第" + (ticket--) + "张票");
        }
    }

    public static void main(String[] args) {
        TicketThread t1 = new TicketThread();
        TicketThread t2 = new TicketThread();
        TicketThread t3 = new TicketThread();
        TicketThread t4 = new TicketThread();
        t1.start();
        t2.start();
        t3.start();
        t4.start();
    }
}
