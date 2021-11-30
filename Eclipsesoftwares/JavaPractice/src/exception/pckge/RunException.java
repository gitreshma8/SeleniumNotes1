package exception.pckge;

public class RunException {

	
	public static void main(String[] args) {
		
		int a=5;
		int b=0;
		
		int c;
		
		System.out.println("checking Run time Exception");
		
		try {
			
			c=a/b;
		}
		
		catch(ArithmeticException e) {//e is an obj to hold this arithmaticException class.
										//if we need we can stop here/can add a print line
			
//			e.printStackTrace();//it will show 3messages(class,descrption and line num of exception
			
//			System.out.println(e.getMessage());//only description
//			System.out.println(e);//class+description
			
			System.out.println(e.toString());//class+description
			
		}
		
		System.out.println("Continue execution");
		
		
	}

}
