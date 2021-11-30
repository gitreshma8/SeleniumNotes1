
public class AdditionThis {
	

      
	void read(int a,int b) {
		
		int c=a+b;
		System.out.println("Addition is :"+" "+c);
	}
	
	void add() {
		
		this.read(20,13);
		
	}
	
	public static void main(String[] args) {
		
		AdditionThis at=new AdditionThis();
		
				at.add();
	}
	
}
