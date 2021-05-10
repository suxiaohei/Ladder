package com.study.ladder.designmode.singleton;

import org.springframework.util.ObjectUtils;

/**
 * 单例工厂
 *
 * @author suxin
 * @since 2021-05-08
 */
public class SingletonFactory {

    private static final Object lockObj = new Object();
    private static Singleton singleton;

    public static Singleton get() {
        if (ObjectUtils.isEmpty(singleton)) {
            synchronized (lockObj) {
                singleton = new Singleton();
            }
        }
        return singleton;
    }
}
