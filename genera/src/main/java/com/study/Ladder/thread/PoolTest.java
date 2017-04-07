package com.study.Ladder.thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class PoolTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		ExecutorService pool = Executors.newFixedThreadPool(2);
		Thread t1 = new MyThreadPool();
		Thread t2 = new MyThreadPool();
		Thread t3 = new MyThreadPool();
		Thread t4 = new MyThreadPool();
		Thread t5 = new MyThreadPool();
		
		pool.execute(t1);
		pool.execute(t2);
		pool.execute(t3);
		pool.execute(t4);
		pool.execute(t5);
		
		pool.shutdown();
	}
	
}

class MyThreadPool extends Thread{
	public void run(){
		System.out.println(Thread.currentThread().getName()+"ÕýÔÚÖ´ÐÐ");
	}
}
