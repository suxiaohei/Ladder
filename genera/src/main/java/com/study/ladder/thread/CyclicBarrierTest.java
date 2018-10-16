package com.study.ladder.thread;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

/**
 * @author suxin
 */
public class CyclicBarrierTest {

    /**
     * @param args args
     */
    public static void main(String[] args) {
        CyclicBarrier cb = new CyclicBarrier(7, new MainTask());
        new SubTask("A", cb).start();
        new SubTask("B", cb).start();
        new SubTask("C", cb).start();
        new SubTask("D", cb).start();
        new SubTask("E", cb).start();
        new SubTask("F", cb).start();
        new SubTask("G", cb).start();
    }
}

class MainTask implements Runnable {
    @Override
    public void run() {
        System.out.println(">>>>>>>>ִ��������<<<<<<<<");
    }
}

class SubTask extends Thread {
    private String name;
    private CyclicBarrier cb;

    SubTask(String name, CyclicBarrier cb) {
        this.name = name;
        this.cb = cb;
    }

    @Override
    public void run() {
        System.out.println("[������" + name + "]��ʼִ��");
        for (int i = 0; i < 2; i++) {
            System.out.println("[������" + name + "]��ʼִ����ɣ���֪ͨ�ϰ����Ѿ����");
            try {
                cb.await();
            } catch (InterruptedException e) {
                e.printStackTrace();
            } catch (BrokenBarrierException e) {
                e.printStackTrace();
            }
        }
    }
}
	
