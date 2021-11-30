package com.exrcisesalary;

public class Calculate {
	
	float hra;
	float pf;
	public void calculateHRA(float basicPay) {
		hra=(float)(0.05*basicPay);
	}
	
	public void calculatePF(float basicPay) {
		pf=(float)(0.2*basicPay);


	}

}
