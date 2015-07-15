package com.study.Ladder.thread;

public class SynchronizedTestTwo {

	public static void main(String[] args){
		UserTwo u = new UserTwo("张三",100);
		MyThreadSynTwo t1 = new MyThreadSynTwo("线程A", u, 20);
		MyThreadSynTwo t2 = new MyThreadSynTwo("线程B", u, -60);
		MyThreadSynTwo t3 = new MyThreadSynTwo("线程C", u, -80);
		MyThreadSynTwo t4 = new MyThreadSynTwo("线程D", u, -30);
		MyThreadSynTwo t5 = new MyThreadSynTwo("线程E", u, 32);
		MyThreadSynTwo t6 = new MyThreadSynTwo("线程F", u, 21);
		
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		t5.start();
		t6.start();
	}
}

class MyThreadSynTwo extends Thread{
	private UserTwo u;
	private int y =0;
	
	MyThreadSynTwo(String name,UserTwo u,int y){
		super(name);
		this.u = u;
		this.y = y;
	}
	
	public void run(){
		u.oper(y);
	}
}

class UserTwo{
	private String code;
	private int cash;
	
	UserTwo(String code,int cash){
		this.code = code;
		this.cash = cash;
	}
	
	public String getCode(){
		return code;
	}
	
	public void SetCode(String code){
		this.code = code;
	}
	
	public void oper(int x){
		try {
			Thread.sleep(10L);
			synchronized(this){
				this.cash += x;
				System.out.println(Thread.currentThread().getName() + "运行结束，增加‘"+x+"’，当前用户账户余额为：" + cash);
			}
			Thread.sleep(10L);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	@Override
	public String toString(){
		return "UserTwo{" + 
					"code = '" + code + "\\" + 
					", cash = " + cash + "}"; 
	}
	
	
	
	
	
	
	
}