//
///* This keyword can be used to invoke current class constructor..
// * we can use default and parameterized*/
//
//public class ThisConstructor {
//	
//	ThisConstructor(){
//		
////		this(100);//either this way;here invoking parameterized constr to default
//		System.out.println("No argument Constructor");
//	}
//	
//	ThisConstructor(int a){
//		this();//here calling/invoking above default constructor to this constructor
//		
//		System.out.println("Parameterized constructor"+" "+a);
//		
//	}
//	
//	
//	public static void main(String[] args) {
//		
//		ThisConstructor tc=new ThisConstructor(100);//this way also
//	}
//	
//}
//
//
