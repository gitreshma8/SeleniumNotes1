
public class PreferredMethods {
	
	public static void main (String[] args) {
		
		int num=(int)(Math.random()*30);
		System.out.println("Result is :" +num);
		
		if(num>10) {
//			System.out.println("Num is greater than 10");
		
	}
		
		else if(num<10 && num>5) {
			System.out.println("Num is between 5 and 10");
		}
		else if(num<25 && num>20) {
			
			System.out.println("Num is extreme");
		}
		else {
			System.out.println("Num is less than 10");
		}

}
}
