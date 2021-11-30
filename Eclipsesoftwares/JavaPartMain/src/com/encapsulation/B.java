package com.encapsulation;

//public class B extends HumanC{	//this is through inheritance...but we need to create obj for 
	//parent classfor encapsulation
	
	class B{
		
		
	public static void main(String[] args) {
		
		
		HumanC obj=new HumanC();

			
//	obj.setA(10);
	
	System.out.println(" Age is :"+" "+obj.getA());
	
	
	
	System.out.println(" Name is :"+" "+obj.getB());
	
	obj.setC(10.3f);
	
	System.out.println(" Weight is :"+" "+obj.getC());

	}

}
