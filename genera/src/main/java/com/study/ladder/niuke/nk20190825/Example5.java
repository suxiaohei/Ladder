package com.study.ladder.niuke.nk20190825;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Java的%运算符支持整数、浮点数，对于整数，它的计算公式等于；
 * <p>
 * a % b = a － （int）(a / b) * b；
 *
 * @author suxin
 */
public class Example5 {

    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        list.add("1");
        list.add("2");
        list.add("3");
        list.add("4");

        Object[] arrayObj = list.toArray();
        for (Object s : arrayObj) {
            System.out.println(s);
        }

        String[] array = list.toArray(new String[0]);
        for (String s : array) {
            System.out.println(s);
        }
    }
}
