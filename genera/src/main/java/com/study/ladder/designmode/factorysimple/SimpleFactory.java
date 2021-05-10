package com.study.ladder.designmode.factorysimple;

/**
 * 简单工厂, 解决类的创建(子类入参一致的情况)
 *
 * @author suxin
 * @since 2021-05-08
 */
public abstract class SimpleFactory {

    /**
     * 根据类型创建实体类
     *
     * @param type 类型
     * @return SimpleFactory
     */
    public static Simple get(String type) {
        // 根据类型获取
        switch (type) {
            case "A":
                return new SimpleA();
            case "B":
            default:
                return new SimpleB();
        }
    }
}
