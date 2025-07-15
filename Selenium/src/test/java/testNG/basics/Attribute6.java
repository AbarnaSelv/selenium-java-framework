package testNG.basics;

import org.testng.annotations.Test;

public class Attribute6 {
	//Groups - to run only specific class, we have to configure it in the xml file
	
	@Test(groups = "smoke")
	public void login() {
		System.out.println("login");
		
	}
	
	@Test(groups = "reg")
	public void scrolling() {
		System.out.println("Scrolling");
	}
	
	@Test(groups = "sanity")
	public void logout() {
		System.out.println("logout");
	}
	
	//-- converting to xml
	//-right click on the class->testNG->convert to testNG->groups.xml->finish
	

}
//<exclude name = "sanity"></exclude> 
//here it will exclude the given class, at the same time it will execute all other classes

// interview que
//-- what if we give like,
//<include name = "sanity"></include>
//<exclude name = "sanity"></exclude>
// exclude is the high precedence it wont run anything