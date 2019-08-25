package com.study.ladder.niuke.nk20190825;

/**
 * String类重写了equlas方法，类型不同返回false，附上源码(jdk1.7)
 *
 * @author suxin
 */
public class Example2 {

    public static void main(String[] args) {
        String s = "hello";
        String t = "hello";
        char c[] = {'h', 'e', 'l', 'l', 'o'};

        System.out.println("t.equals(c) = " + t.equals(c));
        System.out.println("t.equals(s) = " + t.equals(s));
        System.out.println("t == s = " + (s == t));
    }
}
