package com.study.ladder.example;

public class Aliasl {
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Aliasl x = new Aliasl(7);
		Aliasl y = x;
		System.out.println("x:" + x.i);
		System.out.println("y:" + y.i);
		
		System.out.println("Incrementing x");
		x.i++;
		
		System.out.println("x:" + x.i);
		System.out.println("y:" + y.i);
	}
	
	int i;
	Aliasl(int ii){
		i = ii;
	}
	
}
