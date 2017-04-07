package com.study.Ladder.timer;

import java.util.Calendar;
import java.util.Date;
import java.util.Timer;

public class TimerTest {
	Timer timer;

	public TimerTest(){
		Date time = getTime();
		System.out.println("指定时间"+time);
		timer = new Timer();
		timer.schedule(new DeleteFileAction(), time);
	}
	
	public TimerTest(int time){
		timer = new Timer();
		timer.schedule(new DeleteFileAction(), time * 10000);
	}
	
	public Date getTime(){
		
		Calendar calendar = Calendar.getInstance();
		calendar.set(Calendar.HOUR_OF_DAY, 11);
		calendar.set(Calendar.MINUTE, 40);
		calendar.set(Calendar.SECOND, 00);
		Date time = calendar.getTime();
		
		return time;
	}
	
	public static void main(String[] args){
		System.out.println("timer begin....");
		new TimerTest();
	}
}
