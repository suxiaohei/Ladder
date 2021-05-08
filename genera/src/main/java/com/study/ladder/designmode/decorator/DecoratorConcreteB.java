package com.study.ladder.designmode.decorator;

/**
 * 装饰B
 *
 * @author suxin
 * @since 2021-05-08
 */
public class DecoratorConcreteB extends Decorator {

    public DecoratorConcreteB(Component component) {
        super(component);
    }

    private void addedBehavior() {
        System.out.println("装饰：新增函数");
    }

    @Override
    public void operation() {
        super.operation();
        addedBehavior();
    }

}
