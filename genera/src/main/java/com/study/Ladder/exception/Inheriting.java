package com.study.Ladder.exception;

public class Inheriting {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		try{
			f();
		}catch(MyException e){
			e.printStackTrace();
		}
		
		try{
			g();
		}catch(MyException e){
			e.printStackTrace();
		}
	}
	
	public static void f() throws MyException{
		System.out.println("Throwing MyException from f()");
		throw new MyException();
	}

	public static void g() throws MyException{
		System.out.println("Throwing MyException from g()");
		throw new MyException("Originated in g()");
	}
	
}
