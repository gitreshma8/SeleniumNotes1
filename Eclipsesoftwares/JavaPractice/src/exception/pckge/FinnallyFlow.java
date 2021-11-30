package exception.pckge;

public class FinnallyFlow {

	public static void main(String[] args) {
	
		try {
			
			int a=100,b=0,c;
			c=a/b;
			System.out.println(c);
					
		}
	
	finally {
		
		System.out.println(" i am in finally block");
	}
		System.out.println(" again");
}
}


