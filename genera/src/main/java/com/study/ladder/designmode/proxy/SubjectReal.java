package com.study.ladder.designmode.proxy;

/**
 * 业务真正执行人
 *
 * @author suxin
 * @since 2021-05-08
 */
public class SubjectReal implements Subject {

    @Override
    public void request() {
        System.out.println("真正的业务执行");
    }
}
