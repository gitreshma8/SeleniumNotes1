package exception.pckge;

public class TryDemo {

	
	void add() {
		
		
		
		int a=10,b=0,c;
		try {
		int x=a/b;
		
		System.out.println(x);
		}
		finally {
			
			System.out.println("hello");
		}
		
	}
	
	
	public static void main(String[] args) {
	
		TryDemo obj=new TryDemo();
		
		obj.add();

	}

}
