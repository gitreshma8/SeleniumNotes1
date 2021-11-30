package interface1.pckge;

public interface InterfaceParent extends Interface2{

	void show();
	
	default void print() {
		
		System.out.println("can create default concrete method under interface based on java 8v");
		
	}
	
	public static void display() {
		
		System.out.println("can create static concrete method under interface based on java 8v");
		
	}
	
//	private void inter() {
//		
//		System.out.println("can create default concrete method under interface based on java 9v");
//		
//	}
//	
}


