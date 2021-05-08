package com.study.ladder.designmode.strategy;

/**
 * 测试类
 *
 * @author suxin
 * @since 2021-05-08
 */
public class StrategyTest {

    public static void main(String[] args) {

        Strategy strategyA = StrategyFactory.get("A");
        strategyA.print();

        Strategy strategyB = StrategyFactory.get("B");
        strategyB.print();
    }
}
