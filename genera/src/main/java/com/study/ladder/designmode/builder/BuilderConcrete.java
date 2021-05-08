package com.study.ladder.designmode.builder;

/**
 * 建造者具象类
 *
 * @author suxin
 * @since 2021-05-08
 */
public class BuilderConcrete extends Builder {

    @Override
    public void buider1(String str) {
        this.getProduct().setStr1(str);
    }

    @Override
    public void buider2(String str) {
        this.getProduct().setStr2(str);
    }

}
