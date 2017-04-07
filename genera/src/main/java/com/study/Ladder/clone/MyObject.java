package com.study.Ladder.clone;

public class MyObject implements Cloneable {

	int i;
	MyObject(int ii){
		i = ii;
	}
	

	
	public Object clone(){
		Object o = null;
		try {
			o = super.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return o;
	}
	
	public String toString(){
		return Integer.toString(i);
	}
}
