package com.study.ladder.niuke.nk20190825;

import java.util.HashSet;
import java.util.Set;

/**
 * Java的%运算符支持整数、浮点数，对于整数，它的计算公式等于；
 * <p>
 * a % b = a － （int）(a / b) * b；
 *
 * @author suxin
 */
public class Example7 {

    public static void main(String[] args) {

        String test = "A,B,C,,";

        System.out.println(test.split(",").length);
    }
}
