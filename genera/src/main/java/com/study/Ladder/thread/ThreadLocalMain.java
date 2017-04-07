package com.study.Ladder.thread;

public class ThreadLocalMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		ThreadLocalMy tlm = new ThreadLocalMy();
		Thread t1 = new ThreadLocalTest(tlm);
		Thread t2 = new ThreadLocalTest(tlm);
		Thread t3 = new ThreadLocalTest(tlm);
		Thread t4 = new ThreadLocalTest(tlm);
		
		t1.start();
		t2.start();
		t3.start();
		t4.start();
	}
	
}
