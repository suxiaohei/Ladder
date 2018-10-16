package com.study.ladder.thread;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/**
 * @author suxin
 */
public class CallableTest {

    public static void main(String[] args) {
        ExecutorService pool = Executors.newFixedThreadPool(2);

        Callable c1 = new MyCallable("A");
        Callable c2 = new MyCallable("B");

        Future<String> f1 = pool.submit(c1);
        Future<String> f2 = pool.submit(c2);

        try {
            System.out.println(">>>>>>>>>" + f1.get().toString());
            System.out.println(">>>>>>>>>" + f2.get().toString());
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }

        pool.shutdown();
    }
}

class MyCallable<String> implements Callable {

    private String oid;

    MyCallable(String oid) {
        this.oid = oid;
    }

    @Override
    public Object call() throws Exception {
        return oid + "���񷵻ص�����";
    }

}
