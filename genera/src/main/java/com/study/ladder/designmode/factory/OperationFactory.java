package com.study.ladder.designmode.factory;

/**
 * 操作工厂
 *
 * @author suxin
 * @since 2021-05-08
 */
public abstract class OperationFactory {

    /**
     * 创建操作类
     *
     * @return Operation
     */
    public abstract Operation createOperation();
}
