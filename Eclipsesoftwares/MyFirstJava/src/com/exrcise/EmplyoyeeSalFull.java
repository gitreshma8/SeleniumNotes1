//package com.exrcise;
//import java.util.Scanner;
//public class EmplyoyeeSalFull {
//	String name;
//	float totalSalary;
//	Calculate calObj;
//	getEmployeeData dataObj;
//	
//	public static void main(String[] args) {
//		EmplyoyeeSalFull obj= new EmplyoyeeSalFull();
//	    Scanner sc= new Scanner(System.in);
//		System.out.print("Enter Name   : ");
//		obj.name =sc.next();
//		obj.getTotalSalary();
//		obj.paySlip();
//		
//		
//	}
//	
//	public void getTotalSalary() {
//		dataObj= new getEmployeeData();
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
//
//class getEmployeeData{
//  public float basicPay;
//  public float deduction;
//  public float bonus;
//  
//  public void getBasicPay() {
//	  Scanner sc= new Scanner(System.in);
//	  System.out.print("Enter Basic pay :");
//	  basicPay = sc.nextFloat();
//	  
//  }
//  
//  
//  public void getDeduction() {
//	  Scanner sc= new Scanner(System.in);
//	  System.out.print("Enter Deduction :");
//	  deduction = sc.nextFloat();
//	  
//	  
//  }
//  
//
//public void getBonus() {
//	  Scanner sc= new Scanner(System.in);
//	  System.out.print("Enter bonus :");
//	  bonus = sc.nextFloat();
//	  
//}
//	
//		
//}
//
//class Calculate{
//	float hra;
//	float pf;
//	public void calculateHRA(float basicPay) {
//		hra=(float)(0.05*basicPay);
//	}
//	
//	public void calculatePF(float basicPay) {
//		pf=(float)(0.2*basicPay);
//
//
//	}
//	
//	
//}
//
//
