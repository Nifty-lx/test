package com.java_impove.pc2;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class Test {
    public static void main(String[] args) {
        BlockingQueue queue = new ArrayBlockingQueue<Goods>(5);
        ProducerQueue producerQueue = new ProducerQueue(queue);
        ComsumerQueue comsumerQueue = new ComsumerQueue(queue);
        Thread t1 = new Thread(producerQueue);
        Thread t2 = new Thread(comsumerQueue);
        t1.start();
        t2.start();
    }
}
