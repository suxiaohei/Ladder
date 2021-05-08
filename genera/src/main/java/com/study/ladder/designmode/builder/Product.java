package com.study.ladder.designmode.builder;

/**
 * 建造者产品
 *
 * @author suxin
 * @since 2021-05-08
 */
public class Product {

    private String str1;

    private String str2;

    public void show() {
        System.out.println("product.str1 = " + str1);
        System.out.println("product.str2 =" + str2);
    }

    public String getStr1() {
        return str1;
    }

    public void setStr1(String str1) {
        this.str1 = str1;
    }

    public String getStr2() {
        return str2;
    }

    public void setStr2(String str2) {
        this.str2 = str2;
    }
}
