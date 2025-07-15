package testNG.basics;

import org.testng.annotations.Test;

public class Attribute2 {
	// apart from test there is a another one called "dependsOnMethods" which will execute the next method message only 
		// when the previous one got succeed
		    
		    @Test(priority=1)
			public void login() {
				System.out.println("login");
			}
			// packageName.className.methodName
		    @Test(dependsOnMethods = "testNG.basics.Attribute2.login", priority = -1)// in this case "dependsOnMethod is the first priority , it will suppress the priority"
			public void scrolling() {
		    	
				System.out.println("scrolling");
				// for example in this case,
				//throw new RuntimeException(); // it wont execute the next method, it just skip it
			}
			
		    @Test(dependsOnMethods = "scrolling")
			public void logout() {
				System.out.println("logout");
			}

}
