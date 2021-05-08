package com.study.ladder.designmode.strategy;

/**
 * 策略B
 *
 * @author suxin
 * @since 2021-05-08
 */
public class StrategyB implements Strategy {

    /**
     * 变量A
     */
    private int numA;

    public StrategyB(int numA) {
        this.numA = numA;
    }

    @Override
    public void print() {
        System.out.println("strategyB numA = " + numA);
    }
}
