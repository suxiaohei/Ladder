package com.study.ladder.timer;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class ScheduledExecutorTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		ScheduledExecutorTest test = new ScheduledExecutorTest();
		test.timerOne();
//		test.timerTwo();
		test.timerThree();
	}
	
	private ScheduledExecutorService scheduExec;
	
	public long start;
	
	public ScheduledExecutorTest(){
		this.scheduExec = Executors.newScheduledThreadPool(2);
		this.start = System.currentTimeMillis();
	}
	
	public void timerOne(){
		scheduExec.schedule(new Runnable(){
			@Override
			public void run(){
				System.out.println("timerOne,the time:"+(System.currentTimeMillis() - start));
				try{
					Thread.sleep(4000);
				}catch(Exception e){
					e.printStackTrace();
				}
			}
		},1000,TimeUnit.MILLISECONDS);
	}

	public void timerTwo(){
		scheduExec.schedule(new Runnable(){
			@Override
			public void run(){
				System.out.println("timerTwo,the time:"+(System.currentTimeMillis() - start));
			}
		},2000,TimeUnit.MILLISECONDS);
	}
	
	public void timerThree(){
		scheduExec.scheduleAtFixedRate(new Runnable(){
			@Override
			public void run(){
				System.out.println("timerThree,the time:"+(System.currentTimeMillis() - start));
			}
		},2000,500,TimeUnit.MILLISECONDS);
	}
}
