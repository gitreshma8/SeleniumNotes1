package exception.pckge;

import java.util.Scanner;

 class ThrowVoting {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter your age");
		
		int age=sc.nextInt();
//		to handle exception using try catch block
		
		try {
				if(age<18) {
					
					throw new AgeExeption("You are not eligible to vote");
//					System.out.println("hiiii");
				}	else {
			
					System.out.println("Eligible");
				}
		}catch(Exception e) {
			
			
		e.printStackTrace();
		
	}
		System.out.println("hello");
			
	}
}


