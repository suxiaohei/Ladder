package com.study.ladder.designmode.prototype;

/**
 * 原型具象类
 *
 * @author suxin
 * @since 2021-05-08
 */
public class PrototypeConcrete extends Prototype {

    public PrototypeConcrete(String str, Integer num, PrototypeSub prototypeSub) {
        super(str, num, prototypeSub);
    }

    public void show() {
        System.out.println("this.str = " + this.getStr());
        System.out.println("this.num = " + this.getNum());
        System.out.println("this.prototypeSub = " + this.getPrototypeSub());
        System.out.println("this.prototypeSub.str = " + this.getPrototypeSub().getStr());
        System.out.println("this.prototypeSub.num = " + this.getPrototypeSub().getNum());
    }
}
