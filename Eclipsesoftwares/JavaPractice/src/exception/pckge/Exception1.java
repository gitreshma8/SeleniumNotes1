package exception.pckge;

public class Exception1 {
	
	
	

void verifyLicence(int age) throws CustomMain {
		
		if(age<18) {
			
			
			throw new CustomMain(age);
			
			
			
		}	}
		public static void main(String[]args) throws CustomMain {
			
			Exception1 obj1=new Exception1();
				
			obj1.verifyLicence(10);
		
		
		
	
		
	}
	
}
