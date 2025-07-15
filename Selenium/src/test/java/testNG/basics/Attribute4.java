package testNG.basics;

import java.util.NoSuchElementException;

import org.testng.annotations.Test;

public class Attribute4 {
	//alwaysRun , enabled, description
	
	    @Test(enabled = false) // enable = false means it will tell that it not even a testcase
		public void login() {
			System.out.println("login");
		}
		
	    @Test()
		public void scrolling() {
	    	
			System.out.println("scrolling");
			throw new NoSuchElementException("Element not there");
			
			
		}
		
	    @Test(dependsOnMethods = "testNG.basics.Attribute4.scrolling", alwaysRun = true, description = "You are logged out") // make me run whatever happens
		public void logout() {
			System.out.println("logout");
		}


}

// if we give test(enabled = false, alwaysRun = true) -> "enabled" is the high precedence it will suppress the "alwaysRun" , so "always run" wont work

