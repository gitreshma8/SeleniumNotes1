package exception.pckge;

import java.util.Scanner;


public class TryCatch {

	
	public static void main(String[] args) {
		
			int[] d= {1,2,3};
			
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter two values");
		
		int a=sc.nextInt();
		int b=sc.nextInt();
		
		int c=0;
		
		
		
		try {				//add diff try and catch
			
			System.out.println(d[5]);
		}
		
		
	catch(Exception e) {
			
			System.out.println("checking array");//any message..we can customize
			
			
		}
			try {
			c=a/b;
		}	
					
//		catch(ArithmeticException e) {
//			
//			System.out.println("division is not possible");//any message
//			
//			
//		}
		
		catch(Exception e) {//parent class--it can hold any child's obj
			
			System.out.println(e.getMessage());//any message..we can customize or can add get message of e
		}
		
		
		System.out.println(c);
	}
	
}
