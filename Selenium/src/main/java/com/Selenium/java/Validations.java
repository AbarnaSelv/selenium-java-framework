package com.Selenium.java;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Validations {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver-win32/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		//driver.get("https://buymeacoffee.com/letcode");
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		
		  WebElement WebE = driver.findElementByLinkText("Login"); // rename -> ctrl +
		  
		  
		  //1. isDisplayed() is used to check whether the element is visible or rendered
		  Boolean display = WebE.isDisplayed();
		  System.out.println("Login Button: "+display);
		  
		  //2. isEnabled() if the element is intractable , these are attributes with no
		  //values u can see when u click the inspect
		  
		  driver.get("https://letcode.in/edit/"); 
		  Boolean res = driver.findElementById("noEdit").isEnabled(); 
		  System.out.println(res);
		 
		 
		 // passed as css.. button is only disabled only when it act as an attribute without a value here,
		
		  driver.get("https://semantic-ui.com/elements/button.html"); 
		  WebElement btn = driver.findElementByXPath("//button[text()[normalize-space() = 'Followed']]"); 
		  System.out.println(btn.isEnabled());// thats why its giving true here
		  String s = btn.getAttribute("class");
		  System.out.println(s.contains("disabled"));
		 
		 // 3. isSelected() - If the elements like radio box or checkbox or already selected or not
		 
		 // if we want to check if its already checked we have to take an input tag
		 driver.get("https://letcode.in/radio");
		 WebElement WeE= driver.findElementByXPath("//label[@class='checkbox']//input[1]");
		 System.out.println(WeE.isSelected());
		 
		 
		 
		 
		 driver.quit();
		 
		 //submit() .. works only inside the </form> ex login we can give .submit() instead of .click()
		 
		 
		 
		 

		

	}

}
