

/*this keyword can be used to invoke current class method.
if we haven't used this keyword when call method,compiler will be adding this by default*/


public class ThisMethod {
	
	void display() {
		
		System.out.println("Hello");
	}
	
	void show()
	{
		
		this.display();//we can use only display() here instead of using "this"
	}
	
	public static void main(String[] args) {
		
		ThisMethod tm=new ThisMethod();
		tm.show();
		
	}
	
	
}
