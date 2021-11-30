
public class Factorial {
	
	int f=1,n=5;
	
	void factorialCal(){
		
		for(int i=1;i<=n;i++) {
			
			f=f*i;
		}
		
	}
	
	void factshow() {
		this.factorialCal();
		System.out.println("Factorial of "+n+" is "+" " +f);
		
	}
	
	
	public static void main(String[] args) {
		
		Factorial fc=new Factorial();
		
		fc.factshow();
	}
	
}
//5!=1*2*3*4*5
//i=1;i<=n;i++ sop:f=f*i

