package com.study.ladder.designmode.prototype;

/**
 * 原型子类
 *
 * @author suxin
 * @since 2021-05-08
 */
public class PrototypeSub implements Cloneable {

    /**
     * 字符串
     */
    private String str;

    /**
     * 数字
     */
    private Integer num;

    public String getStr() {
        return str;
    }

    public void setStr(String str) {
        this.str = str;
    }

    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }

    @Override
    protected PrototypeSub clone() {
        PrototypeSub prototypeSub = null;
        // 克隆
        try {
            prototypeSub = (PrototypeSub) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

        return prototypeSub;
    }
}
