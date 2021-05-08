package com.study.ladder.designmode.proxy;

/**
 * 代理模式测试，通过代理控制对象的访问
 *
 * @author suxin
 * @since 2021-05-08
 */
public class ProxyTest {

    public static void main(String[] args) {
        SubjectProxy subjectProxy = new SubjectProxy();
        subjectProxy.request();
    }
}
