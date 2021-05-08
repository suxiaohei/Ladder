package com.study.ladder.clone;

/**
 * @author suxin
 */
public class MyObject implements Cloneable {

    int i;

    MyObject(int ii) {
        i = ii;
    }


    @Override
    public Object clone() {
        Object o = null;
        try {
            o = super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return o;
    }

    @Override
    public String toString() {
        return Integer.toString(i);
    }
}
