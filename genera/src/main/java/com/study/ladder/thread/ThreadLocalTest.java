package com.study.ladder.thread;

public class ThreadLocalTest extends Thread{

	private ThreadLocalMy tlm = new ThreadLocalMy();
	
	public ThreadLocalTest(ThreadLocalMy tlm){
		this.tlm = tlm;
	}
	
	@Override
	public void run(){
		for(int i=0; i<3; i++){
			System.out.println(Thread.currentThread().getName() + "\t" + tlm.getNextNum());
		}
	}
}
