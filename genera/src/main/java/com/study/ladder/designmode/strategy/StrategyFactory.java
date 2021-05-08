package com.study.ladder.designmode.strategy;

/**
 * 策略工厂，对不同策略的抽象
 *
 * @author suxin
 * @since 2021-05-08
 */
public class StrategyFactory {

    public static Strategy get(String type) {
        switch (type) {
            case "A":
                return new StrategyA(1, 2);
            case "B":
            default:
                return new StrategyB(1);
        }
    }
}
