package com.study.ladder.designmode.proxy;

import org.springframework.util.ObjectUtils;

/**
 * 业务代理
 *
 * @author suxin
 * @since 2021-05-08
 */
public class SubjectProxy implements Subject {

    /**
     * 代理类
     */
    private SubjectReal subject;

    public SubjectProxy() {
        this.subject = new SubjectReal();
    }

    @Override
    public void request() {
        if (!ObjectUtils.isEmpty(subject)) {
            subject.request();
        }
    }
}
