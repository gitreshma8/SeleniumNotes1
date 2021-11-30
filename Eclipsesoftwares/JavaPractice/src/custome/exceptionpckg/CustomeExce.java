////license eligibility
//
//package custome.exceptionpckg;
//
//public class CustomeExce {
//
//	
//
//	
//	void checkAge(int age) throws LicenseExce {//declaring throws
//		
//		
//		if(age>18) {
//			
//			System.out.println("Eligible");
//		}else {//if not exception,so throw that exception
//			
//			throw new LicenseExce("Not Eligible");//throwing to constructor
//			
//			
//		}
//	}
//	
//	public static void main(String[] args) {
//	
//		CustomeExce obj=new CustomeExce();
//		
//		try {
//			
//		obj.checkAge(16);//again exception chance..so use try catch
//		
//		}catch(Exception e) {
//			
//			System.out.println("Exception handled");
//			
//			System.out.println(e);//to get which type of exception handled
//		}
//		
//		
//		System.out.println("End of Statement");
//		
//	}
//
//}
