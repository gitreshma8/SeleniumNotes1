package com.javapractice.pakge;

public class Animal {

	
	String color,name;
	int age;
	
	public static void main(String[] args) {
		
		System.out.println("1");
		
		Animal eatobj=new Animal();
		eatobj.eat("black", 10);
	
		eatobj.color="black";
		eatobj.age=14;
		System.out.println(eatobj.color+" "+eatobj.age);
		eatobj.dispaly();
		
		eatobj.namedDisplay("rony");
		
		eatobj.run();
		
	}
	
	
	public void eat(String c,int a) {
		
		color=c;
		age=a;
		
		System.out.println("eating");
	}
	
	void namedDisplay(String n) {
		
		name=n;
	}
	
	void run() {
		
		System.out.println(color+name);
	}
	
	void dispaly() {
		
		System.out.println(color+age);
	}
	
	
	
}
