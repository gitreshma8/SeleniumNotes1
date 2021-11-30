//package atm.pckge;
//
//import java.util.Scanner;
//
//public class Bank {
//	
//	private static int x,y,z,pin;
//	public static int WD,amount=5000;
//	
//	
//	public static void setPin1(int pin1) {
//		
//		x=pin1;
//		
//	}
//	public static void setPin2(int pin2) {
//		
//		y=pin2;
//		
//	}
//	public static void setPin3(int pin3) {
//	
//	z=pin3;
//	
//}
//	
//	public int getPin1() {
//		
//		return x;
//	}
//	
//
//	public int getPin2() {
//		
//		return y;
//	}
//	
//
//	public int getPin3() {
//		
//		return z;
//	}
//	
//	public static void validatePin() {
//		
//		Scanner sc=new Scanner(System.in);
//		System.out.println("Please enter your pin number");
//		
//		pin=sc.nextInt();
//		
//		Bank.setPin1(1001);
//		Bank.setPin2(1234);
//		Bank.setPin3(1212);
//		
//		if(pin==x || pin==y || pin==z) {
//			
//		
//			 Bank.withdraw();
//		}else {
//			
//			System.out.println("Please enter a valid pin number");
//			validatePin();
//		}
//		
//		
//	}
//	
//	public static void withdraw() {
//		
//		Scanner sc=new Scanner(System.in);
//		System.out.println("Please enter the amount need to withdraw");
//		
//		 WD=sc.nextInt();
//		 
//		 int wd=WD;
//		
//		if(wd>amount) {
//			
//			System.out.println("Insufficiet balance");
//		}else {
//			
//			int balance=amount-wd;
//			System.out.println("Amount withdrawn is "+wd +" "+"and Your Account balance is"+" "+balance);
//		}
//	}
//	
//}
