package com.superkeyword;

public class B extends A{
	
	
//	public int a;
	
	B(){
		
		super(80);//at a time only one constructor
		
		a=70;
	}
	
//	@Override
//	public void show() {
//		
//		System.out.println(a);
//	}
//	
	
	public void result(){
		
		int a=90;
		
		System.out.println(a);
		System.out.println(this.a);
		System.out.println(super.a);
		System.out.println(super.c);//by default also it will show when object calls
		
	}
	
	public static void main(String[] args) {
		
		B obj1=new B();
		obj1.result();
	}
}
