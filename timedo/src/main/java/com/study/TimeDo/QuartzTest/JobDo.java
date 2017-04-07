package com.study.TimeDo.QuartzTest;

import org.quartz.JobBuilder;
import org.quartz.JobDetail;
import org.quartz.Scheduler;
import org.quartz.SchedulerException;
import org.quartz.SchedulerFactory;
import org.quartz.SimpleScheduleBuilder;
import org.quartz.Trigger;
import org.quartz.TriggerBuilder;
import org.quartz.impl.StdSchedulerFactory;

public class JobDo {

	
	/**
	 * @param args
	 * @throws SchedulerException 
	 */
	public static void main(String[] args) throws SchedulerException {
		//创建JobDetial对象
		JobDetail jobDetail = JobBuilder.newJob(MyQuartzJob.class).withIdentity("testJob-1","group_1").build();
		
		Trigger trigger = TriggerBuilder.newTrigger()
							.withIdentity("trigger_1", "group_1")
							.startNow().withSchedule(SimpleScheduleBuilder.simpleSchedule()
														.withIntervalInSeconds(10).withRepeatCount(5)).build();
		SchedulerFactory sf = new StdSchedulerFactory();
		Scheduler sched = sf.getScheduler();
		sched.scheduleJob(jobDetail,trigger);
		sched.start();

	}
}
