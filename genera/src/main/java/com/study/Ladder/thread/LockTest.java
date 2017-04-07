package com.study.Ladder.thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class LockTest {

	public static void main(String[] args){
		MyCount myCount = new MyCount("99990008080011111",10000);
		Lock lock = new ReentrantLock();
		ExecutorService pool = Executors.newCachedThreadPool();
		UserLock ul1 = new UserLock("张三",myCount,-4000,lock);
		UserLock ul2 = new UserLock("张三他爹",myCount,6000,lock);
		UserLock ul3 = new UserLock("张三他弟",myCount,-8000,lock);
		UserLock ul4 = new UserLock("张三",myCount,800,lock);
		
		pool.execute(ul1);
		pool.execute(ul2);
		pool.execute(ul3);
		pool.execute(ul4);
		
		pool.shutdown();
	}
}

class UserLock implements Runnable{

	private String name;
	private MyCount myCount;
	private int iocash;
	private Lock myLock;
	
	UserLock(String name,MyCount myCount,int iocash,Lock myLock){
		this.name = name;
		this.myCount = myCount;
		this.iocash = iocash;
		this.myLock = myLock;
	}
	
	@Override
	public void run() {
		myLock.lock();
		System.out.println(name+"正在操作"+myCount+"账户，金额为"+iocash+",当前金额为"+myCount.getCash());
		myCount.setCash(myCount.getCash()+iocash);
		System.out.println(name+"操作"+myCount+"账户成功，金额为"+iocash+",当前金额为"+myCount.getCash());
		myLock.unlock();
	}
	
}

class MyCount{
	private String oid;
	private int cash;
	
	MyCount(String oid,int cash){
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
	public String toString(){
		return "MyCount{"+"oid="+oid+",cash="+cash+"}";
	}
}
