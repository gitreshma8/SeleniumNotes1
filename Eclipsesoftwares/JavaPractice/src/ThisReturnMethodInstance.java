
/*this keyword can be used to return current class instance from method*/

public class ThisReturnMethodInstance {
	

//	void m1() //if we use void in m1 method..
				//	we cant return instance.so using current class as return type of method m1
	ThisReturnMethodInstance c1() {
		
		return this;
			
	}
	
	public static void main() {
		
		ThisReturnMethodInstance trmi=new ThisReturnMethodInstance();
		trmi.c1();
	}
	
}
