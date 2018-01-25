package com.study.Ladder.example;

public class IntegerCase {
    public static void main(String[] args) {
        Integer c = 10000;
        Integer d = 10000;
        int e = 10000;

        Integer a = 1;
        Integer b = 1;

        System.out.println(a == b);
        System.out.println(c == d);
        System.out.println(c.compareTo(d));
        System.out.println(c == e);
    }
}

