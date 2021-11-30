package salarycalc.pckg;

public class EmployeeMain {

	public static void main(String[] args) {
	
		FullTimeEmployee FT=new FullTimeEmployee();
		Contractor con=new Contractor();
		
		FT.calculateSalary();
		con.calculateSalary();
		
	}

}
