package com.Selenium.java;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicitWait {
	/*
	 * -- It is a one time declaration only
	 * -- It will wait until the time ends and then only throws an exception 
	 * -- We can write both implicit and explicit in one code
	 * -- It affects only two functions -> findElementbyId(),findElements()
	 * 	 */
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver-win32/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		 
		
		  driver.get("https://buymeacoffee.com/letcode");
		  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		  driver.findElementByLinkText("Login").click();
		  driver.findElementByLinkText("Sign up").click();
		  driver.findElementByXPath("//h3[contains(text(),'buymeacoffee.com')]/following-sibling::input").sendKeys(" abarna_03");
			
		  

	}

}
