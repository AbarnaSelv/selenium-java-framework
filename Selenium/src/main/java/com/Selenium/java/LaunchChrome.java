package com.Selenium.java;

import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchChrome {

	public static void main(String[] args) {
		// to tell the system which driver am using
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver-win32/chromedriver.exe"); // here "./ refers to the current project"
		ChromeDriver driver = new ChromeDriver(); // after equal to is a constructor
		// add a chrome driver to resolve a error
		

	}

}
