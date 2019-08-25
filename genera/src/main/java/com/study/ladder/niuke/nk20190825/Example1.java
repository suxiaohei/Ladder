package com.study.ladder.niuke.nk20190825;

/**
 * 这个类虽然继承了Thread类，但是并没有真正创建一个线程。
 * 创建一个线程需要覆盖Thread类的run方法，然后调用Thread类的start()方法启动
 * 这里直接调用run()方法并没有创建线程，跟普通方法调用一样，是顺序执行的
 *
 * @author suxin
 */
public class Example1 extends Thread {
    @Override
    public void run() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.print("run");
    }

    public static void main(String[] args) {
        Example1 example = new Example1();
        example.start();
        example.run();
        System.out.print("main");
    }
}
