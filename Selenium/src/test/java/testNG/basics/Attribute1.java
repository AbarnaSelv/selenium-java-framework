package testNG.basics;

import org.testng.annotations.Test;

public class Attribute1  { // priority

	 //without priority it will print the ouput by ASCII so using "Priority", it will print accordingly
	
	    @Test(priority = 1)
		public void login() {
			System.out.println("login");
		}
		
	    @Test(priority = 2)
		public void scrolling() {
			System.out.println("scrolling");
		}
		
	    @Test(priority = 3)
		public void logout() {
			System.out.println("logout");
		}
	    
	
		
}

//Annotations execution wise
//-> beforeSuite
//-> beforeTest
//-> beforeClass
//-> beforeMethod
//-> myTest
//-> afterMethod
//-> afterClass
//-> afterTest

