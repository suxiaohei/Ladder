package com.study.ladder.designmode.decorator;

/**
 * 装饰A
 *
 * @author suxin
 * @since 2021-05-08
 */
public class DecoratorConcreteA extends Decorator {

    public DecoratorConcreteA(Component component) {
        super(component);
    }

    @Override
    public void operation() {
        super.operation();
        System.out.println("装饰：装饰对象A的操作");
    }

}
