package com.study.ladder.thread;

public class ThreadLocalMy {
	
	private Integer t1 = 0;
	public Integer getNextNum(){
		return t1 = t1 + 1;
	}

//	private ThreadLocal<Integer> tl = new ThreadLocal<Integer>(){
//		
//		@Override
//		protected Integer initialValue(){
//			return 0;
//		}
//	};
//	
//	public Integer getNextNum(){
//		tl.set(tl.get() + 1);
//		return tl.get();
//	}
}
