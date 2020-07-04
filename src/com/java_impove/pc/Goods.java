package com.java_impove.pc;

public class Goods {
    private String brand;
    private String name;
    private boolean flag = false;

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    //消费者获取商品
    public synchronized void get(){
        if(!flag){
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("消费者取走了"+ this.getBrand() + "---------" + this.getName());
        //消费者消费完毕
        flag = false;
        notify();
    }
    //生产者生产商品
    public synchronized void set(String brand, String name){
        //当生产者抢占到cpu资源后会判断当前对象是否有值，有值，则提醒消费者消费，同时当前线程进入阻塞状态，直至消费者取走商品。
        if(flag){
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        this.setBrand(brand);
        this.setName(name);
        System.out.println("生产者生产了" + this.getBrand() + "-------" + this.getName());
        //生产者已经生产完成
        flag = true;
        notify();
    }
}
