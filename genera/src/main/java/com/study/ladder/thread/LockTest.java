package com.study.ladder.thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author suxin
 */
public class LockTest {

    public static void main(String[] args) {
        MyCount myCount = new MyCount("99990008080011111", 10000);
        Lock lock = new ReentrantLock();
        ExecutorService pool = Executors.newCachedThreadPool();
        UserLock ul1 = new UserLock("����", myCount, -4000, lock);
        UserLock ul2 = new UserLock("��������", myCount, 6000, lock);
        UserLock ul3 = new UserLock("��������", myCount, -8000, lock);
        UserLock ul4 = new UserLock("����", myCount, 800, lock);

        pool.execute(ul1);
        pool.execute(ul2);
        pool.execute(ul3);
        pool.execute(ul4);

        pool.shutdown();
    }
}

class UserLock implements Runnable {

    private String name;
    private MyCount myCount;
    private int iocash;
    private Lock myLock;

    UserLock(String name, MyCount myCount, int iocash, Lock myLock) {
        this.name = name;
        this.myCount = myCount;
        this.iocash = iocash;
        this.myLock = myLock;
    }

    @Override
    public void run() {
        myLock.lock();
        System.out.println(name + "���ڲ���" + myCount + "�˻������Ϊ" + iocash + ",��ǰ���Ϊ" + myCount.getCash());
        myCount.setCash(myCount.getCash() + iocash);
        System.out.println(name + "����" + myCount + "�˻��ɹ������Ϊ" + iocash + ",��ǰ���Ϊ" + myCount.getCash());
        myLock.unlock();
    }

}

class MyCount {
    private String oid;
    private int cash;

    MyCount(String oid, int cash) {
        this.oid = oid;
        this.cash = cash;
    }

    public String getOid() {
        return oid;
    }

    public void setOid(String oid) {
        this.oid = oid;
    }

    public int getCash() {
        return cash;
    }

    public void setCash(int cash) {
        this.cash = cash;
    }

    @Override
    public String toString() {
        return "MyCount{" + "oid=" + oid + ",cash=" + cash + "}";
    }
}
