package com.InterfaceAndAbstract.java;

public class Bank implements InterfaceEx{
	
	public void Loan() {
		System.out.println("Loans");
	}

	@Override
	public void aadharMandatory() {
		System.out.println("Aadhar Added");
		
	}

	@Override
	public boolean panMandatory() {
		
		return true;
	}

	

}
