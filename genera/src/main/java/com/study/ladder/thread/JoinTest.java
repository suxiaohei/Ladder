package com.study.ladder.thread;

public class JoinTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Thread t = new MyThread();
		t.start();
		
		for(int i=0;i<20;i++){
			System.out.println("??????"+i+"?????");
			if(i>2){
				try {
					t.join();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
	}
}

class MyThread extends Thread{
	public void run(){
		for(int i=0;i<10;i++){
			System.out.println("??????"+i+"?????");
		}
	}
}
