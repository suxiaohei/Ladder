package com.study.ladder.designmode.factoryabstract;

/**
 * 抽象工厂产品B1
 *
 * @author suxin
 * @since 2021-05-08
 */
public class ProductBTypeOne implements IProductB {

    @Override
    public void print() {
        System.out.println("输出 ProductBTypeOne !");
    }
}
