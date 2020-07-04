package com.java_impove.pc2;

import java.util.concurrent.BlockingQueue;

public class ProducerQueue implements Runnable{
    private BlockingQueue<Goods> blockingQueue;

    public ProducerQueue(BlockingQueue<Goods> blockingQueue) {
        this.blockingQueue = blockingQueue;
    }

    @Override
    public void run() {
        for(int i = 0; i < 10; i++){
            Goods goods = null;
            if(i % 2 == 0) {
                goods = new Goods("哇哈哈", "矿泉水");
            }
            else{
                goods = new Goods("康师傅", "方便面");
            }
            System.out.println("生产者生产商品:" + goods.getName() + "---------" + goods.getBrand());
            try {
                this.blockingQueue.put(goods);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
