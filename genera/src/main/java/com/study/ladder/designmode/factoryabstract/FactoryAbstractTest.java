package com.study.ladder.designmode.factoryabstract;

/**
 * 抽象工厂测试类
 *
 * @author suxin
 * @since 2021-05-08
 */
public class FactoryAbstractTest {

    public static void main(String[] args) {
        try {
            DataBaseAccess.createProductA().print();
            DataBaseAccess.createProductB().print();
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException e) {
            e.printStackTrace();
        }
    }
}
