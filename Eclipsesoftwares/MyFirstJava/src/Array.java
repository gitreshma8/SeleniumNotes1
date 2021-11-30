
import java.util.Scanner;

class Array{
	
	int Result;
	Scanner sc=new Scanner(System.in);
	
 void DoWhile() {
	
	
		

				
		do{
					
			System.out.println("Enter a number");
		
		int x=sc.nextInt();
		
			System.out.println("Enter a number");
		
		int y=sc.nextInt();
		
		int Sum=x+y;
		
		Result=Sum;			
				
			
		}while(Result<=10);
		
		
	System.out.println(Result);
repeat();

}

void repeat() {
		
if(Result>10) {
			
			 System.out.println("Do you want to perform the operation again/press 1 to continue and 0 to exit");
			
			 int option=sc.nextInt();
			 
			 if(option==1) {
				 
				 
				 
				DoWhile();
				 
				 
			 }else {
				 
					System.out.println("Terminated");
					
			 }
			
		}
}

		public static void main(String[] args){
			
		Array dw=new Array();
		dw.DoWhile();

		
	}	
	

	
}