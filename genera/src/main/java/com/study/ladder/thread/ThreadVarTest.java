package com.study.ladder.thread;

/**
 * @author suxin
 */
public class ThreadVarTest {

    /**
     * @param args args
     */
    public static void main(String[] args) {

        Thread t1 = new MyThreadVar();
        Thread t2 = new MyThreadVar();
        Thread t3 = new MyThreadVar();
        Thread t4 = new MyThreadVar();

        t1.start();
        t2.start();
        t3.start();
        t4.start();
    }
}

class MyThreadVar extends Thread {
    private static int sn = 0;
    private int x = 0;

    MyThreadVar() {
        x = sn++;
    }

    public void run() {
        Thread t = Thread.currentThread();
        System.out.println(t.getName() + "\t" + x);
    }
}