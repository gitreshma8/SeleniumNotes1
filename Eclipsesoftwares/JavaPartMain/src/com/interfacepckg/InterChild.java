package com.interfacepckg;

public class InterChild implements InterfaceDemo{

	public void show() {
		
		System.out.println("Interface method from parent");
	}
	
	
	public static void main(String[] args) {
	
		InterChild obj=new InterChild();
		
		obj.show();
		System.out.println("Interface parent variable :"+" "+InterfaceDemo.a);
}
}
