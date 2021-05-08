package com.study.ladder.designmode.factory;

/**
 * 工厂模式测试，应用于已有的数据增加新增的功能
 *
 * @author suxin
 * @since 2021-05-08
 */
public class FactoryTest {

    public static void main(String[] args) {
        OperationFactory operationFactory = new OperationAFactory();
        Operation operation1 = operationFactory.createOperation();
        Operation operation2 = operationFactory.createOperation();

        operation1.operation();
        operation2.operation();
    }
}
