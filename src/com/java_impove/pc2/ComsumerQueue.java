package com.java_impove.pc2;

import java.util.concurrent.BlockingQueue;

public class ComsumerQueue implements Runnable {
    private BlockingQueue<Goods> blockingQueue;

    public ComsumerQueue(BlockingQueue<Goods> blockingQueue) {
        this.blockingQueue = blockingQueue;
    }

    @Override
    public void run() {
        for(int i = 0; i < 10; i++){
            try {
                Goods goods = blockingQueue.take();
                System.out.println("消费者消费商品:" + goods.getBrand() + "-------" + goods.getName());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
