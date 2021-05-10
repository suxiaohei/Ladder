package com.study.ladder.designmode.state;

/**
 * 状态B
 *
 * @author suxin
 * @since 2021-05-10
 */
public class StateB implements State {

    @Override
    public void change(Process process) {
        System.out.println("输出 StateB");
    }
}
