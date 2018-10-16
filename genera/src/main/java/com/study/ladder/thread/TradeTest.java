package com.study.ladder.thread;

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
 * �ֿ�
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
			System.out.println("Ҫ�����Ĳ�Ʒ����"+neednum+"����ʣ������"+(max_size-curnum)+",��ʱ��������");
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		curnum += neednum;
		System.out.println("�Ѿ�������"+neednum+"����Ʒ�����ڲִ���Ϊ"+curnum);
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
		System.out.println("�Ѿ�������"+neednum+"����Ʒ���ֲִ���Ϊ"+ curnum);
		notifyAll();
	}
}

/**
 * ������
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