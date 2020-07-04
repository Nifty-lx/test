package com.java_impove.proxy;

public class PanJinLian implements KindWomen{
    String name;
    public PanJinLian(){
        this.name = "Panjinlian";
    }
    @Override
    public void makeEyesWithMen() {
        System.out.println(this.name + "在抛媚眼");
    }

    @Override
    public void playWithMen() {
        System.out.println(this.name + "在玩");
    }
}
