package com.study.Ladder.thread;

public class TradeTest {

	public static void main(String[] args){
		Godown godown = new Godown(30);
		Consumer c1 = new Consumer(50,godown);
		Consumer c2 = new Consumer(20,godown);
		Consumer c3 = new Consumer(30,godown);
		Producer p1 = new Producer(10,godown);
		Producer p2 = new Producer(10,godown);
		Producer p3 = new Producer(10,godown);
		Producer p4 = new Producer(10,godown);
		Producer p5 = new Producer(10,godown);
		Producer p6 = new Producer(10,godown);
		Producer p7 = new Producer(80,godown);
		
		c1.start();
		c2.start();
		c3.start();
		p1.start();
		p2.start();
		p3.start();
		p4.start();
		p5.start();
		p6.start();
		p7.start();
	}
}

/**
 * 仓库
 * @author Administrator
 *
 */
class Godown{
	public static final int max_size = 100;
	public int curnum;
	
	Godown(){
		
	}
	
	Godown(int curnum){
		this.curnum = curnum;
	}
	
	public synchronized void produce(int neednum){
		while(neednum+curnum > max_size){
			System.out.println("要生产的产品数量"+neednum+"超过剩余库存量"+(max_size-curnum)+",暂时不能生产");
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		curnum += neednum;
		System.out.println("已经生产了"+neednum+"个产品，现在仓储量为"+curnum);
		notifyAll();
	}
	
	public synchronized void consume(int neednum){
		while(curnum < neednum){
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		curnum -= neednum;
		System.out.println("已经消费了"+neednum+"个产品，现仓储量为"+ curnum);
		notifyAll();
	}
}

/**
 * 生产者
 * @author Administrator
 *
 */
class Producer extends Thread{
	private int neednum;
	private Godown godown;
	
	Producer(int neednum,Godown godown){
		this.neednum = neednum;
		this.godown = godown;
	}
	
	public void run(){
		godown.produce(neednum);
	}
}

class Consumer extends Thread{
	private int neednum;
	private Godown godown;
	
	Consumer(int neednum,Godown godown){
		this.neednum = neednum;
		this.godown = godown;
	}
	
	public void run(){
		godown.consume(neednum);
	}
}