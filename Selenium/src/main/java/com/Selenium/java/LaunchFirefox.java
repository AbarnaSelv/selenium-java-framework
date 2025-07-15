package com.Selenium.java;

import org.openqa.selenium.firefox.FirefoxDriver;

public class LaunchFirefox {

	public static void main(String[] args) {
		// Set system property with correct key and absolute path
		System.setProperty("webdriver.gecko.driver", 
		    "C:\\Users\\sharfaras\\eclipse-workspace\\Selenium\\drivers\\geckodriver-v0.36.0-win64\\geckodriver.exe");

		FirefoxDriver driver = new FirefoxDriver();
	}
}
