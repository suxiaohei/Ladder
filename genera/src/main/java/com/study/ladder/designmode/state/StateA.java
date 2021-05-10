package com.study.ladder.designmode.state;

/**
 * 状态A
 *
 * @author suxin
 * @since 2021-05-10
 */
public class StateA implements State {

    @Override
    public void change(Process process) {
        System.out.println("输出 StateA");
        process.setState(new StateB());
    }
}
