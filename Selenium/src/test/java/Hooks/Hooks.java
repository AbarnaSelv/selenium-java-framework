package Hooks;

import org.openqa.selenium.OutputType;
import org.testng.Assert;

import Drivers.DriverInstance;
import bsh.org.objectweb.asm.Type;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.AfterStep;
import cucumber.api.java.Before;
import cucumber.api.java.BeforeStep;

public class Hooks extends DriverInstance{
	
	@BeforeStep
	public void beforeStep(Scenario scenario) {
	scenario.write("Started");
		
	}
	
	@AfterStep
	public void afterStep(Scenario scenario) {
		scenario.write("finished");
	}
	
	
	@Before
	public void beforeScenario(Scenario scenario) { // here scenario is an interface
		String name = scenario.getName();
		System.out.println(name);
		System.out.println(scenario.getId());//get the examples line number in the add to cart feature, in scenario it will directly return the name
		System.out.println(scenario.getLines()); // same like getId it will return as string collections -> [scenario name no,scenario example no]
		System.out.println(scenario.getUri());// same like getId() but it wont give the line number .. like a path
		System.out.println(scenario.getSourceTagNames()); // it will give the tags [@reg,@sanity] like that
		
		
	}
	@After("@cleanup")
	public void cleanUp(Scenario scenario) {
		scenario.write("Before Cleaning the cart");
		byte[] screenshotsAS = driver.getScreenshotAs(OutputType.BYTES);
		scenario.embed(screenshotsAS, "image/png");
		
		driver.findElementByClassName("mat-ripple mat-mdc-button-ripple").click();
		driver.findElementByXPath("//span[.=' Clear cart ']").click();
		String text =  driver.findElementByClassName("mat-mdc-card-title mat-h1").getText();
		Assert.assertEquals(text, "Your shopping cart is empty");
		scenario.write("After Cleaning the cart");
		byte[] screenshotAS = driver.getScreenshotAs(OutputType.BYTES);
		scenario.embed(screenshotAS, "image/png");
		
		
		
	}
	
	@After
	public void afterScenario(Scenario scenario) {
		boolean failed = scenario.isFailed();
		System.out.println(failed);
		//generating screenshots in a report
		byte[] screenshots = driver.getScreenshotAs(OutputType.BYTES);
		scenario.embed(screenshots, "image/png");
		//driver.quit();
		// to take a screenshot only if its failed
		if(failed) {
			byte[] screenshotsAS = driver.getScreenshotAs(OutputType.BYTES);
			scenario.embed(screenshotsAS, "image/png");
			
		}
		cucumber.api.Result.Type status = scenario.getStatus();
		System.out.println(status);
		
	
		driver.quit();
		
	}

}
