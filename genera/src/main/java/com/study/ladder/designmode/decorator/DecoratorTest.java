package com.study.ladder.designmode.decorator;

/**
 * 测试
 *
 * @author suxin
 * @since 2021-05-08
 */
public class DecoratorTest {

    public static void main(String[] args) {
        ComponentConcrete concrete = new ComponentConcrete();
        DecoratorConcreteA decoratorConcreteA = new DecoratorConcreteA(concrete);
        DecoratorConcreteB decoratorConcreteB = new DecoratorConcreteB(decoratorConcreteA);
        decoratorConcreteB.operation();
    }
}
