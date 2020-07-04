package com.java_impove.pc;

import com.java_impove.pc.Goods;

public class Consumer implements Runnable{
    private Goods goods;
    public Consumer(Goods goods){
        this.goods = goods;
    }
    @Override
    public void run() {
        for(int i = 0; i < 10; i++){
            goods.get();
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
