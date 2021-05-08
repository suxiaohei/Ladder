package com.study.ladder.designmode.template;

/**
 * 模板抽象类
 *
 * @author suxin
 * @since 2021-05-08
 */
public  class TemplateTest {

    public static void main(String[] args) {
        TemplateConcrete templateConcrete = new TemplateConcrete();
        templateConcrete.template();
    }
}
