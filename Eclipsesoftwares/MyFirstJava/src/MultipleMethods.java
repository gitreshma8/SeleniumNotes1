
public class MultipleMethods {
	
	///In same class and same main method---calling directly//
	//non static<--->nonstatic
	
	//nonstatic<---static
	
	//static<----non static
	
	//static <--->static
	
	//static<---nonstatic(it should have created obj for that class
	int a;
	public static void main(String []args) {
		
		MultipleMethods Mul=new MultipleMethods();
		Mul.job();
		Mul.job1();
		
	}
	
	
	public void job() {
		
		int b=10,c=2;
		
		System.out.println("Calling method job");
		job1();
		
		int sum=a+b+c;
		System.out.println(sum);
		
		
	}
public void job1() {
		

		System.out.println("Calling method after job1");
		
		job2();
	}
public void job2() {
	
	
	
	System.out.println("Calling method job2");
	
	
}

}
