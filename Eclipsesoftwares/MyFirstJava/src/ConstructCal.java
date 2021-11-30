

/*Write the above program with parameterized constructor (to calculate total amount).
(instance methods) */

public class ConstructCal {

	void  amountFirst(int a,int b,int c) {
		
		int totalAMount=a+b+c;
		System.out.println("TotalAmount is :"+totalAMount);
	}
	
	
	void  amountSec(float a,float b,float c) {
		
		float totalAMount=a+b+c;
		
		System.out.println("TotalAmount is :"+totalAMount);
		
	}
	
	public static void main(String[] args) {
		
		ConstructCal cc=new ConstructCal();
		
		cc.amountFirst(10,20,30);
		cc.amountSec(1.2f,2.3f,3.3f);
		
		
	}
	
}
