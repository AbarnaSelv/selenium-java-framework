package com.Selenium.java;

import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverNavigationCommands {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver-win32/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		// Going to the current Url and printing it
		driver.get("https://letcode.in/button");
		
		
		String URL = driver.getCurrentUrl();
		System.out.println("Button Page URL "+ URL);
		
		// since the action is speed using to thread to stop for 3 sec 
		Thread.sleep(3000);
		
		// code using XPath to go back and printing it
		driver.findElementByXPath("//button[text()='Goto Home']").click();
		String Back_URL = driver.getCurrentUrl();
		System.out.println("Button Page URL "+ Back_URL);
		
		
		Thread.sleep(3000);
		
		// again navigating back to the button page
		driver.navigate().back();
		
		System.out.println("Back to button page " + driver.getCurrentUrl());
		
		// this is to refresh
		driver.navigate().refresh();
		
		//this is to navigate to any URL
		driver.navigate().to("https://letcode.in/courses");
		
		/*
		 * // In short we can also write 
		 * Navigation nav = driver.navigate();
		 * nav.back();
		 * nav.forward(); 
		 * nav.refresh(); 
		 * nav.to("");
		 * 
		 * 
		 * 
		 * 
		 * -- Interview Question
		 * --what is the difference between driver.get() and driver.navigate.to()
		 * -- both are almost same when you click the open declaration for to() it contains a get() method inside it
		 */
		
		

	}

}
