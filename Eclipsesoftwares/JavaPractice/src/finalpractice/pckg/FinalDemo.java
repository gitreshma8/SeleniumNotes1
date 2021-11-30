package finalpractice.pckg;

 public class FinalDemo {
	 
	final int a=50;
	 
	 static void m1() {
		 final int a;
		 	 a=10;
	System.out.println("static method"+a);
	
	
	 }
	 
	 FinalDemo(){
		 
		 final int a=5;
		 
		 System.out.println("constructor"+a);
	 }
	 static {

      final int a=20;
		 
      System.out.println("static bloack"+a);
	 }
	 
	 
	 
//	final void  m1() {
//		
//		
//		System.out.println("i am in Demo class");
//	}

}

