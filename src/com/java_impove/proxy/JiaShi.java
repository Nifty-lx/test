package com.java_impove.proxy;

import java.awt.*;

public class JiaShi implements KindWomen{
    private String name;
    public JiaShi(){
        this.name = "甲氏";
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
