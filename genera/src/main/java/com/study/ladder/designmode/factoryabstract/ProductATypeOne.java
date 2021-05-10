package com.study.ladder.designmode.factoryabstract;

/**
 * 抽象工厂产品A1
 *
 * @author suxin
 * @since 2021-05-08
 */
public class ProductATypeOne implements IProductA {

    @Override
    public void print() {
        System.out.println("输出 ProductATypeOne !");
    }
}
