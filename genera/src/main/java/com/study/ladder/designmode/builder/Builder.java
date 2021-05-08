package com.study.ladder.designmode.builder;

/**
 * 建造者模式
 *
 * @author suxin
 * @since 2021-05-08
 */
public abstract class Builder {

    private Product product = new Product();

    public abstract void buider1(String str);

    public abstract void buider2(String str);

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }
}
