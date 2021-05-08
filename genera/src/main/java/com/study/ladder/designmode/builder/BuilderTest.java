package com.study.ladder.designmode.builder;

/**
 * 建造者模式测试，应用于已有的数据增加新增的功能
 *
 * @author suxin
 * @since 2021-05-08
 */
public class BuilderTest {

    public static void main(String[] args) {
        BuilderConcrete builderConcrete = new BuilderConcrete();
        BuilderDirector builderDirector = new BuilderDirector(builderConcrete);
        builderDirector.build();
        builderConcrete.getProduct().show();
    }
}
