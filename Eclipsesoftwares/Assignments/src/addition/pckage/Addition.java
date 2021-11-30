package addition.pckage;

public class Addition {
	
	int a,b,Sum;
	
	public int add(int a,int b){
		
		Sum=a+b;
		
		
		
  if(Sum%10==0) {
			
			System.out.println("Sum is divisible by 10");
		}
		else {
			
			System.out.println("Sum is Not divisible by 10");
		}

     return Sum;
	}
		
		
	}
	
	
		
		


