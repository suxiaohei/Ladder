package com.study.ladder.sample;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

/**
 * 内部类测试
 *
 * @author suxin
 * @since 2020-06-23
 */
public class StaticInnerClassTest {

    public String testStr;

    public StaticInnerClassTest(String testStr) {
        this.testStr = testStr;

        System.out.println("super " + this.testStr);
    }

    // public void test() {
    //     List<String> aa = new ArrayList<>();
    //     List<Integer> aa2 = new ArrayList<>();
    //     List<Object> aa3 = new ArrayList<>();
    //
    //     Object[] oo1 = {};
    //     String[] ss1 = {};
    //     ss1 = oo1;
    //     oo1 = ss1;
    //
    //     List<String>[] arg = {aa};
    //     test1(aa);
    //     test1(aa3);
    //
    //     String[] abb = {"aaa"};
    //
    // }

    @SafeVarargs
    public static <T> void test1(List<T>... args) {

    }

    @SafeVarargs
    static <T> T[] toArray(T... args) {
        return args;
    }

    static <T> T[] pickTwo(T a, T b, T c) {
        switch (ThreadLocalRandom.current().nextInt(3)) {
            case 0:
                return toArray(a, b);
            case 1:
                return toArray(a, c);
            case 2:
                return toArray(b, c);
            default:
                return toArray(b, b);
        }
    }

    public static void main(String[] args) {
        // String[] attributes = pickTwo("good", "fast", "checp");
        // Integer[] attributes1 = pickTwo(1, 2, 3);


        String[] ss = {"bb", "cc"};
        // Object[] oo = {"bb", "cc"};
        Object[] oo = ss;
        String[] ss1 = (String[]) oo;

        // Object o = "String";
        // String s = (String) o;
        // Integer i = (Integer) o;
        // System.out.println(s);

        Arrays.asList("1", "2");
        //
        // Collections.addAll(new ArrayList<>(), "1");

       Class<?> cla = Class.class;

    }

}
