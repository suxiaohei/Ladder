package com.study.ladder.designmode.decorator;

/**
 * 业务接口
 *
 * @author suxin
 * @since 2021-05-08
 */
public class ComponentConcrete implements Component {

    @Override
    public void operation() {
        System.out.println("实际操作类");
    }
}
