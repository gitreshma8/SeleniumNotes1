package mulinterface.pckge;

public class Display implements Showable,Interface2{
	
	public void show() {
		
		System.out.println("from Showable interface");
		
	}
	
	public void inter() {
		
		System.out.println("interface2");
	}

	public static void main(String[] args) {
	
		Display obj=new Display();
		
		obj.show();
	obj.inter();
		

	}

}
