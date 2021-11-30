package exception.pckge;

public class UnderAgeCustomException extends Exception {
	
	//method overloading ,diff parameters passing
	UnderAgeCustomException(){
		
		super("You are underag");
	}
	
UnderAgeCustomException(String msg){
		
		super(msg);
	}


}

