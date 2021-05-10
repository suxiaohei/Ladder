package com.study.ladder.designmode.singleton;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * 单例模式测试，clone不调用构造方法，访问权限无效
 *
 * @author suxin
 * @since 2021-05-08
 */
public class SingletonTest {

    public static void main(String[] args) {
        ThreadPoolExecutor threadPool = new ThreadPoolExecutor(1, 2,
                1, TimeUnit.MINUTES, new ArrayBlockingQueue(5));
        Runnable r = () -> System.out.println(SingletonFactory.get());
        threadPool.execute(r);
        threadPool.execute(r);
        threadPool.execute(r);
        threadPool.execute(r);
        threadPool.execute(r);
        threadPool.execute(r);
        threadPool.execute(r);

    }
}
