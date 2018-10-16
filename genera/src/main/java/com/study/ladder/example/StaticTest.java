package com.study.ladder.example;

public class StaticTest {
	
	public static void main(String[] args) {
		StaticTest test = new StaticTest();
		test.Test(test.s);
		System.out.println(test.s);
		test.Test();
		System.out.println(test.s);
		test.TestB();
		System.out.println(test.s);
	}
	
	public static String s = null;
	
	static{
		int a = 0;
	}
	
	public static void init(){
		
	}
	
	public void Test(String s){
		s = "Test";
	}
	
	public void Test(){
		this.s = "test";
	}
	
	public void TestB(){
		this.s = "TestB";
	}
	
}
