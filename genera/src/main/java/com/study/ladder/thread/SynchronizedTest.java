package com.study.ladder.thread;

public class SynchronizedTest {

	public static void main(String[] args){
		User u = new User("����",100);
		MyThreadSyn t1 = new MyThreadSyn("�߳�A", u, 20);
		MyThreadSyn t2 = new MyThreadSyn("�߳�B", u, -60);
		MyThreadSyn t3 = new MyThreadSyn("�߳�C", u, -80);
		MyThreadSyn t4 = new MyThreadSyn("�߳�D", u, -30);
		MyThreadSyn t5 = new MyThreadSyn("�߳�E", u, 32);
		MyThreadSyn t6 = new MyThreadSyn("�߳�F", u, 21);
		
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		t5.start();
		t6.start();
	}
}

class MyThreadSyn extends Thread{
	private User u;
	private int y =0;
	
	MyThreadSyn(String name,User u,int y){
		super(name);
		this.u = u;
		this.y = y;
	}
	
	public void run(){
		u.oper(y);
	}
}

class User{
	private String code;
	private int cash;
	
	User(String code,int cash){
		this.code = code;
		this.cash = cash;
	}
	
	public String getCode(){
		return code;
	}
	
	public void SetCode(String code){
		this.code = code;
	}
	
	public synchronized void oper(int x){
		try {
			Thread.sleep(10L);
			this.cash += x;
			System.out.println(Thread.currentThread().getName() + "���н��������ӡ�"+x+"������ǰ�û��˻����Ϊ��" + cash);
			Thread.sleep(10L);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	@Override
	public String toString(){
		return "User{" + 
					"code = '" + code + "\\" + 
					", cash = " + cash + "}"; 
	}
	
	
	
	
	
	
	
}