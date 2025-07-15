package com.Selenium.java;

import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.chrome.ChromeDriver;

public class Maximize_Window {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver-win32/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		// common manner
		driver.manage().window().maximize();
		
		// detailed manner 
		Options opt = driver.manage();
		Window win = opt.window();
		win.maximize();
		
		driver.get("https://letcode.in/");
		

	}

}
