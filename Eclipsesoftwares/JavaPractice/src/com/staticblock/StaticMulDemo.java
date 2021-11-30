package com.staticblock;

public class StaticMulDemo {

	public static void main(String[] args) {
		
		System.out.println("main static");
	}
	
	static {
		
		System.out.println("hello1");
	}
	
	static {
		
		System.out.println("static 2");
	}

}
