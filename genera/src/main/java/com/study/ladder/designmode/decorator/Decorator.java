package com.study.ladder.designmode.decorator;

import org.springframework.util.ObjectUtils;

/**
 * 装饰
 *
 * @author suxin
 * @since 2021-05-08
 */
public class Decorator implements Component {

    /**
     * 业务
     */
    private Component component;

    public Decorator(Component component) {
        this.component = component;
    }

    @Override
    public void operation() {
        if (!ObjectUtils.isEmpty(component)) {
            component.operation();
        }
    }
}
