package com.InterfaceAndAbstract.java;

public interface InterfaceEx {

	// whatever variable you declared inside variable , it will be in a "static final" by default
	// so we can't modify, change and override
	int UPILimit = 100000;// static final
	void aadharMandatory();
	boolean panMandatory();
    // there will be no constructor inside interface so we cant create an object for it	
	
	// after jdk 1.8 default and static access modifiers are added, we can add body to it
	default void HouseLoanMandatory() {
		
	}
	
	static void EduLoansAvailable() {
		// we can call the func in main class 
	}
}

