package com.study.ladder.designmode.simplefactory;

/**
 * 测试类
 *
 * @author suxin
 * @since 2021-05-08
 */
public class SimpleFactoryTest {

    public static void main(String[] args) {

        Simple simpleA = SimpleFactory.get("A");
        simpleA.print();

        Simple simpleB = SimpleFactory.get("B");
        simpleB.print();
    }
}
