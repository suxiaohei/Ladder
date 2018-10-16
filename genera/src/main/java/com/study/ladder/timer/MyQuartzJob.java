package com.study.ladder.timer;

import java.util.Date;

import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;

public class MyQuartzJob implements Job {

	public void execute(JobExecutionContext arg0) throws JobExecutionException {
		System.out.println("Hellow World ! - " + new Date());
	}

}

