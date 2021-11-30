
public class MultipleOpns {
	
	
	static int a=10,b=2;
	
public static int addition() {
	
	int sum=a+b;
	
	System.out.println("Addition is"+ " "+sum);
	
return sum;
		
	}	
	
	public static void multiplication() {
		
		int Result=a*b;
		
		int product=Result+a;
		
		System.out.println("Multiplication is"+" "+Result);
		System.out.println("Multiplication is"+" "+product);
		
	}

	public static void main(String[] args) {
		
	
		MultipleOpns.addition();
	
		MultipleOpns.multiplication();
		
		 int output=addition();
		 
		 int mulans=output;
		
		if(output<2) {
			
			System.out.println("yes");
		}
		else if(mulans>10) {
			
			System.out.println("yes greater than 10");
		}
		else {
			System.out.println(" less than 10");
		}
		
		

	}
	
	
	

}
