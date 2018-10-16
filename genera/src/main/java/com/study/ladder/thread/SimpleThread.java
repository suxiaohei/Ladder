package com.study.ladder.thread;

/**
 * @author suxin
 */
public class SimpleThread extends Thread {

    /**
     * @param args args
     */
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            new SimpleThread().start();
            System.out.println("All Threads Started");
        }
    }

    private int countDown = 5;
    private int threadNumber;
    private static int threadCount = 0;

    public SimpleThread() {
        threadNumber = ++threadCount;
        System.out.println("Making" + threadNumber);
    }

    @Override
    public void run() {
        while (true) {
            System.out.println("Thread" + threadNumber + "(" + countDown + ")");
            if (--countDown == 0) {
                return;
            }
        }
    }

}
