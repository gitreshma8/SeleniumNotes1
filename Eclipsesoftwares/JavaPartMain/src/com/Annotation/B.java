package com.Annotation;

public class B extends A{

	
	
	public static void main(String[] args) {
		
		
		B obj=new B();
		obj.show(10);
		
		A obj1=new A();
		obj1.show(12);
	}
	
	@Override
void show(int a) {
		
		System.out.println("show");
	}
	
}
