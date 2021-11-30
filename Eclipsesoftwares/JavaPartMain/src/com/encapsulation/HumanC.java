package com.encapsulation;

public class HumanC {
	
	private int age;
	private String name;
	private float weight;
	
	//setter method
	
	public void setA(int x) {
		
		age=x;
	}
//	public void setB(String y ) {
//		
//		name=y;
//	}
	public void setC(float z) {
		weight=z;
	}


	
	//getter method
	
	public int getA() {
		
		return age;
	}
	public String getB() {
		
		return name;
	}
	public float getC() {
		
		return weight;
	}
	
}
//public static void main(String[] args) {
//	
//	
//	HumanC  obj=new HumanC();
//
//		
//obj.setA(10);
//
//System.out.println(" Age is :"+" "+obj.getA());
//
//obj.setB("roy");
//
//System.out.println(" Name is :"+" "+obj.getB());
//
//obj.setC(10.3f);
//
//System.out.println(" Weight is :"+" "+obj.getC());
//
//}
//}
