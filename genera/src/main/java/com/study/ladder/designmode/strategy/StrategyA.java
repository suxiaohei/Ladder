package com.study.ladder.designmode.strategy;

/**
 * 策略A
 *
 * @author suxin
 * @since 2021-05-08
 */
public class StrategyA implements Strategy {

    /**
     * 变量A
     */
    private int numA;

    /**
     * 变量B
     */
    private int numB;

    public StrategyA(int numA, int numB) {
        this.numA = numA;
        this.numB = numB;
    }

    @Override
    public void print() {
        System.out.println("strategyA numA = " + numA + ", numB = " + numB);
    }
}
