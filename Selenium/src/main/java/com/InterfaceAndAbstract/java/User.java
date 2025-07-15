package com.InterfaceAndAbstract.java;

public class User {

	public static void main(String[] args) {

		Bank bank = new Bank();
		bank.aadharMandatory();
		Boolean b = bank.panMandatory();
		System.out.println(b);
		bank.Loan();
		System.out.println(bank.UPILimit); //or // Bank.UPILimit
		bank.HouseLoanMandatory();
		
		// here we can write as 
		InterfaceEx IE = new Bank();// using this we can call the func only inside an Interface
		// thats why we are using the class
		
		// abstract 
		IndianBanks IB = new IndianBanks();
		IB.aadharMandatory();
		IB.panMandatory();
		
		//Difference b/w Abstract and Interface 
		// when an interface implements any class it has to implement 100%
		// but not in abstract class 
		
		
		
		

	}

}
