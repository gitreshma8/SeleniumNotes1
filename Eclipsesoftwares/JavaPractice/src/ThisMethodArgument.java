

/*This key word can be used as an argument in the method to pass.  */

public class ThisMethodArgument {
	
	void m1(ThisMethodArgument tm) {//passing argument as reference variable of current class
		

		System.out.println("m2 is in m1 method");
	}
	
	void m2() {
				
		m1(this);
		
	}
	
	public static void main(String[] args) {
		
		ThisMethodArgument tm=new ThisMethodArgument();
		tm.m2();
	
		
	}

}
