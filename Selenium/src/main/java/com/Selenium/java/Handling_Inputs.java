package com.Selenium.java;

import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ISelect;

public class Handling_Inputs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver-win32/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://letcode.in/edit/");
		
		//Enter your full Name
		driver.findElementByXPath("//input[@placeholder='Enter first & last name']").sendKeys("Abharnas");
		
		//Append a text and press keyboard tab
		driver.findElementById("join").sendKeys(" person", Keys.TAB);
		
		//What is inside the text box
		String myValue = driver.findElementById("getMe").getAttribute("value");
		System.out.println(myValue);
		
		//Clear the text
		driver.findElementById("clearMe").clear();
		
		
		 //Confirm edit field is disabled
		 Boolean res = driver.findElementById("noEdit").isEnabled();
		 System.out.println(res);
		 
		/*
		 * String isDis = driver.findElementById("noEdit").getAttribute("disabled");
		 * System.out.println(isDis);
		 */
		 
		//Confirm text is readonly 
		String myValue1 = driver.findElementById("dontwrite").getAttribute("readonly");
		System.out.println(myValue1);
		
		
	    //Quitting the browser 
		driver.quit();

	}

}
