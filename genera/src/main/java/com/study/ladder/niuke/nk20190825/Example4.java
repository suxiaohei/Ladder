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
public class Example4 {

    public static void main(String[] args) {

        try {
            Set<String> s1 = new HashSet<>();
            boolean s = s1.add("2");
            System.out.println("sum = " + s);
             s = s1.add("2");
            System.out.println("sum = " + s);
            return;
            // System.out.println("sum = " + 13);
        } finally {
            System.out.println("sum = " + 11);
        }


        // System.out.println("sum = " + sum);
    }
}
