package com.study.ladder.designmode.factory;

/**
 * 业务实现A
 *
 * @author suxin
 * @since 2021-05-08
 */
public class OperationA implements Operation {

    @Override
    public void operation() {
        System.out.println("业务实现A");
    }
}
