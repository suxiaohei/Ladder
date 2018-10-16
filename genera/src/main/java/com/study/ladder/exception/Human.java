package com.study.ladder.exception;

public class Human {
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {

//		s();
		notS();
	}

	public static void s() {
		try{
			throw new Sneeze();
		}catch(Sneeze s){
			System.out.println("Caught Sneeze");
		}catch(Annoyance a){
			System.out.println("Caught Annoyance");
		}
	}
	
//	public static void a(){
//		try{
//			throw new Sneeze();
//		}catch(Annoyance a){
//			System.out.println("Caught Annoyance");
//		}catch(Sneeze s){
//			System.out.println("Caught Sneeze");
//		}
//	}
	
	public static void notS(){
		try{
			throw new Sneeze();
		}catch(Annoyance a){
			System.out.println("Caught Annoyance");
		}
	}
	
}
