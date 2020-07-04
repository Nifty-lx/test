package com.java_impove.proxy;

public class XiMenQing {
    public static void main(String[] args) {
        WangPo wangPo = new WangPo(new PanJinLian());
        wangPo.makeEyesWithMen();
        wangPo.playWithMen();

        wangPo = new WangPo(new JiaShi());
        wangPo.makeEyesWithMen();
        wangPo.playWithMen();
    }
}
