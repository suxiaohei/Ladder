package com.study.ladder.designmode.composite;

/**
 * 人力部门
 *
 * @author suxin
 * @since 2021-05-08
 */
public class DepartmentHr extends Organization {

    @Override
    public void add(Organization company) {

    }

    @Override
    public void remove(Organization company) {

    }

    @Override
    public void showLine() {
        System.out.println("---" + this.getName());
    }

    @Override
    public void showDuty() {
        System.out.println(this.getName() + " 负责人力");
    }
}
