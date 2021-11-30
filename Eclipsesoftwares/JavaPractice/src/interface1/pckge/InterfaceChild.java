package interface1.pckge;

public class InterfaceChild implements Interface2 {
	
	public void show() {
		
		System.out.println("i am from parent");
	}

	public static void main(String[] args) {
		
		InterfaceChild obj=new InterfaceChild();
		
		obj.show();
//		obj.print();
		
//		InterfaceParent.display(); 
		
		
		
	}

}
