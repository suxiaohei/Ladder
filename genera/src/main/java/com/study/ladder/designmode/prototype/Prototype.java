package com.study.ladder.designmode.prototype;

/**
 * 原型
 *
 * @author suxin
 * @since 2021-05-08
 */
public class Prototype implements Cloneable {

    /**
     * 字符串
     */
    private String str;

    /**
     * 数字
     */
    private Integer num;

    /**
     * 原型子类
     */
    private PrototypeSub prototypeSub;

    public Prototype(String str, Integer num, PrototypeSub prototypeSub) {
        this.str = str;
        this.num = num;
        this.prototypeSub = prototypeSub;
    }

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

    public PrototypeSub getPrototypeSub() {
        return prototypeSub;
    }

    public void setPrototypeSub(PrototypeSub prototypeSub) {
        this.prototypeSub = prototypeSub;
    }

    @Override
    protected Prototype clone() {
        Prototype prototype = null;
        // 克隆
        try {
            prototype = (Prototype) super.clone();
            prototype.prototypeSub = this.prototypeSub.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

        return prototype;
    }
}
