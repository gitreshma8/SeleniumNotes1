package salarycalc.pckg;

public class FullTimeEmployee extends Employee{
	
	final int wh=8;
	
	void calculateSalary() {
		
		   totalPay=payment*wh;
		   
		   System.out.println("FullTimeEmployee's payment is :"+" " +totalPay);
		      
			}
			

}
