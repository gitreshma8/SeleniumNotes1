//package com.exrcisesalary;
//
//import java.util.Scanner;
//
//
//public class EmplyoyeeTest {
//	
//	String name;
//	float totalSalary;
//	Calculate calObj;
//	getEmployeeData dataObj;
//	
//	public static void main(String[] args) {
//		EmplyoyeeTest obj= new EmplyoyeeTest();
//	    Scanner sc= new Scanner(System.in);
//		System.out.print("Enter Name   : ");
//		obj.name =sc.next();
//		obj.getTotalSalary();
//		obj.paySlip();
//		
//	}
//	
//	public void getTotalSalary() {
//		dataObj= new getEmployeeData();//same as String(Aggregation )creating 
//		dataObj.getBasicPay();
//		dataObj.getDeduction();
//		dataObj.getBonus();
//		
//		calObj=new Calculate();
//		
//		calObj.calculateHRA(dataObj.basicPay);
//
//		calObj.calculatePF(dataObj.basicPay);
//		
//		totalSalary=(float)(dataObj.basicPay+calObj.hra-calObj.pf-dataObj.deduction+dataObj.bonus);
//		
//	}
//	
//	public void paySlip() {
//		  System.out.println(" Name         : "+name);
//		  System.out.println(" Basic pay    : "+dataObj.basicPay);
//		  System.out.println(" Deduction    : "+dataObj.deduction);
//		  System.out.println(" HRA          : "+calObj.hra);
//		  System.out.println(" PF           : "+calObj.pf);
//		  System.out.println(" Total Salary : "+totalSalary);
//		  		
//	}
//
//}
