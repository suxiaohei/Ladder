package com.study.ladder.designmode.composite;

/**
 * 公司基类
 *
 * @author suxin
 * @since 2021-05-08
 */
public abstract class Organization {

    /**
     * 名称
     */
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    /**
     * 新增
     *
     * @param company 公司
     */
    public abstract void add(Organization company);

    /**
     * 移除
     *
     * @param company 公司
     */
    public abstract void remove(Organization company);

    /**
     * 显示层级
     */
    public abstract void showLine();

    /**
     * 显示职责
     */
    public abstract void showDuty();
}
