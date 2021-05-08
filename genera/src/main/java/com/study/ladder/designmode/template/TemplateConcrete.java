package com.study.ladder.designmode.template;

/**
 * 模板抽象类
 *
 * @author suxin
 * @since 2021-05-08
 */
public class TemplateConcrete extends Template {

    @Override
    public void operation() {
        System.out.println("输出 operation ");
    }

    @Override
    public void print() {
        System.out.println("输出 print ");
    }
}
