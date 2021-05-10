package com.study.ladder.designmode.state;

/**
 * 状态测试类，用于状态流转影响内部行为的类
 *
 * @author suxin
 * @since 2021-05-10
 */
public class StateTest {

    public static void main(String[] args) {
        Process process = new Process(new StateA());
        process.process();
        process.process();
    }
}
