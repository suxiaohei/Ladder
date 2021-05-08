package com.study.ladder.designmode.simplefactory;

/**
 * 实际业务类B
 *
 * @author suxin
 * @since 2021-05-08
 */
public class SimpleB implements Simple {

    @Override
    public void print() {
        System.out.println("我是通过工厂创建的B");
    }
}
