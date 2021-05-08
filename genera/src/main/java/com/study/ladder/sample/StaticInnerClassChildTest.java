package com.study.ladder.sample;

public class StaticInnerClassChildTest extends StaticInnerClassTest {

    private String testStr;

    public StaticInnerClassChildTest(String testStr) {
        super(testStr);
        this.testStr = testStr;

        System.out.println("child " + this.testStr);
    }

    // @Override
    // public void test() {
    //
    // }

    public static void main(String[] args) {
        int a = 8;
        int b = a--;
        int c = ++b;
        System.out.println(c);
        // int d = ++ (a--);
        // int b = ++a+d;
        // int c = -1;
        // new StaticInnerClassChildTest("test");
    }
}



