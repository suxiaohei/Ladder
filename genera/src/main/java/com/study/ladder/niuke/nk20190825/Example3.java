package com.study.ladder.niuke.nk20190825;

/**
 *Java的%运算符支持整数、浮点数，对于整数，它的计算公式等于；
 *
 * a % b = a － （int）(a / b) * b；
 *
 * @author suxin
 */
public class Example3 {

    public static void main(String[] args) {
        int sum = 0;
        int i = 0, j = 0;

        for (j = 0; j < 6; j++) {
            if ((j % 2d) == 0d) {
                continue;
            }
            System.out.println("j = [" + j + "]");
            System.out.println("j % 2 = [" + (j % 2d) + "]");
            sum++;
        }

        System.out.println("sum = " + sum);
    }
}
