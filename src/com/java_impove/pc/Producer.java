package com.java_impove.pc;

import com.java_impove.pc.Goods;

/*
    生产产品放入共享空间中。
 */
public class Producer implements Runnable{
    private Goods goods;

    public Producer(Goods goods) {
        this.goods = goods;
    }

    @Override
    public void run() {
        for(int i = 0; i < 10; i++){
            if(i%2==0){
                goods.set("哇哈哈","矿泉水");
            }
            else{
                goods.set("旺仔", "小馒头");
            }
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
