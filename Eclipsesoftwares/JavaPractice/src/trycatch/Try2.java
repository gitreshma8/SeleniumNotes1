package trycatch;

public class Try2 {

	public static void main(String[] args) {
		
		int x=10,y=0;
		
		try {
		int z=x/y;
		
		System.out.println(z);
		
		}catch(Exception e) {
			
			e.printStackTrace();
		
		}
	
finally {
	
	System.out.println(x);
}
	}

}
