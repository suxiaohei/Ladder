package com.study.ladder.designmode.prototype;

/**
 * 原型模式测试，clone不调用构造方法，访问权限无效
 *
 * @author suxin
 * @since 2021-05-08
 */
public class PrototypeTest {

    public static void main(String[] args) {

        PrototypeSub prototypeSub1 = new PrototypeSub();
        prototypeSub1.setStr("子类1");
        prototypeSub1.setNum(298);

        PrototypeConcrete prototypeConcrete = new PrototypeConcrete("test", 1, prototypeSub1);
        PrototypeConcrete prototype1 = (PrototypeConcrete) prototypeConcrete.clone();
        PrototypeConcrete prototype2 = (PrototypeConcrete) prototypeConcrete.clone();
        // prototypeSub1.setStr("子类2");
        // prototypeSub1.setNum(300);

        prototypeConcrete.show();
        prototype1.show();
        prototype2.show();
    }
}
