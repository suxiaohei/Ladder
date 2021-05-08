package com.study.ladder.designmode.template;

/**
 * 模板抽象类
 *
 * @author suxin
 * @since 2021-05-08
 */
public abstract class Template {

    /**
     * 执行
     */
    public abstract void operation();

    /**
     * 打印
     */
    public abstract void print();

    /**
     * ，模板方法
     */
    public void template() {
        this.operation();
        this.print();
    }
}
