package com.inheritance;

public class Child extends Animal{		//if we dint use extends then we cant call parent method


	public static void main(String[] args) {
		
		Child obj=new Child();
		obj.eat();
	}

}

