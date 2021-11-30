package exception.pckge;

public class CustomMainVoting {
	
		public static void main(String[] args) {
		
		try {
		int age=10;
				if(age<18) {
					
		throw new UnderAgeCustomException("Not eleigible:here we can pass the message to be printed via default exception handler,own message");
					
//					throw new UnderAgeCustomException();//it will take default constructor message from parnt class
				}else {
					
					System.out.println("eligible");
				}
		}catch(UnderAgeCustomException e) {
			
			e.printStackTrace();
		}
		
	}
}

