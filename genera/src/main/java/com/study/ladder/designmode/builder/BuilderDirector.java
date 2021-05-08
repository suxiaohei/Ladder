package com.study.ladder.designmode.builder;

/**
 * 建造者模式指挥
 *
 * @author suxin
 * @since 2021-05-08
 */
public class BuilderDirector {

    /**
     * 建造者
     */
    private Builder builder;

    public BuilderDirector(Builder builder) {
        this.builder = builder;
    }

    public void build() {
        builder.buider1("1");
        builder.buider2("2");
    }
}
