package com.study.ladder.designmode.factory;

/**
 * 操作工厂
 *
 * @author suxin
 * @since 2021-05-08
 */
public class OperationAFactory extends OperationFactory {

    /**
     * 创建操作类
     *
     * @return Operation
     */
    @Override
    public Operation createOperation() {
        return new OperationA();
    }
}
