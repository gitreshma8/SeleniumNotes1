package bank.Pckge;

public class HDFC implements RBI{
	
	int amount;
	
	int n=6;
	
	
	public void recurringDeposit() {
		
	System.out.println("Amount after depositing for "+n+" Period of time  :"+"Rs."+hdfcDeposit(500));
	
	
	}
	
	public float hdfcDeposit(int amount) {
		
		
		float totalAmount=amount*((float)r/100)*n;
		
				return totalAmount;
	}

	public static void main(String[] args) {
	
		HDFC obj=new HDFC();
		
		obj.recurringDeposit();
		
	
	}

}
